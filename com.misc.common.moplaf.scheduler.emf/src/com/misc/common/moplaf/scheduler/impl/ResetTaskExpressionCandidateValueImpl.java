/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;

import com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.TaskExpression;

import com.misc.common.moplaf.scheduler.TaskExpressionPropagatorFunction;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reset Task Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ResetTaskExpressionCandidateValueImpl#getTaskExpression <em>Task Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResetTaskExpressionCandidateValueImpl extends PropagatorFunctionBindingsImpl implements ResetTaskExpressionCandidateValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetTaskExpressionCandidateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.RESET_TASK_EXPRESSION_CANDIDATE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExpression getTaskExpression() {
		TaskExpression taskExpression = basicGetTaskExpression();
		return taskExpression != null && taskExpression.eIsProxy() ? (TaskExpression)eResolveProxy((InternalEObject)taskExpression) : taskExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExpression basicGetTaskExpression() {
		// TODO: implement this method to return the 'Task Expression' reference
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
			case SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TASK_EXPRESSION:
				if (resolve) return getTaskExpression();
				return basicGetTaskExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TASK_EXPRESSION:
				return basicGetTaskExpression() != null;
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
		if (baseClass == TaskExpressionPropagatorFunction.class) {
			switch (derivedFeatureID) {
				case SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TASK_EXPRESSION: return SchedulerPackage.TASK_EXPRESSION_PROPAGATOR_FUNCTION__TASK_EXPRESSION;
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
		if (baseClass == TaskExpressionPropagatorFunction.class) {
			switch (baseFeatureID) {
				case SchedulerPackage.TASK_EXPRESSION_PROPAGATOR_FUNCTION__TASK_EXPRESSION: return SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TASK_EXPRESSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ResetTaskExpressionCandidateValueImpl
