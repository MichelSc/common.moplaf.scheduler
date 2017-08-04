/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;

import com.misc.common.moplaf.scheduler.CalcSolutionExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Solution Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.CalcSolutionExpressionCandidateValueImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcSolutionExpressionCandidateValueImpl extends PropagatorFunctionBindingsImpl implements CalcSolutionExpressionCandidateValue {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected SolutionExpression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcSolutionExpressionCandidateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionExpression getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (SolutionExpression)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionExpression basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(SolutionExpression newExpression) {
		SolutionExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION:
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
			case SchedulerPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION:
				setExpression((SolutionExpression)newValue);
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
			case SchedulerPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION:
				setExpression((SolutionExpression)null);
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
			case SchedulerPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //CalcSolutionExpressionCandidateValueImpl
