/**
 */
package com.misc.common.moplaf.schedulercalc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.schedulercalc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage
 * @generated
 */
public class SchedulerCalcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchedulerCalcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerCalcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchedulerCalcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerCalcSwitch<Adapter> modelSwitch =
		new SchedulerCalcSwitch<Adapter>() {
			@Override
			public Adapter caseSolutionPropagatorFunction(SolutionPropagatorFunction object) {
				return createSolutionPropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseSolutionExpressionPropagatorFunction(SolutionExpressionPropagatorFunction object) {
				return createSolutionExpressionPropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseResourcePropagatorFunction(ResourcePropagatorFunction object) {
				return createResourcePropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseResourceExpressionPropagatorFunction(ResourceExpressionPropagatorFunction object) {
				return createResourceExpressionPropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseTaskPropagatorFunction(TaskPropagatorFunction object) {
				return createTaskPropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseTaskExpressionPropagatorFunction(TaskExpressionPropagatorFunction object) {
				return createTaskExpressionPropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseCalcSolutionAllExpressionCandidateValues(CalcSolutionAllExpressionCandidateValues object) {
				return createCalcSolutionAllExpressionCandidateValuesAdapter();
			}
			@Override
			public Adapter caseCalcSolutionExpressionCandidateValue(CalcSolutionExpressionCandidateValue object) {
				return createCalcSolutionExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseCalcResourceExpressionCandidateValue(CalcResourceExpressionCandidateValue object) {
				return createCalcResourceExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseCalcTaskExpressionCandidateValue(CalcTaskExpressionCandidateValue object) {
				return createCalcTaskExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseCalcTaksExpressionCandidateValueCumulative(CalcTaksExpressionCandidateValueCumulative object) {
				return createCalcTaksExpressionCandidateValueCumulativeAdapter();
			}
			@Override
			public Adapter caseResetSolutionAllExpressionCandidateValues(ResetSolutionAllExpressionCandidateValues object) {
				return createResetSolutionAllExpressionCandidateValuesAdapter();
			}
			@Override
			public Adapter caseResetSolutionExpressionCandidateValue(ResetSolutionExpressionCandidateValue object) {
				return createResetSolutionExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseResetResourceExpressionCandidateValue(ResetResourceExpressionCandidateValue object) {
				return createResetResourceExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseResetTaskExpressionCandidateValue(ResetTaskExpressionCandidateValue object) {
				return createResetTaskExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseResetTaskCandidateNext(ResetTaskCandidateNext object) {
				return createResetTaskCandidateNextAdapter();
			}
			@Override
			public Adapter caseResetTaskCandidateScheduledResource(ResetTaskCandidateScheduledResource object) {
				return createResetTaskCandidateScheduledResourceAdapter();
			}
			@Override
			public Adapter caseResetResourceTasksCandidateNext(ResetResourceTasksCandidateNext object) {
				return createResetResourceTasksCandidateNextAdapter();
			}
			@Override
			public Adapter caseResetResourceTasksCandidateScheduledResource(ResetResourceTasksCandidateScheduledResource object) {
				return createResetResourceTasksCandidateScheduledResourceAdapter();
			}
			@Override
			public Adapter caseSetTaskCandidateScheduledResourceScope(SetTaskCandidateScheduledResourceScope object) {
				return createSetTaskCandidateScheduledResourceScopeAdapter();
			}
			@Override
			public Adapter caseSetTaskCandidateScheduledResource(SetTaskCandidateScheduledResource object) {
				return createSetTaskCandidateScheduledResourceAdapter();
			}
			@Override
			public Adapter casePropagatorFunction(PropagatorFunction object) {
				return createPropagatorFunctionAdapter();
			}
			@Override
			public Adapter casePropagatorFunctionBindings(PropagatorFunctionBindings object) {
				return createPropagatorFunctionBindingsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.CalcSolutionAllExpressionCandidateValues <em>Calc Solution All Expression Candidate Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.CalcSolutionAllExpressionCandidateValues
	 * @generated
	 */
	public Adapter createCalcSolutionAllExpressionCandidateValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.ResetSolutionAllExpressionCandidateValues <em>Reset Solution All Expression Candidate Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.ResetSolutionAllExpressionCandidateValues
	 * @generated
	 */
	public Adapter createResetSolutionAllExpressionCandidateValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction <em>Solution Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction
	 * @generated
	 */
	public Adapter createSolutionExpressionPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction <em>Resource Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction
	 * @generated
	 */
	public Adapter createResourcePropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.ResetSolutionExpressionCandidateValue <em>Reset Solution Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.ResetSolutionExpressionCandidateValue
	 * @generated
	 */
	public Adapter createResetSolutionExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.CalcResourceExpressionCandidateValue <em>Calc Resource Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.CalcResourceExpressionCandidateValue
	 * @generated
	 */
	public Adapter createCalcResourceExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.ResetResourceExpressionCandidateValue <em>Reset Resource Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.ResetResourceExpressionCandidateValue
	 * @generated
	 */
	public Adapter createResetResourceExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.CalcTaskExpressionCandidateValue <em>Calc Task Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.CalcTaskExpressionCandidateValue
	 * @generated
	 */
	public Adapter createCalcTaskExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.ResetTaskExpressionCandidateValue <em>Reset Task Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.ResetTaskExpressionCandidateValue
	 * @generated
	 */
	public Adapter createResetTaskExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.ResetTaskCandidateNext <em>Reset Task Candidate Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.ResetTaskCandidateNext
	 * @generated
	 */
	public Adapter createResetTaskCandidateNextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.ResetTaskCandidateScheduledResource <em>Reset Task Candidate Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.ResetTaskCandidateScheduledResource
	 * @generated
	 */
	public Adapter createResetTaskCandidateScheduledResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.ResetResourceTasksCandidateNext <em>Reset Resource Tasks Candidate Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.ResetResourceTasksCandidateNext
	 * @generated
	 */
	public Adapter createResetResourceTasksCandidateNextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.ResetResourceTasksCandidateScheduledResource <em>Reset Resource Tasks Candidate Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.ResetResourceTasksCandidateScheduledResource
	 * @generated
	 */
	public Adapter createResetResourceTasksCandidateScheduledResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResourceScope <em>Set Task Candidate Scheduled Resource Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResourceScope
	 * @generated
	 */
	public Adapter createSetTaskCandidateScheduledResourceScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResource <em>Set Task Candidate Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResource
	 * @generated
	 */
	public Adapter createSetTaskCandidateScheduledResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.ResourceExpressionPropagatorFunction <em>Resource Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.ResourceExpressionPropagatorFunction
	 * @generated
	 */
	public Adapter createResourceExpressionPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction <em>Task Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction
	 * @generated
	 */
	public Adapter createTaskPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.CalcSolutionExpressionCandidateValue <em>Calc Solution Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.CalcSolutionExpressionCandidateValue
	 * @generated
	 */
	public Adapter createCalcSolutionExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.TaskExpressionPropagatorFunction <em>Task Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.TaskExpressionPropagatorFunction
	 * @generated
	 */
	public Adapter createTaskExpressionPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction <em>Solution Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction
	 * @generated
	 */
	public Adapter createSolutionPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.CalcTaksExpressionCandidateValueCumulative <em>Calc Taks Expression Candidate Value Cumulative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.CalcTaksExpressionCandidateValueCumulative
	 * @generated
	 */
	public Adapter createCalcTaksExpressionCandidateValueCumulativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator2.PropagatorFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction
	 * @generated
	 */
	public Adapter createPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator2.PropagatorFunctionBindings <em>Function Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunctionBindings
	 * @generated
	 */
	public Adapter createPropagatorFunctionBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SchedulerCalcAdapterFactory
