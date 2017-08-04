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
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution</em>'.
	 * @generated
	 */
	Solution createSolution();

	/**
	 * Returns a new object of class '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move</em>'.
	 * @generated
	 */
	Move createMove();

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
	 * Returns a new object of class '<em>Solution Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Expression</em>'.
	 * @generated
	 */
	SolutionExpression createSolutionExpression();

	/**
	 * Returns a new object of class '<em>Move Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Expression</em>'.
	 * @generated
	 */
	MoveExpression createMoveExpression();

	/**
	 * Returns a new object of class '<em>Resource Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Expression</em>'.
	 * @generated
	 */
	ResourceExpression createResourceExpression();

	/**
	 * Returns a new object of class '<em>Task Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Expression</em>'.
	 * @generated
	 */
	TaskExpression createTaskExpression();

	/**
	 * Returns a new object of class '<em>Reset Task Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Task Expression Candidate Value</em>'.
	 * @generated
	 */
	ResetTaskExpressionCandidateValue createResetTaskExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Calc Task Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Task Expression Candidate Value</em>'.
	 * @generated
	 */
	CalcTaskExpressionCandidateValue createCalcTaskExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Reset Resource Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Resource Expression Candidate Value</em>'.
	 * @generated
	 */
	ResetResourceExpressionCandidateValue createResetResourceExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Calc Resource Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Resource Expression Candidate Value</em>'.
	 * @generated
	 */
	CalcResourceExpressionCandidateValue createCalcResourceExpressionCandidateValue();

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
	 * Returns a new object of class '<em>Reset Solution Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Solution Expression Candidate Value</em>'.
	 * @generated
	 */
	ResetSolutionExpressionCandidateValue createResetSolutionExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Calc Solution Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Solution Expression Candidate Value</em>'.
	 * @generated
	 */
	CalcSolutionExpressionCandidateValue createCalcSolutionExpressionCandidateValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchedulerPackage getSchedulerPackage();

} //SchedulerFactory
