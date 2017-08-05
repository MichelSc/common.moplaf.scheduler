/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.ResourceExpression;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionResourceImpl extends MinimalEObjectImpl.Container implements SolutionResource {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

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
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
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
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
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
		Resource resource = this.getResource();
		String description = String.format("sol %d, resource %s", solution.getSolutionNr(), resource.getName());
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledTasks()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCandidateScheduledTasks()).basicAdd(otherEnd, msgs);
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
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				return getExpressions();
			case SchedulerPackage.SOLUTION_RESOURCE__DESCRIPTION:
				return getDescription();
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
				return getSolution();
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
				setResource((Resource)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS:
				getScheduledTasks().clear();
				getScheduledTasks().addAll((Collection<? extends SolutionTask>)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS:
				getCandidateScheduledTasks().clear();
				getCandidateScheduledTasks().addAll((Collection<? extends SolutionTask>)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends ResourceExpression>)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
				setSolution((Solution)newValue);
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
				setResource((Resource)null);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS:
				getScheduledTasks().clear();
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS:
				getCandidateScheduledTasks().clear();
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				getExpressions().clear();
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
				setSolution((Solution)null);
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
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case SchedulerPackage.SOLUTION_RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SchedulerPackage.SOLUTION_RESOURCE__SOLUTION:
				return getSolution() != null;
		}
		return super.eIsSet(featureID);
	}

} //SolutionResourceImpl
