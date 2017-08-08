/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;
import com.misc.common.moplaf.scheduler.Plugin;
import com.misc.common.moplaf.scheduler.TaskExpression;

import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.TaskExpressionPropagatorFunction;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Expression Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.TaskExpressionPropagatorFunctionImpl#getTaskExpression <em>Task Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskExpressionPropagatorFunctionImpl extends PropagatorFunctionBindingsImpl implements TaskExpressionPropagatorFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskExpressionPropagatorFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.TASK_EXPRESSION_PROPAGATOR_FUNCTION;
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
	 */
	public TaskExpression basicGetTaskExpression() {
		EObject container = this.eContainer;
		if ( container instanceof TaskExpression){
			return (TaskExpression) container;
		}
		String logMessage = String.format("The owner of the TaskExpressionPropagatorFunction %s must be a TaskExpression and not %s",
                this.getClass().getName(),
                container == null ? "null" : container.getClass().getName());
		Plugin.INSTANCE.logError(logMessage);
		return null;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerCalcPackage.TASK_EXPRESSION_PROPAGATOR_FUNCTION__TASK_EXPRESSION:
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
			case SchedulerCalcPackage.TASK_EXPRESSION_PROPAGATOR_FUNCTION__TASK_EXPRESSION:
				return basicGetTaskExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskExpressionPropagatorFunctionImpl
