/**
 */
package com.misc.common.moplaf.scheduler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getMoves <em>Moves</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getCandidateMove <em>Candidate Move</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends EObject {
	/**
	 * Returns the value of the '<em><b>Moves</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Move}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moves</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moves</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_Moves()
	 * @model containment="true"
	 * @generated
	 */
	EList<Move> getMoves();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.SolutionTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolutionTask> getResources();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.SolutionResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolutionResource> getTasks();

	/**
	 * Returns the value of the '<em><b>Candidate Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Move</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Move</em>' reference.
	 * @see #setCandidateMove(Move)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_CandidateMove()
	 * @model
	 * @generated
	 */
	Move getCandidateMove();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Solution#getCandidateMove <em>Candidate Move</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Move</em>' reference.
	 * @see #getCandidateMove()
	 * @generated
	 */
	void setCandidateMove(Move value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.SolutionExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolutionExpression> getExpressions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void duplicate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCandidate(Move move);

} // Solution
