/**
 */
package com.misc.common.moplaf.schedulercalc.impl;


import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;
import com.misc.common.moplaf.scheduler.Plugin;
import com.misc.common.moplaf.scheduler.Solution;

import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.SolutionPropagatorFunctionImpl#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionPropagatorFunctionImpl extends PropagatorFunctionBindingsImpl implements SolutionPropagatorFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionPropagatorFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.SOLUTION_PROPAGATOR_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSolution() {
		Solution solution = basicGetSolution();
		return solution != null && solution.eIsProxy() ? (Solution)eResolveProxy((InternalEObject)solution) : solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Solution basicGetSolution() {
		EObject container = this.eContainer;
		if ( container instanceof Solution){
			return (Solution) container;
		}
		String logMessage = String.format("The owner of the SolutionPropagatorFunction %s must be a Solution and not %s",
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
			case SchedulerCalcPackage.SOLUTION_PROPAGATOR_FUNCTION__SOLUTION:
				if (resolve) return getSolution();
				return basicGetSolution();
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
			case SchedulerCalcPackage.SOLUTION_PROPAGATOR_FUNCTION__SOLUTION:
				return basicGetSolution() != null;
		}
		return super.eIsSet(featureID);
	}

} //SolutionPropagatorFunctionImpl
