/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;

import com.misc.common.moplaf.scheduler.CandidateValueExpression;
import com.misc.common.moplaf.scheduler.OwnerExpression;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.ValueExpression;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Candidate Value Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.CandidateValueExpressionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.CandidateValueExpressionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.CandidateValueExpressionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.CandidateValueExpressionImpl#getCandidateValueAsString <em>Candidate Value As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CandidateValueExpressionImpl extends ObjectWithPropagatorFunctionsImpl implements CandidateValueExpression {
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
	 * The default value of the '{@link #getCandidateValueAsString() <em>Candidate Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CANDIDATE_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateValueExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.CANDIDATE_VALUE_EXPRESSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("%s=%s", this.getRole(), this.getCandidateValueAsString());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCandidateValueAsString() {
		// TODO: implement this method to return the 'Candidate Value As String' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshValueCandidate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(CandidateValueExpression candidate) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__OWNER:
				return getOwner();
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__ROLE:
				return getRole();
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__DESCRIPTION:
				return getDescription();
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__CANDIDATE_VALUE_AS_STRING:
				return getCandidateValueAsString();
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
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__ROLE:
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
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__ROLE:
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
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__OWNER:
				return OWNER_EDEFAULT == null ? getOwner() != null : !OWNER_EDEFAULT.equals(getOwner());
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__CANDIDATE_VALUE_AS_STRING:
				return CANDIDATE_VALUE_AS_STRING_EDEFAULT == null ? getCandidateValueAsString() != null : !CANDIDATE_VALUE_AS_STRING_EDEFAULT.equals(getCandidateValueAsString());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OwnerExpression.class) {
			switch (derivedFeatureID) {
				case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__OWNER: return SchedulerPackage.OWNER_EXPRESSION__OWNER;
				case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__ROLE: return SchedulerPackage.OWNER_EXPRESSION__ROLE;
				case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__DESCRIPTION: return SchedulerPackage.OWNER_EXPRESSION__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == ValueExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OwnerExpression.class) {
			switch (baseFeatureID) {
				case SchedulerPackage.OWNER_EXPRESSION__OWNER: return SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__OWNER;
				case SchedulerPackage.OWNER_EXPRESSION__ROLE: return SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__ROLE;
				case SchedulerPackage.OWNER_EXPRESSION__DESCRIPTION: return SchedulerPackage.CANDIDATE_VALUE_EXPRESSION__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == ValueExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == OwnerExpression.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ValueExpression.class) {
			switch (baseOperationID) {
				case SchedulerPackage.VALUE_EXPRESSION___SET_VALUE__CANDIDATEVALUEEXPRESSION: return SchedulerPackage.CANDIDATE_VALUE_EXPRESSION___SET_VALUE__CANDIDATEVALUEEXPRESSION;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION___REFRESH_VALUE_CANDIDATE:
				refreshValueCandidate();
				return null;
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION___SET_VALUE:
				setValue();
				return null;
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION___SET_VALUE__CANDIDATEVALUEEXPRESSION:
				setValue((CandidateValueExpression)arguments.get(0));
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
		result.append(" (Role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //CandidateValueExpressionImpl
