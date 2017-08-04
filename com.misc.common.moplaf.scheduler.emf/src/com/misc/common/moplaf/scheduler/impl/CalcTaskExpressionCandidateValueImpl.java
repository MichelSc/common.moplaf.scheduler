/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;

import com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.TaskExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Task Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.CalcTaskExpressionCandidateValueImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaskExpressionCandidateValueImpl extends PropagatorFunctionBindingsImpl implements CalcTaskExpressionCandidateValue {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected TaskExpression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskExpressionCandidateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.CALC_TASK_EXPRESSION_CANDIDATE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExpression getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (TaskExpression)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExpression basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(TaskExpression newExpression, NotificationChain msgs) {
		TaskExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(TaskExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE, TaskExpression.class, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE, TaskExpression.class, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION:
				if (expression != null)
					msgs = ((InternalEObject)expression).eInverseRemove(this, SchedulerPackage.TASK_EXPRESSION__CALC_CANDIDATE_VALUE, TaskExpression.class, msgs);
				return basicSetExpression((TaskExpression)otherEnd, msgs);
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
			case SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
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
			case SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION:
				setExpression((TaskExpression)newValue);
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
			case SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION:
				setExpression((TaskExpression)null);
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
			case SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //CalcTaskExpressionCandidateValueImpl
