/**
 */
package com.misc.common.moplaf.schedulercalc;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.scheduler.SolutionResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getResourcePropagatorFunction()
 * @model
 * @generated
 */
public interface ResourcePropagatorFunction extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getResourcePropagatorFunction_Resource()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SolutionResource getResource();

} // ResourcePropagatorFunction
