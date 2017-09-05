/**
 */
package com.misc.common.moplaf.schedulercalc.provider;

import com.misc.common.moplaf.schedulercalc.util.SchedulerCalcAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulerCalcItemProviderAdapterFactory extends SchedulerCalcAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerCalcItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionPropagatorFunctionItemProvider solutionPropagatorFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionPropagatorFunctionAdapter() {
		if (solutionPropagatorFunctionItemProvider == null) {
			solutionPropagatorFunctionItemProvider = new SolutionPropagatorFunctionItemProvider(this);
		}

		return solutionPropagatorFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionExpressionPropagatorFunctionItemProvider solutionExpressionPropagatorFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionExpressionPropagatorFunctionAdapter() {
		if (solutionExpressionPropagatorFunctionItemProvider == null) {
			solutionExpressionPropagatorFunctionItemProvider = new SolutionExpressionPropagatorFunctionItemProvider(this);
		}

		return solutionExpressionPropagatorFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePropagatorFunctionItemProvider resourcePropagatorFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourcePropagatorFunctionAdapter() {
		if (resourcePropagatorFunctionItemProvider == null) {
			resourcePropagatorFunctionItemProvider = new ResourcePropagatorFunctionItemProvider(this);
		}

		return resourcePropagatorFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.CandidateExpressionPropagatorFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateExpressionPropagatorFunctionItemProvider candidateExpressionPropagatorFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.CandidateExpressionPropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCandidateExpressionPropagatorFunctionAdapter() {
		if (candidateExpressionPropagatorFunctionItemProvider == null) {
			candidateExpressionPropagatorFunctionItemProvider = new CandidateExpressionPropagatorFunctionItemProvider(this);
		}

		return candidateExpressionPropagatorFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.ResourceExpressionPropagatorFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceExpressionPropagatorFunctionItemProvider resourceExpressionPropagatorFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.ResourceExpressionPropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceExpressionPropagatorFunctionAdapter() {
		if (resourceExpressionPropagatorFunctionItemProvider == null) {
			resourceExpressionPropagatorFunctionItemProvider = new ResourceExpressionPropagatorFunctionItemProvider(this);
		}

		return resourceExpressionPropagatorFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskPropagatorFunctionItemProvider taskPropagatorFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskPropagatorFunctionAdapter() {
		if (taskPropagatorFunctionItemProvider == null) {
			taskPropagatorFunctionItemProvider = new TaskPropagatorFunctionItemProvider(this);
		}

		return taskPropagatorFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.TaskExpressionPropagatorFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskExpressionPropagatorFunctionItemProvider taskExpressionPropagatorFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.TaskExpressionPropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskExpressionPropagatorFunctionAdapter() {
		if (taskExpressionPropagatorFunctionItemProvider == null) {
			taskExpressionPropagatorFunctionItemProvider = new TaskExpressionPropagatorFunctionItemProvider(this);
		}

		return taskExpressionPropagatorFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SetScheduleScope} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetScheduleScopeItemProvider setScheduleScopeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SetScheduleScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetScheduleScopeAdapter() {
		if (setScheduleScopeItemProvider == null) {
			setScheduleScopeItemProvider = new SetScheduleScopeItemProvider(this);
		}

		return setScheduleScopeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SetTaskSchedule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTaskScheduleItemProvider setTaskScheduleItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SetTaskSchedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetTaskScheduleAdapter() {
		if (setTaskScheduleItemProvider == null) {
			setTaskScheduleItemProvider = new SetTaskScheduleItemProvider(this);
		}

		return setTaskScheduleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SetExpressionCandidateValueScope} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetExpressionCandidateValueScopeItemProvider setExpressionCandidateValueScopeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SetExpressionCandidateValueScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetExpressionCandidateValueScopeAdapter() {
		if (setExpressionCandidateValueScopeItemProvider == null) {
			setExpressionCandidateValueScopeItemProvider = new SetExpressionCandidateValueScopeItemProvider(this);
		}

		return setExpressionCandidateValueScopeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SetTaskExpressionCandidateValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTaskExpressionCandidateValueItemProvider setTaskExpressionCandidateValueItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SetTaskExpressionCandidateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetTaskExpressionCandidateValueAdapter() {
		if (setTaskExpressionCandidateValueItemProvider == null) {
			setTaskExpressionCandidateValueItemProvider = new SetTaskExpressionCandidateValueItemProvider(this);
		}

		return setTaskExpressionCandidateValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SetSolutionExpressionCandidateValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetSolutionExpressionCandidateValueItemProvider setSolutionExpressionCandidateValueItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SetSolutionExpressionCandidateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetSolutionExpressionCandidateValueAdapter() {
		if (setSolutionExpressionCandidateValueItemProvider == null) {
			setSolutionExpressionCandidateValueItemProvider = new SetSolutionExpressionCandidateValueItemProvider(this);
		}

		return setSolutionExpressionCandidateValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SetResourceExpressionCandidateValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetResourceExpressionCandidateValueItemProvider setResourceExpressionCandidateValueItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SetResourceExpressionCandidateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetResourceExpressionCandidateValueAdapter() {
		if (setResourceExpressionCandidateValueItemProvider == null) {
			setResourceExpressionCandidateValueItemProvider = new SetResourceExpressionCandidateValueItemProvider(this);
		}

		return setResourceExpressionCandidateValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SetResourceSchedule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetResourceScheduleItemProvider setResourceScheduleItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SetResourceSchedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetResourceScheduleAdapter() {
		if (setResourceScheduleItemProvider == null) {
			setResourceScheduleItemProvider = new SetResourceScheduleItemProvider(this);
		}

		return setResourceScheduleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SetExpressionSchedule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetExpressionScheduleItemProvider setExpressionScheduleItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SetExpressionSchedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetExpressionScheduleAdapter() {
		if (setExpressionScheduleItemProvider == null) {
			setExpressionScheduleItemProvider = new SetExpressionScheduleItemProvider(this);
		}

		return setExpressionScheduleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.SetFloatExpressionSchedule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetFloatExpressionScheduleItemProvider setFloatExpressionScheduleItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.SetFloatExpressionSchedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetFloatExpressionScheduleAdapter() {
		if (setFloatExpressionScheduleItemProvider == null) {
			setFloatExpressionScheduleItemProvider = new SetFloatExpressionScheduleItemProvider(this);
		}

		return setFloatExpressionScheduleItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (solutionPropagatorFunctionItemProvider != null) solutionPropagatorFunctionItemProvider.dispose();
		if (solutionExpressionPropagatorFunctionItemProvider != null) solutionExpressionPropagatorFunctionItemProvider.dispose();
		if (resourcePropagatorFunctionItemProvider != null) resourcePropagatorFunctionItemProvider.dispose();
		if (candidateExpressionPropagatorFunctionItemProvider != null) candidateExpressionPropagatorFunctionItemProvider.dispose();
		if (resourceExpressionPropagatorFunctionItemProvider != null) resourceExpressionPropagatorFunctionItemProvider.dispose();
		if (taskPropagatorFunctionItemProvider != null) taskPropagatorFunctionItemProvider.dispose();
		if (taskExpressionPropagatorFunctionItemProvider != null) taskExpressionPropagatorFunctionItemProvider.dispose();
		if (setScheduleScopeItemProvider != null) setScheduleScopeItemProvider.dispose();
		if (setTaskScheduleItemProvider != null) setTaskScheduleItemProvider.dispose();
		if (setExpressionCandidateValueScopeItemProvider != null) setExpressionCandidateValueScopeItemProvider.dispose();
		if (setTaskExpressionCandidateValueItemProvider != null) setTaskExpressionCandidateValueItemProvider.dispose();
		if (setSolutionExpressionCandidateValueItemProvider != null) setSolutionExpressionCandidateValueItemProvider.dispose();
		if (setResourceExpressionCandidateValueItemProvider != null) setResourceExpressionCandidateValueItemProvider.dispose();
		if (setResourceScheduleItemProvider != null) setResourceScheduleItemProvider.dispose();
		if (setExpressionScheduleItemProvider != null) setExpressionScheduleItemProvider.dispose();
		if (setFloatExpressionScheduleItemProvider != null) setFloatExpressionScheduleItemProvider.dispose();
	}

}
