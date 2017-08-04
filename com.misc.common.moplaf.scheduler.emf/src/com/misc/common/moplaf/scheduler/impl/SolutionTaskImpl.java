/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.common.moplaf.scheduler.TaskExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getAssignedResource <em>Assigned Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getCandidateAssignedResource <em>Candidate Assigned Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getCandidateNextTask <em>Candidate Next Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getCandidatePreviousTask <em>Candidate Previous Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionTaskImpl extends MinimalEObjectImpl.Container implements SolutionTask {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

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
	 * The cached value of the '{@link #getAssignedResource() <em>Assigned Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedResource()
	 * @generated
	 * @ordered
	 */
	protected SolutionResource assignedResource;

	/**
	 * The cached value of the '{@link #getCandidateAssignedResource() <em>Candidate Assigned Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateAssignedResource()
	 * @generated
	 * @ordered
	 */
	protected SolutionResource candidateAssignedResource;

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
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskExpression> expressions;

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
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
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
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		Task oldTask = task;
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
	public SolutionResource getAssignedResource() {
		if (assignedResource != null && assignedResource.eIsProxy()) {
			InternalEObject oldAssignedResource = (InternalEObject)assignedResource;
			assignedResource = (SolutionResource)eResolveProxy(oldAssignedResource);
			if (assignedResource != oldAssignedResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__ASSIGNED_RESOURCE, oldAssignedResource, assignedResource));
			}
		}
		return assignedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource basicGetAssignedResource() {
		return assignedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedResource(SolutionResource newAssignedResource, NotificationChain msgs) {
		SolutionResource oldAssignedResource = assignedResource;
		assignedResource = newAssignedResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__ASSIGNED_RESOURCE, oldAssignedResource, newAssignedResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedResource(SolutionResource newAssignedResource) {
		if (newAssignedResource != assignedResource) {
			NotificationChain msgs = null;
			if (assignedResource != null)
				msgs = ((InternalEObject)assignedResource).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__ASSIGNED_TASKS, SolutionResource.class, msgs);
			if (newAssignedResource != null)
				msgs = ((InternalEObject)newAssignedResource).eInverseAdd(this, SchedulerPackage.SOLUTION_RESOURCE__ASSIGNED_TASKS, SolutionResource.class, msgs);
			msgs = basicSetAssignedResource(newAssignedResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__ASSIGNED_RESOURCE, newAssignedResource, newAssignedResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource getCandidateAssignedResource() {
		if (candidateAssignedResource != null && candidateAssignedResource.eIsProxy()) {
			InternalEObject oldCandidateAssignedResource = (InternalEObject)candidateAssignedResource;
			candidateAssignedResource = (SolutionResource)eResolveProxy(oldCandidateAssignedResource);
			if (candidateAssignedResource != oldCandidateAssignedResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE, oldCandidateAssignedResource, candidateAssignedResource));
			}
		}
		return candidateAssignedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource basicGetCandidateAssignedResource() {
		return candidateAssignedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCandidateAssignedResource(SolutionResource newCandidateAssignedResource, NotificationChain msgs) {
		SolutionResource oldCandidateAssignedResource = candidateAssignedResource;
		candidateAssignedResource = newCandidateAssignedResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE, oldCandidateAssignedResource, newCandidateAssignedResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateAssignedResource(SolutionResource newCandidateAssignedResource) {
		if (newCandidateAssignedResource != candidateAssignedResource) {
			NotificationChain msgs = null;
			if (candidateAssignedResource != null)
				msgs = ((InternalEObject)candidateAssignedResource).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS, SolutionResource.class, msgs);
			if (newCandidateAssignedResource != null)
				msgs = ((InternalEObject)newCandidateAssignedResource).eInverseAdd(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS, SolutionResource.class, msgs);
			msgs = basicSetCandidateAssignedResource(newCandidateAssignedResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE, newCandidateAssignedResource, newCandidateAssignedResource));
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
	public NotificationChain basicSetCandidateNextTask(SolutionTask newCandidateNextTask, NotificationChain msgs) {
		SolutionTask oldCandidateNextTask = candidateNextTask;
		candidateNextTask = newCandidateNextTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK, oldCandidateNextTask, newCandidateNextTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateNextTask(SolutionTask newCandidateNextTask) {
		if (newCandidateNextTask != candidateNextTask) {
			NotificationChain msgs = null;
			if (candidateNextTask != null)
				msgs = ((InternalEObject)candidateNextTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK, SolutionTask.class, msgs);
			if (newCandidateNextTask != null)
				msgs = ((InternalEObject)newCandidateNextTask).eInverseAdd(this, SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK, SolutionTask.class, msgs);
			msgs = basicSetCandidateNextTask(newCandidateNextTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK, newCandidateNextTask, newCandidateNextTask));
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
	public NotificationChain basicSetCandidatePreviousTask(SolutionTask newCandidatePreviousTask, NotificationChain msgs) {
		SolutionTask oldCandidatePreviousTask = candidatePreviousTask;
		candidatePreviousTask = newCandidatePreviousTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK, oldCandidatePreviousTask, newCandidatePreviousTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidatePreviousTask(SolutionTask newCandidatePreviousTask) {
		if (newCandidatePreviousTask != candidatePreviousTask) {
			NotificationChain msgs = null;
			if (candidatePreviousTask != null)
				msgs = ((InternalEObject)candidatePreviousTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK, SolutionTask.class, msgs);
			if (newCandidatePreviousTask != null)
				msgs = ((InternalEObject)newCandidatePreviousTask).eInverseAdd(this, SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK, SolutionTask.class, msgs);
			msgs = basicSetCandidatePreviousTask(newCandidatePreviousTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK, newCandidatePreviousTask, newCandidatePreviousTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<TaskExpression>(TaskExpression.class, this, SchedulerPackage.SOLUTION_TASK__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			case SchedulerPackage.SOLUTION_TASK__ASSIGNED_RESOURCE:
				if (assignedResource != null)
					msgs = ((InternalEObject)assignedResource).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__ASSIGNED_TASKS, SolutionResource.class, msgs);
				return basicSetAssignedResource((SolutionResource)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE:
				if (candidateAssignedResource != null)
					msgs = ((InternalEObject)candidateAssignedResource).eInverseRemove(this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS, SolutionResource.class, msgs);
				return basicSetCandidateAssignedResource((SolutionResource)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK:
				if (candidateNextTask != null)
					msgs = ((InternalEObject)candidateNextTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK, SolutionTask.class, msgs);
				return basicSetCandidateNextTask((SolutionTask)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK:
				if (candidatePreviousTask != null)
					msgs = ((InternalEObject)candidatePreviousTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK, SolutionTask.class, msgs);
				return basicSetCandidatePreviousTask((SolutionTask)otherEnd, msgs);
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
			case SchedulerPackage.SOLUTION_TASK__ASSIGNED_RESOURCE:
				return basicSetAssignedResource(null, msgs);
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE:
				return basicSetCandidateAssignedResource(null, msgs);
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK:
				return basicSetCandidateNextTask(null, msgs);
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK:
				return basicSetCandidatePreviousTask(null, msgs);
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
			case SchedulerPackage.SOLUTION_TASK__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case SchedulerPackage.SOLUTION_TASK__NEXT_TASK:
				if (resolve) return getNextTask();
				return basicGetNextTask();
			case SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK:
				if (resolve) return getPreviousTask();
				return basicGetPreviousTask();
			case SchedulerPackage.SOLUTION_TASK__ASSIGNED_RESOURCE:
				if (resolve) return getAssignedResource();
				return basicGetAssignedResource();
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE:
				if (resolve) return getCandidateAssignedResource();
				return basicGetCandidateAssignedResource();
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK:
				if (resolve) return getCandidateNextTask();
				return basicGetCandidateNextTask();
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK:
				if (resolve) return getCandidatePreviousTask();
				return basicGetCandidatePreviousTask();
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				return getExpressions();
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
				setTask((Task)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__NEXT_TASK:
				setNextTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK:
				setPreviousTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__ASSIGNED_RESOURCE:
				setAssignedResource((SolutionResource)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE:
				setCandidateAssignedResource((SolutionResource)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK:
				setCandidateNextTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK:
				setCandidatePreviousTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends TaskExpression>)newValue);
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
				setTask((Task)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__NEXT_TASK:
				setNextTask((SolutionTask)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK:
				setPreviousTask((SolutionTask)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__ASSIGNED_RESOURCE:
				setAssignedResource((SolutionResource)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE:
				setCandidateAssignedResource((SolutionResource)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK:
				setCandidateNextTask((SolutionTask)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK:
				setCandidatePreviousTask((SolutionTask)null);
				return;
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				getExpressions().clear();
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
			case SchedulerPackage.SOLUTION_TASK__ASSIGNED_RESOURCE:
				return assignedResource != null;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE:
				return candidateAssignedResource != null;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK:
				return candidateNextTask != null;
			case SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK:
				return candidatePreviousTask != null;
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolutionTaskImpl
