/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
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
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getMoves <em>Moves</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getCandidateMove <em>Candidate Move</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Moves</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Move}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Move#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moves</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moves</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_Moves()
	 * @see com.misc.common.moplaf.scheduler.Move#getSolution
	 * @model opposite="Solution" containment="true"
	 * @generated
	 */
	EList<Move> getMoves();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.SolutionTask}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionTask#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_Tasks()
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getSolution
	 * @model opposite="Solution" containment="true"
	 * @generated
	 */
	EList<SolutionTask> getTasks();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.SolutionResource}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionResource#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_Resources()
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getSolution
	 * @model opposite="Solution" containment="true"
	 * @generated
	 */
	EList<SolutionResource> getResources();

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
	 * Returns the value of the '<em><b>Expressions</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.CandidateValueExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_Expressions()
	 * @model
	 * @generated
	 */
	EList<CandidateValueExpression> getExpressions();

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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_SolutionNr()
	 * @model
	 * @generated
	 */
	int getSolutionNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Solution#getSolutionNr <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution Nr</em>' attribute.
	 * @see #getSolutionNr()
	 * @generated
	 */
	void setSolutionNr(int value);

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Scheduler#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' container reference.
	 * @see #setScheduler(Scheduler)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_Scheduler()
	 * @see com.misc.common.moplaf.scheduler.Scheduler#getSolutions
	 * @model opposite="Solutions" transient="false"
	 * @generated
	 */
	Scheduler getScheduler();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Solution#getScheduler <em>Scheduler</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' container reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(Scheduler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a new solution in the reset state (no candidate move, candidate values are reset to the solution values)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Solution clone();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the candidate move. The candidate expression values are updated as a function of the new candidate move.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setCandidate(Move move);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reset the candidate solution to this Solution. The candidate expression values are aligned to the solution expression values.
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void resetCandidate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change this Solution into the candidate Solution. The solutions expression values are updated with the candidate expression values.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void acceptCandidate();

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
	void reset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void constructExpressions();

} // Solution
