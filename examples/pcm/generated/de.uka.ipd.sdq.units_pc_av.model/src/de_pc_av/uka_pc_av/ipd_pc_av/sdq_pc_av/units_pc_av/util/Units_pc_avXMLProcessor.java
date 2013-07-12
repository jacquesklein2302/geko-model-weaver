/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.util;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Units_pc_avXMLProcessor extends XMLProcessor {

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_pc_avXMLProcessor() {
      super((EPackage.Registry.INSTANCE));
      Units_pc_avPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the Units_pc_avResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations() {
      if (registrations == null) {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new Units_pc_avResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new Units_pc_avResourceFactoryImpl());
      }
      return registrations;
   }

} //Units_pc_avXMLProcessor
