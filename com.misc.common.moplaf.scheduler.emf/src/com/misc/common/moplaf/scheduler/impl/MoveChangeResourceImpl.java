/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.MoveChangeResource;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Change Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.MoveChangeResourceImpl#getInsertionPoint <em>Insertion Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MoveChangeResourceImpl extends MoveChangeImpl implements MoveChangeResource {
	/**
	 * The cached value of the '{@link #getInsertionPoint() <em>Insertion Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertionPoint()
	 * @generated
	 * @ordered
	 */
	protected SolutionResource insertionPoint;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveChangeResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.MOVE_CHANGE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource getInsertionPoint() {
		if (insertionPoint != null && insertionPoint.eIsProxy()) {
			InternalEObject oldInsertionPoint = (InternalEObject)insertionPoint;
			insertionPoint = (SolutionResource)eResolveProxy(oldInsertionPoint);
			if (insertionPoint != oldInsertionPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.MOVE_CHANGE_RESOURCE__INSERTION_POINT, oldInsertionPoint, insertionPoint));
			}
		}
		return insertionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource basicGetInsertionPoint() {
		return insertionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertionPoint(SolutionResource newInsertionPoint) {
		SolutionResource oldInsertionPoint = insertionPoint;
		insertionPoint = newInsertionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.MOVE_CHANGE_RESOURCE__INSERTION_POINT, oldInsertionPoint, insertionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.MOVE_CHANGE_RESOURCE__INSERTION_POINT:
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
			case SchedulerPackage.MOVE_CHANGE_RESOURCE__INSERTION_POINT:
				setInsertionPoint((SolutionResource)newValue);
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
			case SchedulerPackage.MOVE_CHANGE_RESOURCE__INSERTION_POINT:
				setInsertionPoint((SolutionResource)null);
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
			case SchedulerPackage.MOVE_CHANGE_RESOURCE__INSERTION_POINT:
				return insertionPoint != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	protected String isValidFeedback() {
		String feedback = super.isValidFeedback();
		if ( feedback!=null) {
			return feedback;
		} else if ( this.getInsertionPoint()==null) {
			return "No insertion point resource";
		}
		return null;
	}
} //MoveChangeResourceImpl
