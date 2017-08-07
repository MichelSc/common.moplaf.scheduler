/**
 */
package com.misc.common.moplaf.schedulercalc.impl;


import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.TaskExpression;
import com.misc.common.moplaf.schedulercalc.CalcTaskExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Task Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcTaskExpressionCandidateValueImpl extends TaskExpressionPropagatorFunctionImpl implements CalcTaskExpressionCandidateValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskExpressionCandidateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.CALC_TASK_EXPRESSION_CANDIDATE_VALUE;
	}

	/**
	 * 
	 */
	@Override
	public PropagatorFunction doGetParent() {
		TaskExpression task_expression = this.getTaskExpression();
		SolutionTask task = task_expression.getTask();
		Solution solution = task.getSolution();
	    PropagatorFunction parent = solution.getPropagatorFunction(CalcSolutionAllExpressionCandidateValuesImpl.class);
		return parent;
	}

} //CalcTaskExpressionCandidateValueImpl
