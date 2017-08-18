/**
 */
package com.misc.common.moplaf.schedulercalc.impl;


import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetScheduleScope;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Schedule Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SetScheduleScopeImpl extends SolutionPropagatorFunctionImpl implements SetScheduleScope {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetScheduleScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.SET_SCHEDULE_SCOPE;
	}

	@Override
	public String getFactoryID() {
		return SetScheduleScope.scopeIDSetSchedule;
	}


	@Override
	public void doRefresh() {
		Solution solution = this.getSolution();
		
		solution.setNrScheduledTasks(solution.getNrCandidateScheduledTasks());
	}


} //SetScheduleScopeImpl
