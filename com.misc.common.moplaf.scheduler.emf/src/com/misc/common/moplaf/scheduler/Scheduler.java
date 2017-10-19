/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.localsearch.Score;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler()
 * @model abstract="true"
 * @generated
 */
public interface Scheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Schedules</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Schedule}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Schedule#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedules</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler_Schedules()
	 * @see com.misc.common.moplaf.scheduler.Schedule#getScheduler
	 * @model opposite="Scheduler" containment="true"
	 * @generated
	 */
	EList<Schedule> getSchedules();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Scheduler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Solution Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Solution Nr</em>' attribute.
	 * @see #setCurrentSolutionNr(int)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler_CurrentSolutionNr()
	 * @model
	 * @generated
	 */
	int getCurrentSolutionNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Scheduler#getCurrentSolutionNr <em>Current Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Solution Nr</em>' attribute.
	 * @see #getCurrentSolutionNr()
	 * @generated
	 */
	void setCurrentSolutionNr(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Schedule constructSchedule();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Score constructScore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateTasks(Schedule schedule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateResources(Schedule schedule);

} // Scheduler
