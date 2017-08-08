/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.scheduler.SchedulerPackage;

import com.misc.common.moplaf.schedulercalc.CalcResourceExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.CalcSolutionAllExpressionCandidateValues;
import com.misc.common.moplaf.schedulercalc.CalcSolutionExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.CalcTaksExpressionCandidateValueCumulative;
import com.misc.common.moplaf.schedulercalc.CalcTaskExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.ResetResourceExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.ResetResourceTasksCandidateNext;
import com.misc.common.moplaf.schedulercalc.ResetResourceTasksCandidateScheduledResource;
import com.misc.common.moplaf.schedulercalc.ResetSolutionAllExpressionCandidateValues;
import com.misc.common.moplaf.schedulercalc.ResetSolutionExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.ResetTaskCandidateNext;
import com.misc.common.moplaf.schedulercalc.ResetTaskCandidateScheduledResource;
import com.misc.common.moplaf.schedulercalc.ResetTaskExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.ResourceExpressionPropagatorFunction;
import com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcFactory;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResource;
import com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResourceScope;
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
	private EClass calcSolutionAllExpressionCandidateValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetSolutionAllExpressionCandidateValuesEClass = null;

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
	private EClass resetSolutionExpressionCandidateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcResourceExpressionCandidateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetResourceExpressionCandidateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskExpressionCandidateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetTaskExpressionCandidateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetTaskCandidateNextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetTaskCandidateScheduledResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetResourceTasksCandidateNextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetResourceTasksCandidateScheduledResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTaskCandidateScheduledResourceScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTaskCandidateScheduledResourceEClass = null;

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
	private EClass calcSolutionExpressionCandidateValueEClass = null;

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
	private EClass solutionPropagatorFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaksExpressionCandidateValueCumulativeEClass = null;

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
		SchedulerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSchedulerCalcPackage.createPackageContents();

		// Initialize created meta-data
		theSchedulerCalcPackage.initializePackageContents();

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
	public EClass getCalcSolutionAllExpressionCandidateValues() {
		return calcSolutionAllExpressionCandidateValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetSolutionAllExpressionCandidateValues() {
		return resetSolutionAllExpressionCandidateValuesEClass;
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
	public EClass getResetSolutionExpressionCandidateValue() {
		return resetSolutionExpressionCandidateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcResourceExpressionCandidateValue() {
		return calcResourceExpressionCandidateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetResourceExpressionCandidateValue() {
		return resetResourceExpressionCandidateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskExpressionCandidateValue() {
		return calcTaskExpressionCandidateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetTaskExpressionCandidateValue() {
		return resetTaskExpressionCandidateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetTaskCandidateNext() {
		return resetTaskCandidateNextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetTaskCandidateScheduledResource() {
		return resetTaskCandidateScheduledResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetResourceTasksCandidateNext() {
		return resetResourceTasksCandidateNextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetResourceTasksCandidateScheduledResource() {
		return resetResourceTasksCandidateScheduledResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTaskCandidateScheduledResourceScope() {
		return setTaskCandidateScheduledResourceScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTaskCandidateScheduledResource() {
		return setTaskCandidateScheduledResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTaskCandidateScheduledResource_ConcreteParent() {
		return (EReference)setTaskCandidateScheduledResourceEClass.getEStructuralFeatures().get(0);
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
	public EClass getCalcSolutionExpressionCandidateValue() {
		return calcSolutionExpressionCandidateValueEClass;
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
	public EClass getCalcTaksExpressionCandidateValueCumulative() {
		return calcTaksExpressionCandidateValueCumulativeEClass;
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

		calcSolutionAllExpressionCandidateValuesEClass = createEClass(CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES);

		calcSolutionExpressionCandidateValueEClass = createEClass(CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE);

		calcResourceExpressionCandidateValueEClass = createEClass(CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE);

		calcTaskExpressionCandidateValueEClass = createEClass(CALC_TASK_EXPRESSION_CANDIDATE_VALUE);

		calcTaksExpressionCandidateValueCumulativeEClass = createEClass(CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE);

		resetSolutionAllExpressionCandidateValuesEClass = createEClass(RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES);

		resetSolutionExpressionCandidateValueEClass = createEClass(RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE);

		resetResourceExpressionCandidateValueEClass = createEClass(RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE);

		resetTaskExpressionCandidateValueEClass = createEClass(RESET_TASK_EXPRESSION_CANDIDATE_VALUE);

		resetTaskCandidateNextEClass = createEClass(RESET_TASK_CANDIDATE_NEXT);

		resetTaskCandidateScheduledResourceEClass = createEClass(RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE);

		resetResourceTasksCandidateNextEClass = createEClass(RESET_RESOURCE_TASKS_CANDIDATE_NEXT);

		resetResourceTasksCandidateScheduledResourceEClass = createEClass(RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE);

		setTaskCandidateScheduledResourceScopeEClass = createEClass(SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE);

		setTaskCandidateScheduledResourceEClass = createEClass(SET_TASK_CANDIDATE_SCHEDULED_RESOURCE);
		createEReference(setTaskCandidateScheduledResourceEClass, SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__CONCRETE_PARENT);
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
		calcSolutionAllExpressionCandidateValuesEClass.getESuperTypes().add(this.getSolutionPropagatorFunction());
		calcSolutionExpressionCandidateValueEClass.getESuperTypes().add(this.getSolutionExpressionPropagatorFunction());
		calcResourceExpressionCandidateValueEClass.getESuperTypes().add(this.getResourceExpressionPropagatorFunction());
		calcTaskExpressionCandidateValueEClass.getESuperTypes().add(this.getTaskExpressionPropagatorFunction());
		calcTaksExpressionCandidateValueCumulativeEClass.getESuperTypes().add(this.getCalcTaskExpressionCandidateValue());
		resetSolutionAllExpressionCandidateValuesEClass.getESuperTypes().add(this.getSolutionPropagatorFunction());
		resetSolutionExpressionCandidateValueEClass.getESuperTypes().add(this.getSolutionExpressionPropagatorFunction());
		resetResourceExpressionCandidateValueEClass.getESuperTypes().add(this.getResourceExpressionPropagatorFunction());
		resetTaskExpressionCandidateValueEClass.getESuperTypes().add(this.getTaskExpressionPropagatorFunction());
		resetTaskCandidateNextEClass.getESuperTypes().add(this.getTaskPropagatorFunction());
		resetTaskCandidateScheduledResourceEClass.getESuperTypes().add(this.getTaskPropagatorFunction());
		resetResourceTasksCandidateNextEClass.getESuperTypes().add(this.getResourcePropagatorFunction());
		resetResourceTasksCandidateScheduledResourceEClass.getESuperTypes().add(this.getResourcePropagatorFunction());
		setTaskCandidateScheduledResourceScopeEClass.getESuperTypes().add(this.getSolutionPropagatorFunction());
		setTaskCandidateScheduledResourceEClass.getESuperTypes().add(this.getTaskPropagatorFunction());

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

		initEClass(calcSolutionAllExpressionCandidateValuesEClass, CalcSolutionAllExpressionCandidateValues.class, "CalcSolutionAllExpressionCandidateValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcSolutionExpressionCandidateValueEClass, CalcSolutionExpressionCandidateValue.class, "CalcSolutionExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcResourceExpressionCandidateValueEClass, CalcResourceExpressionCandidateValue.class, "CalcResourceExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcTaskExpressionCandidateValueEClass, CalcTaskExpressionCandidateValue.class, "CalcTaskExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcTaksExpressionCandidateValueCumulativeEClass, CalcTaksExpressionCandidateValueCumulative.class, "CalcTaksExpressionCandidateValueCumulative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resetSolutionAllExpressionCandidateValuesEClass, ResetSolutionAllExpressionCandidateValues.class, "ResetSolutionAllExpressionCandidateValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resetSolutionExpressionCandidateValueEClass, ResetSolutionExpressionCandidateValue.class, "ResetSolutionExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resetResourceExpressionCandidateValueEClass, ResetResourceExpressionCandidateValue.class, "ResetResourceExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resetTaskExpressionCandidateValueEClass, ResetTaskExpressionCandidateValue.class, "ResetTaskExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resetTaskCandidateNextEClass, ResetTaskCandidateNext.class, "ResetTaskCandidateNext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resetTaskCandidateScheduledResourceEClass, ResetTaskCandidateScheduledResource.class, "ResetTaskCandidateScheduledResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resetResourceTasksCandidateNextEClass, ResetResourceTasksCandidateNext.class, "ResetResourceTasksCandidateNext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resetResourceTasksCandidateScheduledResourceEClass, ResetResourceTasksCandidateScheduledResource.class, "ResetResourceTasksCandidateScheduledResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setTaskCandidateScheduledResourceScopeEClass, SetTaskCandidateScheduledResourceScope.class, "SetTaskCandidateScheduledResourceScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setTaskCandidateScheduledResourceEClass, SetTaskCandidateScheduledResource.class, "SetTaskCandidateScheduledResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetTaskCandidateScheduledResource_ConcreteParent(), this.getSetTaskCandidateScheduledResourceScope(), null, "ConcreteParent", null, 1, 1, SetTaskCandidateScheduledResource.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SchedulerCalcPackageImpl
