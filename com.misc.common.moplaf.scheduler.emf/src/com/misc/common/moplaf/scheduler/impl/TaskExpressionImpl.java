/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;

import com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.TaskExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.TaskExpressionImpl#getResetCandidateValue <em>Reset Candidate Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.TaskExpressionImpl#getCalcCandidateValue <em>Calc Candidate Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskExpressionImpl extends ObjectWithPropagatorFunctionsImpl implements TaskExpression {
	/**
	 * The cached value of the '{@link #getResetCandidateValue() <em>Reset Candidate Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetCandidateValue()
	 * @generated
	 * @ordered
	 */
	protected ResetTaskExpressionCandidateValue resetCandidateValue;

	/**
	 * The cached value of the '{@link #getCalcCandidateValue() <em>Calc Candidate Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcCandidateValue()
	 * @generated
	 * @ordered
	 */
	protected CalcTaskExpressionCandidateValue calcCandidateValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.TASK_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetTaskExpressionCandidateValue getResetCandidateValue() {
		if (resetCandidateValue != null && resetCandidateValue.eIsProxy()) {
			InternalEObject oldResetCandidateValue = (InternalEObject)resetCandidateValue;
			resetCandidateValue = (ResetTaskExpressionCandidateValue)eResolveProxy(oldResetCandidateValue);
			if (resetCandidateValue != oldResetCandidateValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.TASK_EXPRESSION__RESET_CANDIDATE_VALUE, oldResetCandidateValue, resetCandidateValue));
			}
		}
		return resetCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetTaskExpressionCandidateValue basicGetResetCandidateValue() {
		return resetCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResetCandidateValue(ResetTaskExpressionCandidateValue newResetCandidateValue, NotificationChain msgs) {
		ResetTaskExpressionCandidateValue oldResetCandidateValue = resetCandidateValue;
		resetCandidateValue = newResetCandidateValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK_EXPRESSION__RESET_CANDIDATE_VALUE, oldResetCandidateValue, newResetCandidateValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetCandidateValue(ResetTaskExpressionCandidateValue newResetCandidateValue) {
		if (newResetCandidateValue != resetCandidateValue) {
			NotificationChain msgs = null;
			if (resetCandidateValue != null)
				msgs = ((InternalEObject)resetCandidateValue).eInverseRemove(this, SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, ResetTaskExpressionCandidateValue.class, msgs);
			if (newResetCandidateValue != null)
				msgs = ((InternalEObject)newResetCandidateValue).eInverseAdd(this, SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, ResetTaskExpressionCandidateValue.class, msgs);
			msgs = basicSetResetCandidateValue(newResetCandidateValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK_EXPRESSION__RESET_CANDIDATE_VALUE, newResetCandidateValue, newResetCandidateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskExpressionCandidateValue getCalcCandidateValue() {
		if (calcCandidateValue != null && calcCandidateValue.eIsProxy()) {
			InternalEObject oldCalcCandidateValue = (InternalEObject)calcCandidateValue;
			calcCandidateValue = (CalcTaskExpressionCandidateValue)eResolveProxy(oldCalcCandidateValue);
			if (calcCandidateValue != oldCalcCandidateValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE, oldCalcCandidateValue, calcCandidateValue));
			}
		}
		return calcCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskExpressionCandidateValue basicGetCalcCandidateValue() {
		return calcCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcCandidateValue(CalcTaskExpressionCandidateValue newCalcCandidateValue, NotificationChain msgs) {
		CalcTaskExpressionCandidateValue oldCalcCandidateValue = calcCandidateValue;
		calcCandidateValue = newCalcCandidateValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE, oldCalcCandidateValue, newCalcCandidateValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcCandidateValue(CalcTaskExpressionCandidateValue newCalcCandidateValue) {
		if (newCalcCandidateValue != calcCandidateValue) {
			NotificationChain msgs = null;
			if (calcCandidateValue != null)
				msgs = ((InternalEObject)calcCandidateValue).eInverseRemove(this, SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, CalcTaskExpressionCandidateValue.class, msgs);
			if (newCalcCandidateValue != null)
				msgs = ((InternalEObject)newCalcCandidateValue).eInverseAdd(this, SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, CalcTaskExpressionCandidateValue.class, msgs);
			msgs = basicSetCalcCandidateValue(newCalcCandidateValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE, newCalcCandidateValue, newCalcCandidateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.TASK_EXPRESSION__RESET_CANDIDATE_VALUE:
				if (resetCandidateValue != null)
					msgs = ((InternalEObject)resetCandidateValue).eInverseRemove(this, SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, ResetTaskExpressionCandidateValue.class, msgs);
				return basicSetResetCandidateValue((ResetTaskExpressionCandidateValue)otherEnd, msgs);
			case SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE:
				if (calcCandidateValue != null)
					msgs = ((InternalEObject)calcCandidateValue).eInverseRemove(this, SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, CalcTaskExpressionCandidateValue.class, msgs);
				return basicSetCalcCandidateValue((CalcTaskExpressionCandidateValue)otherEnd, msgs);
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
			case SchedulerPackage.TASK_EXPRESSION__RESET_CANDIDATE_VALUE:
				return basicSetResetCandidateValue(null, msgs);
			case SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE:
				return basicSetCalcCandidateValue(null, msgs);
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
			case SchedulerPackage.TASK_EXPRESSION__RESET_CANDIDATE_VALUE:
				if (resolve) return getResetCandidateValue();
				return basicGetResetCandidateValue();
			case SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE:
				if (resolve) return getCalcCandidateValue();
				return basicGetCalcCandidateValue();
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
			case SchedulerPackage.TASK_EXPRESSION__RESET_CANDIDATE_VALUE:
				setResetCandidateValue((ResetTaskExpressionCandidateValue)newValue);
				return;
			case SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE:
				setCalcCandidateValue((CalcTaskExpressionCandidateValue)newValue);
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
			case SchedulerPackage.TASK_EXPRESSION__RESET_CANDIDATE_VALUE:
				setResetCandidateValue((ResetTaskExpressionCandidateValue)null);
				return;
			case SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE:
				setCalcCandidateValue((CalcTaskExpressionCandidateValue)null);
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
			case SchedulerPackage.TASK_EXPRESSION__RESET_CANDIDATE_VALUE:
				return resetCandidateValue != null;
			case SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE:
				return calcCandidateValue != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskExpressionImpl
