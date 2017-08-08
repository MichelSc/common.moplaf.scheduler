/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.PropagatorPackage;
import com.misc.common.moplaf.scheduler.Move;
import com.misc.common.moplaf.scheduler.MoveChange;
import com.misc.common.moplaf.scheduler.MoveChangeResource;
import com.misc.common.moplaf.scheduler.MoveChangeTask;
import com.misc.common.moplaf.scheduler.MoveExpression;
import com.misc.common.moplaf.scheduler.ResourceExpression;
import com.misc.common.moplaf.scheduler.ScheduleAfter;
import com.misc.common.moplaf.scheduler.ScheduleBefore;
import com.misc.common.moplaf.scheduler.ScheduleFirst;
import com.misc.common.moplaf.scheduler.ScheduleLast;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionExpression;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.TaskExpression;
import com.misc.common.moplaf.scheduler.TaskFloatExpression;
import com.misc.common.moplaf.scheduler.Unschedule;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
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
	private EClass taskFloatExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveChangeTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleBeforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveChangeResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleLastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unscheduleEClass = null;

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

		// Obtain or create and register interdependencies
		SchedulerCalcPackageImpl theSchedulerCalcPackage = (SchedulerCalcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulerCalcPackage.eNS_URI) instanceof SchedulerCalcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulerCalcPackage.eNS_URI) : SchedulerCalcPackage.eINSTANCE);

		// Create package meta-data objects
		theSchedulerPackage.createPackageContents();
		theSchedulerCalcPackage.createPackageContents();

		// Initialize created meta-data
		theSchedulerPackage.initializePackageContents();
		theSchedulerCalcPackage.initializePackageContents();

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
		return (EReference)schedulerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScheduler__ConstructTask__EObject() {
		return schedulerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScheduler__ConstructResource__EObject() {
		return schedulerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_Tasks() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduler_Name() {
		return (EAttribute)schedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduler_CurrentSolutionntr() {
		return (EAttribute)schedulerEClass.getEStructuralFeatures().get(2);
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
		return (EReference)solutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Tasks() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getSolution_SolutionNr() {
		return (EAttribute)solutionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Scheduler() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__Clone() {
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
	public EOperation getSolution__ResetCandidate() {
		return solutionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__AcceptCandidate() {
		return solutionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__Reset() {
		return solutionEClass.getEOperations().get(4);
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
	public EReference getMove_Changes() {
		return (EReference)moveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Name() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_Solution() {
		return (EReference)moveEClass.getEStructuralFeatures().get(3);
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
	public EReference getSolutionResource_ScheduledTasks() {
		return (EReference)solutionResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionResource_CandidateScheduledTasks() {
		return (EReference)solutionResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionResource_CandidateFirstTask() {
		return (EReference)solutionResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionResource_CandidateLastTask() {
		return (EReference)solutionResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionResource_Expressions() {
		return (EReference)solutionResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionResource_Description() {
		return (EAttribute)solutionResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionResource_Solution() {
		return (EReference)solutionResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionResource_Name() {
		return (EAttribute)solutionResourceEClass.getEStructuralFeatures().get(8);
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
	public EReference getSolutionTask_ScheduledResource() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_CandidateScheduledResource() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_CandidateNextTask() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_CandidatePreviousTask() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_ResourceAsCandidateFirstTask() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_ResourceAsCandidateLastTask() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_Expressions() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionTask_Description() {
		return (EAttribute)solutionTaskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionTask_Solution() {
		return (EReference)solutionTaskEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionTask_Name() {
		return (EAttribute)solutionTaskEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionTask__UnsetCandidatePreviousNext() {
		return solutionTaskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionTask__SetCandidatePreviousNext__SolutionResource_SolutionTask_SolutionTask() {
		return solutionTaskEClass.getEOperations().get(1);
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
	public EReference getSolutionExpression_Solution() {
		return (EReference)solutionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionExpression_Description() {
		return (EAttribute)solutionExpressionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getMoveExpression_Description() {
		return (EAttribute)moveExpressionEClass.getEStructuralFeatures().get(0);
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
	public EReference getResourceExpression_Resource() {
		return (EReference)resourceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceExpression_Description() {
		return (EAttribute)resourceExpressionEClass.getEStructuralFeatures().get(1);
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
	public EReference getTaskExpression_Task() {
		return (EReference)taskExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskExpression_Description() {
		return (EAttribute)taskExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskExpression_Role() {
		return (EAttribute)taskExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTaskExpression__ResetValueCandidate() {
		return taskExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTaskExpression__RefreshValueCandidate() {
		return taskExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskFloatExpression() {
		return taskFloatExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskFloatExpression_Value() {
		return (EAttribute)taskFloatExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskFloatExpression_CandidateValue() {
		return (EAttribute)taskFloatExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveChange() {
		return moveChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveChange_TaskToSchedule() {
		return (EReference)moveChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveChange_Description() {
		return (EAttribute)moveChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveChange_Valid() {
		return (EAttribute)moveChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveChange_Move() {
		return (EReference)moveChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoveChange__Change() {
		return moveChangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveChangeTask() {
		return moveChangeTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveChangeTask_InsertionPoint() {
		return (EReference)moveChangeTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleAfter() {
		return scheduleAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleBefore() {
		return scheduleBeforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveChangeResource() {
		return moveChangeResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveChangeResource_InsertionPoint() {
		return (EReference)moveChangeResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleFirst() {
		return scheduleFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleLast() {
		return scheduleLastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnschedule() {
		return unscheduleEClass;
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
		createEAttribute(schedulerEClass, SCHEDULER__NAME);
		createEAttribute(schedulerEClass, SCHEDULER__CURRENT_SOLUTIONNTR);
		createEReference(schedulerEClass, SCHEDULER__TASKS);
		createEReference(schedulerEClass, SCHEDULER__RESOURCES);
		createEOperation(schedulerEClass, SCHEDULER___CONSTRUCT_TASK__EOBJECT);
		createEOperation(schedulerEClass, SCHEDULER___CONSTRUCT_RESOURCE__EOBJECT);

		solutionEClass = createEClass(SOLUTION);
		createEReference(solutionEClass, SOLUTION__MOVES);
		createEReference(solutionEClass, SOLUTION__TASKS);
		createEReference(solutionEClass, SOLUTION__RESOURCES);
		createEReference(solutionEClass, SOLUTION__CANDIDATE_MOVE);
		createEReference(solutionEClass, SOLUTION__EXPRESSIONS);
		createEAttribute(solutionEClass, SOLUTION__SOLUTION_NR);
		createEReference(solutionEClass, SOLUTION__SCHEDULER);
		createEOperation(solutionEClass, SOLUTION___CLONE);
		createEOperation(solutionEClass, SOLUTION___SET_CANDIDATE__MOVE);
		createEOperation(solutionEClass, SOLUTION___RESET_CANDIDATE);
		createEOperation(solutionEClass, SOLUTION___ACCEPT_CANDIDATE);
		createEOperation(solutionEClass, SOLUTION___RESET);

		solutionResourceEClass = createEClass(SOLUTION_RESOURCE);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__RESOURCE);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__SCHEDULED_TASKS);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__CANDIDATE_LAST_TASK);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__EXPRESSIONS);
		createEAttribute(solutionResourceEClass, SOLUTION_RESOURCE__DESCRIPTION);
		createEReference(solutionResourceEClass, SOLUTION_RESOURCE__SOLUTION);
		createEAttribute(solutionResourceEClass, SOLUTION_RESOURCE__NAME);

		solutionTaskEClass = createEClass(SOLUTION_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__NEXT_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__PREVIOUS_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__SCHEDULED_RESOURCE);
		createEReference(solutionTaskEClass, SOLUTION_TASK__CANDIDATE_NEXT_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK);
		createEReference(solutionTaskEClass, SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE);
		createEReference(solutionTaskEClass, SOLUTION_TASK__EXPRESSIONS);
		createEAttribute(solutionTaskEClass, SOLUTION_TASK__DESCRIPTION);
		createEReference(solutionTaskEClass, SOLUTION_TASK__SOLUTION);
		createEAttribute(solutionTaskEClass, SOLUTION_TASK__NAME);
		createEOperation(solutionTaskEClass, SOLUTION_TASK___UNSET_CANDIDATE_PREVIOUS_NEXT);
		createEOperation(solutionTaskEClass, SOLUTION_TASK___SET_CANDIDATE_PREVIOUS_NEXT__SOLUTIONRESOURCE_SOLUTIONTASK_SOLUTIONTASK);

		moveEClass = createEClass(MOVE);
		createEReference(moveEClass, MOVE__EXPRESSIONS);
		createEReference(moveEClass, MOVE__CHANGES);
		createEAttribute(moveEClass, MOVE__NAME);
		createEReference(moveEClass, MOVE__SOLUTION);

		moveExpressionEClass = createEClass(MOVE_EXPRESSION);
		createEAttribute(moveExpressionEClass, MOVE_EXPRESSION__DESCRIPTION);

		solutionExpressionEClass = createEClass(SOLUTION_EXPRESSION);
		createEReference(solutionExpressionEClass, SOLUTION_EXPRESSION__SOLUTION);
		createEAttribute(solutionExpressionEClass, SOLUTION_EXPRESSION__DESCRIPTION);

		resourceExpressionEClass = createEClass(RESOURCE_EXPRESSION);
		createEReference(resourceExpressionEClass, RESOURCE_EXPRESSION__RESOURCE);
		createEAttribute(resourceExpressionEClass, RESOURCE_EXPRESSION__DESCRIPTION);

		taskExpressionEClass = createEClass(TASK_EXPRESSION);
		createEReference(taskExpressionEClass, TASK_EXPRESSION__TASK);
		createEAttribute(taskExpressionEClass, TASK_EXPRESSION__DESCRIPTION);
		createEAttribute(taskExpressionEClass, TASK_EXPRESSION__ROLE);
		createEOperation(taskExpressionEClass, TASK_EXPRESSION___RESET_VALUE_CANDIDATE);
		createEOperation(taskExpressionEClass, TASK_EXPRESSION___REFRESH_VALUE_CANDIDATE);

		taskFloatExpressionEClass = createEClass(TASK_FLOAT_EXPRESSION);
		createEAttribute(taskFloatExpressionEClass, TASK_FLOAT_EXPRESSION__VALUE);
		createEAttribute(taskFloatExpressionEClass, TASK_FLOAT_EXPRESSION__CANDIDATE_VALUE);

		moveChangeEClass = createEClass(MOVE_CHANGE);
		createEReference(moveChangeEClass, MOVE_CHANGE__TASK_TO_SCHEDULE);
		createEAttribute(moveChangeEClass, MOVE_CHANGE__DESCRIPTION);
		createEAttribute(moveChangeEClass, MOVE_CHANGE__VALID);
		createEReference(moveChangeEClass, MOVE_CHANGE__MOVE);
		createEOperation(moveChangeEClass, MOVE_CHANGE___CHANGE);

		moveChangeTaskEClass = createEClass(MOVE_CHANGE_TASK);
		createEReference(moveChangeTaskEClass, MOVE_CHANGE_TASK__INSERTION_POINT);

		scheduleAfterEClass = createEClass(SCHEDULE_AFTER);

		scheduleBeforeEClass = createEClass(SCHEDULE_BEFORE);

		moveChangeResourceEClass = createEClass(MOVE_CHANGE_RESOURCE);
		createEReference(moveChangeResourceEClass, MOVE_CHANGE_RESOURCE__INSERTION_POINT);

		scheduleFirstEClass = createEClass(SCHEDULE_FIRST);

		scheduleLastEClass = createEClass(SCHEDULE_LAST);

		unscheduleEClass = createEClass(UNSCHEDULE);
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
		solutionEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		solutionResourceEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		solutionTaskEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		moveExpressionEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		solutionExpressionEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		resourceExpressionEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		taskExpressionEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		taskFloatExpressionEClass.getESuperTypes().add(this.getTaskExpression());
		moveChangeTaskEClass.getESuperTypes().add(this.getMoveChange());
		scheduleAfterEClass.getESuperTypes().add(this.getMoveChangeTask());
		scheduleBeforeEClass.getESuperTypes().add(this.getMoveChangeTask());
		moveChangeResourceEClass.getESuperTypes().add(this.getMoveChange());
		scheduleFirstEClass.getESuperTypes().add(this.getMoveChangeResource());
		scheduleLastEClass.getESuperTypes().add(this.getMoveChangeResource());
		unscheduleEClass.getESuperTypes().add(this.getMoveChange());

		// Initialize classes, features, and operations; add parameters
		initEClass(schedulerEClass, Scheduler.class, "Scheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScheduler_Solutions(), this.getSolution(), this.getSolution_Scheduler(), "Solutions", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduler_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduler_CurrentSolutionntr(), ecorePackage.getEInt(), "CurrentSolutionntr", null, 0, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_Tasks(), ecorePackage.getEObject(), null, "Tasks", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_Resources(), ecorePackage.getEObject(), null, "Resources", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getScheduler__ConstructTask__EObject(), this.getSolutionTask(), "constructTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getScheduler__ConstructResource__EObject(), this.getSolutionResource(), "constructResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolution_Moves(), this.getMove(), this.getMove_Solution(), "Moves", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Tasks(), this.getSolutionTask(), this.getSolutionTask_Solution(), "Tasks", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Resources(), this.getSolutionResource(), this.getSolutionResource_Solution(), "Resources", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_CandidateMove(), this.getMove(), null, "CandidateMove", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Expressions(), this.getSolutionExpression(), this.getSolutionExpression_Solution(), "Expressions", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolution_SolutionNr(), ecorePackage.getEInt(), "SolutionNr", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Scheduler(), this.getScheduler(), this.getScheduler_Solutions(), "Scheduler", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolution__Clone(), this.getSolution(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolution__SetCandidate__Move(), null, "setCandidate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMove(), "move", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolution__ResetCandidate(), null, "resetCandidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolution__AcceptCandidate(), null, "acceptCandidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolution__Reset(), null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solutionResourceEClass, SolutionResource.class, "SolutionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionResource_Resource(), ecorePackage.getEObject(), null, "Resource", null, 1, 1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionResource_ScheduledTasks(), this.getSolutionTask(), this.getSolutionTask_ScheduledResource(), "ScheduledTasks", null, 0, -1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionResource_CandidateScheduledTasks(), this.getSolutionTask(), this.getSolutionTask_CandidateScheduledResource(), "CandidateScheduledTasks", null, 0, -1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionResource_CandidateFirstTask(), this.getSolutionTask(), this.getSolutionTask_ResourceAsCandidateFirstTask(), "CandidateFirstTask", null, 0, 1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionResource_CandidateLastTask(), this.getSolutionTask(), this.getSolutionTask_ResourceAsCandidateLastTask(), "CandidateLastTask", null, 0, 1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionResource_Expressions(), this.getResourceExpression(), this.getResourceExpression_Resource(), "Expressions", null, 0, -1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionResource_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SolutionResource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionResource_Solution(), this.getSolution(), this.getSolution_Resources(), "Solution", null, 1, 1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionResource_Name(), ecorePackage.getEString(), "Name", null, 0, 1, SolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionTaskEClass, SolutionTask.class, "SolutionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionTask_Task(), ecorePackage.getEObject(), null, "Task", null, 1, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_NextTask(), this.getSolutionTask(), this.getSolutionTask_PreviousTask(), "NextTask", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_PreviousTask(), this.getSolutionTask(), this.getSolutionTask_NextTask(), "PreviousTask", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_ScheduledResource(), this.getSolutionResource(), this.getSolutionResource_ScheduledTasks(), "ScheduledResource", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_CandidateNextTask(), this.getSolutionTask(), null, "CandidateNextTask", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_CandidatePreviousTask(), this.getSolutionTask(), null, "CandidatePreviousTask", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_ResourceAsCandidateFirstTask(), this.getSolutionResource(), this.getSolutionResource_CandidateFirstTask(), "ResourceAsCandidateFirstTask", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_ResourceAsCandidateLastTask(), this.getSolutionResource(), this.getSolutionResource_CandidateLastTask(), "ResourceAsCandidateLastTask", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_CandidateScheduledResource(), this.getSolutionResource(), this.getSolutionResource_CandidateScheduledTasks(), "CandidateScheduledResource", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_Expressions(), this.getTaskExpression(), this.getTaskExpression_Task(), "Expressions", null, 0, -1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionTask_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SolutionTask.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionTask_Solution(), this.getSolution(), this.getSolution_Tasks(), "Solution", null, 1, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionTask_Name(), ecorePackage.getEString(), "Name", null, 0, 1, SolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolutionTask__UnsetCandidatePreviousNext(), null, "unsetCandidatePreviousNext", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolutionTask__SetCandidatePreviousNext__SolutionResource_SolutionTask_SolutionTask(), null, "setCandidatePreviousNext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolutionResource(), "solution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolutionTask(), "previous", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolutionTask(), "next", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMove_Expressions(), this.getMoveExpression(), null, "Expressions", null, 0, -1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMove_Changes(), this.getMoveChange(), this.getMoveChange_Move(), "Changes", null, 0, -1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMove_Solution(), this.getSolution(), this.getSolution_Moves(), "Solution", null, 1, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveExpressionEClass, MoveExpression.class, "MoveExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveExpression_Description(), ecorePackage.getEString(), "Description", null, 0, 1, MoveExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(solutionExpressionEClass, SolutionExpression.class, "SolutionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionExpression_Solution(), this.getSolution(), this.getSolution_Expressions(), "Solution", null, 1, 1, SolutionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionExpression_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SolutionExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(resourceExpressionEClass, ResourceExpression.class, "ResourceExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceExpression_Resource(), this.getSolutionResource(), this.getSolutionResource_Expressions(), "Resource", null, 1, 1, ResourceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceExpression_Description(), ecorePackage.getEString(), "Description", null, 0, 1, ResourceExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(taskExpressionEClass, TaskExpression.class, "TaskExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskExpression_Task(), this.getSolutionTask(), this.getSolutionTask_Expressions(), "Task", null, 1, 1, TaskExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskExpression_Description(), ecorePackage.getEString(), "Description", null, 0, 1, TaskExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskExpression_Role(), ecorePackage.getEString(), "Role", null, 0, 1, TaskExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getTaskExpression__ResetValueCandidate(), null, "resetValueCandidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTaskExpression__RefreshValueCandidate(), null, "refreshValueCandidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskFloatExpressionEClass, TaskFloatExpression.class, "TaskFloatExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskFloatExpression_Value(), ecorePackage.getEFloat(), "Value", null, 0, 1, TaskFloatExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskFloatExpression_CandidateValue(), ecorePackage.getEFloat(), "CandidateValue", null, 0, 1, TaskFloatExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveChangeEClass, MoveChange.class, "MoveChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveChange_TaskToSchedule(), this.getSolutionTask(), null, "TaskToSchedule", null, 1, 1, MoveChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveChange_Description(), ecorePackage.getEString(), "Description", null, 0, 1, MoveChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveChange_Valid(), ecorePackage.getEBoolean(), "Valid", null, 0, 1, MoveChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMoveChange_Move(), this.getMove(), this.getMove_Changes(), "Move", null, 1, 1, MoveChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMoveChange__Change(), ecorePackage.getEBoolean(), "change", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moveChangeTaskEClass, MoveChangeTask.class, "MoveChangeTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveChangeTask_InsertionPoint(), this.getSolutionTask(), null, "InsertionPoint", null, 1, 1, MoveChangeTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleAfterEClass, ScheduleAfter.class, "ScheduleAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scheduleBeforeEClass, ScheduleBefore.class, "ScheduleBefore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveChangeResourceEClass, MoveChangeResource.class, "MoveChangeResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveChangeResource_InsertionPoint(), this.getSolutionResource(), null, "InsertionPoint", null, 1, 1, MoveChangeResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleFirstEClass, ScheduleFirst.class, "ScheduleFirst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scheduleLastEClass, ScheduleLast.class, "ScheduleLast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unscheduleEClass, Unschedule.class, "Unschedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SchedulerPackageImpl
