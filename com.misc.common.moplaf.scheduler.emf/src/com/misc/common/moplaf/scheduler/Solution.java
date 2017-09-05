/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <p>
 * A solution implements a schedule of the tasks on the resources. 
 * The schedule is qualified by expressions, that may be defined on task, on resource or on solution levels.
 * So a schedule is composed of the following elements
 * <ul>
 * <li>at Solution level
 * 	<ul>
 * 	<li>the Nr of tasks scheduled</li>
 * 	<li>a set of expressions</li>
 * 	</ul>
 * </li>
 * <li>at Resource level
 * 	<ul>
 * 	<li>the Nr of tasks scheduled </li>
 * 	<li>the set of tasks scheduled on the resource </li>
 * 	<li>the first task scheduled on the resource </li>
 * 	<li>the last task scheduled on the resource </li>
 * 	<li>a set of expressions</li>
 * 	</ul>
 * </li>
* <li>at Task level
 * 	<ul>
 * 	<li>the resource the task is scheduled on</li>
 * 	<li>the task next to this task in the schedule </li>
 * 	<li>the task previous to this task in the schedule </li>
 * 	<li>a set of expressions</li>
 * 	</ul>
 * </li>
 * </ul>
 * <p>
 * Two versions of the schedule are maintained by a Solution
 * <ul>
 * <li>the 'ActualSchedule', which is the actual current schedule considered </li>
 * <li>the 'CandidateSchedule', obtained from the actual by executing one Move: the Candidate Move </li>
 * </ul>
 * <p>
 * A solution can be in two states
 * <ul>
 * <li>no pending move: the actual and the candidate schedule are equal, a new Move can be done </li>
 * <li>with pending move: some candidate move has been set; the candidate schedule is different from the actual move
 * and is the result of applying this move; two operations are possible
 * 	<ul>
 * 	<li>'ResetCandidate': move is not done; the candidate schedule is aligned on the actual schedule; both schedules are equal</li>
 * 	<li>'AcceptCandidate': move is done; the actual schedule is aligned on the candidate schedule; both schedules are equal</li>
 * </ul>
 * </ul>
 * <p>
 * The implementation is optimized making the assumption that many small moves will be submitted. So setting and resetting 
 * a move should take a time proportional to the size of the move and constant with respect to the size of the 
 * solution.
 * <p>
 *
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
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#isPendingCandidateMove <em>Pending Candidate Move</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getSetCandidateMoveEnabled <em>Set Candidate Move Enabled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getResetCandidateMoveEnabled <em>Reset Candidate Move Enabled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getAcceptCandidateMoveEnabled <em>Accept Candidate Move Enabled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getMoves <em>Moves</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getCandidateMove <em>Candidate Move</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getNrCandidateScheduledTasks <em>Nr Candidate Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Solution#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}</li>
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
	 * Returns the value of the '<em><b>Nr Candidate Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Candidate Scheduled Tasks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Candidate Scheduled Tasks</em>' attribute.
	 * @see #setNrCandidateScheduledTasks(int)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_NrCandidateScheduledTasks()
	 * @model
	 * @generated
	 */
	int getNrCandidateScheduledTasks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Solution#getNrCandidateScheduledTasks <em>Nr Candidate Scheduled Tasks</em>}' attribute.
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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_NrScheduledTasks()
	 * @model
	 * @generated
	 */
	int getNrScheduledTasks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Solution#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Scheduled Tasks</em>' attribute.
	 * @see #getNrScheduledTasks()
	 * @generated
	 */
	void setNrScheduledTasks(int value);

	/**
	 * Returns the value of the '<em><b>Pending Candidate Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending Candidate Move</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Candidate Move</em>' attribute.
	 * @see #setPendingCandidateMove(boolean)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_PendingCandidateMove()
	 * @model
	 * @generated
	 */
	boolean isPendingCandidateMove();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Solution#isPendingCandidateMove <em>Pending Candidate Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending Candidate Move</em>' attribute.
	 * @see #isPendingCandidateMove()
	 * @generated
	 */
	void setPendingCandidateMove(boolean value);

	/**
	 * Returns the value of the '<em><b>Set Candidate Move Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Candidate Move Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Candidate Move Enabled</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_SetCandidateMoveEnabled()
	 * @model dataType="com.misc.common.moplaf.scheduler.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getSetCandidateMoveEnabled();

	/**
	 * Returns the value of the '<em><b>Reset Candidate Move Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Candidate Move Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Candidate Move Enabled</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_ResetCandidateMoveEnabled()
	 * @model dataType="com.misc.common.moplaf.scheduler.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getResetCandidateMoveEnabled();

	/**
	 * Returns the value of the '<em><b>Accept Candidate Move Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Candidate Move Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Candidate Move Enabled</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolution_AcceptCandidateMoveEnabled()
	 * @model dataType="com.misc.common.moplaf.scheduler.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getAcceptCandidateMoveEnabled();

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
	 * @model
	 * @generated
	 */
	void constructExpressions();

} // Solution
