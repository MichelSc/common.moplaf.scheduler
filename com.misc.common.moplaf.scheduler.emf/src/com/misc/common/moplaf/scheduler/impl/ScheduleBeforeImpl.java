/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleBefore;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionTask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Before</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl#getTaskAfter <em>Task After</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleBeforeImpl extends MoveChangeImpl implements ScheduleBefore {
	/**
	 * The cached value of the '{@link #getTaskAfter() <em>Task After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskAfter()
	 * @generated
	 * @ordered
	 */
	protected SolutionTask taskAfter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleBeforeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULE_BEFORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask getTaskAfter() {
		if (taskAfter != null && taskAfter.eIsProxy()) {
			InternalEObject oldTaskAfter = (InternalEObject)taskAfter;
			taskAfter = (SolutionTask)eResolveProxy(oldTaskAfter);
			if (taskAfter != oldTaskAfter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SCHEDULE_BEFORE__TASK_AFTER, oldTaskAfter, taskAfter));
			}
		}
		return taskAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask basicGetTaskAfter() {
		return taskAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskAfter(SolutionTask newTaskAfter) {
		SolutionTask oldTaskAfter = taskAfter;
		taskAfter = newTaskAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE_BEFORE__TASK_AFTER, oldTaskAfter, taskAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_BEFORE__TASK_AFTER:
				if (resolve) return getTaskAfter();
				return basicGetTaskAfter();
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
			case SchedulerPackage.SCHEDULE_BEFORE__TASK_AFTER:
				setTaskAfter((SolutionTask)newValue);
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
			case SchedulerPackage.SCHEDULE_BEFORE__TASK_AFTER:
				setTaskAfter((SolutionTask)null);
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
			case SchedulerPackage.SCHEDULE_BEFORE__TASK_AFTER:
				return taskAfter != null;
		}
		return super.eIsSet(featureID);
	}

} //ScheduleBeforeImpl
