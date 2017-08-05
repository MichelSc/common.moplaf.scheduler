/**
 */
package com.misc.common.moplaf.scheduler.provider;


import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.propagator2.provider.ObjectWithPropagatorFunctionsItemProvider;

import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.TaskExpression;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.scheduler.TaskExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskExpressionItemProvider extends ObjectWithPropagatorFunctionsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addRolePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_TaskExpression_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskExpression_Description_feature", "_UI_TaskExpression_type"),
				 SchedulerPackage.Literals.TASK_EXPRESSION__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskExpression_Role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskExpression_Role_feature", "_UI_TaskExpression_type"),
				 SchedulerPackage.Literals.TASK_EXPRESSION__ROLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TaskExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskExpression)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskExpression_type") :
			getString("_UI_TaskExpression_type") + " " + label;
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

		switch (notification.getFeatureID(TaskExpression.class)) {
			case SchedulerPackage.TASK_EXPRESSION__DESCRIPTION:
			case SchedulerPackage.TASK_EXPRESSION__ROLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createSolutionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createCalcSolutionAllExpressionCandidateValues()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createResetSolutionAllExpressionCandidateValues()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createSolutionExpressionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createResetSolutionExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createResourceExpressionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createCalcResourceExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createResetResourceExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createTaskExpressionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createCalcTaskExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createResetTaskExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createCalcSolutionExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 SchedulerFactory.eINSTANCE.createCalcTaksExpressionCandidateValueCumulative()));
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
