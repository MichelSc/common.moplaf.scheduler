/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.TaskExpression;

import com.misc.common.moplaf.schedulercalc.ResetTaskExpressionCandidateValue;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reset Task Expression Candidate Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResetTaskExpressionCandidateValueImpl extends TaskExpressionPropagatorFunctionImpl implements ResetTaskExpressionCandidateValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetTaskExpressionCandidateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.RESET_TASK_EXPRESSION_CANDIDATE_VALUE;
	}

	/**
	 * 
	 */
	@Override
	public PropagatorFunction doGetParent() {
		TaskExpression task_expression = this.getTaskExpression();
		SolutionTask task = task_expression.getTask();
		Solution solution = task.getSolution();
	    PropagatorFunction parent = solution.getPropagatorFunction(ResetSolutionAllExpressionCandidateValuesImpl.class);
		return parent;
	}
} //ResetTaskExpressionCandidateValueImpl
