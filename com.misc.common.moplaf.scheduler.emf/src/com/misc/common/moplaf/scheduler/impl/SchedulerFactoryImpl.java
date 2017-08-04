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
			case SchedulerPackage.MOVE: return createMove();
			case SchedulerPackage.SOLUTION_RESOURCE: return createSolutionResource();
			case SchedulerPackage.SOLUTION_TASK: return createSolutionTask();
			case SchedulerPackage.SOLUTION_EXPRESSION: return createSolutionExpression();
			case SchedulerPackage.MOVE_EXPRESSION: return createMoveExpression();
			case SchedulerPackage.RESOURCE_EXPRESSION: return createResourceExpression();
			case SchedulerPackage.TASK_EXPRESSION: return createTaskExpression();
			case SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE: return createResetTaskExpressionCandidateValue();
			case SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE: return createCalcTaskExpressionCandidateValue();
			case SchedulerPackage.RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE: return createResetResourceExpressionCandidateValue();
			case SchedulerPackage.CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE: return createCalcResourceExpressionCandidateValue();
			case SchedulerPackage.CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: return createCalcSolutionAllExpressionCandidateValues();
			case SchedulerPackage.RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: return createResetSolutionAllExpressionCandidateValues();
			case SchedulerPackage.RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE: return createResetSolutionExpressionCandidateValue();
			case SchedulerPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE: return createCalcSolutionExpressionCandidateValue();
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
	public SolutionExpression createSolutionExpression() {
		SolutionExpressionImpl solutionExpression = new SolutionExpressionImpl();
		return solutionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveExpression createMoveExpression() {
		MoveExpressionImpl moveExpression = new MoveExpressionImpl();
		return moveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceExpression createResourceExpression() {
		ResourceExpressionImpl resourceExpression = new ResourceExpressionImpl();
		return resourceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExpression createTaskExpression() {
		TaskExpressionImpl taskExpression = new TaskExpressionImpl();
		return taskExpression;
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
