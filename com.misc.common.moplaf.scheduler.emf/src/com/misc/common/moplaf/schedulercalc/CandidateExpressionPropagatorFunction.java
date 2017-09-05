/**
 */
package com.misc.common.moplaf.schedulercalc;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.scheduler.CandidateValueExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Candidate Expression Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.CandidateExpressionPropagatorFunction#getCandidateValueExpression <em>Candidate Value Expression</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getCandidateExpressionPropagatorFunction()
 * @model
 * @generated
 */
public interface CandidateExpressionPropagatorFunction extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Candidate Value Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Value Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Value Expression</em>' reference.
	 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getCandidateExpressionPropagatorFunction_CandidateValueExpression()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CandidateValueExpression getCandidateValueExpression();

} // CandidateExpressionPropagatorFunction
