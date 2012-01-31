/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max E. Kramer - initial API and implementation
 ******************************************************************************/
package lu.uni.geko.test;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.util.bridges.JavaBridge;
import lu.uni.geko.util.datastructures.Quintuple;
import lu.uni.geko.util.ecore.UnorderedReferencesRespectingEqualityHelper;
import lu.uni.geko.util.tostring.EMFToStringAdapter;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * A utility class for functionality needed by developers for testing GeKo, a generic model weaver, and its extensions.
 *
 * @author Max E. Kramer
 */
public final class Tester {
   /** Utility classes should not have a public or default constructor. */
   private Tester() {
   }

   /**
    * Determines and returns the baseMURI, pointcutMURI, adviceMURI, pc2AvMappingMURI, and wovenArchetypeMURI for the given folder
    * if it conforms to the testing naming conventions (i.e. the values of the constants defined in
    * {@link lu.uni.geko.common.GeKoConstants}).
    *
    * @param folder
    *           the folder containing the models for testing
    * @return the found (baseMURI, pointcutMURI, adviceMURI, pc2AvMappingMURI, wovenArchetypeMURI)
    */
   public static Quintuple<URI, URI, URI, URI, URI> getModelURIsFromFolder(final IFolder folder) {
      try {
         URI baseMURI = null;
         URI pointcutMURI = null;
         URI adviceMURI = null;
         URI pc2AvMappingMURI = null;
         URI wovenArchetypeMURI = null;
         String baseFileExt = null;
         String trimmedPcFileExt = null;
         String trimmedAvFileExt = null;
         String wovenArchetypeFileExt = null;
         IResource[] folderMembers = folder.members();
         for (IResource folderMember : folderMembers) {
            if (folderMember.exists()) {
               if (folderMember instanceof IFile) {
                  String fileExt = folderMember.getFileExtension();
                  if (fileExt.equals(GeKoConstants.getPc2AvMappingFileExt())) {
                     pc2AvMappingMURI = getURIIfNotYetSet(pc2AvMappingMURI, folderMember, folder, "pointcut to advice mapping");
                  } else if (fileExt.endsWith(GeKoConstants.getPcFileExtSuffix())) {
                     pointcutMURI = getURIIfNotYetSet(pointcutMURI, folderMember, folder, "pointcut");
                     trimmedPcFileExt = JavaBridge.trim(fileExt, GeKoConstants.getPcFileExtSuffix());
                  } else if (fileExt.endsWith(GeKoConstants.getAvFileExtSuffix())) {
                     adviceMURI = getURIIfNotYetSet(adviceMURI, folderMember, folder, "advice");
                     trimmedAvFileExt = JavaBridge.trim(fileExt, GeKoConstants.getAvFileExtSuffix());
                  } else {
                     // now folderMember can only be the base or the woven archetype
                     IPath memberPath = folderMember.getFullPath();
                     String memberName = memberPath.removeFileExtension().lastSegment();
                     if (memberName.endsWith(GeKoConstants.getArchetypeMFilenameAppendage())) {
                        wovenArchetypeMURI = getURIIfNotYetSet(wovenArchetypeMURI, folderMember, folder, "woven archetype");
                        wovenArchetypeFileExt = fileExt;
                     } else {
                        // ignore old woven files
                        if (!memberName.endsWith(GeKoConstants.getWovenMFilenameAppendage())) {
                           baseMURI = getURIIfNotYetSet(baseMURI, folderMember, folder, "base");
                           baseFileExt = fileExt;
                        }
                     }
                  }
               }
            }
         }
         boolean allRequiredModelURIsSet = baseMURI != null && pointcutMURI != null && adviceMURI != null
               && wovenArchetypeMURI != null && baseFileExt != null;
         if (allRequiredModelURIsSet) {
            boolean allFileExtCorrespond = baseFileExt.equals(trimmedPcFileExt) && baseFileExt.equals(trimmedAvFileExt)
                  && baseFileExt.equals(wovenArchetypeFileExt);
            if (allFileExtCorrespond) {
               return new Quintuple<URI, URI, URI, URI, URI>(baseMURI, pointcutMURI, adviceMURI, pc2AvMappingMURI,
                     wovenArchetypeMURI);
            }
         }
         throw new RuntimeException(
               "Test cannot be run as not all required model URIs are set or their file extensions do not correspond!");
      } catch (CoreException e) {
         // soften
         throw new RuntimeException(e);
      }
   }

   /**
    * Determines whether the given URI variable is not yet set. Returns the URI of the model for the given resource if this is the
    * case and throws a {@link java.lang.RuntimeException} otherwise.
    *
    * @param uri
    *           a URI variable to be checked whether set or not
    * @param resource
    *           the resource for which the URI should be determined
    * @param folder
    *           the containing test folder (for debugging output)
    * @param modelName
    *           the name of the model (for debugging output)
    * @return the URI of the model for the given resource
    */
   private static URI getURIIfNotYetSet(final URI uri, final IResource resource, final IFolder folder, final String modelName) {
      if (uri == null) {
         return EcoreBridge.getEMFUriForIResource(resource);
      } else {
         throw new RuntimeException("Found more than one " + modelName + " model in folder '" + folder + "'!");
      }
   }

   /**
    * Asserts that the models at the given URI are equivalent by throwing a {@link java.lang.RuntimeException} if this is not the
    * case. The equivalence considers unordered references as equal even if they contain the same elements in different order.
    *
    * @param wovenMURI
    *           the URI of the newly woven model
    * @param wovenArchetypeMURI
    *           the URI of the old woven model serving as archetype
    */
   public static void assertWovenMRootEqualsWovenArchetypeMRoot(final URI wovenMURI, final URI wovenArchetypeMURI) {
      EObject wovenRootElement = MainResourceLoader.getUniqueContentRoot(wovenMURI, "woven model");
      EObject wovenArchetypeRootElement = MainResourceLoader.getUniqueContentRoot(wovenArchetypeMURI, "woven archetype model");
      UnorderedReferencesRespectingEqualityHelper equalityHelper = new UnorderedReferencesRespectingEqualityHelper();
      boolean equals = equalityHelper.equals(wovenRootElement, wovenArchetypeRootElement);
      if (equals) {
         String successMessage = "Sucessfully completed asymmetric weaver test in '" + wovenMURI.trimSegments(1).lastSegment()
               + "'.";
         SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName()).println(successMessage);
         System.out.println(successMessage);
      } else {
         throw new RuntimeException("The woven model root element '" + EMFToStringAdapter.INSTANCE.toString(wovenRootElement)
               + "' does not equal the woven archetype model root element '"
               + EMFToStringAdapter.INSTANCE.toString(wovenArchetypeRootElement) + "'!");
      }
   }
}
