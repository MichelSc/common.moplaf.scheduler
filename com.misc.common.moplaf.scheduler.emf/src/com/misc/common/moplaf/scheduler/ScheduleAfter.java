/**
 */
package com.misc.common.moplaf.scheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule After</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.ScheduleAfter#getTaskBefore <em>Task Before</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleAfter()
 * @model
 * @generated
 */
public interface ScheduleAfter extends MoveChange {
	/**
	 * Returns the value of the '<em><b>Task Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Before</em>' reference.
	 * @see #setTaskBefore(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleAfter_TaskBefore()
	 * @model required="true"
	 * @generated
	 */
	SolutionTask getTaskBefore();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.ScheduleAfter#getTaskBefore <em>Task Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Before</em>' reference.
	 * @see #getTaskBefore()
	 * @generated
	 */
	void setTaskBefore(SolutionTask value);

} // ScheduleAfter
