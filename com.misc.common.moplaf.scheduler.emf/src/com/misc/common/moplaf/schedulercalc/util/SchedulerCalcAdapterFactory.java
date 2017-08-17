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
			public Adapter caseSetScheduleScope(SetScheduleScope object) {
				return createSetScheduleScopeAdapter();
			}
			@Override
			public Adapter caseSetTaskSchedule(SetTaskSchedule object) {
				return createSetTaskScheduleAdapter();
			}
			@Override
			public Adapter caseSetExpressionCandidateValueScope(SetExpressionCandidateValueScope object) {
				return createSetExpressionCandidateValueScopeAdapter();
			}
			@Override
			public Adapter caseSetTaskExpressionCandidateValue(SetTaskExpressionCandidateValue object) {
				return createSetTaskExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseSetSolutionExpressionCandidateValue(SetSolutionExpressionCandidateValue object) {
				return createSetSolutionExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseSetResourceExpressionCandidateValue(SetResourceExpressionCandidateValue object) {
				return createSetResourceExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseSetResourceSchedule(SetResourceSchedule object) {
				return createSetResourceScheduleAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SetScheduleScope <em>Set Schedule Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SetScheduleScope
	 * @generated
	 */
	public Adapter createSetScheduleScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SetTaskSchedule <em>Set Task Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SetTaskSchedule
	 * @generated
	 */
	public Adapter createSetTaskScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SetExpressionCandidateValueScope <em>Set Expression Candidate Value Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SetExpressionCandidateValueScope
	 * @generated
	 */
	public Adapter createSetExpressionCandidateValueScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SetTaskExpressionCandidateValue <em>Set Task Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SetTaskExpressionCandidateValue
	 * @generated
	 */
	public Adapter createSetTaskExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SetSolutionExpressionCandidateValue <em>Set Solution Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SetSolutionExpressionCandidateValue
	 * @generated
	 */
	public Adapter createSetSolutionExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SetResourceExpressionCandidateValue <em>Set Resource Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SetResourceExpressionCandidateValue
	 * @generated
	 */
	public Adapter createSetResourceExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.schedulercalc.SetResourceSchedule <em>Set Resource Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.schedulercalc.SetResourceSchedule
	 * @generated
	 */
	public Adapter createSetResourceScheduleAdapter() {
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
