/**
 */
package com.misc.common.moplaf.schedulercalc.impl;


import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.scheduler.ResourceExpression;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.schedulercalc.CalcResourceExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Resource Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcResourceExpressionCandidateValueImpl extends ResourceExpressionPropagatorFunctionImpl implements CalcResourceExpressionCandidateValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcResourceExpressionCandidateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE;
	}
	
	/**
	 * 
	 */
	@Override
	public PropagatorFunction doGetParent() {
		ResourceExpression solution_expression = this.getResourceExpression();
		SolutionResource resource = solution_expression.getResource();
		Solution solution = resource.getSolution();
	    PropagatorFunction parent = solution.getPropagatorFunction(CalcSolutionAllExpressionCandidateValuesImpl.class);
		return parent;
	}


} //CalcResourceExpressionCandidateValueImpl
