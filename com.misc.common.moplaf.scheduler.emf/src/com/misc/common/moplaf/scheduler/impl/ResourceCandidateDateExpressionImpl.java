/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ResourceCandidateDateExpression;
import com.misc.common.moplaf.scheduler.ResourceExpression;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Candidate Date Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ResourceCandidateDateExpressionImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceCandidateDateExpressionImpl extends CandidateDateExpressionImpl implements ResourceCandidateDateExpression {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected SolutionResource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceCandidateDateExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.RESOURCE_CANDIDATE_DATE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (SolutionResource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.RESOURCE_CANDIDATE_DATE_EXPRESSION__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionResource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(SolutionResource newResource) {
		SolutionResource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.RESOURCE_CANDIDATE_DATE_EXPRESSION__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.RESOURCE_CANDIDATE_DATE_EXPRESSION__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case SchedulerPackage.RESOURCE_CANDIDATE_DATE_EXPRESSION__RESOURCE:
				setResource((SolutionResource)newValue);
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
			case SchedulerPackage.RESOURCE_CANDIDATE_DATE_EXPRESSION__RESOURCE:
				setResource((SolutionResource)null);
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
			case SchedulerPackage.RESOURCE_CANDIDATE_DATE_EXPRESSION__RESOURCE:
				return resource != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceExpression.class) {
			switch (derivedFeatureID) {
				case SchedulerPackage.RESOURCE_CANDIDATE_DATE_EXPRESSION__RESOURCE: return SchedulerPackage.RESOURCE_EXPRESSION__RESOURCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceExpression.class) {
			switch (baseFeatureID) {
				case SchedulerPackage.RESOURCE_EXPRESSION__RESOURCE: return SchedulerPackage.RESOURCE_CANDIDATE_DATE_EXPRESSION__RESOURCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	/**
	 * 
	 */
	@Override
	public String getOwner() {
		return this.getResource().getName();
	}


} //ResourceCandidateDateExpressionImpl
