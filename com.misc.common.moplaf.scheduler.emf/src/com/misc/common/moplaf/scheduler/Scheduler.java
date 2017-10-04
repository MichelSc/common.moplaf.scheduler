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
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getSchedulers <em>Schedulers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler()
 * @model abstract="true"
 * @generated
 */
public interface Scheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Schedulers</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Schedule}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Schedule#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulers</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler_Schedulers()
	 * @see com.misc.common.moplaf.scheduler.Schedule#getScheduler
	 * @model opposite="Scheduler" containment="true"
	 * @generated
	 */
	EList<Schedule> getSchedulers();

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
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler_Tasks()
	 * @model
	 * @generated
	 */
	EList<EObject> getTasks();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler_Resources()
	 * @model
	 * @generated
	 */
	EList<EObject> getResources();

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
	Task constructTask(EObject task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Resource constructResource(EObject resource);

} // Scheduler
