/**
 */
package com.misc.common.moplaf.scheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Change Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.MoveChangeTask#getInsertionPoint <em>Insertion Point</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveChangeTask()
 * @model abstract="true"
 * @generated
 */
public interface MoveChangeTask extends MoveChange {
	/**
	 * Returns the value of the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertion Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertion Point</em>' reference.
	 * @see #setInsertionPoint(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveChangeTask_InsertionPoint()
	 * @model required="true"
	 * @generated
	 */
	SolutionTask getInsertionPoint();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.MoveChangeTask#getInsertionPoint <em>Insertion Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertion Point</em>' reference.
	 * @see #getInsertionPoint()
	 * @generated
	 */
	void setInsertionPoint(SolutionTask value);

} // MoveChangeTask
