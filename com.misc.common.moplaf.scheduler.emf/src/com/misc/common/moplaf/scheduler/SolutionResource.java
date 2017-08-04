/**
 */
package com.misc.common.moplaf.scheduler;

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
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getAssignedTasks <em>Assigned Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateAssignedTasks <em>Candidate Assigned Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionResource#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource()
 * @model
 * @generated
 */
public interface SolutionResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_Resource()
	 * @model required="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionResource#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Assigned Tasks</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.SolutionTask}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionTask#getAssignedResource <em>Assigned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Tasks</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_AssignedTasks()
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getAssignedResource
	 * @model opposite="AssignedResource"
	 * @generated
	 */
	EList<SolutionTask> getAssignedTasks();

	/**
	 * Returns the value of the '<em><b>Candidate Assigned Tasks</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.SolutionTask}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateAssignedResource <em>Candidate Assigned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Assigned Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Assigned Tasks</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_CandidateAssignedTasks()
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getCandidateAssignedResource
	 * @model opposite="CandidateAssignedResource"
	 * @generated
	 */
	EList<SolutionTask> getCandidateAssignedTasks();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.ResourceExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionResource_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceExpression> getExpressions();

} // SolutionResource
