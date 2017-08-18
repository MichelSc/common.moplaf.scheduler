/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;

import com.misc.common.moplaf.scheduler.CandidateValueExpression;
import com.misc.common.moplaf.scheduler.Plugin;
import com.misc.common.moplaf.schedulercalc.CandidateExpressionPropagatorFunction;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Candidate Expression Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.CandidateExpressionPropagatorFunctionImpl#getCandidateValueExpression <em>Candidate Value Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CandidateExpressionPropagatorFunctionImpl extends PropagatorFunctionBindingsImpl implements CandidateExpressionPropagatorFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateExpressionPropagatorFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.CANDIDATE_EXPRESSION_PROPAGATOR_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidateValueExpression getCandidateValueExpression() {
		CandidateValueExpression candidateValueExpression = basicGetCandidateValueExpression();
		return candidateValueExpression != null && candidateValueExpression.eIsProxy() ? (CandidateValueExpression)eResolveProxy((InternalEObject)candidateValueExpression) : candidateValueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public CandidateValueExpression basicGetCandidateValueExpression() {
		EObject container = this.eContainer;
		if ( container instanceof CandidateValueExpression){
			return (CandidateValueExpression) container;
		}
		String logMessage = String.format("The owner of the CandidateExpressionPropagatorFunction %s must be a CandidateValueExpression and not %s",
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
			case SchedulerCalcPackage.CANDIDATE_EXPRESSION_PROPAGATOR_FUNCTION__CANDIDATE_VALUE_EXPRESSION:
				if (resolve) return getCandidateValueExpression();
				return basicGetCandidateValueExpression();
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
			case SchedulerCalcPackage.CANDIDATE_EXPRESSION_PROPAGATOR_FUNCTION__CANDIDATE_VALUE_EXPRESSION:
				return basicGetCandidateValueExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //CandidateExpressionPropagatorFunctionImpl
