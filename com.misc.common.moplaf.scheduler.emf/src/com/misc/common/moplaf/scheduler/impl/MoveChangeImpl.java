/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.Move;
import com.misc.common.moplaf.scheduler.MoveChange;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionTask;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.MoveChangeImpl#getTaskToSchedule <em>Task To Schedule</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.MoveChangeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.MoveChangeImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.MoveChangeImpl#getMove <em>Move</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MoveChangeImpl extends MinimalEObjectImpl.Container implements MoveChange {
	/**
	 * The cached value of the '{@link #getTaskToSchedule() <em>Task To Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskToSchedule()
	 * @generated
	 * @ordered
	 */
	protected SolutionTask taskToSchedule;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.MOVE_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask getTaskToSchedule() {
		if (taskToSchedule != null && taskToSchedule.eIsProxy()) {
			InternalEObject oldTaskToSchedule = (InternalEObject)taskToSchedule;
			taskToSchedule = (SolutionTask)eResolveProxy(oldTaskToSchedule);
			if (taskToSchedule != oldTaskToSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.MOVE_CHANGE__TASK_TO_SCHEDULE, oldTaskToSchedule, taskToSchedule));
			}
		}
		return taskToSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask basicGetTaskToSchedule() {
		return taskToSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskToSchedule(SolutionTask newTaskToSchedule) {
		SolutionTask oldTaskToSchedule = taskToSchedule;
		taskToSchedule = newTaskToSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.MOVE_CHANGE__TASK_TO_SCHEDULE, oldTaskToSchedule, taskToSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method to return the 'Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValid() {
		return this.isValidFeedback()==null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move getMove() {
		if (eContainerFeatureID() != SchedulerPackage.MOVE_CHANGE__MOVE) return null;
		return (Move)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMove(Move newMove, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMove, SchedulerPackage.MOVE_CHANGE__MOVE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMove(Move newMove) {
		if (newMove != eInternalContainer() || (eContainerFeatureID() != SchedulerPackage.MOVE_CHANGE__MOVE && newMove != null)) {
			if (EcoreUtil.isAncestor(this, newMove))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMove != null)
				msgs = ((InternalEObject)newMove).eInverseAdd(this, SchedulerPackage.MOVE__CHANGES, Move.class, msgs);
			msgs = basicSetMove(newMove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.MOVE_CHANGE__MOVE, newMove, newMove));
	}

	/**
	 * 
	 * @return
	 */
	protected String isValidFeedback() {
		if ( this.getTaskToSchedule()==null ) {
			return "No task to schedule";
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean change() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.MOVE_CHANGE__MOVE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMove((Move)otherEnd, msgs);
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
			case SchedulerPackage.MOVE_CHANGE__MOVE:
				return basicSetMove(null, msgs);
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
			case SchedulerPackage.MOVE_CHANGE__MOVE:
				return eInternalContainer().eInverseRemove(this, SchedulerPackage.MOVE__CHANGES, Move.class, msgs);
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
			case SchedulerPackage.MOVE_CHANGE__TASK_TO_SCHEDULE:
				if (resolve) return getTaskToSchedule();
				return basicGetTaskToSchedule();
			case SchedulerPackage.MOVE_CHANGE__DESCRIPTION:
				return getDescription();
			case SchedulerPackage.MOVE_CHANGE__VALID:
				return isValid();
			case SchedulerPackage.MOVE_CHANGE__MOVE:
				return getMove();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulerPackage.MOVE_CHANGE__TASK_TO_SCHEDULE:
				setTaskToSchedule((SolutionTask)newValue);
				return;
			case SchedulerPackage.MOVE_CHANGE__MOVE:
				setMove((Move)newValue);
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
			case SchedulerPackage.MOVE_CHANGE__TASK_TO_SCHEDULE:
				setTaskToSchedule((SolutionTask)null);
				return;
			case SchedulerPackage.MOVE_CHANGE__MOVE:
				setMove((Move)null);
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
			case SchedulerPackage.MOVE_CHANGE__TASK_TO_SCHEDULE:
				return taskToSchedule != null;
			case SchedulerPackage.MOVE_CHANGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SchedulerPackage.MOVE_CHANGE__VALID:
				return isValid() != VALID_EDEFAULT;
			case SchedulerPackage.MOVE_CHANGE__MOVE:
				return getMove() != null;
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
			case SchedulerPackage.MOVE_CHANGE___CHANGE:
				return change();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MoveChangeImpl
