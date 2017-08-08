/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.common.moplaf.scheduler.ResourceExpression;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getScheduledTasks <em>Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getCandidateScheduledTasks <em>Candidate Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getCandidateFirstTask <em>Candidate First Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getCandidateLastTask <em>Candidate Last Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionResourceImpl extends ObjectWithPropagatorFunctionsImpl implements SolutionResource {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EObject resource;

	/**
	 * The cached value of the '{@link #getScheduledTasks() <em>Scheduled Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionTask> scheduledTasks;

	/**
	 * The cached value of the '{@link #getCandidateScheduledTasks() <em>Candidate Scheduled Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionTask> candidateScheduledTasks;

	/**
	 * The cached value of the '{@link #getCandidateFirstTask() <em>Candidate First Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateFirstTask()
	 * @generated
	 * @ordered
	 */
	protected SolutionTask candidateFirstTask;

	/**
	 * The cached value of the '{@link #getCandidateLastTask() <em>Candidate Last Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateLastTask()
	 * @generated
	 * @ordered
	 */
	protected SolutionTask candidateLastTask;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceExpression> expressions;

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
	protected SolutionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SOLUTION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_RESOURCE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(EObject newResource) {
		EObject oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_RESOURCE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionTask> getScheduledTasks() {
		if (scheduledTasks == null) {
			scheduledTasks = new EObjectWithInverseResolvingEList<SolutionTask>(SolutionTask.class, this, SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS, SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE);
		}
		return scheduledTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionTask> getCandidateScheduledTasks() {
		if (candidateScheduledTasks == null) {
			candidateScheduledTasks = new EObjectWithInverseResolvingEList<SolutionTask>(SolutionTask.class, this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS, SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE);
		}
		return candidateScheduledTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask getCandidateFirstTask() {
		if (candidateFirstTask != null && candidateFirstTask.eIsProxy()) {
			InternalEObject oldCandidateFirstTask = (InternalEObject)candidateFirstTask;
			candidateFirstTask = (SolutionTask)eResolveProxy(oldCandidateFirstTask);
			if (candidateFirstTask != oldCandidateFirstTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK, oldCandidateFirstTask, candidateFirstTask));
			}
		}
		return candidateFirstTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask basicGetCandidateFirstTask() {
		return candidateFirstTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCandidateFirstTask(SolutionTask newCandidateFirstTask, NotificationChain msgs) {
		SolutionTask oldCandidateFirstTask = candidateFirstTask;
		candidateFirstTask = newCandidateFirstTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK, oldCandidateFirstTask, newCandidateFirstTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateFirstTask(SolutionTask newCandidateFirstTask) {
		if (newCandidateFirstTask != candidateFirstTask) {
			NotificationChain msgs = null;
			if (candidateFirstTask != null)
				msgs = ((InternalEObject)candidateFirstTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK, SolutionTask.class, msgs);
			if (newCandidateFirstTask != null)
				msgs = ((InternalEObject)newCandidateFirstTask).eInverseAdd(this, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK, SolutionTask.class, msgs);
			msgs = basicSetCandidateFirstTask(newCandidateFirstTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK, newCandidateFirstTask, newCandidateFirstTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask getCandidateLastTask() {
		if (candidateLastTask != null && candidateLastTask.eIsProxy()) {
			InternalEObject oldCandidateLastTask = (InternalEObject)candidateLastTask;
			candidateLastTask = (SolutionTask)eResolveProxy(oldCandidateLastTask);
			if (candidateLastTask != oldCandidateLastTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK, oldCandidateLastTask, candidateLastTask));
			}
		}
		return candidateLastTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTask basicGetCandidateLastTask() {
		return candidateLastTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCandidateLastTask(SolutionTask newCandidateLastTask, NotificationChain msgs) {
		SolutionTask oldCandidateLastTask = candidateLastTask;
		candidateLastTask = newCandidateLastTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK, oldCandidateLastTask, newCandidateLastTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateLastTask(SolutionTask newCandidateLastTask) {
		if (newCandidateLastTask != candidateLastTask) {
			NotificationChain msgs = null;
			if (candidateLastTask != null)
				msgs = ((InternalEObject)candidateLastTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK, SolutionTask.class, msgs);
			if (newCandidateLastTask != null)
				msgs = ((InternalEObject)newCandidateLastTask).eInverseAdd(this, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK, SolutionTask.class, msgs);
			msgs = basicSetCandidateLastTask(newCandidateLastTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK, newCandidateLastTask, newCandidateLastTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentWithInverseEList<ResourceExpression>(ResourceExpression.class, this, SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS, SchedulerPackage.RESOURCE_EXPRESSION__RESOURCE);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		Solution solution = this.getSolution();
		String description = String.format("sol %d, resource %s", solution.getSolutionNr(), this.getName());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSolution() {
		if (eContainerFeatureID() != SchedulerPackage.SOLUTION_RESOURCE__SOLUTION) return null;
		return (Solution)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolution(Solution newSolution, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSolution, SchedulerPackage.SOLUTION_RESOURCE__SOLUTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(Solution newSolution) {
		if (newSolution != eInternalContainer() || (eContainerFeatureID() != SchedulerPackage.SOLUTION_RESOURCE__SOLUTION && newSolution != null)) {
			if (EcoreUtil.isAncestor(this, newSolution))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSolution != null)
				msgs = ((InternalEObject)newSolution).eInverseAdd(this, SchedulerPackage.SOLUTION__RESOURCES, Solution.class, msgs);
			msgs = basicSetSolution(newSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_RESOURCE__SOLUTION, newSolution, newSolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_RESOURCE__NAME, oldName, name));
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
			case SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledTasks()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCandidateScheduledTasks()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK:
				if (candidateFirstTask != null)
					msgs = ((InternalEObject)candidateFirstTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK, SolutionTask.class, msgs);
				return basicSetCandidateFirstTask((SolutionTask)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK:
				if (candidateLastTask != null)
					msgs = ((InternalEObject)candidateLastTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK, SolutionTask.class, msgs);
				return basicSetCandidateLastTask((SolutionTask)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpressions()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
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
			case SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS:
				return ((InternalEList<?>)getScheduledTasks()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS:
				return ((InternalEList<?>)getCandidateScheduledTasks()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK:
				return basicSetCandidateFirstTask(null, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK:
				return basicSetCandidateLastTask(null, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
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
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
				return eInternalContainer().eInverseRemove(this, SchedulerPackage.SOLUTION__RESOURCES, Solution.class, msgs);
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
			case SchedulerPackage.SOLUTION_RESOURCE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS:
				return getScheduledTasks();
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS:
				return getCandidateScheduledTasks();
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK:
				if (resolve) return getCandidateFirstTask();
				return basicGetCandidateFirstTask();
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK:
				if (resolve) return getCandidateLastTask();
				return basicGetCandidateLastTask();
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				return getExpressions();
			case SchedulerPackage.SOLUTION_RESOURCE__DESCRIPTION:
				return getDescription();
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
				return getSolution();
			case SchedulerPackage.SOLUTION_RESOURCE__NAME:
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
			case SchedulerPackage.SOLUTION_RESOURCE__RESOURCE:
				setResource((EObject)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS:
				getScheduledTasks().clear();
				getScheduledTasks().addAll((Collection<? extends SolutionTask>)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS:
				getCandidateScheduledTasks().clear();
				getCandidateScheduledTasks().addAll((Collection<? extends SolutionTask>)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK:
				setCandidateFirstTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK:
				setCandidateLastTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends ResourceExpression>)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
				setSolution((Solution)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__NAME:
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
			case SchedulerPackage.SOLUTION_RESOURCE__RESOURCE:
				setResource((EObject)null);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS:
				getScheduledTasks().clear();
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS:
				getCandidateScheduledTasks().clear();
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK:
				setCandidateFirstTask((SolutionTask)null);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK:
				setCandidateLastTask((SolutionTask)null);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				getExpressions().clear();
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
				setSolution((Solution)null);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__NAME:
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
			case SchedulerPackage.SOLUTION_RESOURCE__RESOURCE:
				return resource != null;
			case SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS:
				return scheduledTasks != null && !scheduledTasks.isEmpty();
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS:
				return candidateScheduledTasks != null && !candidateScheduledTasks.isEmpty();
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK:
				return candidateFirstTask != null;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK:
				return candidateLastTask != null;
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case SchedulerPackage.SOLUTION_RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
				return getSolution() != null;
			case SchedulerPackage.SOLUTION_RESOURCE__NAME:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SolutionResourceImpl
