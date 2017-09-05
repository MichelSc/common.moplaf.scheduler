/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetResourceSchedule;
import com.misc.common.moplaf.schedulercalc.SetScheduleScope;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Resource Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.SetResourceScheduleImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetResourceScheduleImpl extends ResourcePropagatorFunctionImpl implements SetResourceSchedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetResourceScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.SET_RESOURCE_SCHEDULE;
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
		SolutionResource resource = this.getResource();
		Solution solution = resource.getSolution();
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
			case SchedulerCalcPackage.SET_RESOURCE_SCHEDULE__CONCRETE_PARENT:
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
			case SchedulerCalcPackage.SET_RESOURCE_SCHEDULE__CONCRETE_PARENT:
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
	
	private static Bindings thisResourceBindings = Bindings.constructBindings()
	.addInboundBinding (SchedulerPackage.Literals.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK)		
	.addInboundBinding (SchedulerPackage.Literals.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK)		
	.addInboundBinding (SchedulerPackage.Literals.SOLUTION_RESOURCE__NR_CANDIDATE_SCHEDULED_TASKS)		
	;

	@Override
	public Bindings doGetBindings() {
	return thisResourceBindings;
	}

	@Override
	public void doRefresh() {
		SolutionResource resource = this.getResource();
		
		resource.setFirstTask(resource.getCandidateFirstTask());
		resource.setLastTask(resource.getCandidateLastTask());
		resource.setNrScheduledTasks(resource.getNrCandidateScheduledTasks());
	}

} //SetResourceScheduleImpl
