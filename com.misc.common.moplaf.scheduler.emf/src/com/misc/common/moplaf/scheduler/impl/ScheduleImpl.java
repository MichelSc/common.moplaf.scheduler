/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.impl.SolutionImpl;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends SolutionImpl implements Schedule {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The default value of the '{@link #getSolutionNr() <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLUTION_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSolutionNr() <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected int solutionNr = SOLUTION_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrScheduledTasks() <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_SCHEDULED_TASKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrScheduledTasks() <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected int nrScheduledTasks = NR_SCHEDULED_TASKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentWithInverseEList<Task>(Task.class, this, SchedulerPackage.SCHEDULE__TASKS, SchedulerPackage.TASK__SCHEDULE);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, SchedulerPackage.SCHEDULE__RESOURCES, SchedulerPackage.RESOURCE__SCHEDULE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSolutionNr() {
		return solutionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolutionNr(int newSolutionNr) {
		int oldSolutionNr = solutionNr;
		solutionNr = newSolutionNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE__SOLUTION_NR, oldSolutionNr, solutionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getScheduler() {
		if (eContainerFeatureID() != SchedulerPackage.SCHEDULE__SCHEDULER) return null;
		return (Scheduler)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduler(Scheduler newScheduler, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScheduler, SchedulerPackage.SCHEDULE__SCHEDULER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(Scheduler newScheduler) {
		if (newScheduler != eInternalContainer() || (eContainerFeatureID() != SchedulerPackage.SCHEDULE__SCHEDULER && newScheduler != null)) {
			if (EcoreUtil.isAncestor(this, newScheduler))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScheduler != null)
				msgs = ((InternalEObject)newScheduler).eInverseAdd(this, SchedulerPackage.SCHEDULER__SCHEDULES, Scheduler.class, msgs);
			msgs = basicSetScheduler(newScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE__SCHEDULER, newScheduler, newScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrScheduledTasks() {
		return nrScheduledTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrScheduledTasks(int newNrScheduledTasks) {
		int oldNrScheduledTasks = nrScheduledTasks;
		nrScheduledTasks = newNrScheduledTasks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS, oldNrScheduledTasks, nrScheduledTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void initialize() {
		// clear everything
		this.getTasks().clear();
		this.getResources().clear();
		// construct tasks and resources
		Scheduler scheduler = this.getScheduler();
		scheduler.generateResources(this);
		scheduler.generateTasks(this);
		Score new_score = scheduler.constructScore();
		this.setScore(new_score);
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
			case SchedulerPackage.SCHEDULE__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SCHEDULE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SCHEDULE__SCHEDULER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScheduler((Scheduler)otherEnd, msgs);
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
			case SchedulerPackage.SCHEDULE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SCHEDULE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SCHEDULE__SCHEDULER:
				return basicSetScheduler(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SchedulerPackage.SCHEDULE__SCHEDULER:
				return eInternalContainer().eInverseRemove(this, SchedulerPackage.SCHEDULER__SCHEDULES, Scheduler.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE__TASKS:
				return getTasks();
			case SchedulerPackage.SCHEDULE__RESOURCES:
				return getResources();
			case SchedulerPackage.SCHEDULE__SOLUTION_NR:
				return getSolutionNr();
			case SchedulerPackage.SCHEDULE__SCHEDULER:
				return getScheduler();
			case SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS:
				return getNrScheduledTasks();
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
			case SchedulerPackage.SCHEDULE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case SchedulerPackage.SCHEDULE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case SchedulerPackage.SCHEDULE__SOLUTION_NR:
				setSolutionNr((Integer)newValue);
				return;
			case SchedulerPackage.SCHEDULE__SCHEDULER:
				setScheduler((Scheduler)newValue);
				return;
			case SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS:
				setNrScheduledTasks((Integer)newValue);
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
			case SchedulerPackage.SCHEDULE__TASKS:
				getTasks().clear();
				return;
			case SchedulerPackage.SCHEDULE__RESOURCES:
				getResources().clear();
				return;
			case SchedulerPackage.SCHEDULE__SOLUTION_NR:
				setSolutionNr(SOLUTION_NR_EDEFAULT);
				return;
			case SchedulerPackage.SCHEDULE__SCHEDULER:
				setScheduler((Scheduler)null);
				return;
			case SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS:
				setNrScheduledTasks(NR_SCHEDULED_TASKS_EDEFAULT);
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
			case SchedulerPackage.SCHEDULE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case SchedulerPackage.SCHEDULE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case SchedulerPackage.SCHEDULE__SOLUTION_NR:
				return solutionNr != SOLUTION_NR_EDEFAULT;
			case SchedulerPackage.SCHEDULE__SCHEDULER:
				return getScheduler() != null;
			case SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS:
				return nrScheduledTasks != NR_SCHEDULED_TASKS_EDEFAULT;
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
			case SchedulerPackage.SCHEDULE___INITIALIZE:
				initialize();
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
		result.append(" (SolutionNr: ");
		result.append(solutionNr);
		result.append(", NrScheduledTasks: ");
		result.append(nrScheduledTasks);
		result.append(')');
		return result.toString();
	}

} //ScheduleImpl
