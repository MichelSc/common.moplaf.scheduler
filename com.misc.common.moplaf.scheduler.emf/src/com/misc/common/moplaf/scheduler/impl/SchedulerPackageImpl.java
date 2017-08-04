/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.scheduler.CalcResourceExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.CalcSolutionAllExpressionCandidateValues;
import com.misc.common.moplaf.scheduler.CalcSolutionExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.Move;
import com.misc.common.moplaf.scheduler.MoveExpression;
import com.misc.common.moplaf.scheduler.ResetResourceExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues;
import com.misc.common.moplaf.scheduler.ResetSolutionExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.ResourceExpression;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionExpression;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.common.moplaf.scheduler.TaskExpression;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulerPackageImpl extends EPackageImpl implements SchedulerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskExpressionEClass = null;

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
	private EClass calcTaskExpressionCandidateValueEClass = null;

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
	private EClass calcResourceExpressionCandidateValueEClass = null;

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
	private EClass resetSolutionExpressionCandidateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSolutionExpressionCandidateValueEClass = null;

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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchedulerPackageImpl() {
		super(eNS_URI, SchedulerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchedulerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchedulerPackage init() {
		if (isInited) return (SchedulerPackage)EPackage.Registry.INSTANCE.getEPackage(SchedulerPackage.eNS_URI);

		// Obtain or create and register package
		SchedulerPackageImpl theSchedulerPackage = (SchedulerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SchedulerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SchedulerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropagatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSchedulerPackage.createPackageContents();

		// Initialize created meta-data
		theSchedulerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchedulerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchedulerPackage.eNS_URI, theSchedulerPackage);
		return theSchedulerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduler() {
		return schedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_Solutions() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_Resources() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_Tasks() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Moves() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Resources() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Tasks() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_CandidateMove() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Expressions() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__Duplicate() {
		return solutionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__SetCandidate__Move() {
		return solutionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMove() {
		return moveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_Expressions() {
		return (EReference)moveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMove__Accept() {
		return moveEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionResource() {
		return solutionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionResource_Resource() {
		return (EReference)solutionResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionResource_AssignedTasks() {
		return (EReference)solutionResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionResource_CandidateAssignedTasks() {
		return (EReference)solutionResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionResource_Expressions() {
		return (EReference)solutionResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionTask() {
		return solutionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_Task() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_NextTask() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_PreviousTask() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_AssignedResource() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_CandidateAssignedResource() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_CandidateNextTask() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_CandidatePreviousTask() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_Expressions() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionExpression() {
		return solutionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveExpression() {
		return moveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceExpression() {
		return resourceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskExpression() {
		return taskExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskExpression_ResetCandidateValue() {
		return (EReference)taskExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskExpression_CalcCandidateValue() {
		return (EReference)taskExpressionEClass.getEStructuralFeatures().get(1);
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
	public EReference getResetTaskExpressionCandidateValue_Expression() {
		return (EReference)resetTaskExpressionCandidateValueEClass.getEStructuralFeatures().get(0);
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
	public EReference getCalcTaskExpressionCandidateValue_Expression() {
		return (EReference)calcTaskExpressionCandidateValueEClass.getEStructuralFeatures().get(0);
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
	public EReference getResetResourceExpressionCandidateValue_Expression() {
		return (EReference)resetResourceExpressionCandidateValueEClass.getEStructuralFeatures().get(0);
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
	public EReference getCalcResourceExpressionCandidateValue_Expression() {
		return (EReference)calcResourceExpressionCandidateValueEClass.getEStructuralFeatures().get(0);
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
	public EReference getCalcSolutionAllExpressionCandidateValues_Solution() {
		return (EReference)calcSolutionAllExpressionCandidateValuesEClass.getEStructuralFeatures().get(0);
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
	public EReference getResetSolutionAllExpressionCandidateValues_Solution() {
		return (EReference)resetSolutionAllExpressionCandidateValuesEClass.getEStructuralFeatures().get(0);
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
	public EReference getResetSolutionExpressionCandidateValue_Expression() {
		return (EReference)resetSolutionExpressionCandidateValueEClass.getEStructuralFeatures().get(0);
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
	public EReference getCalcSolutionExpressionCandidateValue_Expression() {
		return (EReference)calcSolutionExpressionCandidateValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerFactory getSchedulerFactory() {
		return (SchedulerFactory)getEFactoryInstance();
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
		schedulerEClass = createEClass(SCHEDULER);
		createEReference(schedulerEClass, SCHEDULER__SOLUTIONS);
		createEReference(schedulerEClass, SCHEDULER__RESOURCES);
		createEReference(schedulerEClass, SCHEDULER__TASKS);

		resourceEClass = createEClass(RESOURCE);

		taskEClass = createEClass(TASK);

		solutionEClass = createEClass(SOLUTION);
		createEReference(solutionEClass, SOLUTION__MOVES);
		createEReference(solutionEClass, SOLUTION__RESOURCES);
		createEReference(solutionEClass, SOLUTION__TASKS);
		createEReference(solutionEClass, SOLUTION__CANDIDATE_MOVE);
		createEReference(solutionEClass, SOLUTION__EXPRESSIONS);
		createEOperation(solutionEClass, SOLUTION___DUPLICATE);
		createEOperation(solutionEClass, SOLUTION___SET_CANDIDATE__MOVE);

		moveEClass = createEClass(MOVE);
		createEReference(moveEClass, MOVE__EXPRESSIONS);
		createEOperation(moveEClass, MOVE___ACCEPT);

		solutionResourceEClass = createEClass(SOLUTION_RESOURCE);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__RESOURCE);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__ASSIGNED_TASKS);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__EXPRESSIONS);

		solutionTaskEClass = createEClass(SOLUTION_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__NEXT_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__PREVIOUS_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__ASSIGNED_RESOURCE);
		createEReference(solutionTaskEClass, SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE);
		createEReference(solutionTaskEClass, SOLUTION_TASK__CANDIDATE_NEXT_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__EXPRESSIONS);

		solutionExpressionEClass = createEClass(SOLUTION_EXPRESSION);

		moveExpressionEClass = createEClass(MOVE_EXPRESSION);

		resourceExpressionEClass = createEClass(RESOURCE_EXPRESSION);

		taskExpressionEClass = createEClass(TASK_EXPRESSION);
		createEReference(taskExpressionEClass, TASK_EXPRESSION__RESET_CANDIDATE_VALUE);
		createEReference(taskExpressionEClass, TASK_EXPRESSION__CALC_CANDIDATE_VALUE);

		resetTaskExpressionCandidateValueEClass = createEClass(RESET_TASK_EXPRESSION_CANDIDATE_VALUE);
		createEReference(resetTaskExpressionCandidateValueEClass, RESET_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION);

		calcTaskExpressionCandidateValueEClass = createEClass(CALC_TASK_EXPRESSION_CANDIDATE_VALUE);
		createEReference(calcTaskExpressionCandidateValueEClass, CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION);

		resetResourceExpressionCandidateValueEClass = createEClass(RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE);
		createEReference(resetResourceExpressionCandidateValueEClass, RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__EXPRESSION);

		calcResourceExpressionCandidateValueEClass = createEClass(CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE);
		createEReference(calcResourceExpressionCandidateValueEClass, CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__EXPRESSION);

		calcSolutionAllExpressionCandidateValuesEClass = createEClass(CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES);
		createEReference(calcSolutionAllExpressionCandidateValuesEClass, CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__SOLUTION);

		resetSolutionAllExpressionCandidateValuesEClass = createEClass(RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES);
		createEReference(resetSolutionAllExpressionCandidateValuesEClass, RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__SOLUTION);

		resetSolutionExpressionCandidateValueEClass = createEClass(RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE);
		createEReference(resetSolutionExpressionCandidateValueEClass, RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION);

		calcSolutionExpressionCandidateValueEClass = createEClass(CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE);
		createEReference(calcSolutionExpressionCandidateValueEClass, CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taskExpressionEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		resetTaskExpressionCandidateValueEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		calcTaskExpressionCandidateValueEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		resetResourceExpressionCandidateValueEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		calcResourceExpressionCandidateValueEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		calcSolutionAllExpressionCandidateValuesEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		resetSolutionAllExpressionCandidateValuesEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		resetSolutionExpressionCandidateValueEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		calcSolutionExpressionCandidateValueEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());

		// Initialize classes, features, and operations; add parameters
		initEClass(schedulerEClass, Scheduler.class, "Scheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScheduler_Solutions(), this.getSolution(), null, "Solutions", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_Resources(), this.getResource(), null, "Resources", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_Tasks(), this.getTask(), null, "Tasks", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolution_Moves(), this.getMove(), null, "Moves", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Resources(), this.getSolutionTask(), null, "Resources", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Tasks(), this.getSolutionResource(), null, "Tasks", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_CandidateMove(), this.getMove(), null, "CandidateMove", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Expressions(), this.getSolutionExpression(), null, "Expressions", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolution__Duplicate(), null, "duplicate", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getSolution__SetCandidate__Move(), null, "setCandidate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMove(), "move", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMove_Expressions(), this.getMoveExpression(), null, "Expressions", null, 0, -1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMove__Accept(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solutionResourceEClass, SolutionResource.class, "SolutionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionResource_Resource(), this.getResource(), null, "Resource", null, 1, 1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionResource_AssignedTasks(), this.getSolutionTask(), this.getSolutionTask_AssignedResource(), "AssignedTasks", null, 0, -1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionResource_CandidateAssignedTasks(), this.getSolutionTask(), this.getSolutionTask_CandidateAssignedResource(), "CandidateAssignedTasks", null, 0, -1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionResource_Expressions(), this.getResourceExpression(), null, "Expressions", null, 0, -1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionTaskEClass, SolutionTask.class, "SolutionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionTask_Task(), this.getTask(), null, "Task", null, 1, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_NextTask(), this.getSolutionTask(), this.getSolutionTask_PreviousTask(), "NextTask", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_PreviousTask(), this.getSolutionTask(), this.getSolutionTask_NextTask(), "PreviousTask", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_AssignedResource(), this.getSolutionResource(), this.getSolutionResource_AssignedTasks(), "AssignedResource", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_CandidateAssignedResource(), this.getSolutionResource(), this.getSolutionResource_CandidateAssignedTasks(), "CandidateAssignedResource", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_CandidateNextTask(), this.getSolutionTask(), this.getSolutionTask_CandidatePreviousTask(), "CandidateNextTask", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_CandidatePreviousTask(), this.getSolutionTask(), this.getSolutionTask_CandidateNextTask(), "CandidatePreviousTask", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_Expressions(), this.getTaskExpression(), null, "Expressions", null, 0, -1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionExpressionEClass, SolutionExpression.class, "SolutionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveExpressionEClass, MoveExpression.class, "MoveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceExpressionEClass, ResourceExpression.class, "ResourceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskExpressionEClass, TaskExpression.class, "TaskExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskExpression_ResetCandidateValue(), this.getResetTaskExpressionCandidateValue(), this.getResetTaskExpressionCandidateValue_Expression(), "ResetCandidateValue", null, 1, 1, TaskExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskExpression_CalcCandidateValue(), this.getCalcTaskExpressionCandidateValue(), this.getCalcTaskExpressionCandidateValue_Expression(), "CalcCandidateValue", null, 1, 1, TaskExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetTaskExpressionCandidateValueEClass, ResetTaskExpressionCandidateValue.class, "ResetTaskExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResetTaskExpressionCandidateValue_Expression(), this.getTaskExpression(), this.getTaskExpression_ResetCandidateValue(), "Expression", null, 1, 1, ResetTaskExpressionCandidateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskExpressionCandidateValueEClass, CalcTaskExpressionCandidateValue.class, "CalcTaskExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskExpressionCandidateValue_Expression(), this.getTaskExpression(), this.getTaskExpression_CalcCandidateValue(), "Expression", null, 1, 1, CalcTaskExpressionCandidateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetResourceExpressionCandidateValueEClass, ResetResourceExpressionCandidateValue.class, "ResetResourceExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResetResourceExpressionCandidateValue_Expression(), this.getResourceExpression(), null, "Expression", null, 1, 1, ResetResourceExpressionCandidateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcResourceExpressionCandidateValueEClass, CalcResourceExpressionCandidateValue.class, "CalcResourceExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcResourceExpressionCandidateValue_Expression(), this.getResourceExpression(), null, "Expression", null, 1, 1, CalcResourceExpressionCandidateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcSolutionAllExpressionCandidateValuesEClass, CalcSolutionAllExpressionCandidateValues.class, "CalcSolutionAllExpressionCandidateValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcSolutionAllExpressionCandidateValues_Solution(), this.getSolution(), null, "Solution", null, 1, 1, CalcSolutionAllExpressionCandidateValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetSolutionAllExpressionCandidateValuesEClass, ResetSolutionAllExpressionCandidateValues.class, "ResetSolutionAllExpressionCandidateValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResetSolutionAllExpressionCandidateValues_Solution(), this.getSolution(), null, "Solution", null, 1, 1, ResetSolutionAllExpressionCandidateValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetSolutionExpressionCandidateValueEClass, ResetSolutionExpressionCandidateValue.class, "ResetSolutionExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResetSolutionExpressionCandidateValue_Expression(), this.getSolutionExpression(), null, "Expression", null, 1, 1, ResetSolutionExpressionCandidateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcSolutionExpressionCandidateValueEClass, CalcSolutionExpressionCandidateValue.class, "CalcSolutionExpressionCandidateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcSolutionExpressionCandidateValue_Expression(), this.getSolutionExpression(), null, "Expression", null, 1, 1, CalcSolutionExpressionCandidateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SchedulerPackageImpl
