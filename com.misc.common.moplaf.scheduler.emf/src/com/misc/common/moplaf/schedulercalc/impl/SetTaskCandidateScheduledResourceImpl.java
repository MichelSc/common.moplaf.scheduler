/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResource;

import com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResourceScope;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Task Candidate Scheduled Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.SetTaskCandidateScheduledResourceImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetTaskCandidateScheduledResourceImpl extends TaskPropagatorFunctionImpl implements SetTaskCandidateScheduledResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTaskCandidateScheduledResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.SET_TASK_CANDIDATE_SCHEDULED_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTaskCandidateScheduledResourceScope getConcreteParent() {
		SetTaskCandidateScheduledResourceScope concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (SetTaskCandidateScheduledResourceScope)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SetTaskCandidateScheduledResourceScope basicGetConcreteParent() {
		SolutionTask task = this.getTask();
		Solution solution = task.getSolution();
		SetTaskCandidateScheduledResourceScope parent = solution.getPropagatorFunction(SetTaskCandidateScheduledResourceScope.class);
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
			case SchedulerCalcPackage.SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__CONCRETE_PARENT:
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
			case SchedulerCalcPackage.SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getFactoryID() {
		return SetTaskCandidateScheduledResourceScope.factoryID;
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	private static Bindings previousTaskBindings = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE)
			;

	private static Bindings thisTaskBindings = Bindings.constructBindings()
			.addInboundBinding (SchedulerPackage.Literals.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK)		
			.addInboundBinding (SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK, previousTaskBindings)		
			.addOutboundBinding(SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE)
			;
		
	@Override
	public Bindings doGetBindings() {
		return thisTaskBindings;
	}


	@Override
	public void doRefresh() {
		SolutionTask task = this.getTask();
		// unset
		SolutionResource resource_asis = task.getCandidateScheduledResource();
		if ( resource_asis!=null) {
			resource_asis.getCandidateScheduledTasks().remove(task);
		}
		// set
		SolutionResource resource_asfirst_tobe = task.getResourceAsCandidateFirstTask();
		if ( resource_asfirst_tobe!=null) {
			resource_asfirst_tobe.getCandidateScheduledTasks().add(0, task); // add as first
		} else {
			SolutionTask previous = task.getCandidatePreviousTask();
			if ( previous!=null) {
				SolutionResource resource_tobe = previous.getCandidateScheduledResource();
				EList<SolutionTask> scheduled_tasks = resource_tobe.getCandidateScheduledTasks();
				int insertion_point = scheduled_tasks.indexOf(previous);
				resource_tobe.getCandidateScheduledTasks().add(insertion_point+1, task);
			} else {
				// task not scheduled, no scheduled resource
			}
		}
	}
} //SetTaskCandidateScheduledResourceImpl
