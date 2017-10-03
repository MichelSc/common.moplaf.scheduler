/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;

import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.TaskImpl#getTask <em>Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.TaskImpl#getNextTask <em>Next Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.TaskImpl#getPreviousTask <em>Previous Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.TaskImpl#getScheduledResource <em>Scheduled Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.TaskImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.TaskImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends ObjectWithPropagatorFunctionsImpl implements Task {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EObject task;

	/**
	 * The cached value of the '{@link #getNextTask() <em>Next Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextTask()
	 * @generated
	 * @ordered
	 */
	protected Task nextTask;

	/**
	 * The cached value of the '{@link #getPreviousTask() <em>Previous Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousTask()
	 * @generated
	 * @ordered
	 */
	protected Task previousTask;

	/**
	 * The cached value of the '{@link #getScheduledResource() <em>Scheduled Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledResource()
	 * @generated
	 * @ordered
	 */
	protected Resource scheduledResource;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.TASK__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(EObject newTask) {
		EObject oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getNextTask() {
		if (nextTask != null && nextTask.eIsProxy()) {
			InternalEObject oldNextTask = (InternalEObject)nextTask;
			nextTask = (Task)eResolveProxy(oldNextTask);
			if (nextTask != oldNextTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.TASK__NEXT_TASK, oldNextTask, nextTask));
			}
		}
		return nextTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetNextTask() {
		return nextTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextTask(Task newNextTask, NotificationChain msgs) {
		Task oldNextTask = nextTask;
		nextTask = newNextTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK__NEXT_TASK, oldNextTask, newNextTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextTask(Task newNextTask) {
		if (newNextTask != nextTask) {
			NotificationChain msgs = null;
			if (nextTask != null)
				msgs = ((InternalEObject)nextTask).eInverseRemove(this, SchedulerPackage.TASK__PREVIOUS_TASK, Task.class, msgs);
			if (newNextTask != null)
				msgs = ((InternalEObject)newNextTask).eInverseAdd(this, SchedulerPackage.TASK__PREVIOUS_TASK, Task.class, msgs);
			msgs = basicSetNextTask(newNextTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK__NEXT_TASK, newNextTask, newNextTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getPreviousTask() {
		if (previousTask != null && previousTask.eIsProxy()) {
			InternalEObject oldPreviousTask = (InternalEObject)previousTask;
			previousTask = (Task)eResolveProxy(oldPreviousTask);
			if (previousTask != oldPreviousTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.TASK__PREVIOUS_TASK, oldPreviousTask, previousTask));
			}
		}
		return previousTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetPreviousTask() {
		return previousTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousTask(Task newPreviousTask, NotificationChain msgs) {
		Task oldPreviousTask = previousTask;
		previousTask = newPreviousTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK__PREVIOUS_TASK, oldPreviousTask, newPreviousTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousTask(Task newPreviousTask) {
		if (newPreviousTask != previousTask) {
			NotificationChain msgs = null;
			if (previousTask != null)
				msgs = ((InternalEObject)previousTask).eInverseRemove(this, SchedulerPackage.TASK__NEXT_TASK, Task.class, msgs);
			if (newPreviousTask != null)
				msgs = ((InternalEObject)newPreviousTask).eInverseAdd(this, SchedulerPackage.TASK__NEXT_TASK, Task.class, msgs);
			msgs = basicSetPreviousTask(newPreviousTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK__PREVIOUS_TASK, newPreviousTask, newPreviousTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getScheduledResource() {
		if (scheduledResource != null && scheduledResource.eIsProxy()) {
			InternalEObject oldScheduledResource = (InternalEObject)scheduledResource;
			scheduledResource = (Resource)eResolveProxy(oldScheduledResource);
			if (scheduledResource != oldScheduledResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.TASK__SCHEDULED_RESOURCE, oldScheduledResource, scheduledResource));
			}
		}
		return scheduledResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetScheduledResource() {
		return scheduledResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledResource(Resource newScheduledResource) {
		Resource oldScheduledResource = scheduledResource;
		scheduledResource = newScheduledResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK__SCHEDULED_RESOURCE, oldScheduledResource, scheduledResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		Schedule solution = this.getSchedule();
		String description = String.format("sol %d, task %s", solution.getSolutionNr(), this.getName());
		return description;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		if (eContainerFeatureID() != SchedulerPackage.TASK__SCHEDULE) return null;
		return (Schedule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Schedule newSchedule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchedule, SchedulerPackage.TASK__SCHEDULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		if (newSchedule != eInternalContainer() || (eContainerFeatureID() != SchedulerPackage.TASK__SCHEDULE && newSchedule != null)) {
			if (EcoreUtil.isAncestor(this, newSchedule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, SchedulerPackage.SCHEDULE__TASKS, Schedule.class, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK__SCHEDULE, newSchedule, newSchedule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void unsetPreviousNext() {
		// precondition: this task is scheduled
		Task previous = this.getPreviousTask();
		Task next = this.getNextTask();
		Resource resource_asis = this.getScheduledResource();

		// before
		if ( previous!=null) {
			previous.setNextTask(next);
		} else if ( resource_asis!=null){
			// this task was the first task
			resource_asis.setFirstTask(next);
		} 

		this.setPreviousTask(null);
		// after
		if ( next!=null) {
			next.setPreviousTask(previous);
		} else if ( resource_asis!=null){
			// this task was the last task
			resource_asis.setLastTask(previous);
		} 
		this.setNextTask(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setPreviousNext(Resource resource, Task previous, Task next) {
		// assert previous.next = next.previous
		// or previous is null and next is first
		// or next is null and previous is last

		this.unsetPreviousNext();
		// before: set previous
		if ( previous==null ) {
			resource.setFirstTask(this);
		} else {
			previous.setNextTask(this);
			this.setPreviousTask(previous);
		}

		// after: set next
		if ( next==null) {
			resource.setLastTask(this);
		} else {
			next.setPreviousTask(this);
			this.setNextTask(next);
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void scheduleResource(Resource resource) {
		Resource resource_asis = this.getScheduledResource();
		Resource resource_tobe = resource;

		if ( resource_asis != resource_tobe ) {
			if ( resource_asis!=null ) {
				resource_asis.setNrCandidateScheduledTasks(resource_asis.getNrCandidateScheduledTasks()-1);
			}

			if ( resource_tobe!=null ) {
				resource_tobe.setNrCandidateScheduledTasks(resource_tobe.getNrCandidateScheduledTasks()+1);
			}
	
			this.setScheduledResource(resource_tobe);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.TASK__NEXT_TASK:
				if (nextTask != null)
					msgs = ((InternalEObject)nextTask).eInverseRemove(this, SchedulerPackage.TASK__PREVIOUS_TASK, Task.class, msgs);
				return basicSetNextTask((Task)otherEnd, msgs);
			case SchedulerPackage.TASK__PREVIOUS_TASK:
				if (previousTask != null)
					msgs = ((InternalEObject)previousTask).eInverseRemove(this, SchedulerPackage.TASK__NEXT_TASK, Task.class, msgs);
				return basicSetPreviousTask((Task)otherEnd, msgs);
			case SchedulerPackage.TASK__SCHEDULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchedule((Schedule)otherEnd, msgs);
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
			case SchedulerPackage.TASK__NEXT_TASK:
				return basicSetNextTask(null, msgs);
			case SchedulerPackage.TASK__PREVIOUS_TASK:
				return basicSetPreviousTask(null, msgs);
			case SchedulerPackage.TASK__SCHEDULE:
				return basicSetSchedule(null, msgs);
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
			case SchedulerPackage.TASK__SCHEDULE:
				return eInternalContainer().eInverseRemove(this, SchedulerPackage.SCHEDULE__TASKS, Schedule.class, msgs);
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
			case SchedulerPackage.TASK__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case SchedulerPackage.TASK__NEXT_TASK:
				if (resolve) return getNextTask();
				return basicGetNextTask();
			case SchedulerPackage.TASK__PREVIOUS_TASK:
				if (resolve) return getPreviousTask();
				return basicGetPreviousTask();
			case SchedulerPackage.TASK__SCHEDULED_RESOURCE:
				if (resolve) return getScheduledResource();
				return basicGetScheduledResource();
			case SchedulerPackage.TASK__DESCRIPTION:
				return getDescription();
			case SchedulerPackage.TASK__SCHEDULE:
				return getSchedule();
			case SchedulerPackage.TASK__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulerPackage.TASK__TASK:
				setTask((EObject)newValue);
				return;
			case SchedulerPackage.TASK__NEXT_TASK:
				setNextTask((Task)newValue);
				return;
			case SchedulerPackage.TASK__PREVIOUS_TASK:
				setPreviousTask((Task)newValue);
				return;
			case SchedulerPackage.TASK__SCHEDULED_RESOURCE:
				setScheduledResource((Resource)newValue);
				return;
			case SchedulerPackage.TASK__SCHEDULE:
				setSchedule((Schedule)newValue);
				return;
			case SchedulerPackage.TASK__NAME:
				setName((String)newValue);
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
			case SchedulerPackage.TASK__TASK:
				setTask((EObject)null);
				return;
			case SchedulerPackage.TASK__NEXT_TASK:
				setNextTask((Task)null);
				return;
			case SchedulerPackage.TASK__PREVIOUS_TASK:
				setPreviousTask((Task)null);
				return;
			case SchedulerPackage.TASK__SCHEDULED_RESOURCE:
				setScheduledResource((Resource)null);
				return;
			case SchedulerPackage.TASK__SCHEDULE:
				setSchedule((Schedule)null);
				return;
			case SchedulerPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
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
			case SchedulerPackage.TASK__TASK:
				return task != null;
			case SchedulerPackage.TASK__NEXT_TASK:
				return nextTask != null;
			case SchedulerPackage.TASK__PREVIOUS_TASK:
				return previousTask != null;
			case SchedulerPackage.TASK__SCHEDULED_RESOURCE:
				return scheduledResource != null;
			case SchedulerPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SchedulerPackage.TASK__SCHEDULE:
				return getSchedule() != null;
			case SchedulerPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case SchedulerPackage.TASK___UNSET_PREVIOUS_NEXT:
				unsetPreviousNext();
				return null;
			case SchedulerPackage.TASK___SET_PREVIOUS_NEXT__RESOURCE_TASK_TASK:
				setPreviousNext((Resource)arguments.get(0), (Task)arguments.get(1), (Task)arguments.get(2));
				return null;
			case SchedulerPackage.TASK___SCHEDULE_RESOURCE__RESOURCE:
				scheduleResource((Resource)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //TaskImpl