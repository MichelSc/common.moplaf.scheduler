/**
 */
package com.misc.common.moplaf.scheduler.provider;


import com.misc.common.moplaf.propagator2.provider.ObjectWithPropagatorFunctionsItemProvider;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.schedulercalc.provider.SchedulerEditPlugin;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.scheduler.SolutionTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionTaskItemProvider 
	extends ObjectWithPropagatorFunctionsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTaskItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTaskPropertyDescriptor(object);
			addNextTaskPropertyDescriptor(object);
			addPreviousTaskPropertyDescriptor(object);
			addScheduledResourcePropertyDescriptor(object);
			addCandidateNextTaskPropertyDescriptor(object);
			addCandidatePreviousTaskPropertyDescriptor(object);
			addResourceAsCandidateFirstTaskPropertyDescriptor(object);
			addResourceAsCandidateLastTaskPropertyDescriptor(object);
			addCandidateScheduledResourcePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_Task_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_Task_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__TASK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_NextTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_NextTask_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__NEXT_TASK,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__30SolutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_PreviousTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_PreviousTask_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__PREVIOUS_TASK,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__30SolutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Scheduled Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduledResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_ScheduledResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_ScheduledResource_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__SCHEDULED_RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__30SolutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Candidate Scheduled Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCandidateScheduledResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_CandidateScheduledResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_CandidateScheduledResource_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20CandidatePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Candidate Next Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCandidateNextTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_CandidateNextTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_CandidateNextTask_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_NEXT_TASK,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20CandidatePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Candidate Previous Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCandidatePreviousTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_CandidatePreviousTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_CandidatePreviousTask_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20CandidatePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource As Candidate First Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceAsCandidateFirstTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_ResourceAsCandidateFirstTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_ResourceAsCandidateFirstTask_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20CandidatePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource As Candidate Last Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceAsCandidateLastTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_ResourceAsCandidateLastTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_ResourceAsCandidateLastTask_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20CandidatePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_Description_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10SchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionTask_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionTask_Name_feature", "_UI_SolutionTask_type"),
				 SchedulerPackage.Literals.SOLUTION_TASK__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10SchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SchedulerPackage.Literals.SOLUTION_TASK__EXPRESSIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SolutionTask.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SolutionTask"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SolutionTask)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SolutionTask_type") :
			getString("_UI_SolutionTask_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SolutionTask.class)) {
			case SchedulerPackage.SOLUTION_TASK__DESCRIPTION:
			case SchedulerPackage.SOLUTION_TASK__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SchedulerPackage.SOLUTION_TASK__EXPRESSIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SchedulerEditPlugin.INSTANCE;
	}

}
