/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getScheduledTasks <em>Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateScheduledTasks <em>Candidate Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateFirstTask <em>Candidate First Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateLastTask <em>Candidate Last Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getNrCandidateScheduledTasks <em>Nr Candidate Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getFirstTask <em>First Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getLastTask <em>Last Task</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource()
 * @model
 * @generated
 */
public interface SolutionResource extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(EObject)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_Resource()
	 * @model required="true"
	 * @generated
	 */
	EObject getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionResource#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(EObject value);

	/**
	 * Returns the value of the '<em><b>Scheduled Tasks</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.SolutionTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Tasks</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_ScheduledTasks()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SolutionTask> getScheduledTasks();

	/**
	 * Returns the value of the '<em><b>Candidate Scheduled Tasks</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.SolutionTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Scheduled Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Scheduled Tasks</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_CandidateScheduledTasks()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SolutionTask> getCandidateScheduledTasks();

	/**
	 * Returns the value of the '<em><b>Candidate First Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate First Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate First Task</em>' reference.
	 * @see #setCandidateFirstTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_CandidateFirstTask()
	 * @model
	 * @generated
	 */
	SolutionTask getCandidateFirstTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateFirstTask <em>Candidate First Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate First Task</em>' reference.
	 * @see #getCandidateFirstTask()
	 * @generated
	 */
	void setCandidateFirstTask(SolutionTask value);

	/**
	 * Returns the value of the '<em><b>Candidate Last Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Last Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Last Task</em>' reference.
	 * @see #setCandidateLastTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_CandidateLastTask()
	 * @model
	 * @generated
	 */
	SolutionTask getCandidateLastTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateLastTask <em>Candidate Last Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Last Task</em>' reference.
	 * @see #getCandidateLastTask()
	 * @generated
	 */
	void setCandidateLastTask(SolutionTask value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.CandidateValueExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_Expressions()
	 * @model
	 * @generated
	 */
	EList<CandidateValueExpression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Solution#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' container reference.
	 * @see #setSolution(Solution)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_Solution()
	 * @see com.misc.common.moplaf.scheduler.Solution#getResources
	 * @model opposite="Resources" required="true" transient="false"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionResource#getSolution <em>Solution</em>}' container reference.
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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_NrScheduledTasks()
	 * @model
	 * @generated
	 */
	int getNrScheduledTasks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionResource#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Scheduled Tasks</em>' attribute.
	 * @see #getNrScheduledTasks()
	 * @generated
	 */
	void setNrScheduledTasks(int value);

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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_NrCandidateScheduledTasks()
	 * @model
	 * @generated
	 */
	int getNrCandidateScheduledTasks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionResource#getNrCandidateScheduledTasks <em>Nr Candidate Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Candidate Scheduled Tasks</em>' attribute.
	 * @see #getNrCandidateScheduledTasks()
	 * @generated
	 */
	void setNrCandidateScheduledTasks(int value);

	/**
	 * Returns the value of the '<em><b>First Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Task</em>' reference.
	 * @see #setFirstTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_FirstTask()
	 * @model
	 * @generated
	 */
	SolutionTask getFirstTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionResource#getFirstTask <em>First Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Task</em>' reference.
	 * @see #getFirstTask()
	 * @generated
	 */
	void setFirstTask(SolutionTask value);

	/**
	 * Returns the value of the '<em><b>Last Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Task</em>' reference.
	 * @see #setLastTask(SolutionTask)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_LastTask()
	 * @model
	 * @generated
	 */
	SolutionTask getLastTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionResource#getLastTask <em>Last Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Task</em>' reference.
	 * @see #getLastTask()
	 * @generated
	 */
	void setLastTask(SolutionTask value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void constructExpressions();

} // SolutionResource
