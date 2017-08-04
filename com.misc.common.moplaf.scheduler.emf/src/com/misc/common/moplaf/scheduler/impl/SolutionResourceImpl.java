/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.ResourceExpression;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getAssignedTasks <em>Assigned Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getCandidateAssignedTasks <em>Candidate Assigned Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl#getExpressions <em>Expressions</em>}</li>
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
	 * The cached value of the '{@link #getAssignedTasks() <em>Assigned Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionTask> assignedTasks;

	/**
	 * The cached value of the '{@link #getCandidateAssignedTasks() <em>Candidate Assigned Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateAssignedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionTask> candidateAssignedTasks;

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
	public EList<SolutionTask> getAssignedTasks() {
		if (assignedTasks == null) {
			assignedTasks = new EObjectWithInverseResolvingEList<SolutionTask>(SolutionTask.class, this, SchedulerPackage.SOLUTION_RESOURCE__ASSIGNED_TASKS, SchedulerPackage.SOLUTION_TASK__ASSIGNED_RESOURCE);
		}
		return assignedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionTask> getCandidateAssignedTasks() {
		if (candidateAssignedTasks == null) {
			candidateAssignedTasks = new EObjectWithInverseResolvingEList<SolutionTask>(SolutionTask.class, this, SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS, SchedulerPackage.SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE);
		}
		return candidateAssignedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<ResourceExpression>(ResourceExpression.class, this, SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS);
		}
		return expressions;
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
			case SchedulerPackage.SOLUTION_RESOURCE__ASSIGNED_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedTasks()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCandidateAssignedTasks()).basicAdd(otherEnd, msgs);
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
			case SchedulerPackage.SOLUTION_RESOURCE__ASSIGNED_TASKS:
				return ((InternalEList<?>)getAssignedTasks()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS:
				return ((InternalEList<?>)getCandidateAssignedTasks()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
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
			case SchedulerPackage.SOLUTION_RESOURCE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case SchedulerPackage.SOLUTION_RESOURCE__ASSIGNED_TASKS:
				return getAssignedTasks();
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS:
				return getCandidateAssignedTasks();
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
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
			case SchedulerPackage.SOLUTION_RESOURCE__RESOURCE:
				setResource((Resource)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__ASSIGNED_TASKS:
				getAssignedTasks().clear();
				getAssignedTasks().addAll((Collection<? extends SolutionTask>)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS:
				getCandidateAssignedTasks().clear();
				getCandidateAssignedTasks().addAll((Collection<? extends SolutionTask>)newValue);
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends ResourceExpression>)newValue);
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
			case SchedulerPackage.SOLUTION_RESOURCE__ASSIGNED_TASKS:
				getAssignedTasks().clear();
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS:
				getCandidateAssignedTasks().clear();
				return;
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
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
			case SchedulerPackage.SOLUTION_RESOURCE__RESOURCE:
				return resource != null;
			case SchedulerPackage.SOLUTION_RESOURCE__ASSIGNED_TASKS:
				return assignedTasks != null && !assignedTasks.isEmpty();
			case SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS:
				return candidateAssignedTasks != null && !candidateAssignedTasks.isEmpty();
			case SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolutionResourceImpl
