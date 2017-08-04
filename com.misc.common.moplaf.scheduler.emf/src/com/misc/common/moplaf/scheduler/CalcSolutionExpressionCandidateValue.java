/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Solution Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.CalcSolutionExpressionCandidateValue#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getCalcSolutionExpressionCandidateValue()
 * @model
 * @generated
 */
public interface CalcSolutionExpressionCandidateValue extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(SolutionExpression)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getCalcSolutionExpressionCandidateValue_Expression()
	 * @model required="true"
	 * @generated
	 */
	SolutionExpression getExpression();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.CalcSolutionExpressionCandidateValue#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(SolutionExpression value);

} // CalcSolutionExpressionCandidateValue
