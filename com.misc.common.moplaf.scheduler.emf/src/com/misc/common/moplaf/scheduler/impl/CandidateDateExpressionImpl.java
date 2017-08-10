/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.CandidateDateExpression;
import com.misc.common.moplaf.scheduler.DateExpression;
import com.misc.common.moplaf.scheduler.SchedulerPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Candidate Date Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.CandidateDateExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.CandidateDateExpressionImpl#getCandidateValue <em>Candidate Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CandidateDateExpressionImpl extends CandidateValueExpressionImpl implements CandidateDateExpression {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Date value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCandidateValue() <em>Candidate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateValue()
	 * @generated
	 * @ordered
	 */
	protected static final Date CANDIDATE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCandidateValue() <em>Candidate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateValue()
	 * @generated
	 * @ordered
	 */
	protected Date candidateValue = CANDIDATE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateDateExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.CANDIDATE_DATE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Date newValue) {
		Date oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.CANDIDATE_DATE_EXPRESSION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCandidateValue() {
		return candidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateValue(Date newCandidateValue) {
		Date oldCandidateValue = candidateValue;
		candidateValue = newCandidateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.CANDIDATE_DATE_EXPRESSION__CANDIDATE_VALUE, oldCandidateValue, candidateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.CANDIDATE_DATE_EXPRESSION__VALUE:
				return getValue();
			case SchedulerPackage.CANDIDATE_DATE_EXPRESSION__CANDIDATE_VALUE:
				return getCandidateValue();
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
			case SchedulerPackage.CANDIDATE_DATE_EXPRESSION__VALUE:
				setValue((Date)newValue);
				return;
			case SchedulerPackage.CANDIDATE_DATE_EXPRESSION__CANDIDATE_VALUE:
				setCandidateValue((Date)newValue);
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
			case SchedulerPackage.CANDIDATE_DATE_EXPRESSION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SchedulerPackage.CANDIDATE_DATE_EXPRESSION__CANDIDATE_VALUE:
				setCandidateValue(CANDIDATE_VALUE_EDEFAULT);
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
			case SchedulerPackage.CANDIDATE_DATE_EXPRESSION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SchedulerPackage.CANDIDATE_DATE_EXPRESSION__CANDIDATE_VALUE:
				return CANDIDATE_VALUE_EDEFAULT == null ? candidateValue != null : !CANDIDATE_VALUE_EDEFAULT.equals(candidateValue);
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
		if (baseClass == DateExpression.class) {
			switch (derivedFeatureID) {
				case SchedulerPackage.CANDIDATE_DATE_EXPRESSION__VALUE: return SchedulerPackage.DATE_EXPRESSION__VALUE;
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
		if (baseClass == DateExpression.class) {
			switch (baseFeatureID) {
				case SchedulerPackage.DATE_EXPRESSION__VALUE: return SchedulerPackage.CANDIDATE_DATE_EXPRESSION__VALUE;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Value: ");
		result.append(value);
		result.append(", CandidateValue: ");
		result.append(candidateValue);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCandidateValueAsString() {
		String value = String.format("%tF", this.getCandidateValue());
		return value;
	}
} //CandidateDateExpressionImpl
