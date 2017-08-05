/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Expression Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.TaskExpressionPropagatorFunction#getTaskExpression <em>Task Expression</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpressionPropagatorFunction()
 * @model
 * @generated
 */
public interface TaskExpressionPropagatorFunction extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Task Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Expression</em>' reference.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpressionPropagatorFunction_TaskExpression()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	TaskExpression getTaskExpression();

} // TaskExpressionPropagatorFunction
