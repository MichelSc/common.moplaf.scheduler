/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
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
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getScheduledResource <em>Scheduled Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateNextTask <em>Candidate Next Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidatePreviousTask <em>Candidate Previous Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getResourceAsCandidateFirstTask <em>Resource As Candidate First Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getResourceAsCandidateLastTask <em>Resource As Candidate Last Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateScheduledResource <em>Candidate Scheduled Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionTask#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask()
 * @model
 * @generated
 */
public interface SolutionTask extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(EObject)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_Task()
	 * @model required="true"
	 * @generated
	 */
	EObject getTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(EObject value);

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
	 * Returns the value of the '<em><b>Scheduled Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionResource#getScheduledTasks <em>Scheduled Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Resource</em>' reference.
	 * @see #setScheduledResource(SolutionResource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_ScheduledResource()
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getScheduledTasks
	 * @model opposite="ScheduledTasks"
	 * @generated
	 */
	SolutionResource getScheduledResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getScheduledResource <em>Scheduled Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Resource</em>' reference.
	 * @see #getScheduledResource()
	 * @generated
	 */
	void setScheduledResource(SolutionResource value);

	/**
	 * Returns the value of the '<em><b>Candidate Scheduled Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateScheduledTasks <em>Candidate Scheduled Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Scheduled Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Scheduled Resource</em>' reference.
	 * @see #setCandidateScheduledResource(SolutionResource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_CandidateScheduledResource()
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getCandidateScheduledTasks
	 * @model opposite="CandidateScheduledTasks"
	 * @generated
	 */
	SolutionResource getCandidateScheduledResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateScheduledResource <em>Candidate Scheduled Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Scheduled Resource</em>' reference.
	 * @see #getCandidateScheduledResource()
	 * @generated
	 */
	void setCandidateScheduledResource(SolutionResource value);

	/**
	 * Returns the value of the '<em><b>Candidate Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Next Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Next Task</em>' reference.
	 * @see #setCandidateNextTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_CandidateNextTask()
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Previous Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Previous Task</em>' reference.
	 * @see #setCandidatePreviousTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_CandidatePreviousTask()
	 * @model
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
	 * Returns the value of the '<em><b>Resource As Candidate First Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateFirstTask <em>Candidate First Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource As Candidate First Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource As Candidate First Task</em>' reference.
	 * @see #setResourceAsCandidateFirstTask(SolutionResource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_ResourceAsCandidateFirstTask()
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getCandidateFirstTask
	 * @model opposite="CandidateFirstTask"
	 * @generated
	 */
	SolutionResource getResourceAsCandidateFirstTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getResourceAsCandidateFirstTask <em>Resource As Candidate First Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource As Candidate First Task</em>' reference.
	 * @see #getResourceAsCandidateFirstTask()
	 * @generated
	 */
	void setResourceAsCandidateFirstTask(SolutionResource value);

	/**
	 * Returns the value of the '<em><b>Resource As Candidate Last Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateLastTask <em>Candidate Last Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource As Candidate Last Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource As Candidate Last Task</em>' reference.
	 * @see #setResourceAsCandidateLastTask(SolutionResource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_ResourceAsCandidateLastTask()
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getCandidateLastTask
	 * @model opposite="CandidateLastTask"
	 * @generated
	 */
	SolutionResource getResourceAsCandidateLastTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getResourceAsCandidateLastTask <em>Resource As Candidate Last Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource As Candidate Last Task</em>' reference.
	 * @see #getResourceAsCandidateLastTask()
	 * @generated
	 */
	void setResourceAsCandidateLastTask(SolutionResource value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.TaskExpression}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.TaskExpression#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_Expressions()
	 * @see com.misc.common.moplaf.scheduler.TaskExpression#getTask
	 * @model opposite="Task"
	 * @generated
	 */
	EList<TaskExpression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Solution#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' container reference.
	 * @see #setSolution(Solution)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_Solution()
	 * @see com.misc.common.moplaf.scheduler.Solution#getTasks
	 * @model opposite="Tasks" required="true" transient="false"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getSolution <em>Solution</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' container reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionTask#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unsetCandidatePreviousNext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCandidatePreviousNext(SolutionResource solution, SolutionTask previous, SolutionTask next);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void constructExpressions();

} // SolutionTask
