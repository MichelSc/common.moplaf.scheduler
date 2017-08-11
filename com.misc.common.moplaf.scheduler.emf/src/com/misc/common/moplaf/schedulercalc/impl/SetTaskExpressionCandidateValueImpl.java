/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.TaskExpression;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetExpressionCandidateValueScope;
import com.misc.common.moplaf.schedulercalc.SetTaskExpressionCandidateValue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Task Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.SetTaskExpressionCandidateValueImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetTaskExpressionCandidateValueImpl extends TaskExpressionPropagatorFunctionImpl implements SetTaskExpressionCandidateValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTaskExpressionCandidateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.SET_TASK_EXPRESSION_CANDIDATE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetExpressionCandidateValueScope getConcreteParent() {
		SetExpressionCandidateValueScope concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (SetExpressionCandidateValueScope)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SetExpressionCandidateValueScope basicGetConcreteParent() {
		TaskExpression task_expression = this.getTaskExpression();
		SolutionTask task = task_expression.getTask();
		Solution solution = task.getSolution();
		SetExpressionCandidateValueScope parent = solution.getPropagatorFunction(SetExpressionCandidateValueScope.class);
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerCalcPackage.SET_TASK_EXPRESSION_CANDIDATE_VALUE__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
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
			case SchedulerCalcPackage.SET_TASK_EXPRESSION_CANDIDATE_VALUE__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}


} //SetTaskExpressionCandidateValueImpl
