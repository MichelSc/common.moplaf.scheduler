/**
 */
package com.misc.common.moplaf.scheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Before</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.ScheduleBefore#getTaskAfter <em>Task After</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleBefore()
 * @model
 * @generated
 */
public interface ScheduleBefore extends MoveChange {
	/**
	 * Returns the value of the '<em><b>Task After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task After</em>' reference.
	 * @see #setTaskAfter(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleBefore_TaskAfter()
	 * @model required="true"
	 * @generated
	 */
	SolutionTask getTaskAfter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.ScheduleBefore#getTaskAfter <em>Task After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task After</em>' reference.
	 * @see #getTaskAfter()
	 * @generated
	 */
	void setTaskAfter(SolutionTask value);

} // ScheduleBefore
