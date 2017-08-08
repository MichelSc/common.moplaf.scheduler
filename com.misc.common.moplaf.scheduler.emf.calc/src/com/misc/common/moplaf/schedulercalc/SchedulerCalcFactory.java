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
	 * Returns a new object of class '<em>Resource Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Propagator Function</em>'.
	 * @generated
	 */
	ResourcePropagatorFunction createResourcePropagatorFunction();

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
	 * Returns a new object of class '<em>Reset Task Candidate Next</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Task Candidate Next</em>'.
	 * @generated
	 */
	ResetTaskCandidateNext createResetTaskCandidateNext();

	/**
	 * Returns a new object of class '<em>Reset Task Candidate Scheduled Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Task Candidate Scheduled Resource</em>'.
	 * @generated
	 */
	ResetTaskCandidateScheduledResource createResetTaskCandidateScheduledResource();

	/**
	 * Returns a new object of class '<em>Reset Resource Tasks Candidate Next</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Resource Tasks Candidate Next</em>'.
	 * @generated
	 */
	ResetResourceTasksCandidateNext createResetResourceTasksCandidateNext();

	/**
	 * Returns a new object of class '<em>Reset Resource Tasks Candidate Scheduled Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Resource Tasks Candidate Scheduled Resource</em>'.
	 * @generated
	 */
	ResetResourceTasksCandidateScheduledResource createResetResourceTasksCandidateScheduledResource();

	/**
	 * Returns a new object of class '<em>Set Task Candidate Scheduled Resource Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Task Candidate Scheduled Resource Scope</em>'.
	 * @generated
	 */
	SetTaskCandidateScheduledResourceScope createSetTaskCandidateScheduledResourceScope();

	/**
	 * Returns a new object of class '<em>Set Task Candidate Scheduled Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Task Candidate Scheduled Resource</em>'.
	 * @generated
	 */
	SetTaskCandidateScheduledResource createSetTaskCandidateScheduledResource();

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
	SchedulerCalcPackage getSchedulerCalcPackage();

} //SchedulerCalcFactory
