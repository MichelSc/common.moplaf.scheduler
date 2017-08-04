/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.Move;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionExpression;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getCandidateMove <em>Candidate Move</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionImpl extends MinimalEObjectImpl.Container implements Solution {
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
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionTask> resources;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionResource> tasks;

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
			moves = new EObjectContainmentEList<Move>(Move.class, this, SchedulerPackage.SOLUTION__MOVES);
		}
		return moves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionTask> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<SolutionTask>(SolutionTask.class, this, SchedulerPackage.SOLUTION__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionResource> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<SolutionResource>(SolutionResource.class, this, SchedulerPackage.SOLUTION__TASKS);
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
			expressions = new EObjectContainmentEList<SolutionExpression>(SolutionExpression.class, this, SchedulerPackage.SOLUTION__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void duplicate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidate(Move move) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case SchedulerPackage.SOLUTION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case SchedulerPackage.SOLUTION__RESOURCES:
				return getResources();
			case SchedulerPackage.SOLUTION__TASKS:
				return getTasks();
			case SchedulerPackage.SOLUTION__CANDIDATE_MOVE:
				if (resolve) return getCandidateMove();
				return basicGetCandidateMove();
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				return getExpressions();
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
			case SchedulerPackage.SOLUTION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends SolutionTask>)newValue);
				return;
			case SchedulerPackage.SOLUTION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends SolutionResource>)newValue);
				return;
			case SchedulerPackage.SOLUTION__CANDIDATE_MOVE:
				setCandidateMove((Move)newValue);
				return;
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends SolutionExpression>)newValue);
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
			case SchedulerPackage.SOLUTION__RESOURCES:
				getResources().clear();
				return;
			case SchedulerPackage.SOLUTION__TASKS:
				getTasks().clear();
				return;
			case SchedulerPackage.SOLUTION__CANDIDATE_MOVE:
				setCandidateMove((Move)null);
				return;
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				getExpressions().clear();
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
			case SchedulerPackage.SOLUTION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case SchedulerPackage.SOLUTION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case SchedulerPackage.SOLUTION__CANDIDATE_MOVE:
				return candidateMove != null;
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
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
			case SchedulerPackage.SOLUTION___DUPLICATE:
				duplicate();
				return null;
			case SchedulerPackage.SOLUTION___SET_CANDIDATE__MOVE:
				setCandidate((Move)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SolutionImpl
