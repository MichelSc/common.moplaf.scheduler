/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.scheduler.CandidateValueExpression;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetExpressionSchedule;
import com.misc.common.moplaf.schedulercalc.SetScheduleScope;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Expression Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.SetExpressionScheduleImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetExpressionScheduleImpl extends CandidateExpressionPropagatorFunctionImpl implements SetExpressionSchedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetExpressionScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.SET_EXPRESSION_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetScheduleScope getConcreteParent() {
		SetScheduleScope concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (SetScheduleScope)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SetScheduleScope basicGetConcreteParent() {
		CandidateValueExpression expression = this.getCandidateValueExpression();
		Solution solution = expression.getExpressionSolution();
		SetScheduleScope parent = solution.getPropagatorFunction(SetScheduleScope.class);
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
			case SchedulerCalcPackage.SET_EXPRESSION_SCHEDULE__CONCRETE_PARENT:
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
			case SchedulerCalcPackage.SET_EXPRESSION_SCHEDULE__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String getFactoryID() {
		return SetScheduleScope.scopeIDSetSchedule;
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
	


} //SetExpressionScheduleImpl
