/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetScheduleScope;
import com.misc.common.moplaf.schedulercalc.SetTaskSchedule;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Task Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.SetTaskScheduleImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetTaskScheduleImpl extends TaskPropagatorFunctionImpl implements SetTaskSchedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTaskScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.SET_TASK_SCHEDULE;
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
		SolutionTask task = this.getTask();
		Solution solution = task.getSolution();
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
			case SchedulerCalcPackage.SET_TASK_SCHEDULE__CONCRETE_PARENT:
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
			case SchedulerCalcPackage.SET_TASK_SCHEDULE__CONCRETE_PARENT:
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
	
	private static Bindings thisTaskBindings = Bindings.constructBindings()
	.addInboundBinding (SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_NEXT_TASK)		
	.addInboundBinding (SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK)		
	.addInboundBinding(SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE)
	;

	@Override
	public Bindings doGetBindings() {
	return thisTaskBindings;
	}

	@Override
	public void doRefresh() {
		SolutionTask task = this.getTask();
		
		task.setNextTask(task.getCandidateNextTask());
		task.setPreviousTask(task.getCandidatePreviousTask());
		task.setScheduledResource(task.getCandidateScheduledResource());
	}

} //SetTaskScheduleImpl
