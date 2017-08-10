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
	 * Returns a new object of class '<em>Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Expression</em>'.
	 * @generated
	 */
	FloatExpression createFloatExpression();

	/**
	 * Returns a new object of class '<em>Int Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Expression</em>'.
	 * @generated
	 */
	IntExpression createIntExpression();

	/**
	 * Returns a new object of class '<em>Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Expression</em>'.
	 * @generated
	 */
	DateExpression createDateExpression();

	/**
	 * Returns a new object of class '<em>Candidate Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candidate Float Expression</em>'.
	 * @generated
	 */
	CandidateFloatExpression createCandidateFloatExpression();

	/**
	 * Returns a new object of class '<em>Candidate Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candidate Date Expression</em>'.
	 * @generated
	 */
	CandidateDateExpression createCandidateDateExpression();

	/**
	 * Returns a new object of class '<em>Candidate Int Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candidate Int Expression</em>'.
	 * @generated
	 */
	CandidateIntExpression createCandidateIntExpression();

	/**
	 * Returns a new object of class '<em>Task Candidate Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Candidate Float Expression</em>'.
	 * @generated
	 */
	TaskCandidateFloatExpression createTaskCandidateFloatExpression();

	/**
	 * Returns a new object of class '<em>Task Candidate Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Candidate Date Expression</em>'.
	 * @generated
	 */
	TaskCandidateDateExpression createTaskCandidateDateExpression();

	/**
	 * Returns a new object of class '<em>Resource Candidate Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Candidate Float Expression</em>'.
	 * @generated
	 */
	ResourceCandidateFloatExpression createResourceCandidateFloatExpression();

	/**
	 * Returns a new object of class '<em>Resource Candidate Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Candidate Date Expression</em>'.
	 * @generated
	 */
	ResourceCandidateDateExpression createResourceCandidateDateExpression();

	/**
	 * Returns a new object of class '<em>Resource Candidate Int Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Candidate Int Expression</em>'.
	 * @generated
	 */
	ResourceCandidateIntExpression createResourceCandidateIntExpression();

	/**
	 * Returns a new object of class '<em>Task Candidate Int Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Candidate Int Expression</em>'.
	 * @generated
	 */
	TaskCandidateIntExpression createTaskCandidateIntExpression();

	/**
	 * Returns a new object of class '<em>Solution Candidate Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Candidate Date Expression</em>'.
	 * @generated
	 */
	SolutionCandidateDateExpression createSolutionCandidateDateExpression();

	/**
	 * Returns a new object of class '<em>Solution Candidate Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Candidate Float Expression</em>'.
	 * @generated
	 */
	SolutionCandidateFloatExpression createSolutionCandidateFloatExpression();

	/**
	 * Returns a new object of class '<em>Solution Candidate Int Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Candidate Int Expression</em>'.
	 * @generated
	 */
	SolutionCandidateIntExpression createSolutionCandidateIntExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchedulerPackage getSchedulerPackage();

} //SchedulerFactory
