/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.OwnerExpression;
import com.misc.common.moplaf.scheduler.SchedulerPackage;

import com.misc.common.moplaf.scheduler.Solution;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owner Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.OwnerExpressionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.OwnerExpressionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.OwnerExpressionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.OwnerExpressionImpl#getExpressionSolution <em>Expression Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OwnerExpressionImpl extends MinimalEObjectImpl.Container implements OwnerExpression {
	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnerExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.OWNER_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		// TODO: implement this method to return the 'Owner' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.OWNER_EXPRESSION__ROLE, oldRole, role));
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
	 * @generated
	 */
	public Solution getExpressionSolution() {
		Solution expressionSolution = basicGetExpressionSolution();
		return expressionSolution != null && expressionSolution.eIsProxy() ? (Solution)eResolveProxy((InternalEObject)expressionSolution) : expressionSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetExpressionSolution() {
		// TODO: implement this method to return the 'Expression Solution' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.OWNER_EXPRESSION__OWNER:
				return getOwner();
			case SchedulerPackage.OWNER_EXPRESSION__ROLE:
				return getRole();
			case SchedulerPackage.OWNER_EXPRESSION__DESCRIPTION:
				return getDescription();
			case SchedulerPackage.OWNER_EXPRESSION__EXPRESSION_SOLUTION:
				if (resolve) return getExpressionSolution();
				return basicGetExpressionSolution();
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
			case SchedulerPackage.OWNER_EXPRESSION__ROLE:
				setRole((String)newValue);
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
			case SchedulerPackage.OWNER_EXPRESSION__ROLE:
				setRole(ROLE_EDEFAULT);
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
			case SchedulerPackage.OWNER_EXPRESSION__OWNER:
				return OWNER_EDEFAULT == null ? getOwner() != null : !OWNER_EDEFAULT.equals(getOwner());
			case SchedulerPackage.OWNER_EXPRESSION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case SchedulerPackage.OWNER_EXPRESSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SchedulerPackage.OWNER_EXPRESSION__EXPRESSION_SOLUTION:
				return basicGetExpressionSolution() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (Role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //OwnerExpressionImpl
