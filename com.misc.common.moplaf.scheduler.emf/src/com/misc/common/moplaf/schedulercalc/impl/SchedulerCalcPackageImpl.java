/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.scheduler.SchedulerPackage;

import com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl;
import com.misc.common.moplaf.schedulercalc.ResourceExpressionPropagatorFunction;
import com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcFactory;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetExpressionCandidateValueScope;
import com.misc.common.moplaf.schedulercalc.SetResourceExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.SetResourceSchedule;
import com.misc.common.moplaf.schedulercalc.SetScheduleScope;
import com.misc.common.moplaf.schedulercalc.SetSolutionExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.SetTaskExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.SetTaskSchedule;
import com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction;
import com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction;
import com.misc.common.moplaf.schedulercalc.TaskExpressionPropagatorFunction;

import com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction;
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
public class SchedulerCalcPackageImpl extends EPackageImpl implements SchedulerCalcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionExpressionPropagatorFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePropagatorFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setExpressionCandidateValueScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTaskExpressionCandidateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setSolutionExpressionCandidateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setResourceExpressionCandidateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setResourceScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceExpressionPropagatorFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskPropagatorFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskExpressionPropagatorFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setScheduleScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTaskScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionPropagatorFunctionEClass = null;

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
	 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchedulerCalcPackageImpl() {
		super(eNS_URI, SchedulerCalcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchedulerCalcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchedulerCalcPackage init() {
		if (isInited) return (SchedulerCalcPackage)EPackage.Registry.INSTANCE.getEPackage(SchedulerCalcPackage.eNS_URI);

		// Obtain or create and register package
		SchedulerCalcPackageImpl theSchedulerCalcPackage = (SchedulerCalcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SchedulerCalcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SchedulerCalcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropagatorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SchedulerPackageImpl theSchedulerPackage = (SchedulerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulerPackage.eNS_URI) instanceof SchedulerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulerPackage.eNS_URI) : SchedulerPackage.eINSTANCE);

		// Create package meta-data objects
		theSchedulerCalcPackage.createPackageContents();
		theSchedulerPackage.createPackageContents();

		// Initialize created meta-data
		theSchedulerCalcPackage.initializePackageContents();
		theSchedulerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchedulerCalcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchedulerCalcPackage.eNS_URI, theSchedulerCalcPackage);
		return theSchedulerCalcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionExpressionPropagatorFunction() {
		return solutionExpressionPropagatorFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionExpressionPropagatorFunction_SolutionExpression() {
		return (EReference)solutionExpressionPropagatorFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePropagatorFunction() {
		return resourcePropagatorFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePropagatorFunction_Resource() {
		return (EReference)resourcePropagatorFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetExpressionCandidateValueScope() {
		return setExpressionCandidateValueScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTaskExpressionCandidateValue() {
		return setTaskExpressionCandidateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTaskExpressionCandidateValue_ConcreteParent() {
		return (EReference)setTaskExpressionCandidateValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetSolutionExpressionCandidateValue() {
		return setSolutionExpressionCandidateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetSolutionExpressionCandidateValue_ConcreteParent() {
		return (EReference)setSolutionExpressionCandidateValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetResourceExpressionCandidateValue() {
		return setResourceExpressionCandidateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetResourceExpressionCandidateValue_ConcreteParent() {
		return (EReference)setResourceExpressionCandidateValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetResourceSchedule() {
		return setResourceScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetResourceSchedule_ConcreteParent() {
		return (EReference)setResourceScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceExpressionPropagatorFunction() {
		return resourceExpressionPropagatorFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceExpressionPropagatorFunction_ResourceExpression() {
		return (EReference)resourceExpressionPropagatorFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskPropagatorFunction() {
		return taskPropagatorFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskPropagatorFunction_Task() {
		return (EReference)taskPropagatorFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskExpressionPropagatorFunction() {
		return taskExpressionPropagatorFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskExpressionPropagatorFunction_TaskExpression() {
		return (EReference)taskExpressionPropagatorFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetScheduleScope() {
		return setScheduleScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTaskSchedule() {
		return setTaskScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTaskSchedule_ConcreteParent() {
		return (EReference)setTaskScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionPropagatorFunction() {
		return solutionPropagatorFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionPropagatorFunction_Solution() {
		return (EReference)solutionPropagatorFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerCalcFactory getSchedulerCalcFactory() {
		return (SchedulerCalcFactory)getEFactoryInstance();
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
		solutionPropagatorFunctionEClass = createEClass(SOLUTION_PROPAGATOR_FUNCTION);
		createEReference(solutionPropagatorFunctionEClass, SOLUTION_PROPAGATOR_FUNCTION__SOLUTION);

		solutionExpressionPropagatorFunctionEClass = createEClass(SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION);
		createEReference(solutionExpressionPropagatorFunctionEClass, SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__SOLUTION_EXPRESSION);

		resourcePropagatorFunctionEClass = createEClass(RESOURCE_PROPAGATOR_FUNCTION);
		createEReference(resourcePropagatorFunctionEClass, RESOURCE_PROPAGATOR_FUNCTION__RESOURCE);

		resourceExpressionPropagatorFunctionEClass = createEClass(RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION);
		createEReference(resourceExpressionPropagatorFunctionEClass, RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__RESOURCE_EXPRESSION);

		taskPropagatorFunctionEClass = createEClass(TASK_PROPAGATOR_FUNCTION);
		createEReference(taskPropagatorFunctionEClass, TASK_PROPAGATOR_FUNCTION__TASK);

		taskExpressionPropagatorFunctionEClass = createEClass(TASK_EXPRESSION_PROPAGATOR_FUNCTION);
		createEReference(taskExpressionPropagatorFunctionEClass, TASK_EXPRESSION_PROPAGATOR_FUNCTION__TASK_EXPRESSION);

		setScheduleScopeEClass = createEClass(SET_SCHEDULE_SCOPE);

		setTaskScheduleEClass = createEClass(SET_TASK_SCHEDULE);
		createEReference(setTaskScheduleEClass, SET_TASK_SCHEDULE__CONCRETE_PARENT);

		setExpressionCandidateValueScopeEClass = createEClass(SET_EXPRESSION_CANDIDATE_VALUE_SCOPE);

		setTaskExpressionCandidateValueEClass = createEClass(SET_TASK_EXPRESSION_CANDIDATE_VALUE);
		createEReference(setTaskExpressionCandidateValueEClass, SET_TASK_EXPRESSION_CANDIDATE_VALUE__CONCRETE_PARENT);

		setSolutionExpressionCandidateValueEClass = createEClass(SET_SOLUTION_EXPRESSION_CANDIDATE_VALUE);
		createEReference(setSolutionExpressionCandidateValueEClass, SET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__CONCRETE_PARENT);

		setResourceExpressionCandidateValueEClass = createEClass(SET_RESOURCE_EXPRESSION_CANDIDATE_VALUE);
		createEReference(setResourceExpressionCandidateValueEClass, SET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__CONCRETE_PARENT);

		setResourceScheduleEClass = createEClass(SET_RESOURCE_SCHEDULE);
		createEReference(setResourceScheduleEClass, SET_RESOURCE_SCHEDULE__CONCRETE_PARENT);
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
		PropagatorPackage thePropagatorPackage = (PropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(PropagatorPackage.eNS_URI);
		SchedulerPackage theSchedulerPackage = (SchedulerPackage)EPackage.Registry.INSTANCE.getEPackage(SchedulerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		solutionPropagatorFunctionEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		solutionExpressionPropagatorFunctionEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		resourcePropagatorFunctionEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		resourceExpressionPropagatorFunctionEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		taskPropagatorFunctionEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		taskExpressionPropagatorFunctionEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		setScheduleScopeEClass.getESuperTypes().add(this.getSolutionPropagatorFunction());
		setTaskScheduleEClass.getESuperTypes().add(this.getTaskPropagatorFunction());
		setExpressionCandidateValueScopeEClass.getESuperTypes().add(this.getSolutionPropagatorFunction());
		setTaskExpressionCandidateValueEClass.getESuperTypes().add(this.getTaskExpressionPropagatorFunction());
		setSolutionExpressionCandidateValueEClass.getESuperTypes().add(this.getSolutionExpressionPropagatorFunction());
		setResourceExpressionCandidateValueEClass.getESuperTypes().add(this.getResourceExpressionPropagatorFunction());
		setResourceScheduleEClass.getESuperTypes().add(this.getResourcePropagatorFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(solutionPropagatorFunctionEClass, SolutionPropagatorFunction.class, "SolutionPropagatorFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionPropagatorFunction_Solution(), theSchedulerPackage.getSolution(), null, "Solution", null, 1, 1, SolutionPropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(solutionExpressionPropagatorFunctionEClass, SolutionExpressionPropagatorFunction.class, "SolutionExpressionPropagatorFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionExpressionPropagatorFunction_SolutionExpression(), theSchedulerPackage.getSolutionExpression(), null, "SolutionExpression", null, 1, 1, SolutionExpressionPropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(resourcePropagatorFunctionEClass, ResourcePropagatorFunction.class, "ResourcePropagatorFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePropagatorFunction_Resource(), theSchedulerPackage.getSolutionResource(), null, "Resource", null, 1, 1, ResourcePropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(resourceExpressionPropagatorFunctionEClass, ResourceExpressionPropagatorFunction.class, "ResourceExpressionPropagatorFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceExpressionPropagatorFunction_ResourceExpression(), theSchedulerPackage.getResourceExpression(), null, "ResourceExpression", null, 1, 1, ResourceExpressionPropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(taskPropagatorFunctionEClass, TaskPropagatorFunction.class, "TaskPropagatorFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskPropagatorFunction_Task(), theSchedulerPackage.getSolutionTask(), null, "Task", null, 1, 1, TaskPropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(taskExpressionPropagatorFunctionEClass, TaskExpressionPropagatorFunction.class, "TaskExpressionPropagatorFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskExpressionPropagatorFunction_TaskExpression(), theSchedulerPackage.getTaskExpression(), null, "TaskExpression", null, 1, 1, TaskExpressionPropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(setScheduleScopeEClass, SetScheduleScope.class, "SetScheduleScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setTaskScheduleEClass, SetTaskSchedule.class, "SetTaskSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetTaskSchedule_ConcreteParent(), this.getSetScheduleScope(), null, "ConcreteParent", null, 1, 1, SetTaskSchedule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(setExpressionCandidateValueScopeEClass, SetExpressionCandidateValueScope.class, "SetExpressionCandidateValueScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setTaskExpressionCandidateValueEClass, SetTaskExpressionCandidateValue.class, "SetTaskExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetTaskExpressionCandidateValue_ConcreteParent(), this.getSetExpressionCandidateValueScope(), null, "ConcreteParent", null, 1, 1, SetTaskExpressionCandidateValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(setSolutionExpressionCandidateValueEClass, SetSolutionExpressionCandidateValue.class, "SetSolutionExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetSolutionExpressionCandidateValue_ConcreteParent(), this.getSetExpressionCandidateValueScope(), null, "ConcreteParent", null, 1, 1, SetSolutionExpressionCandidateValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(setResourceExpressionCandidateValueEClass, SetResourceExpressionCandidateValue.class, "SetResourceExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetResourceExpressionCandidateValue_ConcreteParent(), this.getSetExpressionCandidateValueScope(), null, "ConcreteParent", null, 1, 1, SetResourceExpressionCandidateValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(setResourceScheduleEClass, SetResourceSchedule.class, "SetResourceSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetResourceSchedule_ConcreteParent(), this.getSetScheduleScope(), null, "ConcreteParent", null, 1, 1, SetResourceSchedule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SchedulerCalcPackageImpl
