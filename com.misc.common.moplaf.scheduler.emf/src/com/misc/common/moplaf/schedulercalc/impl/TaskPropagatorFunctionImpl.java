/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;
import com.misc.common.moplaf.scheduler.Plugin;
import com.misc.common.moplaf.scheduler.SolutionTask;

import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Propagator Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.impl.TaskPropagatorFunctionImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskPropagatorFunctionImpl extends PropagatorFunctionBindingsImpl implements TaskPropagatorFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskPropagatorFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerCalcPackage.Literals.TASK_PROPAGATOR_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask getTask() {
		SolutionTask task = basicGetTask();
		return task != null && task.eIsProxy() ? (SolutionTask)eResolveProxy((InternalEObject)task) : task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionTask basicGetTask() {
		EObject container = this.eContainer;
		if ( container instanceof SolutionTask){
			return (SolutionTask) container;
		}
		String logMessage = String.format("The owner of the SolutionTaskPropagatorFunction %s must be a SolutionTask and not %s",
                this.getClass().getName(),
                container == null ? "null" : container.getClass().getName());
		Plugin.INSTANCE.logError(logMessage);
		return null;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerCalcPackage.TASK_PROPAGATOR_FUNCTION__TASK:
				if (resolve) return getTask();
				return basicGetTask();
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
			case SchedulerCalcPackage.TASK_PROPAGATOR_FUNCTION__TASK:
				return basicGetTask() != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskPropagatorFunctionImpl
