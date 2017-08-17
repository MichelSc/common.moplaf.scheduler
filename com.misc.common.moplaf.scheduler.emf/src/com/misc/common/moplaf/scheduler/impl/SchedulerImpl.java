/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.common.util.Util;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.schedulercalc.util.SetSchedulePropagatorFunctionManager;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SchedulerImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SchedulerImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SchedulerImpl#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SchedulerImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SchedulerImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulerImpl extends MinimalEObjectImpl.Container implements Scheduler {
	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solutions;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentSolutionNr() <em>Current Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_SOLUTION_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentSolutionNr() <em>Current Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected int currentSolutionNr = CURRENT_SOLUTION_NR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> tasks;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentWithInverseEList<Solution>(Solution.class, this, SchedulerPackage.SCHEDULER__SOLUTIONS, SchedulerPackage.SOLUTION__SCHEDULER);
		}
		return solutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getResources() {
		if (resources == null) {
			resources = new EObjectResolvingEList<EObject>(EObject.class, this, SchedulerPackage.SCHEDULER__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionTask constructTask(EObject task) {
		SolutionTask new_task = SchedulerFactory.eINSTANCE.createSolutionTask();
		return new_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionResource constructResource(EObject resource) {
		SolutionResource new_resource = SchedulerFactory.eINSTANCE.createSolutionResource();
		return new_resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void enable() {
		Util.adapt(this, SetSchedulePropagatorFunctionManager.class, true ); // true = create
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<EObject>(EObject.class, this, SchedulerPackage.SCHEDULER__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentSolutionNr() {
		return currentSolutionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSolutionNr(int newCurrentSolutionNr) {
		int oldCurrentSolutionNr = currentSolutionNr;
		currentSolutionNr = newCurrentSolutionNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULER__CURRENT_SOLUTION_NR, oldCurrentSolutionNr, currentSolutionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULER__SOLUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSolutions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULER__SOLUTIONS:
				return ((InternalEList<?>)getSolutions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULER__SOLUTIONS:
				return getSolutions();
			case SchedulerPackage.SCHEDULER__NAME:
				return getName();
			case SchedulerPackage.SCHEDULER__CURRENT_SOLUTION_NR:
				return getCurrentSolutionNr();
			case SchedulerPackage.SCHEDULER__TASKS:
				return getTasks();
			case SchedulerPackage.SCHEDULER__RESOURCES:
				return getResources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULER__SOLUTIONS:
				getSolutions().clear();
				getSolutions().addAll((Collection<? extends Solution>)newValue);
				return;
			case SchedulerPackage.SCHEDULER__NAME:
				setName((String)newValue);
				return;
			case SchedulerPackage.SCHEDULER__CURRENT_SOLUTION_NR:
				setCurrentSolutionNr((Integer)newValue);
				return;
			case SchedulerPackage.SCHEDULER__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends EObject>)newValue);
				return;
			case SchedulerPackage.SCHEDULER__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends EObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULER__SOLUTIONS:
				getSolutions().clear();
				return;
			case SchedulerPackage.SCHEDULER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SchedulerPackage.SCHEDULER__CURRENT_SOLUTION_NR:
				setCurrentSolutionNr(CURRENT_SOLUTION_NR_EDEFAULT);
				return;
			case SchedulerPackage.SCHEDULER__TASKS:
				getTasks().clear();
				return;
			case SchedulerPackage.SCHEDULER__RESOURCES:
				getResources().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULER__SOLUTIONS:
				return solutions != null && !solutions.isEmpty();
			case SchedulerPackage.SCHEDULER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SchedulerPackage.SCHEDULER__CURRENT_SOLUTION_NR:
				return currentSolutionNr != CURRENT_SOLUTION_NR_EDEFAULT;
			case SchedulerPackage.SCHEDULER__TASKS:
				return tasks != null && !tasks.isEmpty();
			case SchedulerPackage.SCHEDULER__RESOURCES:
				return resources != null && !resources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SchedulerPackage.SCHEDULER___CONSTRUCT_TASK__EOBJECT:
				return constructTask((EObject)arguments.get(0));
			case SchedulerPackage.SCHEDULER___CONSTRUCT_RESOURCE__EOBJECT:
				return constructResource((EObject)arguments.get(0));
			case SchedulerPackage.SCHEDULER___ENABLE:
				enable();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", CurrentSolutionNr: ");
		result.append(currentSolutionNr);
		result.append(')');
		return result.toString();
	}

} //SchedulerImpl
