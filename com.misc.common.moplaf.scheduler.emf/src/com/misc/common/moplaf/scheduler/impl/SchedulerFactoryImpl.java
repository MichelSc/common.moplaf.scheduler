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
			case SchedulerPackage.SOLUTION: return createSolution();
			case SchedulerPackage.SOLUTION_RESOURCE: return createSolutionResource();
			case SchedulerPackage.SOLUTION_TASK: return createSolutionTask();
			case SchedulerPackage.MOVE: return createMove();
			case SchedulerPackage.TASK_FLOAT_EXPRESSION: return createTaskFloatExpression();
			case SchedulerPackage.SCHEDULE_AFTER: return createScheduleAfter();
			case SchedulerPackage.SCHEDULE_BEFORE: return createScheduleBefore();
			case SchedulerPackage.SCHEDULE_FIRST: return createScheduleFirst();
			case SchedulerPackage.SCHEDULE_LAST: return createScheduleLast();
			case SchedulerPackage.UNSCHEDULE: return createUnschedule();
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
