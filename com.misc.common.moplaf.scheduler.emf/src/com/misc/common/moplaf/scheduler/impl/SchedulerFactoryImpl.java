/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulerFactoryImpl extends EFactoryImpl implements SchedulerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulerFactory init() {
		try {
			SchedulerFactory theSchedulerFactory = (SchedulerFactory)EPackage.Registry.INSTANCE.getEFactory(SchedulerPackage.eNS_URI);
			if (theSchedulerFactory != null) {
				return theSchedulerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchedulerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SchedulerPackage.SCHEDULER: return createScheduler();
			case SchedulerPackage.RESOURCE: return createResource();
			case SchedulerPackage.TASK: return createTask();
			case SchedulerPackage.SOLUTION: return createSolution();
			case SchedulerPackage.SOLUTION_RESOURCE: return createSolutionResource();
			case SchedulerPackage.SOLUTION_TASK: return createSolutionTask();
			case SchedulerPackage.MOVE: return createMove();
			case SchedulerPackage.CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: return createCalcSolutionAllExpressionCandidateValues();
			case SchedulerPackage.RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: return createResetSolutionAllExpressionCandidateValues();
			case SchedulerPackage.SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION: return createSolutionExpressionPropagatorFunction();
			case SchedulerPackage.RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE: return createResetSolutionExpressionCandidateValue();
			case SchedulerPackage.CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE: return createCalcResourceExpressionCandidateValue();
			case SchedulerPackage.RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE: return createResetResourceExpressionCandidateValue();
			case SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE: return createCalcTaskExpressionCandidateValue();
			case SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE: return createResetTaskExpressionCandidateValue();
			case SchedulerPackage.TASK_FLOAT_EXPRESSION: return createTaskFloatExpression();
			case SchedulerPackage.SCHEDULE_AFTER: return createScheduleAfter();
			case SchedulerPackage.SCHEDULE_BEFORE: return createScheduleBefore();
			case SchedulerPackage.SCHEDULE_FIRST: return createScheduleFirst();
			case SchedulerPackage.SCHEDULE_LAST: return createScheduleLast();
			case SchedulerPackage.UNSCHEDULE: return createUnschedule();
			case SchedulerPackage.RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION: return createResourceExpressionPropagatorFunction();
			case SchedulerPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE: return createCalcSolutionExpressionCandidateValue();
			case SchedulerPackage.TASK_EXPRESSION_PROPAGATOR_FUNCTION: return createTaskExpressionPropagatorFunction();
			case SchedulerPackage.SOLUTION_PROPAGATOR_FUNCTION: return createSolutionPropagatorFunction();
			case SchedulerPackage.CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE: return createCalcTaksExpressionCandidateValueCumulative();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler createScheduler() {
		SchedulerImpl scheduler = new SchedulerImpl();
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution createSolution() {
		SolutionImpl solution = new SolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource createSolutionResource() {
		SolutionResourceImpl solutionResource = new SolutionResourceImpl();
		return solutionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask createSolutionTask() {
		SolutionTaskImpl solutionTask = new SolutionTaskImpl();
		return solutionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetTaskExpressionCandidateValue createResetTaskExpressionCandidateValue() {
		ResetTaskExpressionCandidateValueImpl resetTaskExpressionCandidateValue = new ResetTaskExpressionCandidateValueImpl();
		return resetTaskExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFloatExpression createTaskFloatExpression() {
		TaskFloatExpressionImpl taskFloatExpression = new TaskFloatExpressionImpl();
		return taskFloatExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleAfter createScheduleAfter() {
		ScheduleAfterImpl scheduleAfter = new ScheduleAfterImpl();
		return scheduleAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleBefore createScheduleBefore() {
		ScheduleBeforeImpl scheduleBefore = new ScheduleBeforeImpl();
		return scheduleBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleFirst createScheduleFirst() {
		ScheduleFirstImpl scheduleFirst = new ScheduleFirstImpl();
		return scheduleFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleLast createScheduleLast() {
		ScheduleLastImpl scheduleLast = new ScheduleLastImpl();
		return scheduleLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unschedule createUnschedule() {
		UnscheduleImpl unschedule = new UnscheduleImpl();
		return unschedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceExpressionPropagatorFunction createResourceExpressionPropagatorFunction() {
		ResourceExpressionPropagatorFunctionImpl resourceExpressionPropagatorFunction = new ResourceExpressionPropagatorFunctionImpl();
		return resourceExpressionPropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskExpressionCandidateValue createCalcTaskExpressionCandidateValue() {
		CalcTaskExpressionCandidateValueImpl calcTaskExpressionCandidateValue = new CalcTaskExpressionCandidateValueImpl();
		return calcTaskExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetResourceExpressionCandidateValue createResetResourceExpressionCandidateValue() {
		ResetResourceExpressionCandidateValueImpl resetResourceExpressionCandidateValue = new ResetResourceExpressionCandidateValueImpl();
		return resetResourceExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcResourceExpressionCandidateValue createCalcResourceExpressionCandidateValue() {
		CalcResourceExpressionCandidateValueImpl calcResourceExpressionCandidateValue = new CalcResourceExpressionCandidateValueImpl();
		return calcResourceExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSolutionAllExpressionCandidateValues createCalcSolutionAllExpressionCandidateValues() {
		CalcSolutionAllExpressionCandidateValuesImpl calcSolutionAllExpressionCandidateValues = new CalcSolutionAllExpressionCandidateValuesImpl();
		return calcSolutionAllExpressionCandidateValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetSolutionAllExpressionCandidateValues createResetSolutionAllExpressionCandidateValues() {
		ResetSolutionAllExpressionCandidateValuesImpl resetSolutionAllExpressionCandidateValues = new ResetSolutionAllExpressionCandidateValuesImpl();
		return resetSolutionAllExpressionCandidateValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionExpressionPropagatorFunction createSolutionExpressionPropagatorFunction() {
		SolutionExpressionPropagatorFunctionImpl solutionExpressionPropagatorFunction = new SolutionExpressionPropagatorFunctionImpl();
		return solutionExpressionPropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetSolutionExpressionCandidateValue createResetSolutionExpressionCandidateValue() {
		ResetSolutionExpressionCandidateValueImpl resetSolutionExpressionCandidateValue = new ResetSolutionExpressionCandidateValueImpl();
		return resetSolutionExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSolutionExpressionCandidateValue createCalcSolutionExpressionCandidateValue() {
		CalcSolutionExpressionCandidateValueImpl calcSolutionExpressionCandidateValue = new CalcSolutionExpressionCandidateValueImpl();
		return calcSolutionExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExpressionPropagatorFunction createTaskExpressionPropagatorFunction() {
		TaskExpressionPropagatorFunctionImpl taskExpressionPropagatorFunction = new TaskExpressionPropagatorFunctionImpl();
		return taskExpressionPropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionPropagatorFunction createSolutionPropagatorFunction() {
		SolutionPropagatorFunctionImpl solutionPropagatorFunction = new SolutionPropagatorFunctionImpl();
		return solutionPropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaksExpressionCandidateValueCumulative createCalcTaksExpressionCandidateValueCumulative() {
		CalcTaksExpressionCandidateValueCumulativeImpl calcTaksExpressionCandidateValueCumulative = new CalcTaksExpressionCandidateValueCumulativeImpl();
		return calcTaksExpressionCandidateValueCumulative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerPackage getSchedulerPackage() {
		return (SchedulerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchedulerPackage getPackage() {
		return SchedulerPackage.eINSTANCE;
	}

} //SchedulerFactoryImpl
