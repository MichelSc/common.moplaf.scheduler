/**
 */
package com.misc.common.moplaf.scheduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.MoveChange#getTaskToSchedule <em>Task To Schedule</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.MoveChange#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.MoveChange#isValid <em>Valid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.MoveChange#getMove <em>Move</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveChange()
 * @model abstract="true"
 * @generated
 */
public interface MoveChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task To Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task To Schedule</em>' reference.
	 * @see #setTaskToSchedule(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveChange_TaskToSchedule()
	 * @model required="true"
	 * @generated
	 */
	SolutionTask getTaskToSchedule();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.MoveChange#getTaskToSchedule <em>Task To Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task To Schedule</em>' reference.
	 * @see #getTaskToSchedule()
	 * @generated
	 */
	void setTaskToSchedule(SolutionTask value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveChange_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveChange_Valid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Returns the value of the '<em><b>Move</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Move#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move</em>' container reference.
	 * @see #setMove(Move)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveChange_Move()
	 * @see com.misc.common.moplaf.scheduler.Move#getChanges
	 * @model opposite="Changes" required="true" transient="false"
	 * @generated
	 */
	Move getMove();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.MoveChange#getMove <em>Move</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move</em>' container reference.
	 * @see #getMove()
	 * @generated
	 */
	void setMove(Move value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean change();

} // MoveChange