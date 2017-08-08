/**
 */
package com.misc.common.moplaf.schedulercalc.impl;


import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.scheduler.ResourceExpression;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.schedulercalc.ResetResourceExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reset Resource Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResetResourceExpressionCandidateValueImpl extends ResourceExpressionPropagatorFunctionImpl implements ResetResourceExpressionCandidateValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetResourceExpressionCandidateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE;
	}

	/**
	 * 
	 */
	@Override
	public PropagatorFunction doGetParent() {
		ResourceExpression solution_expression = this.getResourceExpression();
		SolutionResource resource = solution_expression.getResource();
		Solution solution = resource.getSolution();
	    PropagatorFunction parent = solution.getPropagatorFunction(ResetSolutionAllExpressionCandidateValuesImpl.class);
		return parent;
	}


} //ResetResourceExpressionCandidateValueImpl
