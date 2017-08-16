/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.common.moplaf.scheduler.CandidateValueExpression;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getNrCandidateScheduledTasks <em>Nr Candidate Scheduled Tasks</em>}</li>
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
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<CandidateValueExpression> expressions;

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
	 * The default value of the '{@link #getNrCandidateScheduledTasks() <em>Nr Candidate Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrCandidateScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_CANDIDATE_SCHEDULED_TASKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrCandidateScheduledTasks() <em>Nr Candidate Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrCandidateScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected int nrCandidateScheduledTasks = NR_CANDIDATE_SCHEDULED_TASKS_EDEFAULT;

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
	 */
	public EList<SolutionTask> getScheduledTasks() {
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<SolutionTask> tasks = new EObjectEList<SolutionTask>(SolutionResource.class, 
													               this, 
													               SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS);
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<SolutionTask> getCandidateScheduledTasks() {
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<SolutionTask> tasks = new EObjectEList<SolutionTask>(SolutionResource.class, 
													               this, 
													               SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS);
		SolutionTask task = this.getCandidateFirstTask();
		while ( task!=null) {
			tasks.add(task);
			task = task.getCandidateNextTask();
		}
		return tasks;
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
	public EList<CandidateValueExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectResolvingEList<CandidateValueExpression>(CandidateValueExpression.class, this, SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_RESOURCE__NR_SCHEDULED_TASKS, oldNrScheduledTasks, nrScheduledTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrCandidateScheduledTasks() {
		return nrCandidateScheduledTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrCandidateScheduledTasks(int newNrCandidateScheduledTasks) {
		int oldNrCandidateScheduledTasks = nrCandidateScheduledTasks;
		nrCandidateScheduledTasks = newNrCandidateScheduledTasks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SOLUTION_RESOURCE__NR_CANDIDATE_SCHEDULED_TASKS, oldNrCandidateScheduledTasks, nrCandidateScheduledTasks));
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
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK:
				if (candidateFirstTask != null)
					msgs = ((InternalEObject)candidateFirstTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK, SolutionTask.class, msgs);
				return basicSetCandidateFirstTask((SolutionTask)otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK:
				if (candidateLastTask != null)
					msgs = ((InternalEObject)candidateLastTask).eInverseRemove(this, SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK, SolutionTask.class, msgs);
				return basicSetCandidateLastTask((SolutionTask)otherEnd, msgs);
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
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK:
				return basicSetCandidateFirstTask(null, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK:
				return basicSetCandidateLastTask(null, msgs);
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
			case SchedulerPackage.SOLUTION_RESOURCE__NR_SCHEDULED_TASKS:
				return getNrScheduledTasks();
			case SchedulerPackage.SOLUTION_RESOURCE__NR_CANDIDATE_SCHEDULED_TASKS:
				return getNrCandidateScheduledTasks();
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
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK:
				setCandidateFirstTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK:
				setCandidateLastTask((SolutionTask)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends CandidateValueExpression>)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
				setSolution((Solution)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__NR_SCHEDULED_TASKS:
				setNrScheduledTasks((Integer)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__NR_CANDIDATE_SCHEDULED_TASKS:
				setNrCandidateScheduledTasks((Integer)newValue);
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
			case SchedulerPackage.SOLUTION_RESOURCE__NR_SCHEDULED_TASKS:
				setNrScheduledTasks(NR_SCHEDULED_TASKS_EDEFAULT);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__NR_CANDIDATE_SCHEDULED_TASKS:
				setNrCandidateScheduledTasks(NR_CANDIDATE_SCHEDULED_TASKS_EDEFAULT);
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
				return !getScheduledTasks().isEmpty();
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS:
				return !getCandidateScheduledTasks().isEmpty();
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
			case SchedulerPackage.SOLUTION_RESOURCE__NR_SCHEDULED_TASKS:
				return nrScheduledTasks != NR_SCHEDULED_TASKS_EDEFAULT;
			case SchedulerPackage.SOLUTION_RESOURCE__NR_CANDIDATE_SCHEDULED_TASKS:
				return nrCandidateScheduledTasks != NR_CANDIDATE_SCHEDULED_TASKS_EDEFAULT;
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
			case SchedulerPackage.SOLUTION_RESOURCE___CONSTRUCT_EXPRESSIONS:
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
		result.append(", NrScheduledTasks: ");
		result.append(nrScheduledTasks);
		result.append(", NrCandidateScheduledTasks: ");
		result.append(nrCandidateScheduledTasks);
		result.append(')');
		return result.toString();
	}

} //SolutionResourceImpl
