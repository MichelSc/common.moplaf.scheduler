/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.TaskExpression#getResetCandidateValue <em>Reset Candidate Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.TaskExpression#getCalcCandidateValue <em>Calc Candidate Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpression()
 * @model
 * @generated
 */
public interface TaskExpression extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Reset Candidate Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Candidate Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Candidate Value</em>' reference.
	 * @see #setResetCandidateValue(ResetTaskExpressionCandidateValue)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpression_ResetCandidateValue()
	 * @see com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue#getExpression
	 * @model opposite="Expression" required="true"
	 * @generated
	 */
	ResetTaskExpressionCandidateValue getResetCandidateValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.TaskExpression#getResetCandidateValue <em>Reset Candidate Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Candidate Value</em>' reference.
	 * @see #getResetCandidateValue()
	 * @generated
	 */
	void setResetCandidateValue(ResetTaskExpressionCandidateValue value);

	/**
	 * Returns the value of the '<em><b>Calc Candidate Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calc Candidate Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calc Candidate Value</em>' reference.
	 * @see #setCalcCandidateValue(CalcTaskExpressionCandidateValue)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpression_CalcCandidateValue()
	 * @see com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue#getExpression
	 * @model opposite="Expression" required="true"
	 * @generated
	 */
	CalcTaskExpressionCandidateValue getCalcCandidateValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.TaskExpression#getCalcCandidateValue <em>Calc Candidate Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calc Candidate Value</em>' reference.
	 * @see #getCalcCandidateValue()
	 * @generated
	 */
	void setCalcCandidateValue(CalcTaskExpressionCandidateValue value);

} // TaskExpression
