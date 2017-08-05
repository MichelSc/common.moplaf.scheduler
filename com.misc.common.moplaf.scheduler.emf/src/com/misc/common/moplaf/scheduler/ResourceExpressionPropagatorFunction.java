/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Expression Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.ResourceExpressionPropagatorFunction#getResourceExpression <em>Resource Expression</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResourceExpressionPropagatorFunction()
 * @model
 * @generated
 */
public interface ResourceExpressionPropagatorFunction extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Resource Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Expression</em>' reference.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResourceExpressionPropagatorFunction_ResourceExpression()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ResourceExpression getResourceExpression();

} // ResourceExpressionPropagatorFunction
