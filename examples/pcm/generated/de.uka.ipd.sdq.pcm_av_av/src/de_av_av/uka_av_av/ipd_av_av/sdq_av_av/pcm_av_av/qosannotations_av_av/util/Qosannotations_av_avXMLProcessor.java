/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.Qosannotations_av_avPackage;

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
public class Qosannotations_av_avXMLProcessor extends XMLProcessor {

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qosannotations_av_avXMLProcessor() {
      super((EPackage.Registry.INSTANCE));
      Qosannotations_av_avPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the Qosannotations_av_avResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations() {
      if (registrations == null) {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new Qosannotations_av_avResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new Qosannotations_av_avResourceFactoryImpl());
      }
      return registrations;
   }

} //Qosannotations_av_avXMLProcessor
