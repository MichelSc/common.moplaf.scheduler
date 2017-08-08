/**
 */
package com.misc.common.moplaf.schedulercalc;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.scheduler.Solution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getSolutionPropagatorFunction()
 * @model
 * @generated
 */
public interface SolutionPropagatorFunction extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' reference.
	 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getSolutionPropagatorFunction_Solution()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Solution getSolution();

} // SolutionPropagatorFunction
