/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.MoveResource;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.SchedulerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.MoveResourceImpl#getInsertionPoint <em>Insertion Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MoveResourceImpl extends MoveScheduleImpl implements MoveResource {
	/**
	 * The cached value of the '{@link #getInsertionPoint() <em>Insertion Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertionPoint()
	 * @generated
	 * @ordered
	 */
	protected Resource insertionPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.MOVE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getInsertionPoint() {
		if (insertionPoint != null && insertionPoint.eIsProxy()) {
			InternalEObject oldInsertionPoint = (InternalEObject)insertionPoint;
			insertionPoint = (Resource)eResolveProxy(oldInsertionPoint);
			if (insertionPoint != oldInsertionPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.MOVE_RESOURCE__INSERTION_POINT, oldInsertionPoint, insertionPoint));
			}
		}
		return insertionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetInsertionPoint() {
		return insertionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertionPoint(Resource newInsertionPoint) {
		Resource oldInsertionPoint = insertionPoint;
		insertionPoint = newInsertionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.MOVE_RESOURCE__INSERTION_POINT, oldInsertionPoint, insertionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.MOVE_RESOURCE__INSERTION_POINT:
				if (resolve) return getInsertionPoint();
				return basicGetInsertionPoint();
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
			case SchedulerPackage.MOVE_RESOURCE__INSERTION_POINT:
				setInsertionPoint((Resource)newValue);
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
			case SchedulerPackage.MOVE_RESOURCE__INSERTION_POINT:
				setInsertionPoint((Resource)null);
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
			case SchedulerPackage.MOVE_RESOURCE__INSERTION_POINT:
				return insertionPoint != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public String getValidFeedback() {
		String feedback = super.getValidFeedback();
		if ( feedback!=null) {
			return feedback;
		} else if ( this.getInsertionPoint()==null) {
			return "No insertion point resource";
		}
		return null;
	}
} //MoveResourceImpl
