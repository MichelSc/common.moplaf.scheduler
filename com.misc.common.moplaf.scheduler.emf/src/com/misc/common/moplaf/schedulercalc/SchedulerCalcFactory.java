/**
 */
package com.misc.common.moplaf.schedulercalc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage
 * @generated
 */
public interface SchedulerCalcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulerCalcFactory eINSTANCE = com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solution Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Propagator Function</em>'.
	 * @generated
	 */
	SolutionPropagatorFunction createSolutionPropagatorFunction();

	/**
	 * Returns a new object of class '<em>Solution Expression Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Expression Propagator Function</em>'.
	 * @generated
	 */
	SolutionExpressionPropagatorFunction createSolutionExpressionPropagatorFunction();

	/**
	 * Returns a new object of class '<em>Resource Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Propagator Function</em>'.
	 * @generated
	 */
	ResourcePropagatorFunction createResourcePropagatorFunction();

	/**
	 * Returns a new object of class '<em>Resource Expression Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Expression Propagator Function</em>'.
	 * @generated
	 */
	ResourceExpressionPropagatorFunction createResourceExpressionPropagatorFunction();

	/**
	 * Returns a new object of class '<em>Task Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Propagator Function</em>'.
	 * @generated
	 */
	TaskPropagatorFunction createTaskPropagatorFunction();

	/**
	 * Returns a new object of class '<em>Task Expression Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Expression Propagator Function</em>'.
	 * @generated
	 */
	TaskExpressionPropagatorFunction createTaskExpressionPropagatorFunction();

	/**
	 * Returns a new object of class '<em>Set Schedule Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Schedule Scope</em>'.
	 * @generated
	 */
	SetScheduleScope createSetScheduleScope();

	/**
	 * Returns a new object of class '<em>Set Task Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Task Schedule</em>'.
	 * @generated
	 */
	SetTaskSchedule createSetTaskSchedule();

	/**
	 * Returns a new object of class '<em>Set Expression Candidate Value Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Expression Candidate Value Scope</em>'.
	 * @generated
	 */
	SetExpressionCandidateValueScope createSetExpressionCandidateValueScope();

	/**
	 * Returns a new object of class '<em>Set Task Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Task Expression Candidate Value</em>'.
	 * @generated
	 */
	SetTaskExpressionCandidateValue createSetTaskExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Set Solution Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Solution Expression Candidate Value</em>'.
	 * @generated
	 */
	SetSolutionExpressionCandidateValue createSetSolutionExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Set Resource Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Resource Expression Candidate Value</em>'.
	 * @generated
	 */
	SetResourceExpressionCandidateValue createSetResourceExpressionCandidateValue();

	/**
	 * Returns a new object of class '<em>Set Resource Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Resource Schedule</em>'.
	 * @generated
	 */
	SetResourceSchedule createSetResourceSchedule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchedulerCalcPackage getSchedulerCalcPackage();

} //SchedulerCalcFactory
