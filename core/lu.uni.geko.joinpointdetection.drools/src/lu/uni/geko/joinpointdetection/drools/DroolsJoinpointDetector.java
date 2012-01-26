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
package lu.uni.geko.joinpointdetection.drools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.joinpointdetection.JoinpointDetectorExt;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.adapters.EMFToStringAdapter;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class DroolsJoinpointDetector implements JoinpointDetectorExt {
   @Override
   public List<Map<EObject, EObject>> detectJoinpoints(URI pointcutMURI, URI baseMURI) {
      Pair<String, Map<Integer, EObject>> pointcutRulesAndIDs = (new PointcutRulesGenerator(pointcutMURI)).generate();
      String pointcutRules = pointcutRulesAndIDs.first;
      Map<Integer, EObject> pcID2PcEObjectMap = pointcutRulesAndIDs.second;
      // prepare lists that will contain the result of the joinpoint detection
      ArrayList<ArrayList<EObject>> baseEObjectsPerMatchLists = new ArrayList<ArrayList<EObject>>();
      ArrayList<ArrayList<String>> pcIDsPerMatchLists = new ArrayList<ArrayList<String>>();
      // prepare an iterable for the contents of the base model
      Iterable<EObject> baseContentIterable = createBaseContentIterable(baseMURI);
      DroolsAdapter.detectJoinpoints(pointcutRules, baseContentIterable, baseEObjectsPerMatchLists, pcIDsPerMatchLists);
      return populateResultMaps(baseEObjectsPerMatchLists, pcIDsPerMatchLists, pcID2PcEObjectMap);
   }

   private Iterable<EObject> createBaseContentIterable(final URI baseMURI) {
      Iterable<EObject> baseContentIterable = new Iterable<EObject>() {
         @Override
         public Iterator<EObject> iterator() {
            return MainResourceLoader.getAllContentsIterator(baseMURI);
         }
      };
      return baseContentIterable;
   }

   private List<Map<EObject, EObject>> populateResultMaps(ArrayList<ArrayList<EObject>> baseEObjectsPerMatchLists,
         ArrayList<ArrayList<String>> pcIDsPerMatchLists, Map<Integer, EObject> pcID2PcEObjectMap) {
      SimpleMessageConsole console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
      int matchCount = baseEObjectsPerMatchLists.size();
      if (matchCount == pcIDsPerMatchLists.size()) {
         console.println("\nDetected " + matchCount + " joinpoints:");
         List<Map<EObject, EObject>> pcEObject2BaseEObjectMaps = new ArrayList<Map<EObject, EObject>>(matchCount);
         // RATIONALE MK we want to get rid of the temporary IDs as soon as possible and only reason about real EObjects so we
         // return "shortcut" maps
         // The IDs should not be used anywhere outside the pointcutrules and joinpointdetection packages.
         for (int match = 0; match < matchCount; match++) {
            ArrayList<String> matchedPcIDs = pcIDsPerMatchLists.get(match);
            int matchedElementCount = matchedPcIDs.size();
            ArrayList<EObject> matchedBaseEObjects = baseEObjectsPerMatchLists.get(match);
            if (matchedElementCount == matchedBaseEObjects.size()) {
               Map<EObject, EObject> pcEObject2BaseEObjectMap = new HashMap<EObject, EObject>(matchedElementCount);
               pcEObject2BaseEObjectMaps.add(pcEObject2BaseEObjectMap);
               for (int matchedElement = 0; matchedElement < matchedElementCount; matchedElement++) {
                  Integer matchedPcId = Integer.parseInt(matchedPcIDs.get(matchedElement));
                  EObject matchedBaseEObject = matchedBaseEObjects.get(matchedElement);
                  EObject pcEObject = pcID2PcEObjectMap.get(matchedPcId);
                  pcEObject2BaseEObjectMap.put(pcEObject, matchedBaseEObject);
               }
            } else {
               console
                     .printErrorln("The joinpoint detection returned a match that had not exactly as many matched base EObjects as pointcut ids!");
            }
         }
         console.println(EMFToStringAdapter.INSTANCE.toString(pcEObject2BaseEObjectMaps));
         return pcEObject2BaseEObjectMaps;
      } else {
         console.printErrorln("The joinpoint detection returned not exactly as many matched locations as trace match mappings!");
      }
      return null;
   }
}
