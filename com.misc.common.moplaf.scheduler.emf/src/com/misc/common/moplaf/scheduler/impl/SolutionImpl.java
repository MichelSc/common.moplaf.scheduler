/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.common.moplaf.scheduler.CandidateValueExpression;
import com.misc.common.moplaf.scheduler.Plugin;
import com.misc.common.moplaf.scheduler.Move;
import com.misc.common.moplaf.scheduler.MoveChange;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcFactory;
import com.misc.common.moplaf.schedulercalc.SetExpressionCandidateValueScope;
import com.misc.common.moplaf.schedulercalc.SetScheduleScope;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#isPendingCandidateMove <em>Pending Candidate Move</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getSetCandidateMoveEnabled <em>Set Candidate Move Enabled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getResetCandidateMoveEnabled <em>Reset Candidate Move Enabled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getAcceptCandidateMoveEnabled <em>Accept Candidate Move Enabled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getMoves <em>Moves</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getCandidateMove <em>Candidate Move</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getNrCandidateScheduledTasks <em>Nr Candidate Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionImpl extends ObjectWithPropagatorFunctionsImpl implements Solution {
	/**
	 * The default value of the '{@link #isPendingCandidateMove() <em>Pending Candidate Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPendingCandidateMove()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PENDING_CANDIDATE_MOVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPendingCandidateMove() <em>Pending Candidate Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPendingCandidateMove()
	 * @generated
	 * @ordered
	 */
	protected boolean pendingCandidateMove = PENDING_CANDIDATE_MOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetCandidateMoveEnabled() <em>Set Candidate Move Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetCandidateMoveEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback SET_CANDIDATE_MOVE_ENABLED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getResetCandidateMoveEnabled() <em>Reset Candidate Move Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetCandidateMoveEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback RESET_CANDIDATE_MOVE_ENABLED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAcceptCandidateMoveEnabled() <em>Accept Candidate Move Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptCandidateMoveEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback ACCEPT_CANDIDATE_MOVE_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoves() <em>Moves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<Move> moves;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionTask> tasks;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionResource> resources;

	/**
	 * The cached value of the '{@link #getCandidateMove() <em>Candidate Move</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateMove()
	 * @generated
	 * @ordered
	 */
	protected Move candidateMove;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<CandidateValueExpression> expressions;

	/**
	 * The default value of the '{@link #getSolutionNr() <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLUTION_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSolutionNr() <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected int solutionNr = SOLUTION_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrCandidateScheduledTasks() <em>Nr Candidate Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrCandidateScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_CANDIDATE_SCHEDULED_TASKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrCandidateScheduledTasks() <em>Nr Candidate Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrCandidateScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected int nrCandidateScheduledTasks = NR_CANDIDATE_SCHEDULED_TASKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrScheduledTasks() <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_SCHEDULED_TASKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrScheduledTasks() <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected int nrScheduledTasks = NR_SCHEDULED_TASKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Move> getMoves() {
		if (moves == null) {
			moves = new EObjectContainmentWithInverseEList<Move>(Move.class, this, SchedulerPackage.SOLUTION__MOVES, SchedulerPackage.MOVE__SOLUTION);
		}
		return moves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<SolutionResource>(SolutionResource.class, this, SchedulerPackage.SOLUTION__RESOURCES, SchedulerPackage.SOLUTION_RESOURCE__SOLUTION);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionTask> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentWithInverseEList<SolutionTask>(SolutionTask.class, this, SchedulerPackage.SOLUTION__TASKS, SchedulerPackage.SOLUTION_TASK__SOLUTION);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move getCandidateMove() {
		if (candidateMove != null && candidateMove.eIsProxy()) {
			InternalEObject oldCandidateMove = (InternalEObject)candidateMove;
			candidateMove = (Move)eResolveProxy(oldCandidateMove);
			if (candidateMove != oldCandidateMove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION__CANDIDATE_MOVE, oldCandidateMove, candidateMove));
			}
		}
		return candidateMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move basicGetCandidateMove() {
		return candidateMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateMove(Move newCandidateMove) {
		Move oldCandidateMove = candidateMove;
		candidateMove = newCandidateMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION__CANDIDATE_MOVE, oldCandidateMove, candidateMove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CandidateValueExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectResolvingEList<CandidateValueExpression>(CandidateValueExpression.class, this, SchedulerPackage.SOLUTION__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSolutionNr() {
		return solutionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolutionNr(int newSolutionNr) {
		int oldSolutionNr = solutionNr;
		solutionNr = newSolutionNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION__SOLUTION_NR, oldSolutionNr, solutionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getScheduler() {
		if (eContainerFeatureID() != SchedulerPackage.SOLUTION__SCHEDULER) return null;
		return (Scheduler)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduler(Scheduler newScheduler, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScheduler, SchedulerPackage.SOLUTION__SCHEDULER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(Scheduler newScheduler) {
		if (newScheduler != eInternalContainer() || (eContainerFeatureID() != SchedulerPackage.SOLUTION__SCHEDULER && newScheduler != null)) {
			if (EcoreUtil.isAncestor(this, newScheduler))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScheduler != null)
				msgs = ((InternalEObject)newScheduler).eInverseAdd(this, SchedulerPackage.SCHEDULER__SOLUTIONS, Scheduler.class, msgs);
			msgs = basicSetScheduler(newScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION__SCHEDULER, newScheduler, newScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrCandidateScheduledTasks() {
		return nrCandidateScheduledTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrCandidateScheduledTasks(int newNrCandidateScheduledTasks) {
		int oldNrCandidateScheduledTasks = nrCandidateScheduledTasks;
		nrCandidateScheduledTasks = newNrCandidateScheduledTasks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION__NR_CANDIDATE_SCHEDULED_TASKS, oldNrCandidateScheduledTasks, nrCandidateScheduledTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrScheduledTasks() {
		return nrScheduledTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrScheduledTasks(int newNrScheduledTasks) {
		int oldNrScheduledTasks = nrScheduledTasks;
		nrScheduledTasks = newNrScheduledTasks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION__NR_SCHEDULED_TASKS, oldNrScheduledTasks, nrScheduledTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPendingCandidateMove() {
		return pendingCandidateMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPendingCandidateMove(boolean newPendingCandidateMove) {
		boolean oldPendingCandidateMove = pendingCandidateMove;
		pendingCandidateMove = newPendingCandidateMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION__PENDING_CANDIDATE_MOVE, oldPendingCandidateMove, pendingCandidateMove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getSetCandidateMoveEnabled() {
		if ( !this.isPendingCandidateMove() ){
			return EnabledFeedback.NOFEEDBACK;
		}
		return new EnabledFeedback(false, "Pending move");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getResetCandidateMoveEnabled() {
		if ( this.isPendingCandidateMove() ){
			return EnabledFeedback.NOFEEDBACK;
		}
		return new EnabledFeedback(false, "No pending move");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getAcceptCandidateMoveEnabled() {
		if ( this.isPendingCandidateMove() ){
			return EnabledFeedback.NOFEEDBACK;
		}
		return new EnabledFeedback(false, "No pending move");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void initialize() {
		// clear everything
		SetScheduleScope scopeSetSchedule = this.getPropagatorFunction(SetScheduleScope.class);
		if ( scopeSetSchedule!=null) {
			// pending changes must be removed before removing the tasks/resources (otherwise the objects will be dangling)
			scopeSetSchedule.reset();
		}
		this.getTasks().clear();
		this.getResources().clear();
		this.getMoves().clear();
		this.setCandidateMove(null);
		// construct everything
		Scheduler scheduler = this.getScheduler();
		for ( EObject resource : scheduler.getResources()) {
			SolutionResource new_solution_resource = scheduler.constructResource(resource);
			new_solution_resource.setResource(resource);
			this.getResources().add(new_solution_resource);
			new_solution_resource.constructExpressions();
		}
		for ( EObject task : scheduler.getTasks()) {
			SolutionTask new_solution_task = scheduler.constructTask(task);
			new_solution_task.setTask(task);
			this.getTasks().add(new_solution_task);
			new_solution_task.constructExpressions();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution clone() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setCandidate(Move move) {
		assert !this.isPendingCandidateMove();
		
		SetExpressionCandidateValueScope scopeExpressions = this.getPropagatorFunction(SetExpressionCandidateValueScope.class);
		if ( scopeExpressions==null) {
			// scheduler not enabled: unexpected
			String logMessage = String.format("Solution.setCandidate not performed, Scheduler not enabled");
			Plugin.INSTANCE.logError(logMessage);
			return;
		}
		// everything is up to date, so no reset necessary
		// execute the move
		if ( move != null) {
			for ( MoveChange change : move.getChanges()) {
				if ( !change.isValid()) {
					Plugin.INSTANCE.logError("invalid move change"+change.getDescription());
					break;
				}
				boolean success  = change.change();
				if ( !success ) {
					Plugin.INSTANCE.logError("unexecutable move change"+change.getDescription());
					break;
				}
			}
		}
		this.setCandidateMove(move);
		// refresh the expressions
		scopeExpressions.refresh();
		// there is now a pending move
		this.setPendingCandidateMove(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void resetCandidate() {
		assert this.isPendingCandidateMove();
		
		// there is no pending move
		this.setPendingCandidateMove(false);
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void acceptCandidate() {
		assert this.isPendingCandidateMove();
		
		SetScheduleScope scopeSetSchedule = this.getPropagatorFunction(SetScheduleScope.class);
		if ( scopeSetSchedule==null) {
			// scheduler not enabled: unexpected
			String logMessage = String.format("Solution.acceptCandidate not performed, Scheduler not enabled");
			Plugin.INSTANCE.logError(logMessage);
			return;
		}
		// align schedule on candidate
		scopeSetSchedule.refresh();

		// there is no pending move
		this.setPendingCandidateMove(false);
		// at this point, nothing touched, everything is up to date
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void constructExpressions() {
		// solution does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.SOLUTION__MOVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMoves()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SOLUTION__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SOLUTION__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SOLUTION__SCHEDULER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScheduler((Scheduler)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.SOLUTION__MOVES:
				return ((InternalEList<?>)getMoves()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION__SCHEDULER:
				return basicSetScheduler(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SchedulerPackage.SOLUTION__SCHEDULER:
				return eInternalContainer().eInverseRemove(this, SchedulerPackage.SCHEDULER__SOLUTIONS, Scheduler.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.SOLUTION__PENDING_CANDIDATE_MOVE:
				return isPendingCandidateMove();
			case SchedulerPackage.SOLUTION__SET_CANDIDATE_MOVE_ENABLED:
				return getSetCandidateMoveEnabled();
			case SchedulerPackage.SOLUTION__RESET_CANDIDATE_MOVE_ENABLED:
				return getResetCandidateMoveEnabled();
			case SchedulerPackage.SOLUTION__ACCEPT_CANDIDATE_MOVE_ENABLED:
				return getAcceptCandidateMoveEnabled();
			case SchedulerPackage.SOLUTION__MOVES:
				return getMoves();
			case SchedulerPackage.SOLUTION__TASKS:
				return getTasks();
			case SchedulerPackage.SOLUTION__RESOURCES:
				return getResources();
			case SchedulerPackage.SOLUTION__CANDIDATE_MOVE:
				if (resolve) return getCandidateMove();
				return basicGetCandidateMove();
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				return getExpressions();
			case SchedulerPackage.SOLUTION__SOLUTION_NR:
				return getSolutionNr();
			case SchedulerPackage.SOLUTION__SCHEDULER:
				return getScheduler();
			case SchedulerPackage.SOLUTION__NR_CANDIDATE_SCHEDULED_TASKS:
				return getNrCandidateScheduledTasks();
			case SchedulerPackage.SOLUTION__NR_SCHEDULED_TASKS:
				return getNrScheduledTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulerPackage.SOLUTION__PENDING_CANDIDATE_MOVE:
				setPendingCandidateMove((Boolean)newValue);
				return;
			case SchedulerPackage.SOLUTION__MOVES:
				getMoves().clear();
				getMoves().addAll((Collection<? extends Move>)newValue);
				return;
			case SchedulerPackage.SOLUTION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends SolutionTask>)newValue);
				return;
			case SchedulerPackage.SOLUTION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends SolutionResource>)newValue);
				return;
			case SchedulerPackage.SOLUTION__CANDIDATE_MOVE:
				setCandidateMove((Move)newValue);
				return;
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends CandidateValueExpression>)newValue);
				return;
			case SchedulerPackage.SOLUTION__SOLUTION_NR:
				setSolutionNr((Integer)newValue);
				return;
			case SchedulerPackage.SOLUTION__SCHEDULER:
				setScheduler((Scheduler)newValue);
				return;
			case SchedulerPackage.SOLUTION__NR_CANDIDATE_SCHEDULED_TASKS:
				setNrCandidateScheduledTasks((Integer)newValue);
				return;
			case SchedulerPackage.SOLUTION__NR_SCHEDULED_TASKS:
				setNrScheduledTasks((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchedulerPackage.SOLUTION__PENDING_CANDIDATE_MOVE:
				setPendingCandidateMove(PENDING_CANDIDATE_MOVE_EDEFAULT);
				return;
			case SchedulerPackage.SOLUTION__MOVES:
				getMoves().clear();
				return;
			case SchedulerPackage.SOLUTION__TASKS:
				getTasks().clear();
				return;
			case SchedulerPackage.SOLUTION__RESOURCES:
				getResources().clear();
				return;
			case SchedulerPackage.SOLUTION__CANDIDATE_MOVE:
				setCandidateMove((Move)null);
				return;
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				getExpressions().clear();
				return;
			case SchedulerPackage.SOLUTION__SOLUTION_NR:
				setSolutionNr(SOLUTION_NR_EDEFAULT);
				return;
			case SchedulerPackage.SOLUTION__SCHEDULER:
				setScheduler((Scheduler)null);
				return;
			case SchedulerPackage.SOLUTION__NR_CANDIDATE_SCHEDULED_TASKS:
				setNrCandidateScheduledTasks(NR_CANDIDATE_SCHEDULED_TASKS_EDEFAULT);
				return;
			case SchedulerPackage.SOLUTION__NR_SCHEDULED_TASKS:
				setNrScheduledTasks(NR_SCHEDULED_TASKS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchedulerPackage.SOLUTION__PENDING_CANDIDATE_MOVE:
				return pendingCandidateMove != PENDING_CANDIDATE_MOVE_EDEFAULT;
			case SchedulerPackage.SOLUTION__SET_CANDIDATE_MOVE_ENABLED:
				return SET_CANDIDATE_MOVE_ENABLED_EDEFAULT == null ? getSetCandidateMoveEnabled() != null : !SET_CANDIDATE_MOVE_ENABLED_EDEFAULT.equals(getSetCandidateMoveEnabled());
			case SchedulerPackage.SOLUTION__RESET_CANDIDATE_MOVE_ENABLED:
				return RESET_CANDIDATE_MOVE_ENABLED_EDEFAULT == null ? getResetCandidateMoveEnabled() != null : !RESET_CANDIDATE_MOVE_ENABLED_EDEFAULT.equals(getResetCandidateMoveEnabled());
			case SchedulerPackage.SOLUTION__ACCEPT_CANDIDATE_MOVE_ENABLED:
				return ACCEPT_CANDIDATE_MOVE_ENABLED_EDEFAULT == null ? getAcceptCandidateMoveEnabled() != null : !ACCEPT_CANDIDATE_MOVE_ENABLED_EDEFAULT.equals(getAcceptCandidateMoveEnabled());
			case SchedulerPackage.SOLUTION__MOVES:
				return moves != null && !moves.isEmpty();
			case SchedulerPackage.SOLUTION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case SchedulerPackage.SOLUTION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case SchedulerPackage.SOLUTION__CANDIDATE_MOVE:
				return candidateMove != null;
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case SchedulerPackage.SOLUTION__SOLUTION_NR:
				return solutionNr != SOLUTION_NR_EDEFAULT;
			case SchedulerPackage.SOLUTION__SCHEDULER:
				return getScheduler() != null;
			case SchedulerPackage.SOLUTION__NR_CANDIDATE_SCHEDULED_TASKS:
				return nrCandidateScheduledTasks != NR_CANDIDATE_SCHEDULED_TASKS_EDEFAULT;
			case SchedulerPackage.SOLUTION__NR_SCHEDULED_TASKS:
				return nrScheduledTasks != NR_SCHEDULED_TASKS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SchedulerPackage.SOLUTION___INITIALIZE:
				initialize();
				return null;
			case SchedulerPackage.SOLUTION___CONSTRUCT_EXPRESSIONS:
				constructExpressions();
				return null;
			case SchedulerPackage.SOLUTION___CLONE:
				return clone();
			case SchedulerPackage.SOLUTION___SET_CANDIDATE__MOVE:
				setCandidate((Move)arguments.get(0));
				return null;
			case SchedulerPackage.SOLUTION___RESET_CANDIDATE:
				resetCandidate();
				return null;
			case SchedulerPackage.SOLUTION___ACCEPT_CANDIDATE:
				acceptCandidate();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pendingCandidateMove: ");
		result.append(pendingCandidateMove);
		result.append(", SolutionNr: ");
		result.append(solutionNr);
		result.append(", NrCandidateScheduledTasks: ");
		result.append(nrCandidateScheduledTasks);
		result.append(", NrScheduledTasks: ");
		result.append(nrScheduledTasks);
		result.append(')');
		return result.toString();
	}

	@Override
	public void addPropagatorFunctions(String factoryID) {
		super.addPropagatorFunctions(factoryID);
		if ( factoryID==SetExpressionCandidateValueScope.scopeIDCalcCandidateValue) {
			this.addPropagatorFunction(SchedulerCalcFactory.eINSTANCE.createSetExpressionCandidateValueScope());
		}
	}
	
	

} //SolutionImpl
