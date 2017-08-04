/**
 */
package com.misc.common.moplaf.scheduler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getTask <em>Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getNextTask <em>Next Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getPreviousTask <em>Previous Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getAssignedResource <em>Assigned Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateAssignedResource <em>Candidate Assigned Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateNextTask <em>Candidate Next Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidatePreviousTask <em>Candidate Previous Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask()
 * @model
 * @generated
 */
public interface SolutionTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Next Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionTask#getPreviousTask <em>Previous Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Task</em>' reference.
	 * @see #setNextTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_NextTask()
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getPreviousTask
	 * @model opposite="PreviousTask"
	 * @generated
	 */
	SolutionTask getNextTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getNextTask <em>Next Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Task</em>' reference.
	 * @see #getNextTask()
	 * @generated
	 */
	void setNextTask(SolutionTask value);

	/**
	 * Returns the value of the '<em><b>Previous Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionTask#getNextTask <em>Next Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Task</em>' reference.
	 * @see #setPreviousTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_PreviousTask()
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getNextTask
	 * @model opposite="NextTask"
	 * @generated
	 */
	SolutionTask getPreviousTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getPreviousTask <em>Previous Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Task</em>' reference.
	 * @see #getPreviousTask()
	 * @generated
	 */
	void setPreviousTask(SolutionTask value);

	/**
	 * Returns the value of the '<em><b>Assigned Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionResource#getAssignedTasks <em>Assigned Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Resource</em>' reference.
	 * @see #setAssignedResource(SolutionResource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_AssignedResource()
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getAssignedTasks
	 * @model opposite="AssignedTasks"
	 * @generated
	 */
	SolutionResource getAssignedResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getAssignedResource <em>Assigned Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Resource</em>' reference.
	 * @see #getAssignedResource()
	 * @generated
	 */
	void setAssignedResource(SolutionResource value);

	/**
	 * Returns the value of the '<em><b>Candidate Assigned Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateAssignedTasks <em>Candidate Assigned Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Assigned Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Assigned Resource</em>' reference.
	 * @see #setCandidateAssignedResource(SolutionResource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_CandidateAssignedResource()
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getCandidateAssignedTasks
	 * @model opposite="CandidateAssignedTasks"
	 * @generated
	 */
	SolutionResource getCandidateAssignedResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateAssignedResource <em>Candidate Assigned Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Assigned Resource</em>' reference.
	 * @see #getCandidateAssignedResource()
	 * @generated
	 */
	void setCandidateAssignedResource(SolutionResource value);

	/**
	 * Returns the value of the '<em><b>Candidate Next Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidatePreviousTask <em>Candidate Previous Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Next Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Next Task</em>' reference.
	 * @see #setCandidateNextTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_CandidateNextTask()
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getCandidatePreviousTask
	 * @model opposite="CandidatePreviousTask"
	 * @generated
	 */
	SolutionTask getCandidateNextTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateNextTask <em>Candidate Next Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Next Task</em>' reference.
	 * @see #getCandidateNextTask()
	 * @generated
	 */
	void setCandidateNextTask(SolutionTask value);

	/**
	 * Returns the value of the '<em><b>Candidate Previous Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateNextTask <em>Candidate Next Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Previous Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Previous Task</em>' reference.
	 * @see #setCandidatePreviousTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_CandidatePreviousTask()
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getCandidateNextTask
	 * @model opposite="CandidateNextTask"
	 * @generated
	 */
	SolutionTask getCandidatePreviousTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidatePreviousTask <em>Candidate Previous Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Previous Task</em>' reference.
	 * @see #getCandidatePreviousTask()
	 * @generated
	 */
	void setCandidatePreviousTask(SolutionTask value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.TaskExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskExpression> getExpressions();

} // SolutionTask
