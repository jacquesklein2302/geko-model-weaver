/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.Pcm_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.Allocation_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.impl.Allocation_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completions_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.Core_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyContext;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyInfrastructureConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ComposedStructure;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avFactory;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Connector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.DelegationConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannel;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSourceConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedDelegationConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedInfrastructureDelegationConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.RequiredDelegationConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.RequiredInfrastructureDelegationConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.RequiredResourceDelegationConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ResourceRequiredDelegationConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.SinkDelegationConnector;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.SourceDelegationConnector;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.util.Composition_av_avValidator;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.impl.Entity_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.impl.Core_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.impl.Pcm_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.Parameter_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.impl.Parameter_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.protocol_av_av.Protocol_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.protocol_av_av.impl.Protocol_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.Qosannotations_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.impl.Qosannotations_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.Qos_performance_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.impl.Qos_performance_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_reliability_av_av.Qos_reliability_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_reliability_av_av.impl.Qos_reliability_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.Reliability_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.impl.Reliability_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl.Repository_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.impl.Resourceenvironment_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.Resourcetype_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.impl.Resourcetype_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.impl.Seff_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_performance_av_av.Seff_performance_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_performance_av_av.impl.Seff_performance_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av.Seff_reliability_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av.impl.Seff_reliability_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.subsystem_av_av.Subsystem_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.subsystem_av_av.impl.Subsystem_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.System_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.impl.System_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av.Usagemodel_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av.impl.Usagemodel_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Composition_av_avPackageImpl extends EPackageImpl implements Composition_av_avPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass delegationConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass connectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass composedStructureEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceRequiredDelegationConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass eventChannelEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass eventChannelSourceConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass eventChannelSinkConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass providedDelegationConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass requiredDelegationConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass assemblyConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass assemblyEventConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass sourceDelegationConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass sinkDelegationConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass assemblyInfrastructureConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass providedInfrastructureDelegationConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass requiredInfrastructureDelegationConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass requiredResourceDelegationConnectorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass assemblyContextEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Composition_av_avPackageImpl() {
      super(eNS_URI, Composition_av_avFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link Composition_av_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Composition_av_avPackage init() {
      if (isInited) return (Composition_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_av_avPackage.eNS_URI);

      // Obtain or create and register package
      Composition_av_avPackageImpl theComposition_av_avPackage = (Composition_av_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Composition_av_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Composition_av_avPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_av_avPackage.eINSTANCE.eClass();
      Stoex_av_avPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_av_avPackageImpl thePcm_av_avPackage = (Pcm_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_av_avPackage.eNS_URI) instanceof Pcm_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_av_avPackage.eNS_URI) : Pcm_av_avPackage.eINSTANCE);
      Core_av_avPackageImpl theCore_av_avPackage = (Core_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_av_avPackage.eNS_URI) instanceof Core_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_av_avPackage.eNS_URI) : Core_av_avPackage.eINSTANCE);
      Entity_av_avPackageImpl theEntity_av_avPackage = (Entity_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_av_avPackage.eNS_URI) instanceof Entity_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_av_avPackage.eNS_URI) : Entity_av_avPackage.eINSTANCE);
      Usagemodel_av_avPackageImpl theUsagemodel_av_avPackage = (Usagemodel_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_avPackage.eNS_URI) instanceof Usagemodel_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_avPackage.eNS_URI) : Usagemodel_av_avPackage.eINSTANCE);
      Repository_av_avPackageImpl theRepository_av_avPackage = (Repository_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_av_avPackage.eNS_URI) instanceof Repository_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_av_avPackage.eNS_URI) : Repository_av_avPackage.eINSTANCE);
      Resourcetype_av_avPackageImpl theResourcetype_av_avPackage = (Resourcetype_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_avPackage.eNS_URI) instanceof Resourcetype_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_avPackage.eNS_URI) : Resourcetype_av_avPackage.eINSTANCE);
      Protocol_av_avPackageImpl theProtocol_av_avPackage = (Protocol_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_av_avPackage.eNS_URI) instanceof Protocol_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_av_avPackage.eNS_URI) : Protocol_av_avPackage.eINSTANCE);
      Parameter_av_avPackageImpl theParameter_av_avPackage = (Parameter_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_av_avPackage.eNS_URI) instanceof Parameter_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_av_avPackage.eNS_URI) : Parameter_av_avPackage.eINSTANCE);
      Reliability_av_avPackageImpl theReliability_av_avPackage = (Reliability_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_av_avPackage.eNS_URI) instanceof Reliability_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_av_avPackage.eNS_URI) : Reliability_av_avPackage.eINSTANCE);
      Seff_av_avPackageImpl theSeff_av_avPackage = (Seff_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_av_avPackage.eNS_URI) instanceof Seff_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_av_avPackage.eNS_URI) : Seff_av_avPackage.eINSTANCE);
      Seff_performance_av_avPackageImpl theSeff_performance_av_avPackage = (Seff_performance_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_avPackage.eNS_URI) instanceof Seff_performance_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_avPackage.eNS_URI) : Seff_performance_av_avPackage.eINSTANCE);
      Seff_reliability_av_avPackageImpl theSeff_reliability_av_avPackage = (Seff_reliability_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_avPackage.eNS_URI) instanceof Seff_reliability_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_avPackage.eNS_URI) : Seff_reliability_av_avPackage.eINSTANCE);
      Qosannotations_av_avPackageImpl theQosannotations_av_avPackage = (Qosannotations_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_avPackage.eNS_URI) instanceof Qosannotations_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_avPackage.eNS_URI) : Qosannotations_av_avPackage.eINSTANCE);
      Qos_performance_av_avPackageImpl theQos_performance_av_avPackage = (Qos_performance_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_avPackage.eNS_URI) instanceof Qos_performance_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_avPackage.eNS_URI) : Qos_performance_av_avPackage.eINSTANCE);
      Qos_reliability_av_avPackageImpl theQos_reliability_av_avPackage = (Qos_reliability_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_avPackage.eNS_URI) instanceof Qos_reliability_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_avPackage.eNS_URI) : Qos_reliability_av_avPackage.eINSTANCE);
      System_av_avPackageImpl theSystem_av_avPackage = (System_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_av_avPackage.eNS_URI) instanceof System_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_av_avPackage.eNS_URI) : System_av_avPackage.eINSTANCE);
      Resourceenvironment_av_avPackageImpl theResourceenvironment_av_avPackage = (Resourceenvironment_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_avPackage.eNS_URI) instanceof Resourceenvironment_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_avPackage.eNS_URI) : Resourceenvironment_av_avPackage.eINSTANCE);
      Allocation_av_avPackageImpl theAllocation_av_avPackage = (Allocation_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_av_avPackage.eNS_URI) instanceof Allocation_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_av_avPackage.eNS_URI) : Allocation_av_avPackage.eINSTANCE);
      Subsystem_av_avPackageImpl theSubsystem_av_avPackage = (Subsystem_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_avPackage.eNS_URI) instanceof Subsystem_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_avPackage.eNS_URI) : Subsystem_av_avPackage.eINSTANCE);
      Completions_av_avPackageImpl theCompletions_av_avPackage = (Completions_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_av_avPackage.eNS_URI) instanceof Completions_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_av_avPackage.eNS_URI) : Completions_av_avPackage.eINSTANCE);

      // Create package meta-data objects
      theComposition_av_avPackage.createPackageContents();
      thePcm_av_avPackage.createPackageContents();
      theCore_av_avPackage.createPackageContents();
      theEntity_av_avPackage.createPackageContents();
      theUsagemodel_av_avPackage.createPackageContents();
      theRepository_av_avPackage.createPackageContents();
      theResourcetype_av_avPackage.createPackageContents();
      theProtocol_av_avPackage.createPackageContents();
      theParameter_av_avPackage.createPackageContents();
      theReliability_av_avPackage.createPackageContents();
      theSeff_av_avPackage.createPackageContents();
      theSeff_performance_av_avPackage.createPackageContents();
      theSeff_reliability_av_avPackage.createPackageContents();
      theQosannotations_av_avPackage.createPackageContents();
      theQos_performance_av_avPackage.createPackageContents();
      theQos_reliability_av_avPackage.createPackageContents();
      theSystem_av_avPackage.createPackageContents();
      theResourceenvironment_av_avPackage.createPackageContents();
      theAllocation_av_avPackage.createPackageContents();
      theSubsystem_av_avPackage.createPackageContents();
      theCompletions_av_avPackage.createPackageContents();

      // Initialize created meta-data
      theComposition_av_avPackage.initializePackageContents();
      thePcm_av_avPackage.initializePackageContents();
      theCore_av_avPackage.initializePackageContents();
      theEntity_av_avPackage.initializePackageContents();
      theUsagemodel_av_avPackage.initializePackageContents();
      theRepository_av_avPackage.initializePackageContents();
      theResourcetype_av_avPackage.initializePackageContents();
      theProtocol_av_avPackage.initializePackageContents();
      theParameter_av_avPackage.initializePackageContents();
      theReliability_av_avPackage.initializePackageContents();
      theSeff_av_avPackage.initializePackageContents();
      theSeff_performance_av_avPackage.initializePackageContents();
      theSeff_reliability_av_avPackage.initializePackageContents();
      theQosannotations_av_avPackage.initializePackageContents();
      theQos_performance_av_avPackage.initializePackageContents();
      theQos_reliability_av_avPackage.initializePackageContents();
      theSystem_av_avPackage.initializePackageContents();
      theResourceenvironment_av_avPackage.initializePackageContents();
      theAllocation_av_avPackage.initializePackageContents();
      theSubsystem_av_avPackage.initializePackageContents();
      theCompletions_av_avPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theComposition_av_avPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Composition_av_avValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theComposition_av_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Composition_av_avPackage.eNS_URI, theComposition_av_avPackage);
      return theComposition_av_avPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDelegationConnector() {
      return delegationConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getConnector() {
      return connectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getConnector_ParentStructure__Connector() {
      return (EReference)connectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getComposedStructure() {
      return composedStructureEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getComposedStructure_AssemblyContexts__ComposedStructure() {
      return (EReference)composedStructureEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getComposedStructure_ResourceRequiredDelegationConnectors_ComposedStructure() {
      return (EReference)composedStructureEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getComposedStructure_EventChannel__ComposedStructure() {
      return (EReference)composedStructureEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getComposedStructure_Connectors__ComposedStructure() {
      return (EReference)composedStructureEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceRequiredDelegationConnector() {
      return resourceRequiredDelegationConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceRequiredDelegationConnector_InnerResourceRequiredRole_ResourceRequiredDelegationConnector() {
      return (EReference)resourceRequiredDelegationConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceRequiredDelegationConnector_OuterResourceRequiredRole_ResourceRequiredDelegationConnector() {
      return (EReference)resourceRequiredDelegationConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceRequiredDelegationConnector_ParentStructure_ResourceRequiredDelegationConnector() {
      return (EReference)resourceRequiredDelegationConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEventChannel() {
      return eventChannelEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannel_EventGroup__EventChannel() {
      return (EReference)eventChannelEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannel_EventChannelSourceConnector__EventChannel() {
      return (EReference)eventChannelEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannel_EventChannelSinkConnector__EventChannel() {
      return (EReference)eventChannelEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannel_ParentStructure__EventChannel() {
      return (EReference)eventChannelEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEventChannelSourceConnector() {
      return eventChannelSourceConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannelSourceConnector_SourceRole__EventChannelSourceRole() {
      return (EReference)eventChannelSourceConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannelSourceConnector_AssemblyContext__EventChannelSourceConnector() {
      return (EReference)eventChannelSourceConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector() {
      return (EReference)eventChannelSourceConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEventChannelSinkConnector() {
      return eventChannelSinkConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannelSinkConnector_SinkRole__EventChannelSinkConnector() {
      return (EReference)eventChannelSinkConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannelSinkConnector_FilterCondition__EventChannelSinkConnector() {
      return (EReference)eventChannelSinkConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannelSinkConnector_AssemblyContext__EventChannelSinkConnector() {
      return (EReference)eventChannelSinkConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventChannelSinkConnector_EventChannel__EventChannelSinkConnector() {
      return (EReference)eventChannelSinkConnectorEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProvidedDelegationConnector() {
      return providedDelegationConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProvidedDelegationConnector_InnerProvidedRole_ProvidedDelegationConnector() {
      return (EReference)providedDelegationConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProvidedDelegationConnector_OuterProvidedRole_ProvidedDelegationConnector() {
      return (EReference)providedDelegationConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProvidedDelegationConnector_AssemblyContext_ProvidedDelegationConnector() {
      return (EReference)providedDelegationConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRequiredDelegationConnector() {
      return requiredDelegationConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredDelegationConnector_InnerRequiredRole_RequiredDelegationConnector() {
      return (EReference)requiredDelegationConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredDelegationConnector_OuterRequiredRole_RequiredDelegationConnector() {
      return (EReference)requiredDelegationConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredDelegationConnector_AssemblyContext_RequiredDelegationConnector() {
      return (EReference)requiredDelegationConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAssemblyConnector() {
      return assemblyConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyConnector_RequiringAssemblyContext_AssemblyConnector() {
      return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyConnector_ProvidingAssemblyContext_AssemblyConnector() {
      return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyConnector_ProvidedRole_AssemblyConnector() {
      return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyConnector_RequiredRole_AssemblyConnector() {
      return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAssemblyEventConnector() {
      return assemblyEventConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyEventConnector_SinkRole__AssemblyEventConnector() {
      return (EReference)assemblyEventConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyEventConnector_SourceRole__AssemblyEventConnector() {
      return (EReference)assemblyEventConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyEventConnector_SinkAssemblyContext__AssemblyEventConnector() {
      return (EReference)assemblyEventConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyEventConnector_SourceAssemblyContext__AssemblyEventConnector() {
      return (EReference)assemblyEventConnectorEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyEventConnector_FilterCondition__AssemblyEventConnector() {
      return (EReference)assemblyEventConnectorEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSourceDelegationConnector() {
      return sourceDelegationConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSourceDelegationConnector_InnerSourceRole__SourceRole() {
      return (EReference)sourceDelegationConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSourceDelegationConnector_OuterSourceRole__SourceRole() {
      return (EReference)sourceDelegationConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSourceDelegationConnector_AssemblyContext__SourceDelegationConnector() {
      return (EReference)sourceDelegationConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSinkDelegationConnector() {
      return sinkDelegationConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSinkDelegationConnector_AssemblyContext__SinkDelegationConnector() {
      return (EReference)sinkDelegationConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSinkDelegationConnector_InnerSinkRole__SinkRole() {
      return (EReference)sinkDelegationConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSinkDelegationConnector_OuterSinkRole__SinkRole() {
      return (EReference)sinkDelegationConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAssemblyInfrastructureConnector() {
      return assemblyInfrastructureConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyInfrastructureConnector_ProvidedRole__AssemblyInfrastructureConnector() {
      return (EReference)assemblyInfrastructureConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyInfrastructureConnector_RequiredRole__AssemblyInfrastructureConnector() {
      return (EReference)assemblyInfrastructureConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyInfrastructureConnector_ProvidingAssemblyContext__AssemblyInfrastructureConnector() {
      return (EReference)assemblyInfrastructureConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyInfrastructureConnector_RequiringAssemblyContext__AssemblyInfrastructureConnector() {
      return (EReference)assemblyInfrastructureConnectorEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProvidedInfrastructureDelegationConnector() {
      return providedInfrastructureDelegationConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProvidedInfrastructureDelegationConnector_InnerProvidedRole__ProvidedInfrastructureDelegationConnector() {
      return (EReference)providedInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProvidedInfrastructureDelegationConnector_OuterProvidedRole__ProvidedInfrastructureDelegationConnector() {
      return (EReference)providedInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProvidedInfrastructureDelegationConnector_AssemblyContext__ProvidedInfrastructureDelegationConnector() {
      return (EReference)providedInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRequiredInfrastructureDelegationConnector() {
      return requiredInfrastructureDelegationConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredInfrastructureDelegationConnector_InnerRequiredRole__RequiredInfrastructureDelegationConnector() {
      return (EReference)requiredInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredInfrastructureDelegationConnector_OuterRequiredRole__RequiredInfrastructureDelegationConnector() {
      return (EReference)requiredInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredInfrastructureDelegationConnector_AssemblyContext__RequiredInfrastructureDelegationConnector() {
      return (EReference)requiredInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRequiredResourceDelegationConnector() {
      return requiredResourceDelegationConnectorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredResourceDelegationConnector_AssemblyContext__RequiredResourceDelegationConnector() {
      return (EReference)requiredResourceDelegationConnectorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredResourceDelegationConnector_InnerRequiredRole__RequiredResourceDelegationConnector() {
      return (EReference)requiredResourceDelegationConnectorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredResourceDelegationConnector_OuterRequiredRole__RequiredResourceDelegationConnector() {
      return (EReference)requiredResourceDelegationConnectorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAssemblyContext() {
      return assemblyContextEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyContext_ParentStructure__AssemblyContext() {
      return (EReference)assemblyContextEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyContext_EncapsulatedComponent__AssemblyContext() {
      return (EReference)assemblyContextEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAssemblyContext_ConfigParameterUsages__AssemblyContext() {
      return (EReference)assemblyContextEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Composition_av_avFactory getComposition_av_avFactory() {
      return (Composition_av_avFactory)getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents() {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      delegationConnectorEClass = createEClass(DELEGATION_CONNECTOR);

      connectorEClass = createEClass(CONNECTOR);
      createEReference(connectorEClass, CONNECTOR__PARENT_STRUCTURE_CONNECTOR);

      composedStructureEClass = createEClass(COMPOSED_STRUCTURE);
      createEReference(composedStructureEClass, COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE);
      createEReference(composedStructureEClass, COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE);
      createEReference(composedStructureEClass, COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE);
      createEReference(composedStructureEClass, COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE);

      resourceRequiredDelegationConnectorEClass = createEClass(RESOURCE_REQUIRED_DELEGATION_CONNECTOR);
      createEReference(resourceRequiredDelegationConnectorEClass, RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR);
      createEReference(resourceRequiredDelegationConnectorEClass, RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR);
      createEReference(resourceRequiredDelegationConnectorEClass, RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR);

      eventChannelEClass = createEClass(EVENT_CHANNEL);
      createEReference(eventChannelEClass, EVENT_CHANNEL__EVENT_GROUP_EVENT_CHANNEL);
      createEReference(eventChannelEClass, EVENT_CHANNEL__EVENT_CHANNEL_SOURCE_CONNECTOR_EVENT_CHANNEL);
      createEReference(eventChannelEClass, EVENT_CHANNEL__EVENT_CHANNEL_SINK_CONNECTOR_EVENT_CHANNEL);
      createEReference(eventChannelEClass, EVENT_CHANNEL__PARENT_STRUCTURE_EVENT_CHANNEL);

      eventChannelSourceConnectorEClass = createEClass(EVENT_CHANNEL_SOURCE_CONNECTOR);
      createEReference(eventChannelSourceConnectorEClass, EVENT_CHANNEL_SOURCE_CONNECTOR__SOURCE_ROLE_EVENT_CHANNEL_SOURCE_ROLE);
      createEReference(eventChannelSourceConnectorEClass, EVENT_CHANNEL_SOURCE_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SOURCE_CONNECTOR);
      createEReference(eventChannelSourceConnectorEClass, EVENT_CHANNEL_SOURCE_CONNECTOR__EVENT_CHANNEL_EVENT_CHANNEL_SOURCE_CONNECTOR);

      eventChannelSinkConnectorEClass = createEClass(EVENT_CHANNEL_SINK_CONNECTOR);
      createEReference(eventChannelSinkConnectorEClass, EVENT_CHANNEL_SINK_CONNECTOR__SINK_ROLE_EVENT_CHANNEL_SINK_CONNECTOR);
      createEReference(eventChannelSinkConnectorEClass, EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR);
      createEReference(eventChannelSinkConnectorEClass, EVENT_CHANNEL_SINK_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SINK_CONNECTOR);
      createEReference(eventChannelSinkConnectorEClass, EVENT_CHANNEL_SINK_CONNECTOR__EVENT_CHANNEL_EVENT_CHANNEL_SINK_CONNECTOR);

      providedDelegationConnectorEClass = createEClass(PROVIDED_DELEGATION_CONNECTOR);
      createEReference(providedDelegationConnectorEClass, PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR);
      createEReference(providedDelegationConnectorEClass, PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR);
      createEReference(providedDelegationConnectorEClass, PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR);

      requiredDelegationConnectorEClass = createEClass(REQUIRED_DELEGATION_CONNECTOR);
      createEReference(requiredDelegationConnectorEClass, REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR);
      createEReference(requiredDelegationConnectorEClass, REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR);
      createEReference(requiredDelegationConnectorEClass, REQUIRED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_DELEGATION_CONNECTOR);

      assemblyConnectorEClass = createEClass(ASSEMBLY_CONNECTOR);
      createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR);
      createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR);
      createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_CONNECTOR);
      createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_CONNECTOR);

      assemblyEventConnectorEClass = createEClass(ASSEMBLY_EVENT_CONNECTOR);
      createEReference(assemblyEventConnectorEClass, ASSEMBLY_EVENT_CONNECTOR__SINK_ROLE_ASSEMBLY_EVENT_CONNECTOR);
      createEReference(assemblyEventConnectorEClass, ASSEMBLY_EVENT_CONNECTOR__SOURCE_ROLE_ASSEMBLY_EVENT_CONNECTOR);
      createEReference(assemblyEventConnectorEClass, ASSEMBLY_EVENT_CONNECTOR__SINK_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR);
      createEReference(assemblyEventConnectorEClass, ASSEMBLY_EVENT_CONNECTOR__SOURCE_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR);
      createEReference(assemblyEventConnectorEClass, ASSEMBLY_EVENT_CONNECTOR__FILTER_CONDITION_ASSEMBLY_EVENT_CONNECTOR);

      sourceDelegationConnectorEClass = createEClass(SOURCE_DELEGATION_CONNECTOR);
      createEReference(sourceDelegationConnectorEClass, SOURCE_DELEGATION_CONNECTOR__INNER_SOURCE_ROLE_SOURCE_ROLE);
      createEReference(sourceDelegationConnectorEClass, SOURCE_DELEGATION_CONNECTOR__OUTER_SOURCE_ROLE_SOURCE_ROLE);
      createEReference(sourceDelegationConnectorEClass, SOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SOURCE_DELEGATION_CONNECTOR);

      sinkDelegationConnectorEClass = createEClass(SINK_DELEGATION_CONNECTOR);
      createEReference(sinkDelegationConnectorEClass, SINK_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SINK_DELEGATION_CONNECTOR);
      createEReference(sinkDelegationConnectorEClass, SINK_DELEGATION_CONNECTOR__INNER_SINK_ROLE_SINK_ROLE);
      createEReference(sinkDelegationConnectorEClass, SINK_DELEGATION_CONNECTOR__OUTER_SINK_ROLE_SINK_ROLE);

      assemblyInfrastructureConnectorEClass = createEClass(ASSEMBLY_INFRASTRUCTURE_CONNECTOR);
      createEReference(assemblyInfrastructureConnectorEClass, ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR);
      createEReference(assemblyInfrastructureConnectorEClass, ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR);
      createEReference(assemblyInfrastructureConnectorEClass, ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR);
      createEReference(assemblyInfrastructureConnectorEClass, ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR);

      providedInfrastructureDelegationConnectorEClass = createEClass(PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
      createEReference(providedInfrastructureDelegationConnectorEClass, PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
      createEReference(providedInfrastructureDelegationConnectorEClass, PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
      createEReference(providedInfrastructureDelegationConnectorEClass, PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR);

      requiredInfrastructureDelegationConnectorEClass = createEClass(REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
      createEReference(requiredInfrastructureDelegationConnectorEClass, REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
      createEReference(requiredInfrastructureDelegationConnectorEClass, REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
      createEReference(requiredInfrastructureDelegationConnectorEClass, REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR);

      requiredResourceDelegationConnectorEClass = createEClass(REQUIRED_RESOURCE_DELEGATION_CONNECTOR);
      createEReference(requiredResourceDelegationConnectorEClass, REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_RESOURCE_DELEGATION_CONNECTOR);
      createEReference(requiredResourceDelegationConnectorEClass, REQUIRED_RESOURCE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR);
      createEReference(requiredResourceDelegationConnectorEClass, REQUIRED_RESOURCE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR);

      assemblyContextEClass = createEClass(ASSEMBLY_CONTEXT);
      createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT);
      createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT);
      createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents() {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      Entity_av_avPackage theEntity_av_avPackage = (Entity_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_av_avPackage.eNS_URI);
      Repository_av_avPackage theRepository_av_avPackage = (Repository_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_av_avPackage.eNS_URI);
      Core_av_avPackage theCore_av_avPackage = (Core_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Core_av_avPackage.eNS_URI);
      Parameter_av_avPackage theParameter_av_avPackage = (Parameter_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_av_avPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      delegationConnectorEClass.getESuperTypes().add(this.getConnector());
      connectorEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());
      composedStructureEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());
      eventChannelEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());
      eventChannelSourceConnectorEClass.getESuperTypes().add(this.getConnector());
      eventChannelSinkConnectorEClass.getESuperTypes().add(this.getConnector());
      providedDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
      requiredDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
      assemblyConnectorEClass.getESuperTypes().add(this.getConnector());
      assemblyEventConnectorEClass.getESuperTypes().add(this.getConnector());
      sourceDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
      sinkDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
      assemblyInfrastructureConnectorEClass.getESuperTypes().add(this.getConnector());
      providedInfrastructureDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
      requiredInfrastructureDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
      requiredResourceDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
      assemblyContextEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());

      // Initialize classes and features; add operations and parameters
      initEClass(delegationConnectorEClass, DelegationConnector.class, "DelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getConnector_ParentStructure__Connector(), this.getComposedStructure(), this.getComposedStructure_Connectors__ComposedStructure(), "parentStructure__Connector", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(composedStructureEClass, ComposedStructure.class, "ComposedStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getComposedStructure_AssemblyContexts__ComposedStructure(), this.getAssemblyContext(), this.getAssemblyContext_ParentStructure__AssemblyContext(), "assemblyContexts__ComposedStructure", null, 0, -1, ComposedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getComposedStructure_ResourceRequiredDelegationConnectors_ComposedStructure(), this.getResourceRequiredDelegationConnector(), this.getResourceRequiredDelegationConnector_ParentStructure_ResourceRequiredDelegationConnector(), "resourceRequiredDelegationConnectors_ComposedStructure", null, 0, -1, ComposedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getComposedStructure_EventChannel__ComposedStructure(), this.getEventChannel(), this.getEventChannel_ParentStructure__EventChannel(), "eventChannel__ComposedStructure", null, 0, -1, ComposedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getComposedStructure_Connectors__ComposedStructure(), this.getConnector(), this.getConnector_ParentStructure__Connector(), "connectors__ComposedStructure", null, 0, -1, ComposedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = addEOperation(composedStructureEClass, ecorePackage.getEBoolean(), "MultipleConnectorsConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(composedStructureEClass, ecorePackage.getEBoolean(), "MultipleConnectorsConstraintForAssemblyConnectors", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(resourceRequiredDelegationConnectorEClass, ResourceRequiredDelegationConnector.class, "ResourceRequiredDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceRequiredDelegationConnector_InnerResourceRequiredRole_ResourceRequiredDelegationConnector(), theEntity_av_avPackage.getResourceRequiredRole(), null, "innerResourceRequiredRole_ResourceRequiredDelegationConnector", null, 0, 1, ResourceRequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceRequiredDelegationConnector_OuterResourceRequiredRole_ResourceRequiredDelegationConnector(), theEntity_av_avPackage.getResourceRequiredRole(), null, "outerResourceRequiredRole_ResourceRequiredDelegationConnector", null, 0, 1, ResourceRequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceRequiredDelegationConnector_ParentStructure_ResourceRequiredDelegationConnector(), this.getComposedStructure(), this.getComposedStructure_ResourceRequiredDelegationConnectors_ComposedStructure(), "parentStructure_ResourceRequiredDelegationConnector", null, 0, 1, ResourceRequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(eventChannelEClass, EventChannel.class, "EventChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEventChannel_EventGroup__EventChannel(), theRepository_av_avPackage.getEventGroup(), null, "eventGroup__EventChannel", null, 0, 1, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEventChannel_EventChannelSourceConnector__EventChannel(), this.getEventChannelSourceConnector(), this.getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector(), "eventChannelSourceConnector__EventChannel", null, 0, -1, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEventChannel_EventChannelSinkConnector__EventChannel(), this.getEventChannelSinkConnector(), this.getEventChannelSinkConnector_EventChannel__EventChannelSinkConnector(), "eventChannelSinkConnector__EventChannel", null, 0, -1, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEventChannel_ParentStructure__EventChannel(), this.getComposedStructure(), this.getComposedStructure_EventChannel__ComposedStructure(), "parentStructure__EventChannel", null, 0, 1, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(eventChannelSourceConnectorEClass, EventChannelSourceConnector.class, "EventChannelSourceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEventChannelSourceConnector_SourceRole__EventChannelSourceRole(), theRepository_av_avPackage.getSourceRole(), null, "sourceRole__EventChannelSourceRole", null, 0, 1, EventChannelSourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEventChannelSourceConnector_AssemblyContext__EventChannelSourceConnector(), this.getAssemblyContext(), null, "assemblyContext__EventChannelSourceConnector", null, 0, 1, EventChannelSourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector(), this.getEventChannel(), this.getEventChannel_EventChannelSourceConnector__EventChannel(), "eventChannel__EventChannelSourceConnector", null, 0, 1, EventChannelSourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(eventChannelSinkConnectorEClass, EventChannelSinkConnector.class, "EventChannelSinkConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEventChannelSinkConnector_SinkRole__EventChannelSinkConnector(), theRepository_av_avPackage.getSinkRole(), null, "sinkRole__EventChannelSinkConnector", null, 0, 1, EventChannelSinkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEventChannelSinkConnector_FilterCondition__EventChannelSinkConnector(), theCore_av_avPackage.getPCMRandomVariable(), theCore_av_avPackage.getPCMRandomVariable_EventChannelSinkConnector__FilterCondition(), "filterCondition__EventChannelSinkConnector", null, 0, 1, EventChannelSinkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEventChannelSinkConnector_AssemblyContext__EventChannelSinkConnector(), this.getAssemblyContext(), null, "assemblyContext__EventChannelSinkConnector", null, 0, 1, EventChannelSinkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEventChannelSinkConnector_EventChannel__EventChannelSinkConnector(), this.getEventChannel(), this.getEventChannel_EventChannelSinkConnector__EventChannel(), "eventChannel__EventChannelSinkConnector", null, 0, 1, EventChannelSinkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(providedDelegationConnectorEClass, ProvidedDelegationConnector.class, "ProvidedDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getProvidedDelegationConnector_InnerProvidedRole_ProvidedDelegationConnector(), theRepository_av_avPackage.getOperationProvidedRole(), null, "innerProvidedRole_ProvidedDelegationConnector", null, 0, 1, ProvidedDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProvidedDelegationConnector_OuterProvidedRole_ProvidedDelegationConnector(), theRepository_av_avPackage.getOperationProvidedRole(), null, "outerProvidedRole_ProvidedDelegationConnector", null, 0, 1, ProvidedDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProvidedDelegationConnector_AssemblyContext_ProvidedDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext_ProvidedDelegationConnector", null, 0, 1, ProvidedDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(providedDelegationConnectorEClass, ecorePackage.getEBoolean(), "ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(providedDelegationConnectorEClass, ecorePackage.getEBoolean(), "ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(requiredDelegationConnectorEClass, RequiredDelegationConnector.class, "RequiredDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRequiredDelegationConnector_InnerRequiredRole_RequiredDelegationConnector(), theRepository_av_avPackage.getOperationRequiredRole(), null, "innerRequiredRole_RequiredDelegationConnector", null, 0, 1, RequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRequiredDelegationConnector_OuterRequiredRole_RequiredDelegationConnector(), theRepository_av_avPackage.getOperationRequiredRole(), null, "outerRequiredRole_RequiredDelegationConnector", null, 0, 1, RequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRequiredDelegationConnector_AssemblyContext_RequiredDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext_RequiredDelegationConnector", null, 0, 1, RequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(requiredDelegationConnectorEClass, ecorePackage.getEBoolean(), "RequiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(requiredDelegationConnectorEClass, ecorePackage.getEBoolean(), "ComponentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(requiredDelegationConnectorEClass, ecorePackage.getEBoolean(), "RequiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(assemblyConnectorEClass, AssemblyConnector.class, "AssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAssemblyConnector_RequiringAssemblyContext_AssemblyConnector(), this.getAssemblyContext(), null, "requiringAssemblyContext_AssemblyConnector", null, 0, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyConnector_ProvidingAssemblyContext_AssemblyConnector(), this.getAssemblyContext(), null, "providingAssemblyContext_AssemblyConnector", null, 0, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyConnector_ProvidedRole_AssemblyConnector(), theRepository_av_avPackage.getOperationProvidedRole(), null, "providedRole_AssemblyConnector", null, 0, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyConnector_RequiredRole_AssemblyConnector(), theRepository_av_avPackage.getOperationRequiredRole(), null, "requiredRole_AssemblyConnector", null, 0, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(assemblyConnectorEClass, ecorePackage.getEBoolean(), "AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(assemblyConnectorEClass, ecorePackage.getEBoolean(), "AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(assemblyConnectorEClass, ecorePackage.getEBoolean(), "AssemblyConnectorsReferencedInterfacesMustMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(assemblyEventConnectorEClass, AssemblyEventConnector.class, "AssemblyEventConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAssemblyEventConnector_SinkRole__AssemblyEventConnector(), theRepository_av_avPackage.getSinkRole(), null, "sinkRole__AssemblyEventConnector", null, 0, 1, AssemblyEventConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyEventConnector_SourceRole__AssemblyEventConnector(), theRepository_av_avPackage.getSourceRole(), null, "sourceRole__AssemblyEventConnector", null, 0, 1, AssemblyEventConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyEventConnector_SinkAssemblyContext__AssemblyEventConnector(), this.getAssemblyContext(), null, "sinkAssemblyContext__AssemblyEventConnector", null, 0, 1, AssemblyEventConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyEventConnector_SourceAssemblyContext__AssemblyEventConnector(), this.getAssemblyContext(), null, "sourceAssemblyContext__AssemblyEventConnector", null, 0, 1, AssemblyEventConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyEventConnector_FilterCondition__AssemblyEventConnector(), theCore_av_avPackage.getPCMRandomVariable(), theCore_av_avPackage.getPCMRandomVariable_AssemblyEventConnector__FilterCondition(), "filterCondition__AssemblyEventConnector", null, 0, 1, AssemblyEventConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(sourceDelegationConnectorEClass, SourceDelegationConnector.class, "SourceDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSourceDelegationConnector_InnerSourceRole__SourceRole(), theRepository_av_avPackage.getSourceRole(), null, "innerSourceRole__SourceRole", null, 0, 1, SourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSourceDelegationConnector_OuterSourceRole__SourceRole(), theRepository_av_avPackage.getSourceRole(), null, "outerSourceRole__SourceRole", null, 0, 1, SourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSourceDelegationConnector_AssemblyContext__SourceDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext__SourceDelegationConnector", null, 0, 1, SourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(sinkDelegationConnectorEClass, SinkDelegationConnector.class, "SinkDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSinkDelegationConnector_AssemblyContext__SinkDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext__SinkDelegationConnector", null, 0, 1, SinkDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSinkDelegationConnector_InnerSinkRole__SinkRole(), theRepository_av_avPackage.getSinkRole(), null, "innerSinkRole__SinkRole", null, 0, 1, SinkDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSinkDelegationConnector_OuterSinkRole__SinkRole(), theRepository_av_avPackage.getSinkRole(), null, "outerSinkRole__SinkRole", null, 0, 1, SinkDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(assemblyInfrastructureConnectorEClass, AssemblyInfrastructureConnector.class, "AssemblyInfrastructureConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAssemblyInfrastructureConnector_ProvidedRole__AssemblyInfrastructureConnector(), theRepository_av_avPackage.getInfrastructureProvidedRole(), null, "providedRole__AssemblyInfrastructureConnector", null, 0, 1, AssemblyInfrastructureConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyInfrastructureConnector_RequiredRole__AssemblyInfrastructureConnector(), theRepository_av_avPackage.getInfrastructureRequiredRole(), null, "requiredRole__AssemblyInfrastructureConnector", null, 0, 1, AssemblyInfrastructureConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyInfrastructureConnector_ProvidingAssemblyContext__AssemblyInfrastructureConnector(), this.getAssemblyContext(), null, "providingAssemblyContext__AssemblyInfrastructureConnector", null, 0, 1, AssemblyInfrastructureConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyInfrastructureConnector_RequiringAssemblyContext__AssemblyInfrastructureConnector(), this.getAssemblyContext(), null, "requiringAssemblyContext__AssemblyInfrastructureConnector", null, 0, 1, AssemblyInfrastructureConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(providedInfrastructureDelegationConnectorEClass, ProvidedInfrastructureDelegationConnector.class, "ProvidedInfrastructureDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getProvidedInfrastructureDelegationConnector_InnerProvidedRole__ProvidedInfrastructureDelegationConnector(), theRepository_av_avPackage.getInfrastructureProvidedRole(), null, "innerProvidedRole__ProvidedInfrastructureDelegationConnector", null, 0, 1, ProvidedInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProvidedInfrastructureDelegationConnector_OuterProvidedRole__ProvidedInfrastructureDelegationConnector(), theRepository_av_avPackage.getInfrastructureProvidedRole(), null, "outerProvidedRole__ProvidedInfrastructureDelegationConnector", null, 0, 1, ProvidedInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProvidedInfrastructureDelegationConnector_AssemblyContext__ProvidedInfrastructureDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext__ProvidedInfrastructureDelegationConnector", null, 0, 1, ProvidedInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(requiredInfrastructureDelegationConnectorEClass, RequiredInfrastructureDelegationConnector.class, "RequiredInfrastructureDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRequiredInfrastructureDelegationConnector_InnerRequiredRole__RequiredInfrastructureDelegationConnector(), theRepository_av_avPackage.getInfrastructureRequiredRole(), null, "innerRequiredRole__RequiredInfrastructureDelegationConnector", null, 0, 1, RequiredInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRequiredInfrastructureDelegationConnector_OuterRequiredRole__RequiredInfrastructureDelegationConnector(), theRepository_av_avPackage.getInfrastructureRequiredRole(), null, "outerRequiredRole__RequiredInfrastructureDelegationConnector", null, 0, 1, RequiredInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRequiredInfrastructureDelegationConnector_AssemblyContext__RequiredInfrastructureDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext__RequiredInfrastructureDelegationConnector", null, 0, 1, RequiredInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(requiredResourceDelegationConnectorEClass, RequiredResourceDelegationConnector.class, "RequiredResourceDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRequiredResourceDelegationConnector_AssemblyContext__RequiredResourceDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext__RequiredResourceDelegationConnector", null, 0, 1, RequiredResourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRequiredResourceDelegationConnector_InnerRequiredRole__RequiredResourceDelegationConnector(), theEntity_av_avPackage.getResourceRequiredRole(), null, "innerRequiredRole__RequiredResourceDelegationConnector", null, 0, 1, RequiredResourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRequiredResourceDelegationConnector_OuterRequiredRole__RequiredResourceDelegationConnector(), theEntity_av_avPackage.getResourceRequiredRole(), null, "outerRequiredRole__RequiredResourceDelegationConnector", null, 0, 1, RequiredResourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(assemblyContextEClass, AssemblyContext.class, "AssemblyContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAssemblyContext_ParentStructure__AssemblyContext(), this.getComposedStructure(), this.getComposedStructure_AssemblyContexts__ComposedStructure(), "parentStructure__AssemblyContext", null, 0, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyContext_EncapsulatedComponent__AssemblyContext(), theRepository_av_avPackage.getRepositoryComponent(), null, "encapsulatedComponent__AssemblyContext", null, 0, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAssemblyContext_ConfigParameterUsages__AssemblyContext(), theParameter_av_avPackage.getVariableUsage(), theParameter_av_avPackage.getVariableUsage_AssemblyContext__VariableUsage(), "configParameterUsages__AssemblyContext", null, 0, -1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      // Create annotations
      // http://www.eclipse.org/uml2/1.1.0/GenModel
      createGenModel_1Annotations();
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModel_1Annotations() {
      String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";						
      addAnnotation
        (composedStructureEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(pcm::core::composition::ProvidedDelegationConnector)).oclAsType(pcm::core::composition::ProvidedDelegationConnector)->forAll( c1, c2 | c1 <> c2 implies c1.outerProvidedRole_ProvidedDelegationConnector <> c2.outerProvidedRole_ProvidedDelegationConnector)\r\n"
         });				
      addAnnotation
        (composedStructureEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(pcm::core::composition::AssemblyConnector)).oclAsType(AssemblyConnector)->forAll( c1, c2 | ( (c1 <> c2) and ( c1.requiringAssemblyContext_AssemblyConnector = c2.requiringAssemblyContext_AssemblyConnector ) ) implies c1.requiredRole_AssemblyConnector <> c2.requiredRole_AssemblyConnector )\r\n"
         });						
      addAnnotation
        (providedDelegationConnectorEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.parentStructure__Connector = self.assemblyContext_ProvidedDelegationConnector.parentStructure__AssemblyContext"
         });				
      addAnnotation
        (providedDelegationConnectorEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.innerProvidedRole_ProvidedDelegationConnector.providingEntity_ProvidedRole = self.assemblyContext_ProvidedDelegationConnector.encapsulatedComponent__AssemblyContext"
         });					
      addAnnotation
        (requiredDelegationConnectorEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.parentStructure__Connector = self.assemblyContext_RequiredDelegationConnector.parentStructure__AssemblyContext"
         });				
      addAnnotation
        (requiredDelegationConnectorEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.innerRequiredRole_RequiredDelegationConnector.requiringEntity_RequiredRole = self.assemblyContext_RequiredDelegationConnector.encapsulatedComponent__AssemblyContext"
         });				
      addAnnotation
        (requiredDelegationConnectorEClass.getEOperations().get(2), 
         source, 
         new String[] {
          "body", "self.outerRequiredRole_RequiredDelegationConnector.requiringEntity_RequiredRole=self.parentStructure__Connector"
         });					
      addAnnotation
        (assemblyConnectorEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.providingAssemblyContext_AssemblyConnector.encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity->includes(self.providedRole_AssemblyConnector)\r\n\r\n"
         });					
      addAnnotation
        (assemblyConnectorEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.requiringAssemblyContext_AssemblyConnector.encapsulatedComponent__AssemblyContext.requiredRoles_InterfaceRequiringEntity->includes(self.requiredRole_AssemblyConnector)\r\n\r\n"
         });					
      addAnnotation
        (assemblyConnectorEClass.getEOperations().get(2), 
         source, 
         new String[] {
          "body", "self.providedRole_AssemblyConnector.providedInterface__OperationProvidedRole = self.requiredRole_AssemblyConnector.requiredInterface__OperationRequiredRole"
         });							
   }

} //Composition_av_avPackageImpl
