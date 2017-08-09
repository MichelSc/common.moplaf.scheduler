/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.common.moplaf.scheduler.Plugin;
import com.misc.common.moplaf.scheduler.Move;
import com.misc.common.moplaf.scheduler.MoveChange;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionExpression;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResourceScope;

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
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getMoves <em>Moves</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getCandidateMove <em>Candidate Move</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionImpl extends ObjectWithPropagatorFunctionsImpl implements Solution {
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
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionExpression> expressions;

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
	public EList<SolutionExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentWithInverseEList<SolutionExpression>(SolutionExpression.class, this, SchedulerPackage.SOLUTION__EXPRESSIONS, SchedulerPackage.SOLUTION_EXPRESSION__SOLUTION);
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
		// restore the candidate move to the solution
		this.resetCandidate();
		// execute the candidate move
		SetTaskCandidateScheduledResourceScope scope = this.getPropagatorFunction(SetTaskCandidateScheduledResourceScope.class);
		scope.reset();
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
		scope.refresh();
		// set the candidate move
		this.setCandidateMove(move);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void resetCandidate() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void acceptCandidate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void reset() {
		// clear everything
		this.getTasks().clear();
		this.getResources().clear();
		this.getMoves().clear();
		// construct everyting
		Scheduler scheduler = this.getScheduler();
		for ( EObject resource : scheduler.getResources()) {
			SolutionResource new_solution_resource = scheduler.constructResource(resource);
			new_solution_resource.setResource(resource);
			this.getResources().add(new_solution_resource);
		}
		for ( EObject task : scheduler.getTasks()) {
			SolutionTask new_solution_task = scheduler.constructTask(task);
			new_solution_task.setTask(task);
			this.getTasks().add(new_solution_task);
		}
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
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpressions()).basicAdd(otherEnd, msgs);
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
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
				getExpressions().addAll((Collection<? extends SolutionExpression>)newValue);
				return;
			case SchedulerPackage.SOLUTION__SOLUTION_NR:
				setSolutionNr((Integer)newValue);
				return;
			case SchedulerPackage.SOLUTION__SCHEDULER:
				setScheduler((Scheduler)newValue);
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
			case SchedulerPackage.SOLUTION___RESET:
				reset();
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
		result.append(" (SolutionNr: ");
		result.append(solutionNr);
		result.append(')');
		return result.toString();
	}

} //SolutionImpl
