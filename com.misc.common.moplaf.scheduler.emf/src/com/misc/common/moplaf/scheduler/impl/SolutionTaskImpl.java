/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.TaskExpression;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getTask <em>Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getNextTask <em>Next Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getPreviousTask <em>Previous Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getScheduledResource <em>Scheduled Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getCandidateNextTask <em>Candidate Next Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getCandidatePreviousTask <em>Candidate Previous Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getResourceAsCandidateFirstTask <em>Resource As Candidate First Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getResourceAsCandidateLastTask <em>Resource As Candidate Last Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getCandidateScheduledResource <em>Candidate Scheduled Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionTaskImpl extends ObjectWithPropagatorFunctionsImpl implements SolutionTask {
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
	protected SolutionTask nextTask;

	/**
	 * The cached value of the '{@link #getPreviousTask() <em>Previous Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousTask()
	 * @generated
	 * @ordered
	 */
	protected SolutionTask previousTask;

	/**
	 * The cached value of the '{@link #getScheduledResource() <em>Scheduled Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledResource()
	 * @generated
	 * @ordered
	 */
	protected SolutionResource scheduledResource;

	/**
	 * The cached value of the '{@link #getCandidateNextTask() <em>Candidate Next Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateNextTask()
	 * @generated
	 * @ordered
	 */
	protected SolutionTask candidateNextTask;

	/**
	 * The cached value of the '{@link #getCandidatePreviousTask() <em>Candidate Previous Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidatePreviousTask()
	 * @generated
	 * @ordered
	 */
	protected SolutionTask candidatePreviousTask;

	/**
	 * The cached value of the '{@link #getResourceAsCandidateFirstTask() <em>Resource As Candidate First Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAsCandidateFirstTask()
	 * @generated
	 * @ordered
	 */
	protected SolutionResource resourceAsCandidateFirstTask;

	/**
	 * The cached value of the '{@link #getResourceAsCandidateLastTask() <em>Resource As Candidate Last Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAsCandidateLastTask()
	 * @generated
	 * @ordered
	 */
	protected SolutionResource resourceAsCandidateLastTask;

	/**
	 * The cached value of the '{@link #getCandidateScheduledResource() <em>Candidate Scheduled Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateScheduledResource()
	 * @generated
	 * @ordered
	 */
	protected SolutionResource candidateScheduledResource;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskExpression> expressions;

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
	protected SolutionTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SOLUTION_TASK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__TASK, oldTask, task));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask getNextTask() {
		if (nextTask != null && nextTask.eIsProxy()) {
			InternalEObject oldNextTask = (InternalEObject)nextTask;
			nextTask = (SolutionTask)eResolveProxy(oldNextTask);
			if (nextTask != oldNextTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__NEXT_TASK, oldNextTask, nextTask));
			}
		}
		return nextTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask basicGetNextTask() {
		return nextTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextTask(SolutionTask newNextTask, NotificationChain msgs) {
		SolutionTask oldNextTask = nextTask;
		nextTask = newNextTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__NEXT_TASK, oldNextTask, newNextTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextTask(SolutionTask newNextTask) {
		if (newNextTask != nextTask) {
			NotificationChain msgs = null;
			if (nextTask != null)
				msgs = ((InternalEObject)nextTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK, SolutionTask.class, msgs);
			if (newNextTask != null)
				msgs = ((InternalEObject)newNextTask).eInverseAdd(this, SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK, SolutionTask.class, msgs);
			msgs = basicSetNextTask(newNextTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__NEXT_TASK, newNextTask, newNextTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask getPreviousTask() {
		if (previousTask != null && previousTask.eIsProxy()) {
			InternalEObject oldPreviousTask = (InternalEObject)previousTask;
			previousTask = (SolutionTask)eResolveProxy(oldPreviousTask);
			if (previousTask != oldPreviousTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK, oldPreviousTask, previousTask));
			}
		}
		return previousTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask basicGetPreviousTask() {
		return previousTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousTask(SolutionTask newPreviousTask, NotificationChain msgs) {
		SolutionTask oldPreviousTask = previousTask;
		previousTask = newPreviousTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK, oldPreviousTask, newPreviousTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousTask(SolutionTask newPreviousTask) {
		if (newPreviousTask != previousTask) {
			NotificationChain msgs = null;
			if (previousTask != null)
				msgs = ((InternalEObject)previousTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__NEXT_TASK, SolutionTask.class, msgs);
			if (newPreviousTask != null)
				msgs = ((InternalEObject)newPreviousTask).eInverseAdd(this, SchedulerPackage.SOLUTION_TASK__NEXT_TASK, SolutionTask.class, msgs);
			msgs = basicSetPreviousTask(newPreviousTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK, newPreviousTask, newPreviousTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource getScheduledResource() {
		if (scheduledResource != null && scheduledResource.eIsProxy()) {
			InternalEObject oldScheduledResource = (InternalEObject)scheduledResource;
			scheduledResource = (SolutionResource)eResolveProxy(oldScheduledResource);
			if (scheduledResource != oldScheduledResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE, oldScheduledResource, scheduledResource));
			}
		}
		return scheduledResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource basicGetScheduledResource() {
		return scheduledResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledResource(SolutionResource newScheduledResource, NotificationChain msgs) {
		SolutionResource oldScheduledResource = scheduledResource;
		scheduledResource = newScheduledResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE, oldScheduledResource, newScheduledResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledResource(SolutionResource newScheduledResource) {
		if (newScheduledResource != scheduledResource) {
			NotificationChain msgs = null;
			if (scheduledResource != null)
				msgs = ((InternalEObject)scheduledResource).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS, SolutionResource.class, msgs);
			if (newScheduledResource != null)
				msgs = ((InternalEObject)newScheduledResource).eInverseAdd(this, SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS, SolutionResource.class, msgs);
			msgs = basicSetScheduledResource(newScheduledResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE, newScheduledResource, newScheduledResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource getCandidateScheduledResource() {
		if (candidateScheduledResource != null && candidateScheduledResource.eIsProxy()) {
			InternalEObject oldCandidateScheduledResource = (InternalEObject)candidateScheduledResource;
			candidateScheduledResource = (SolutionResource)eResolveProxy(oldCandidateScheduledResource);
			if (candidateScheduledResource != oldCandidateScheduledResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE, oldCandidateScheduledResource, candidateScheduledResource));
			}
		}
		return candidateScheduledResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource basicGetCandidateScheduledResource() {
		return candidateScheduledResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCandidateScheduledResource(SolutionResource newCandidateScheduledResource, NotificationChain msgs) {
		SolutionResource oldCandidateScheduledResource = candidateScheduledResource;
		candidateScheduledResource = newCandidateScheduledResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE, oldCandidateScheduledResource, newCandidateScheduledResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateScheduledResource(SolutionResource newCandidateScheduledResource) {
		if (newCandidateScheduledResource != candidateScheduledResource) {
			NotificationChain msgs = null;
			if (candidateScheduledResource != null)
				msgs = ((InternalEObject)candidateScheduledResource).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS, SolutionResource.class, msgs);
			if (newCandidateScheduledResource != null)
				msgs = ((InternalEObject)newCandidateScheduledResource).eInverseAdd(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS, SolutionResource.class, msgs);
			msgs = basicSetCandidateScheduledResource(newCandidateScheduledResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE, newCandidateScheduledResource, newCandidateScheduledResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask getCandidateNextTask() {
		if (candidateNextTask != null && candidateNextTask.eIsProxy()) {
			InternalEObject oldCandidateNextTask = (InternalEObject)candidateNextTask;
			candidateNextTask = (SolutionTask)eResolveProxy(oldCandidateNextTask);
			if (candidateNextTask != oldCandidateNextTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK, oldCandidateNextTask, candidateNextTask));
			}
		}
		return candidateNextTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask basicGetCandidateNextTask() {
		return candidateNextTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateNextTask(SolutionTask newCandidateNextTask) {
		SolutionTask oldCandidateNextTask = candidateNextTask;
		candidateNextTask = newCandidateNextTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK, oldCandidateNextTask, candidateNextTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask getCandidatePreviousTask() {
		if (candidatePreviousTask != null && candidatePreviousTask.eIsProxy()) {
			InternalEObject oldCandidatePreviousTask = (InternalEObject)candidatePreviousTask;
			candidatePreviousTask = (SolutionTask)eResolveProxy(oldCandidatePreviousTask);
			if (candidatePreviousTask != oldCandidatePreviousTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK, oldCandidatePreviousTask, candidatePreviousTask));
			}
		}
		return candidatePreviousTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask basicGetCandidatePreviousTask() {
		return candidatePreviousTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidatePreviousTask(SolutionTask newCandidatePreviousTask) {
		SolutionTask oldCandidatePreviousTask = candidatePreviousTask;
		candidatePreviousTask = newCandidatePreviousTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK, oldCandidatePreviousTask, candidatePreviousTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource getResourceAsCandidateFirstTask() {
		if (resourceAsCandidateFirstTask != null && resourceAsCandidateFirstTask.eIsProxy()) {
			InternalEObject oldResourceAsCandidateFirstTask = (InternalEObject)resourceAsCandidateFirstTask;
			resourceAsCandidateFirstTask = (SolutionResource)eResolveProxy(oldResourceAsCandidateFirstTask);
			if (resourceAsCandidateFirstTask != oldResourceAsCandidateFirstTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK, oldResourceAsCandidateFirstTask, resourceAsCandidateFirstTask));
			}
		}
		return resourceAsCandidateFirstTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource basicGetResourceAsCandidateFirstTask() {
		return resourceAsCandidateFirstTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceAsCandidateFirstTask(SolutionResource newResourceAsCandidateFirstTask, NotificationChain msgs) {
		SolutionResource oldResourceAsCandidateFirstTask = resourceAsCandidateFirstTask;
		resourceAsCandidateFirstTask = newResourceAsCandidateFirstTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK, oldResourceAsCandidateFirstTask, newResourceAsCandidateFirstTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceAsCandidateFirstTask(SolutionResource newResourceAsCandidateFirstTask) {
		if (newResourceAsCandidateFirstTask != resourceAsCandidateFirstTask) {
			NotificationChain msgs = null;
			if (resourceAsCandidateFirstTask != null)
				msgs = ((InternalEObject)resourceAsCandidateFirstTask).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK, SolutionResource.class, msgs);
			if (newResourceAsCandidateFirstTask != null)
				msgs = ((InternalEObject)newResourceAsCandidateFirstTask).eInverseAdd(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK, SolutionResource.class, msgs);
			msgs = basicSetResourceAsCandidateFirstTask(newResourceAsCandidateFirstTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK, newResourceAsCandidateFirstTask, newResourceAsCandidateFirstTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource getResourceAsCandidateLastTask() {
		if (resourceAsCandidateLastTask != null && resourceAsCandidateLastTask.eIsProxy()) {
			InternalEObject oldResourceAsCandidateLastTask = (InternalEObject)resourceAsCandidateLastTask;
			resourceAsCandidateLastTask = (SolutionResource)eResolveProxy(oldResourceAsCandidateLastTask);
			if (resourceAsCandidateLastTask != oldResourceAsCandidateLastTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK, oldResourceAsCandidateLastTask, resourceAsCandidateLastTask));
			}
		}
		return resourceAsCandidateLastTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource basicGetResourceAsCandidateLastTask() {
		return resourceAsCandidateLastTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceAsCandidateLastTask(SolutionResource newResourceAsCandidateLastTask, NotificationChain msgs) {
		SolutionResource oldResourceAsCandidateLastTask = resourceAsCandidateLastTask;
		resourceAsCandidateLastTask = newResourceAsCandidateLastTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK, oldResourceAsCandidateLastTask, newResourceAsCandidateLastTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceAsCandidateLastTask(SolutionResource newResourceAsCandidateLastTask) {
		if (newResourceAsCandidateLastTask != resourceAsCandidateLastTask) {
			NotificationChain msgs = null;
			if (resourceAsCandidateLastTask != null)
				msgs = ((InternalEObject)resourceAsCandidateLastTask).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK, SolutionResource.class, msgs);
			if (newResourceAsCandidateLastTask != null)
				msgs = ((InternalEObject)newResourceAsCandidateLastTask).eInverseAdd(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK, SolutionResource.class, msgs);
			msgs = basicSetResourceAsCandidateLastTask(newResourceAsCandidateLastTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK, newResourceAsCandidateLastTask, newResourceAsCandidateLastTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentWithInverseEList<TaskExpression>(TaskExpression.class, this, SchedulerPackage.SOLUTION_TASK__EXPRESSIONS, SchedulerPackage.TASK_EXPRESSION__TASK);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		Solution solution = this.getSolution();
		String description = String.format("sol %d, task %s", solution.getSolutionNr(), this.getName());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSolution() {
		if (eContainerFeatureID() != SchedulerPackage.SOLUTION_TASK__SOLUTION) return null;
		return (Solution)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolution(Solution newSolution, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSolution, SchedulerPackage.SOLUTION_TASK__SOLUTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(Solution newSolution) {
		if (newSolution != eInternalContainer() || (eContainerFeatureID() != SchedulerPackage.SOLUTION_TASK__SOLUTION && newSolution != null)) {
			if (EcoreUtil.isAncestor(this, newSolution))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSolution != null)
				msgs = ((InternalEObject)newSolution).eInverseAdd(this, SchedulerPackage.SOLUTION__TASKS, Solution.class, msgs);
			msgs = basicSetSolution(newSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__SOLUTION, newSolution, newSolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void unsetCandidatePreviousNext() {
		// precondition: this task is scheduled
		SolutionTask previous = this.getCandidatePreviousTask();
		SolutionTask next = this.getCandidateNextTask();
		SolutionResource resource_asfirst = this.getResourceAsCandidateFirstTask();
		SolutionResource resource_aslast  = this.getResourceAsCandidateLastTask();
		// before
		if ( previous!=null) {
			previous.setCandidateNextTask(next);
		} else if ( resource_asfirst!=null ) {
			resource_asfirst.setCandidateFirstTask(next);
		} else {
			assert false;
		}
		this.setCandidatePreviousTask(null);
		// after
		if ( next!=null) {
			next.setCandidatePreviousTask(previous);
		} else if ( resource_aslast!=null) {
			resource_aslast.setCandidateLastTask(previous);
		} else {
			assert false;
		}
		this.setCandidateNextTask(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setCandidatePreviousNext(SolutionResource resource, SolutionTask previous, SolutionTask next) {
		// assert previous.next = next.previous
		// or previous is null and next is first
		// or next is null and previous is last
		this.unsetCandidatePreviousNext();
		
		// before: set previous
		if ( previous==null ) {
			resource.setCandidateFirstTask(this);
		} else {
			previous.setCandidateNextTask(this);
			this.setCandidatePreviousTask(previous);
		}
		
		// after: set next
		if ( next==null) {
			resource.setCandidateLastTask(this);
		} else {
			next.setCandidatePreviousTask(this);
			this.setCandidateNextTask(next);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void constructExpressions() {
		// default does nothing
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
			case SchedulerPackage.SOLUTION_TASK__NEXT_TASK:
				if (nextTask != null)
					msgs = ((InternalEObject)nextTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK, SolutionTask.class, msgs);
				return basicSetNextTask((SolutionTask)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK:
				if (previousTask != null)
					msgs = ((InternalEObject)previousTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__NEXT_TASK, SolutionTask.class, msgs);
				return basicSetPreviousTask((SolutionTask)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE:
				if (scheduledResource != null)
					msgs = ((InternalEObject)scheduledResource).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS, SolutionResource.class, msgs);
				return basicSetScheduledResource((SolutionResource)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK:
				if (resourceAsCandidateFirstTask != null)
					msgs = ((InternalEObject)resourceAsCandidateFirstTask).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK, SolutionResource.class, msgs);
				return basicSetResourceAsCandidateFirstTask((SolutionResource)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK:
				if (resourceAsCandidateLastTask != null)
					msgs = ((InternalEObject)resourceAsCandidateLastTask).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK, SolutionResource.class, msgs);
				return basicSetResourceAsCandidateLastTask((SolutionResource)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE:
				if (candidateScheduledResource != null)
					msgs = ((InternalEObject)candidateScheduledResource).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS, SolutionResource.class, msgs);
				return basicSetCandidateScheduledResource((SolutionResource)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpressions()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__SOLUTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSolution((Solution)otherEnd, msgs);
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
			case SchedulerPackage.SOLUTION_TASK__NEXT_TASK:
				return basicSetNextTask(null, msgs);
			case SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK:
				return basicSetPreviousTask(null, msgs);
			case SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE:
				return basicSetScheduledResource(null, msgs);
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK:
				return basicSetResourceAsCandidateFirstTask(null, msgs);
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK:
				return basicSetResourceAsCandidateLastTask(null, msgs);
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE:
				return basicSetCandidateScheduledResource(null, msgs);
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__SOLUTION:
				return basicSetSolution(null, msgs);
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
			case SchedulerPackage.SOLUTION_TASK__SOLUTION:
				return eInternalContainer().eInverseRemove(this, SchedulerPackage.SOLUTION__TASKS, Solution.class, msgs);
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
			case SchedulerPackage.SOLUTION_TASK__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case SchedulerPackage.SOLUTION_TASK__NEXT_TASK:
				if (resolve) return getNextTask();
				return basicGetNextTask();
			case SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK:
				if (resolve) return getPreviousTask();
				return basicGetPreviousTask();
			case SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE:
				if (resolve) return getScheduledResource();
				return basicGetScheduledResource();
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK:
				if (resolve) return getCandidateNextTask();
				return basicGetCandidateNextTask();
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK:
				if (resolve) return getCandidatePreviousTask();
				return basicGetCandidatePreviousTask();
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK:
				if (resolve) return getResourceAsCandidateFirstTask();
				return basicGetResourceAsCandidateFirstTask();
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK:
				if (resolve) return getResourceAsCandidateLastTask();
				return basicGetResourceAsCandidateLastTask();
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE:
				if (resolve) return getCandidateScheduledResource();
				return basicGetCandidateScheduledResource();
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				return getExpressions();
			case SchedulerPackage.SOLUTION_TASK__DESCRIPTION:
				return getDescription();
			case SchedulerPackage.SOLUTION_TASK__SOLUTION:
				return getSolution();
			case SchedulerPackage.SOLUTION_TASK__NAME:
				return getName();
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
			case SchedulerPackage.SOLUTION_TASK__TASK:
				setTask((EObject)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__NEXT_TASK:
				setNextTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK:
				setPreviousTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE:
				setScheduledResource((SolutionResource)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK:
				setCandidateNextTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK:
				setCandidatePreviousTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK:
				setResourceAsCandidateFirstTask((SolutionResource)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK:
				setResourceAsCandidateLastTask((SolutionResource)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE:
				setCandidateScheduledResource((SolutionResource)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends TaskExpression>)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__SOLUTION:
				setSolution((Solution)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__NAME:
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
			case SchedulerPackage.SOLUTION_TASK__TASK:
				setTask((EObject)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__NEXT_TASK:
				setNextTask((SolutionTask)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK:
				setPreviousTask((SolutionTask)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE:
				setScheduledResource((SolutionResource)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK:
				setCandidateNextTask((SolutionTask)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK:
				setCandidatePreviousTask((SolutionTask)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK:
				setResourceAsCandidateFirstTask((SolutionResource)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK:
				setResourceAsCandidateLastTask((SolutionResource)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE:
				setCandidateScheduledResource((SolutionResource)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				getExpressions().clear();
				return;
			case SchedulerPackage.SOLUTION_TASK__SOLUTION:
				setSolution((Solution)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__NAME:
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
			case SchedulerPackage.SOLUTION_TASK__TASK:
				return task != null;
			case SchedulerPackage.SOLUTION_TASK__NEXT_TASK:
				return nextTask != null;
			case SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK:
				return previousTask != null;
			case SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE:
				return scheduledResource != null;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK:
				return candidateNextTask != null;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK:
				return candidatePreviousTask != null;
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK:
				return resourceAsCandidateFirstTask != null;
			case SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK:
				return resourceAsCandidateLastTask != null;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE:
				return candidateScheduledResource != null;
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case SchedulerPackage.SOLUTION_TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SchedulerPackage.SOLUTION_TASK__SOLUTION:
				return getSolution() != null;
			case SchedulerPackage.SOLUTION_TASK__NAME:
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
			case SchedulerPackage.SOLUTION_TASK___UNSET_CANDIDATE_PREVIOUS_NEXT:
				unsetCandidatePreviousNext();
				return null;
			case SchedulerPackage.SOLUTION_TASK___SET_CANDIDATE_PREVIOUS_NEXT__SOLUTIONRESOURCE_SOLUTIONTASK_SOLUTIONTASK:
				setCandidatePreviousNext((SolutionResource)arguments.get(0), (SolutionTask)arguments.get(1), (SolutionTask)arguments.get(2));
				return null;
			case SchedulerPackage.SOLUTION_TASK___CONSTRUCT_EXPRESSIONS:
				constructExpressions();
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

} //SolutionTaskImpl
