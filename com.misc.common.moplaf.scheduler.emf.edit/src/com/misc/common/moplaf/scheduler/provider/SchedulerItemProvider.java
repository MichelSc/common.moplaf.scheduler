/**
 */
package com.misc.common.moplaf.scheduler.provider;




import com.misc.common.moplaf.propagator2.PropagatorFactory;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.SchedulerPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.scheduler.Scheduler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulerItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addCurrentSolutionntrPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Scheduler_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scheduler_Name_feature", "_UI_Scheduler_type"),
				 SchedulerPackage.Literals.SCHEDULER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Solutionntr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentSolutionntrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scheduler_CurrentSolutionntr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scheduler_CurrentSolutionntr_feature", "_UI_Scheduler_type"),
				 SchedulerPackage.Literals.SCHEDULER__CURRENT_SOLUTIONNTR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
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
			childrenFeatures.add(SchedulerPackage.Literals.SCHEDULER__SOLUTIONS);
			childrenFeatures.add(SchedulerPackage.Literals.SCHEDULER__TASKS);
			childrenFeatures.add(SchedulerPackage.Literals.SCHEDULER__RESOURCES);
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
	 * This returns Scheduler.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scheduler"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Scheduler)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Scheduler_type") :
			getString("_UI_Scheduler_type") + " " + label;
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

		switch (notification.getFeatureID(Scheduler.class)) {
			case SchedulerPackage.SCHEDULER__NAME:
			case SchedulerPackage.SCHEDULER__CURRENT_SOLUTIONNTR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SchedulerPackage.SCHEDULER__SOLUTIONS:
			case SchedulerPackage.SCHEDULER__TASKS:
			case SchedulerPackage.SCHEDULER__RESOURCES:
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

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__SOLUTIONS,
				 SchedulerFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createSolutionResource()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createSolutionTask()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createMove()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createSolutionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createCalcSolutionAllExpressionCandidateValues()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createResetSolutionAllExpressionCandidateValues()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createSolutionExpressionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createResetSolutionExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createResourceExpressionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createCalcResourceExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createResetResourceExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createTaskExpressionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createCalcTaskExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createResetTaskExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createTaskFloatExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createScheduleAfter()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createScheduleBefore()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createScheduleFirst()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createScheduleLast()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createUnschedule()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createCalcSolutionExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 SchedulerFactory.eINSTANCE.createCalcTaksExpressionCandidateValueCumulative()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 PropagatorFactory.eINSTANCE.createObjectWithPropagatorFunctions()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 PropagatorFactory.eINSTANCE.createPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__TASKS,
				 PropagatorFactory.eINSTANCE.createPropagatorFunctionBindings()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createSolutionResource()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createSolutionTask()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createMove()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createSolutionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createCalcSolutionAllExpressionCandidateValues()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createResetSolutionAllExpressionCandidateValues()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createSolutionExpressionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createResetSolutionExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createResourceExpressionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createCalcResourceExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createResetResourceExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createTaskExpressionPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createCalcTaskExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createResetTaskExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createTaskFloatExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createScheduleAfter()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createScheduleBefore()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createScheduleFirst()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createScheduleLast()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createUnschedule()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createCalcSolutionExpressionCandidateValue()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 SchedulerFactory.eINSTANCE.createCalcTaksExpressionCandidateValueCumulative()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 PropagatorFactory.eINSTANCE.createObjectWithPropagatorFunctions()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 PropagatorFactory.eINSTANCE.createPropagatorFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SCHEDULER__RESOURCES,
				 PropagatorFactory.eINSTANCE.createPropagatorFunctionBindings()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SchedulerPackage.Literals.SCHEDULER__SOLUTIONS ||
			childFeature == SchedulerPackage.Literals.SCHEDULER__TASKS ||
			childFeature == SchedulerPackage.Literals.SCHEDULER__RESOURCES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
