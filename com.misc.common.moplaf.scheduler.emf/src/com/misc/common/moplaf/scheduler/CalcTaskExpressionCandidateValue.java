/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Task Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getCalcTaskExpressionCandidateValue()
 * @model
 * @generated
 */
public interface CalcTaskExpressionCandidateValue extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.TaskExpression#getCalcCandidateValue <em>Calc Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(TaskExpression)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getCalcTaskExpressionCandidateValue_Expression()
	 * @see com.misc.common.moplaf.scheduler.TaskExpression#getCalcCandidateValue
	 * @model opposite="CalcCandidateValue" required="true"
	 * @generated
	 */
	TaskExpression getExpression();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(TaskExpression value);

} // CalcTaskExpressionCandidateValue
