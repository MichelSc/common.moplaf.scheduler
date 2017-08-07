/**
 */
package com.misc.common.moplaf.schedulercalc;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.scheduler.SolutionExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Expression Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction#getSolutionExpression <em>Solution Expression</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getSolutionExpressionPropagatorFunction()
 * @model
 * @generated
 */
public interface SolutionExpressionPropagatorFunction extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Solution Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Expression</em>' reference.
	 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getSolutionExpressionPropagatorFunction_SolutionExpression()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SolutionExpression getSolutionExpression();

} // SolutionExpressionPropagatorFunction
