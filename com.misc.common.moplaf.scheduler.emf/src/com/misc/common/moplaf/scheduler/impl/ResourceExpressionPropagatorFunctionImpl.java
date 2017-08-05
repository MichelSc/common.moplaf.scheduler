/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;

import com.misc.common.moplaf.scheduler.ResourceExpression;
import com.misc.common.moplaf.scheduler.ResourceExpressionPropagatorFunction;
import com.misc.common.moplaf.scheduler.SchedulerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Expression Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ResourceExpressionPropagatorFunctionImpl#getResourceExpression <em>Resource Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceExpressionPropagatorFunctionImpl extends PropagatorFunctionBindingsImpl implements ResourceExpressionPropagatorFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceExpressionPropagatorFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceExpression getResourceExpression() {
		ResourceExpression resourceExpression = basicGetResourceExpression();
		return resourceExpression != null && resourceExpression.eIsProxy() ? (ResourceExpression)eResolveProxy((InternalEObject)resourceExpression) : resourceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceExpression basicGetResourceExpression() {
		// TODO: implement this method to return the 'Resource Expression' reference
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
			case SchedulerPackage.RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__RESOURCE_EXPRESSION:
				if (resolve) return getResourceExpression();
				return basicGetResourceExpression();
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
			case SchedulerPackage.RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__RESOURCE_EXPRESSION:
				return basicGetResourceExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceExpressionPropagatorFunctionImpl
