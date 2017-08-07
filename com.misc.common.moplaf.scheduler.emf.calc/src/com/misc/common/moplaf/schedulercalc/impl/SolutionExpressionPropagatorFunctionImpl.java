/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;
import com.misc.common.moplaf.scheduler.Plugin;
import com.misc.common.moplaf.scheduler.SolutionExpression;
import com.misc.common.moplaf.scheduler.TaskExpression;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Expression Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.SolutionExpressionPropagatorFunctionImpl#getSolutionExpression <em>Solution Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionExpressionPropagatorFunctionImpl extends PropagatorFunctionBindingsImpl implements SolutionExpressionPropagatorFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionExpressionPropagatorFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionExpression getSolutionExpression() {
		SolutionExpression solutionExpression = basicGetSolutionExpression();
		return solutionExpression != null && solutionExpression.eIsProxy() ? (SolutionExpression)eResolveProxy((InternalEObject)solutionExpression) : solutionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionExpression basicGetSolutionExpression() {
		EObject container = this.eContainer;
		if ( container instanceof TaskExpression){
			return (SolutionExpression) container;
		}
		String logMessage = String.format("The owner of the SolutionExpressionPropagatorFunction %s must be a SolutionExpression and not %s",
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
			case SchedulerCalcPackage.SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__SOLUTION_EXPRESSION:
				if (resolve) return getSolutionExpression();
				return basicGetSolutionExpression();
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
			case SchedulerCalcPackage.SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__SOLUTION_EXPRESSION:
				return basicGetSolutionExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //SolutionExpressionPropagatorFunctionImpl
