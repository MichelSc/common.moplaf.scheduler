/**
 */
package com.misc.common.moplaf.schedulercalc.impl;


import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.scheduler.ResourceExpression;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetExpressionCandidateValueScope;
import com.misc.common.moplaf.schedulercalc.SetResourceExpressionCandidateValue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Resource Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.SetResourceExpressionCandidateValueImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetResourceExpressionCandidateValueImpl extends ResourceExpressionPropagatorFunctionImpl implements SetResourceExpressionCandidateValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetResourceExpressionCandidateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.SET_RESOURCE_EXPRESSION_CANDIDATE_VALUE;
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
		ResourceExpression resource_expression = this.getResourceExpression();
		SolutionResource resource = resource_expression.getResource();
		Solution solution = resource.getSolution();
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
			case SchedulerCalcPackage.SET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__CONCRETE_PARENT:
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
			case SchedulerCalcPackage.SET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

} //SetResourceExpressionCandidateValueImpl
