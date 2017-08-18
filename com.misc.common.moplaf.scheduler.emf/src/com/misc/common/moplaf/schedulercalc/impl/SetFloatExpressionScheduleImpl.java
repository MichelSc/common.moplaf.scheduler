/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.CandidateFloatExpression;
import com.misc.common.moplaf.scheduler.CandidateValueExpression;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetFloatExpressionSchedule;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Float Expression Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SetFloatExpressionScheduleImpl extends SetExpressionScheduleImpl implements SetFloatExpressionSchedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetFloatExpressionScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.SET_FLOAT_EXPRESSION_SCHEDULE;
	}
	
	private static Bindings thisExpressionBindings = Bindings.constructBindings()
	.addInboundBinding (SchedulerPackage.Literals.CANDIDATE_FLOAT_EXPRESSION__CANDIDATE_VALUE)		
	;

	@Override
	public Bindings doGetBindings() {
	return thisExpressionBindings;
	}

	@Override
	public void doRefresh() {
		CandidateFloatExpression expression = (CandidateFloatExpression) this.getCandidateValueExpression();
		expression.setValue(expression.getCandidateValue());
	}


} //SetFloatExpressionScheduleImpl
