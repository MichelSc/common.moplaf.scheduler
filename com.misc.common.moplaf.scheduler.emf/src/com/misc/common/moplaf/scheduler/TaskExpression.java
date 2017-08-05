/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

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
 *   <li>{@link com.misc.common.moplaf.scheduler.TaskExpression#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.TaskExpression#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpression()
 * @model abstract="true"
 * @generated
 */
public interface TaskExpression extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionTask#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpression_Task()
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getExpressions
	 * @model opposite="Expressions" required="true" transient="false"
	 * @generated
	 */
	SolutionTask getTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.TaskExpression#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(SolutionTask value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpression_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskExpression_Role()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resetValueCandidate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshValueCandidate();

} // TaskExpression
