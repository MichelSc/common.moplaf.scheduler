/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.localsearch.Solution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Update the candidate solution with the parameter Move.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getNrCandidateScheduledTasks <em>Nr Candidate Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends Solution {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Task}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Task#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_Tasks()
	 * @see com.misc.common.moplaf.scheduler.Task#getSchedule
	 * @model opposite="Schedule" containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Resource}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Resource#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_Resources()
	 * @see com.misc.common.moplaf.scheduler.Resource#getSchedule
	 * @model opposite="Schedule" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Nr</em>' attribute.
	 * @see #setSolutionNr(int)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_SolutionNr()
	 * @model
	 * @generated
	 */
	int getSolutionNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Schedule#getSolutionNr <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution Nr</em>' attribute.
	 * @see #getSolutionNr()
	 * @generated
	 */
	void setSolutionNr(int value);

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Scheduler#getSchedulers <em>Schedulers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' container reference.
	 * @see #setScheduler(Scheduler)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_Scheduler()
	 * @see com.misc.common.moplaf.scheduler.Scheduler#getSchedulers
	 * @model opposite="Schedulers" transient="false"
	 * @generated
	 */
	Scheduler getScheduler();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Schedule#getScheduler <em>Scheduler</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' container reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(Scheduler value);

	/**
	 * Returns the value of the '<em><b>Nr Candidate Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Candidate Scheduled Tasks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Candidate Scheduled Tasks</em>' attribute.
	 * @see #setNrCandidateScheduledTasks(int)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_NrCandidateScheduledTasks()
	 * @model
	 * @generated
	 */
	int getNrCandidateScheduledTasks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Schedule#getNrCandidateScheduledTasks <em>Nr Candidate Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Candidate Scheduled Tasks</em>' attribute.
	 * @see #getNrCandidateScheduledTasks()
	 * @generated
	 */
	void setNrCandidateScheduledTasks(int value);

	/**
	 * Returns the value of the '<em><b>Nr Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Scheduled Tasks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Scheduled Tasks</em>' attribute.
	 * @see #setNrScheduledTasks(int)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_NrScheduledTasks()
	 * @model
	 * @generated
	 */
	int getNrScheduledTasks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Schedule#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Scheduled Tasks</em>' attribute.
	 * @see #getNrScheduledTasks()
	 * @generated
	 */
	void setNrScheduledTasks(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initialiaze the solution to the zero solution (no Task is scheduled)
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // Schedule
