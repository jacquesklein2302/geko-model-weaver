/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.Advice;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.DummyClass;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.GlobalScope;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.Pcm_av_pcFactory;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.Pcm_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.PerJoinPointScope;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.Pointcut;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.allocation_av_pc.Allocation_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.allocation_av_pc.impl.Allocation_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.Completions_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.impl.Completions_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.Core_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.Composition_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.impl.Entity_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.impl.Core_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.Parameter_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.impl.Parameter_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.protocol_av_pc.Protocol_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.protocol_av_pc.impl.Protocol_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.Qosannotations_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.impl.Qosannotations_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.Qos_performance_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.impl.Qos_performance_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.Qos_reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.impl.Qos_reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.Reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.impl.Reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.Repository_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.Resourceenvironment_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.Resourceenvironment_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.Resourcetype_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl.Resourcetype_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.impl.Seff_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.Seff_performance_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.impl.Seff_performance_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.Seff_reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.impl.Seff_reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.Subsystem_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.impl.Subsystem_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.impl.System_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.Usagemodel_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pcm_av_pcPackageImpl extends EPackageImpl implements Pcm_av_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass dummyClassEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass adviceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass globalScopeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass perJoinPointScopeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass pointcutEClass = null;

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
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.Pcm_av_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Pcm_av_pcPackageImpl() {
      super(eNS_URI, Pcm_av_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Pcm_av_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Pcm_av_pcPackage init() {
      if (isInited) return (Pcm_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Pcm_av_pcPackage.eNS_URI);

      // Obtain or create and register package
      Pcm_av_pcPackageImpl thePcm_av_pcPackage = (Pcm_av_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Pcm_av_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Pcm_av_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_av_pcPackage.eINSTANCE.eClass();
      Stoex_av_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Core_av_pcPackageImpl theCore_av_pcPackage = (Core_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_av_pcPackage.eNS_URI) instanceof Core_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_av_pcPackage.eNS_URI) : Core_av_pcPackage.eINSTANCE);
      Entity_av_pcPackageImpl theEntity_av_pcPackage = (Entity_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI) instanceof Entity_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI) : Entity_av_pcPackage.eINSTANCE);
      Composition_av_pcPackageImpl theComposition_av_pcPackage = (Composition_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_av_pcPackage.eNS_URI) instanceof Composition_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_av_pcPackage.eNS_URI) : Composition_av_pcPackage.eINSTANCE);
      Usagemodel_av_pcPackageImpl theUsagemodel_av_pcPackage = (Usagemodel_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_pcPackage.eNS_URI) instanceof Usagemodel_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_pcPackage.eNS_URI) : Usagemodel_av_pcPackage.eINSTANCE);
      Repository_av_pcPackageImpl theRepository_av_pcPackage = (Repository_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI) instanceof Repository_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI) : Repository_av_pcPackage.eINSTANCE);
      Resourcetype_av_pcPackageImpl theResourcetype_av_pcPackage = (Resourcetype_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_pcPackage.eNS_URI) instanceof Resourcetype_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_pcPackage.eNS_URI) : Resourcetype_av_pcPackage.eINSTANCE);
      Protocol_av_pcPackageImpl theProtocol_av_pcPackage = (Protocol_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_av_pcPackage.eNS_URI) instanceof Protocol_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_av_pcPackage.eNS_URI) : Protocol_av_pcPackage.eINSTANCE);
      Parameter_av_pcPackageImpl theParameter_av_pcPackage = (Parameter_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI) instanceof Parameter_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI) : Parameter_av_pcPackage.eINSTANCE);
      Reliability_av_pcPackageImpl theReliability_av_pcPackage = (Reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_av_pcPackage.eNS_URI) instanceof Reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_av_pcPackage.eNS_URI) : Reliability_av_pcPackage.eINSTANCE);
      Seff_av_pcPackageImpl theSeff_av_pcPackage = (Seff_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_av_pcPackage.eNS_URI) instanceof Seff_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_av_pcPackage.eNS_URI) : Seff_av_pcPackage.eINSTANCE);
      Seff_performance_av_pcPackageImpl theSeff_performance_av_pcPackage = (Seff_performance_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_pcPackage.eNS_URI) instanceof Seff_performance_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_pcPackage.eNS_URI) : Seff_performance_av_pcPackage.eINSTANCE);
      Seff_reliability_av_pcPackageImpl theSeff_reliability_av_pcPackage = (Seff_reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_pcPackage.eNS_URI) instanceof Seff_reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_pcPackage.eNS_URI) : Seff_reliability_av_pcPackage.eINSTANCE);
      Qosannotations_av_pcPackageImpl theQosannotations_av_pcPackage = (Qosannotations_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_pcPackage.eNS_URI) instanceof Qosannotations_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_pcPackage.eNS_URI) : Qosannotations_av_pcPackage.eINSTANCE);
      Qos_performance_av_pcPackageImpl theQos_performance_av_pcPackage = (Qos_performance_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_pcPackage.eNS_URI) instanceof Qos_performance_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_pcPackage.eNS_URI) : Qos_performance_av_pcPackage.eINSTANCE);
      Qos_reliability_av_pcPackageImpl theQos_reliability_av_pcPackage = (Qos_reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_pcPackage.eNS_URI) instanceof Qos_reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_pcPackage.eNS_URI) : Qos_reliability_av_pcPackage.eINSTANCE);
      System_av_pcPackageImpl theSystem_av_pcPackage = (System_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_av_pcPackage.eNS_URI) instanceof System_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_av_pcPackage.eNS_URI) : System_av_pcPackage.eINSTANCE);
      Resourceenvironment_av_pcPackageImpl theResourceenvironment_av_pcPackage = (Resourceenvironment_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_pcPackage.eNS_URI) instanceof Resourceenvironment_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_pcPackage.eNS_URI) : Resourceenvironment_av_pcPackage.eINSTANCE);
      Allocation_av_pcPackageImpl theAllocation_av_pcPackage = (Allocation_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_av_pcPackage.eNS_URI) instanceof Allocation_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_av_pcPackage.eNS_URI) : Allocation_av_pcPackage.eINSTANCE);
      Subsystem_av_pcPackageImpl theSubsystem_av_pcPackage = (Subsystem_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_pcPackage.eNS_URI) instanceof Subsystem_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_pcPackage.eNS_URI) : Subsystem_av_pcPackage.eINSTANCE);
      Completions_av_pcPackageImpl theCompletions_av_pcPackage = (Completions_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_av_pcPackage.eNS_URI) instanceof Completions_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_av_pcPackage.eNS_URI) : Completions_av_pcPackage.eINSTANCE);

      // Create package meta-data objects
      thePcm_av_pcPackage.createPackageContents();
      theCore_av_pcPackage.createPackageContents();
      theEntity_av_pcPackage.createPackageContents();
      theComposition_av_pcPackage.createPackageContents();
      theUsagemodel_av_pcPackage.createPackageContents();
      theRepository_av_pcPackage.createPackageContents();
      theResourcetype_av_pcPackage.createPackageContents();
      theProtocol_av_pcPackage.createPackageContents();
      theParameter_av_pcPackage.createPackageContents();
      theReliability_av_pcPackage.createPackageContents();
      theSeff_av_pcPackage.createPackageContents();
      theSeff_performance_av_pcPackage.createPackageContents();
      theSeff_reliability_av_pcPackage.createPackageContents();
      theQosannotations_av_pcPackage.createPackageContents();
      theQos_performance_av_pcPackage.createPackageContents();
      theQos_reliability_av_pcPackage.createPackageContents();
      theSystem_av_pcPackage.createPackageContents();
      theResourceenvironment_av_pcPackage.createPackageContents();
      theAllocation_av_pcPackage.createPackageContents();
      theSubsystem_av_pcPackage.createPackageContents();
      theCompletions_av_pcPackage.createPackageContents();

      // Initialize created meta-data
      thePcm_av_pcPackage.initializePackageContents();
      theCore_av_pcPackage.initializePackageContents();
      theEntity_av_pcPackage.initializePackageContents();
      theComposition_av_pcPackage.initializePackageContents();
      theUsagemodel_av_pcPackage.initializePackageContents();
      theRepository_av_pcPackage.initializePackageContents();
      theResourcetype_av_pcPackage.initializePackageContents();
      theProtocol_av_pcPackage.initializePackageContents();
      theParameter_av_pcPackage.initializePackageContents();
      theReliability_av_pcPackage.initializePackageContents();
      theSeff_av_pcPackage.initializePackageContents();
      theSeff_performance_av_pcPackage.initializePackageContents();
      theSeff_reliability_av_pcPackage.initializePackageContents();
      theQosannotations_av_pcPackage.initializePackageContents();
      theQos_performance_av_pcPackage.initializePackageContents();
      theQos_reliability_av_pcPackage.initializePackageContents();
      theSystem_av_pcPackage.initializePackageContents();
      theResourceenvironment_av_pcPackage.initializePackageContents();
      theAllocation_av_pcPackage.initializePackageContents();
      theSubsystem_av_pcPackage.initializePackageContents();
      theCompletions_av_pcPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      thePcm_av_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Pcm_av_pcPackage.eNS_URI, thePcm_av_pcPackage);
      return thePcm_av_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDummyClass() {
      return dummyClassEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAdvice() {
      return adviceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAdvice_Children() {
      return (EReference)adviceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getGlobalScope() {
      return globalScopeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getGlobalScope_ScopedObject() {
      return (EReference)globalScopeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPerJoinPointScope() {
      return perJoinPointScopeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPerJoinPointScope_ScopedObject() {
      return (EReference)perJoinPointScopeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPointcut() {
      return pointcutEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPointcut_Children() {
      return (EReference)pointcutEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pcm_av_pcFactory getPcm_av_pcFactory() {
      return (Pcm_av_pcFactory)getEFactoryInstance();
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
      dummyClassEClass = createEClass(DUMMY_CLASS);

      adviceEClass = createEClass(ADVICE);
      createEReference(adviceEClass, ADVICE__CHILDREN);

      globalScopeEClass = createEClass(GLOBAL_SCOPE);
      createEReference(globalScopeEClass, GLOBAL_SCOPE__SCOPED_OBJECT);

      perJoinPointScopeEClass = createEClass(PER_JOIN_POINT_SCOPE);
      createEReference(perJoinPointScopeEClass, PER_JOIN_POINT_SCOPE__SCOPED_OBJECT);

      pointcutEClass = createEClass(POINTCUT);
      createEReference(pointcutEClass, POINTCUT__CHILDREN);
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
      Core_av_pcPackage theCore_av_pcPackage = (Core_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_av_pcPackage.eNS_URI);
      Usagemodel_av_pcPackage theUsagemodel_av_pcPackage = (Usagemodel_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_pcPackage.eNS_URI);
      Repository_av_pcPackage theRepository_av_pcPackage = (Repository_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI);
      Resourcetype_av_pcPackage theResourcetype_av_pcPackage = (Resourcetype_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_pcPackage.eNS_URI);
      Protocol_av_pcPackage theProtocol_av_pcPackage = (Protocol_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Protocol_av_pcPackage.eNS_URI);
      Parameter_av_pcPackage theParameter_av_pcPackage = (Parameter_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI);
      Reliability_av_pcPackage theReliability_av_pcPackage = (Reliability_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Reliability_av_pcPackage.eNS_URI);
      Seff_av_pcPackage theSeff_av_pcPackage = (Seff_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_av_pcPackage.eNS_URI);
      Qosannotations_av_pcPackage theQosannotations_av_pcPackage = (Qosannotations_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_pcPackage.eNS_URI);
      System_av_pcPackage theSystem_av_pcPackage = (System_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(System_av_pcPackage.eNS_URI);
      Resourceenvironment_av_pcPackage theResourceenvironment_av_pcPackage = (Resourceenvironment_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_pcPackage.eNS_URI);
      Allocation_av_pcPackage theAllocation_av_pcPackage = (Allocation_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Allocation_av_pcPackage.eNS_URI);
      Subsystem_av_pcPackage theSubsystem_av_pcPackage = (Subsystem_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_pcPackage.eNS_URI);
      Completions_av_pcPackage theCompletions_av_pcPackage = (Completions_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Completions_av_pcPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theCore_av_pcPackage);
      getESubpackages().add(theUsagemodel_av_pcPackage);
      getESubpackages().add(theRepository_av_pcPackage);
      getESubpackages().add(theResourcetype_av_pcPackage);
      getESubpackages().add(theProtocol_av_pcPackage);
      getESubpackages().add(theParameter_av_pcPackage);
      getESubpackages().add(theReliability_av_pcPackage);
      getESubpackages().add(theSeff_av_pcPackage);
      getESubpackages().add(theQosannotations_av_pcPackage);
      getESubpackages().add(theSystem_av_pcPackage);
      getESubpackages().add(theResourceenvironment_av_pcPackage);
      getESubpackages().add(theAllocation_av_pcPackage);
      getESubpackages().add(theSubsystem_av_pcPackage);
      getESubpackages().add(theCompletions_av_pcPackage);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes

      // Initialize classes and features; add operations and parameters
      initEClass(dummyClassEClass, DummyClass.class, "DummyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(adviceEClass, Advice.class, "Advice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAdvice_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(globalScopeEClass, GlobalScope.class, "GlobalScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getGlobalScope_ScopedObject(), ecorePackage.getEObject(), null, "scopedObject", null, 0, 1, GlobalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(perJoinPointScopeEClass, PerJoinPointScope.class, "PerJoinPointScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPerJoinPointScope_ScopedObject(), ecorePackage.getEObject(), null, "scopedObject", null, 0, 1, PerJoinPointScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(pointcutEClass, Pointcut.class, "Pointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPointcut_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //Pcm_av_pcPackageImpl
