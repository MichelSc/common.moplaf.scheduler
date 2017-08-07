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
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.CalcSolutionAllExpressionCandidateValues} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcSolutionAllExpressionCandidateValuesItemProvider calcSolutionAllExpressionCandidateValuesItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.CalcSolutionAllExpressionCandidateValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalcSolutionAllExpressionCandidateValuesAdapter() {
		if (calcSolutionAllExpressionCandidateValuesItemProvider == null) {
			calcSolutionAllExpressionCandidateValuesItemProvider = new CalcSolutionAllExpressionCandidateValuesItemProvider(this);
		}

		return calcSolutionAllExpressionCandidateValuesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.ResetSolutionAllExpressionCandidateValues} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetSolutionAllExpressionCandidateValuesItemProvider resetSolutionAllExpressionCandidateValuesItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.ResetSolutionAllExpressionCandidateValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResetSolutionAllExpressionCandidateValuesAdapter() {
		if (resetSolutionAllExpressionCandidateValuesItemProvider == null) {
			resetSolutionAllExpressionCandidateValuesItemProvider = new ResetSolutionAllExpressionCandidateValuesItemProvider(this);
		}

		return resetSolutionAllExpressionCandidateValuesItemProvider;
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
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.ResetSolutionExpressionCandidateValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetSolutionExpressionCandidateValueItemProvider resetSolutionExpressionCandidateValueItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.ResetSolutionExpressionCandidateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResetSolutionExpressionCandidateValueAdapter() {
		if (resetSolutionExpressionCandidateValueItemProvider == null) {
			resetSolutionExpressionCandidateValueItemProvider = new ResetSolutionExpressionCandidateValueItemProvider(this);
		}

		return resetSolutionExpressionCandidateValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.CalcResourceExpressionCandidateValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcResourceExpressionCandidateValueItemProvider calcResourceExpressionCandidateValueItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.CalcResourceExpressionCandidateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalcResourceExpressionCandidateValueAdapter() {
		if (calcResourceExpressionCandidateValueItemProvider == null) {
			calcResourceExpressionCandidateValueItemProvider = new CalcResourceExpressionCandidateValueItemProvider(this);
		}

		return calcResourceExpressionCandidateValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.ResetResourceExpressionCandidateValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetResourceExpressionCandidateValueItemProvider resetResourceExpressionCandidateValueItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.ResetResourceExpressionCandidateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResetResourceExpressionCandidateValueAdapter() {
		if (resetResourceExpressionCandidateValueItemProvider == null) {
			resetResourceExpressionCandidateValueItemProvider = new ResetResourceExpressionCandidateValueItemProvider(this);
		}

		return resetResourceExpressionCandidateValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.CalcTaskExpressionCandidateValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskExpressionCandidateValueItemProvider calcTaskExpressionCandidateValueItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.CalcTaskExpressionCandidateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalcTaskExpressionCandidateValueAdapter() {
		if (calcTaskExpressionCandidateValueItemProvider == null) {
			calcTaskExpressionCandidateValueItemProvider = new CalcTaskExpressionCandidateValueItemProvider(this);
		}

		return calcTaskExpressionCandidateValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.ResetTaskExpressionCandidateValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetTaskExpressionCandidateValueItemProvider resetTaskExpressionCandidateValueItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.ResetTaskExpressionCandidateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResetTaskExpressionCandidateValueAdapter() {
		if (resetTaskExpressionCandidateValueItemProvider == null) {
			resetTaskExpressionCandidateValueItemProvider = new ResetTaskExpressionCandidateValueItemProvider(this);
		}

		return resetTaskExpressionCandidateValueItemProvider;
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
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.CalcSolutionExpressionCandidateValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcSolutionExpressionCandidateValueItemProvider calcSolutionExpressionCandidateValueItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.CalcSolutionExpressionCandidateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalcSolutionExpressionCandidateValueAdapter() {
		if (calcSolutionExpressionCandidateValueItemProvider == null) {
			calcSolutionExpressionCandidateValueItemProvider = new CalcSolutionExpressionCandidateValueItemProvider(this);
		}

		return calcSolutionExpressionCandidateValueItemProvider;
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
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.schedulercalc.CalcTaksExpressionCandidateValueCumulative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaksExpressionCandidateValueCumulativeItemProvider calcTaksExpressionCandidateValueCumulativeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.schedulercalc.CalcTaksExpressionCandidateValueCumulative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalcTaksExpressionCandidateValueCumulativeAdapter() {
		if (calcTaksExpressionCandidateValueCumulativeItemProvider == null) {
			calcTaksExpressionCandidateValueCumulativeItemProvider = new CalcTaksExpressionCandidateValueCumulativeItemProvider(this);
		}

		return calcTaksExpressionCandidateValueCumulativeItemProvider;
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
		if (calcSolutionAllExpressionCandidateValuesItemProvider != null) calcSolutionAllExpressionCandidateValuesItemProvider.dispose();
		if (resetSolutionAllExpressionCandidateValuesItemProvider != null) resetSolutionAllExpressionCandidateValuesItemProvider.dispose();
		if (solutionExpressionPropagatorFunctionItemProvider != null) solutionExpressionPropagatorFunctionItemProvider.dispose();
		if (resetSolutionExpressionCandidateValueItemProvider != null) resetSolutionExpressionCandidateValueItemProvider.dispose();
		if (calcResourceExpressionCandidateValueItemProvider != null) calcResourceExpressionCandidateValueItemProvider.dispose();
		if (resetResourceExpressionCandidateValueItemProvider != null) resetResourceExpressionCandidateValueItemProvider.dispose();
		if (calcTaskExpressionCandidateValueItemProvider != null) calcTaskExpressionCandidateValueItemProvider.dispose();
		if (resetTaskExpressionCandidateValueItemProvider != null) resetTaskExpressionCandidateValueItemProvider.dispose();
		if (resourceExpressionPropagatorFunctionItemProvider != null) resourceExpressionPropagatorFunctionItemProvider.dispose();
		if (calcSolutionExpressionCandidateValueItemProvider != null) calcSolutionExpressionCandidateValueItemProvider.dispose();
		if (taskExpressionPropagatorFunctionItemProvider != null) taskExpressionPropagatorFunctionItemProvider.dispose();
		if (solutionPropagatorFunctionItemProvider != null) solutionPropagatorFunctionItemProvider.dispose();
		if (calcTaksExpressionCandidateValueCumulativeItemProvider != null) calcTaksExpressionCandidateValueCumulativeItemProvider.dispose();
	}

}
