/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.CandidateIntExpression;
import com.misc.common.moplaf.scheduler.IntExpression;
import com.misc.common.moplaf.scheduler.SchedulerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Candidate Int Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.CandidateIntExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.CandidateIntExpressionImpl#getCandidateValue <em>Candidate Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CandidateIntExpressionImpl extends CandidateValueExpressionImpl implements CandidateIntExpression {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCandidateValue() <em>Candidate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateValue()
	 * @generated
	 * @ordered
	 */
	protected static final int CANDIDATE_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCandidateValue() <em>Candidate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateValue()
	 * @generated
	 * @ordered
	 */
	protected int candidateValue = CANDIDATE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateIntExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.CANDIDATE_INT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.CANDIDATE_INT_EXPRESSION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCandidateValue() {
		return candidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateValue(int newCandidateValue) {
		int oldCandidateValue = candidateValue;
		candidateValue = newCandidateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.CANDIDATE_INT_EXPRESSION__CANDIDATE_VALUE, oldCandidateValue, candidateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.CANDIDATE_INT_EXPRESSION__VALUE:
				return getValue();
			case SchedulerPackage.CANDIDATE_INT_EXPRESSION__CANDIDATE_VALUE:
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
			case SchedulerPackage.CANDIDATE_INT_EXPRESSION__VALUE:
				setValue((Integer)newValue);
				return;
			case SchedulerPackage.CANDIDATE_INT_EXPRESSION__CANDIDATE_VALUE:
				setCandidateValue((Integer)newValue);
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
			case SchedulerPackage.CANDIDATE_INT_EXPRESSION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SchedulerPackage.CANDIDATE_INT_EXPRESSION__CANDIDATE_VALUE:
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
			case SchedulerPackage.CANDIDATE_INT_EXPRESSION__VALUE:
				return value != VALUE_EDEFAULT;
			case SchedulerPackage.CANDIDATE_INT_EXPRESSION__CANDIDATE_VALUE:
				return candidateValue != CANDIDATE_VALUE_EDEFAULT;
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
		if (baseClass == IntExpression.class) {
			switch (derivedFeatureID) {
				case SchedulerPackage.CANDIDATE_INT_EXPRESSION__VALUE: return SchedulerPackage.INT_EXPRESSION__VALUE;
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
		if (baseClass == IntExpression.class) {
			switch (baseFeatureID) {
				case SchedulerPackage.INT_EXPRESSION__VALUE: return SchedulerPackage.CANDIDATE_INT_EXPRESSION__VALUE;
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
	@Override
	public String getCandidateValueAsString() {
		String value = String.format("%d", this.getCandidateValue());
		return value;
	}
} //CandidateIntExpressionImpl
