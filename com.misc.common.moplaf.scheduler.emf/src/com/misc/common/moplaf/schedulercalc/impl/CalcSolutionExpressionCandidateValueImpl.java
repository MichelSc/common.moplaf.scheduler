/**
 */
package com.misc.common.moplaf.schedulercalc.impl;


import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionExpression;
import com.misc.common.moplaf.schedulercalc.CalcSolutionExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Solution Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcSolutionExpressionCandidateValueImpl extends SolutionExpressionPropagatorFunctionImpl implements CalcSolutionExpressionCandidateValue {
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
		return SchedulerCalcPackage.Literals.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE;
	}

	/**
	 * 
	 */
	@Override
	public PropagatorFunction doGetParent() {
		SolutionExpression solution_expression = this.getSolutionExpression();
		Solution solution = solution_expression.getSolution();
	    PropagatorFunction parent = solution.getPropagatorFunction(CalcSolutionAllExpressionCandidateValuesImpl.class);
		return parent;
	}

} //CalcSolutionExpressionCandidateValueImpl
