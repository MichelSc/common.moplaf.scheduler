/**
 */
package com.misc.common.moplaf.scheduler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Expression for a Task in a Solution.
 * The Expression maintains 2 values: 1) the value of the expression for the Task in the Solution and 2) the candidate value, that is the value of the Expression in the Solution resulting from performing the candidate Move on this Solution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.TaskExpression#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpression()
 * @model abstract="true"
 * @generated
 */
public interface TaskExpression extends OwnerExpression {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpression_Task()
	 * @model
	 * @generated
	 */
	SolutionTask getTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.TaskExpression#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(SolutionTask value);

} // TaskExpression
