/**
 */
package com.misc.common.moplaf.schedulercalc;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.scheduler.SolutionTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getTaskPropagatorFunction()
 * @model
 * @generated
 */
public interface TaskPropagatorFunction extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getTaskPropagatorFunction_Task()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SolutionTask getTask();

} // TaskPropagatorFunction
