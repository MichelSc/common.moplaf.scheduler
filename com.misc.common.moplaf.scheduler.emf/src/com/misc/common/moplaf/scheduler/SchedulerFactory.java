/**
 */
package com.misc.common.moplaf.scheduler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage
 * @generated
 */
public interface SchedulerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulerFactory eINSTANCE = com.misc.common.moplaf.scheduler.impl.SchedulerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduler</em>'.
	 * @generated
	 */
	Scheduler createScheduler();

	/**
	 * Returns a new object of class '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution</em>'.
	 * @generated
	 */
	Solution createSolution();

	/**
	 * Returns a new object of class '<em>Solution Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Resource</em>'.
	 * @generated
	 */
	SolutionResource createSolutionResource();

	/**
	 * Returns a new object of class '<em>Solution Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Task</em>'.
	 * @generated
	 */
	SolutionTask createSolutionTask();

	/**
	 * Returns a new object of class '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move</em>'.
	 * @generated
	 */
	Move createMove();

	/**
	 * Returns a new object of class '<em>Calc Solution All Expression Candidate Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Solution All Expression Candidate Values</em>'.
	 * @generated
	 */
	CalcSolutionAllExpressionCandidateValues createCalcSolutionAllExpressionCandidateValues();

	/**
	 * Returns a new object of class '<em>Reset Solution All Expression Candidate Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Solution All Expression Candidate Values</em>'.
	 * @generated
	 */
	ResetSolutionAllExpressionCandidateValues createResetSolutionAllExpressionCandidateValues();

	/**
	 * Returns a new object of class '<em>Solution Expression Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Expression Propagator Function</em>'.
	 * @generated
	 */
	SolutionExpressionPropagatorFunction createSolutionExpressionPropagatorFunction();

	/**
	 * Returns a new object of class '<em>Reset Solution Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Solution Expression Candidate Value</em>'.
	 * @generated
	 */
	ResetSolutionExpressionCandidateValue createResetSolutionExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Calc Resource Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Resource Expression Candidate Value</em>'.
	 * @generated
	 */
	CalcResourceExpressionCandidateValue createCalcResourceExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Reset Resource Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Resource Expression Candidate Value</em>'.
	 * @generated
	 */
	ResetResourceExpressionCandidateValue createResetResourceExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Calc Task Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Task Expression Candidate Value</em>'.
	 * @generated
	 */
	CalcTaskExpressionCandidateValue createCalcTaskExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Reset Task Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Task Expression Candidate Value</em>'.
	 * @generated
	 */
	ResetTaskExpressionCandidateValue createResetTaskExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Task Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Float Expression</em>'.
	 * @generated
	 */
	TaskFloatExpression createTaskFloatExpression();

	/**
	 * Returns a new object of class '<em>Schedule After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule After</em>'.
	 * @generated
	 */
	ScheduleAfter createScheduleAfter();

	/**
	 * Returns a new object of class '<em>Schedule Before</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule Before</em>'.
	 * @generated
	 */
	ScheduleBefore createScheduleBefore();

	/**
	 * Returns a new object of class '<em>Schedule First</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule First</em>'.
	 * @generated
	 */
	ScheduleFirst createScheduleFirst();

	/**
	 * Returns a new object of class '<em>Schedule Last</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule Last</em>'.
	 * @generated
	 */
	ScheduleLast createScheduleLast();

	/**
	 * Returns a new object of class '<em>Unschedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unschedule</em>'.
	 * @generated
	 */
	Unschedule createUnschedule();

	/**
	 * Returns a new object of class '<em>Resource Expression Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Expression Propagator Function</em>'.
	 * @generated
	 */
	ResourceExpressionPropagatorFunction createResourceExpressionPropagatorFunction();

	/**
	 * Returns a new object of class '<em>Calc Solution Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Solution Expression Candidate Value</em>'.
	 * @generated
	 */
	CalcSolutionExpressionCandidateValue createCalcSolutionExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Task Expression Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Expression Propagator Function</em>'.
	 * @generated
	 */
	TaskExpressionPropagatorFunction createTaskExpressionPropagatorFunction();

	/**
	 * Returns a new object of class '<em>Solution Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Propagator Function</em>'.
	 * @generated
	 */
	SolutionPropagatorFunction createSolutionPropagatorFunction();

	/**
	 * Returns a new object of class '<em>Calc Taks Expression Candidate Value Cumulative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Taks Expression Candidate Value Cumulative</em>'.
	 * @generated
	 */
	CalcTaksExpressionCandidateValueCumulative createCalcTaksExpressionCandidateValueCumulative();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchedulerPackage getSchedulerPackage();

} //SchedulerFactory
