/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.scheduler.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case SchedulerPackage.SOLUTION: return createSolution();
			case SchedulerPackage.SOLUTION_RESOURCE: return createSolutionResource();
			case SchedulerPackage.SOLUTION_TASK: return createSolutionTask();
			case SchedulerPackage.MOVE: return createMove();
			case SchedulerPackage.SCHEDULE_AFTER: return createScheduleAfter();
			case SchedulerPackage.SCHEDULE_BEFORE: return createScheduleBefore();
			case SchedulerPackage.SCHEDULE_FIRST: return createScheduleFirst();
			case SchedulerPackage.SCHEDULE_LAST: return createScheduleLast();
			case SchedulerPackage.UNSCHEDULE: return createUnschedule();
			case SchedulerPackage.FLOAT_EXPRESSION: return createFloatExpression();
			case SchedulerPackage.INT_EXPRESSION: return createIntExpression();
			case SchedulerPackage.DATE_EXPRESSION: return createDateExpression();
			case SchedulerPackage.CANDIDATE_FLOAT_EXPRESSION: return createCandidateFloatExpression();
			case SchedulerPackage.CANDIDATE_DATE_EXPRESSION: return createCandidateDateExpression();
			case SchedulerPackage.CANDIDATE_INT_EXPRESSION: return createCandidateIntExpression();
			case SchedulerPackage.TASK_CANDIDATE_DATE_EXPRESSION: return createTaskCandidateDateExpression();
			case SchedulerPackage.TASK_CANDIDATE_FLOAT_EXPRESSION: return createTaskCandidateFloatExpression();
			case SchedulerPackage.TASK_CANDIDATE_INT_EXPRESSION: return createTaskCandidateIntExpression();
			case SchedulerPackage.RESOURCE_CANDIDATE_DATE_EXPRESSION: return createResourceCandidateDateExpression();
			case SchedulerPackage.RESOURCE_CANDIDATE_FLOAT_EXPRESSION: return createResourceCandidateFloatExpression();
			case SchedulerPackage.RESOURCE_CANDIDATE_INT_EXPRESSION: return createResourceCandidateIntExpression();
			case SchedulerPackage.SOLUTION_CANDIDATE_DATE_EXPRESSION: return createSolutionCandidateDateExpression();
			case SchedulerPackage.SOLUTION_CANDIDATE_FLOAT_EXPRESSION: return createSolutionCandidateFloatExpression();
			case SchedulerPackage.SOLUTION_CANDIDATE_INT_EXPRESSION: return createSolutionCandidateIntExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SchedulerPackage.ENABLED_FEEDBACK:
				return createEnabledFeedbackFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SchedulerPackage.ENABLED_FEEDBACK:
				return convertEnabledFeedbackToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public FloatExpression createFloatExpression() {
		FloatExpressionImpl floatExpression = new FloatExpressionImpl();
		return floatExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression createIntExpression() {
		IntExpressionImpl intExpression = new IntExpressionImpl();
		return intExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateExpression createDateExpression() {
		DateExpressionImpl dateExpression = new DateExpressionImpl();
		return dateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidateFloatExpression createCandidateFloatExpression() {
		CandidateFloatExpressionImpl candidateFloatExpression = new CandidateFloatExpressionImpl();
		return candidateFloatExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidateDateExpression createCandidateDateExpression() {
		CandidateDateExpressionImpl candidateDateExpression = new CandidateDateExpressionImpl();
		return candidateDateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidateIntExpression createCandidateIntExpression() {
		CandidateIntExpressionImpl candidateIntExpression = new CandidateIntExpressionImpl();
		return candidateIntExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCandidateFloatExpression createTaskCandidateFloatExpression() {
		TaskCandidateFloatExpressionImpl taskCandidateFloatExpression = new TaskCandidateFloatExpressionImpl();
		return taskCandidateFloatExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCandidateDateExpression createTaskCandidateDateExpression() {
		TaskCandidateDateExpressionImpl taskCandidateDateExpression = new TaskCandidateDateExpressionImpl();
		return taskCandidateDateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCandidateFloatExpression createResourceCandidateFloatExpression() {
		ResourceCandidateFloatExpressionImpl resourceCandidateFloatExpression = new ResourceCandidateFloatExpressionImpl();
		return resourceCandidateFloatExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCandidateDateExpression createResourceCandidateDateExpression() {
		ResourceCandidateDateExpressionImpl resourceCandidateDateExpression = new ResourceCandidateDateExpressionImpl();
		return resourceCandidateDateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCandidateIntExpression createResourceCandidateIntExpression() {
		ResourceCandidateIntExpressionImpl resourceCandidateIntExpression = new ResourceCandidateIntExpressionImpl();
		return resourceCandidateIntExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCandidateIntExpression createTaskCandidateIntExpression() {
		TaskCandidateIntExpressionImpl taskCandidateIntExpression = new TaskCandidateIntExpressionImpl();
		return taskCandidateIntExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionCandidateDateExpression createSolutionCandidateDateExpression() {
		SolutionCandidateDateExpressionImpl solutionCandidateDateExpression = new SolutionCandidateDateExpressionImpl();
		return solutionCandidateDateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionCandidateFloatExpression createSolutionCandidateFloatExpression() {
		SolutionCandidateFloatExpressionImpl solutionCandidateFloatExpression = new SolutionCandidateFloatExpressionImpl();
		return solutionCandidateFloatExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionCandidateIntExpression createSolutionCandidateIntExpression() {
		SolutionCandidateIntExpressionImpl solutionCandidateIntExpression = new SolutionCandidateIntExpressionImpl();
		return solutionCandidateIntExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFeedback createEnabledFeedbackFromString(EDataType eDataType, String initialValue) {
		return (EnabledFeedback)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnabledFeedbackToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
