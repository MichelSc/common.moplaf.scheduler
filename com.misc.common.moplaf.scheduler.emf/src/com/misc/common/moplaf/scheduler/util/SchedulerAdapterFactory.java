/**
 */
package com.misc.common.moplaf.scheduler.util;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.scheduler.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage
 * @generated
 */
public class SchedulerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchedulerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchedulerPackage.eINSTANCE;
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
	protected SchedulerSwitch<Adapter> modelSwitch =
		new SchedulerSwitch<Adapter>() {
			@Override
			public Adapter caseScheduler(Scheduler object) {
				return createSchedulerAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseSolution(Solution object) {
				return createSolutionAdapter();
			}
			@Override
			public Adapter caseSolutionResource(SolutionResource object) {
				return createSolutionResourceAdapter();
			}
			@Override
			public Adapter caseSolutionTask(SolutionTask object) {
				return createSolutionTaskAdapter();
			}
			@Override
			public Adapter caseMove(Move object) {
				return createMoveAdapter();
			}
			@Override
			public Adapter caseMoveExpression(MoveExpression object) {
				return createMoveExpressionAdapter();
			}
			@Override
			public Adapter caseSolutionExpression(SolutionExpression object) {
				return createSolutionExpressionAdapter();
			}
			@Override
			public Adapter caseCalcSolutionAllExpressionCandidateValues(CalcSolutionAllExpressionCandidateValues object) {
				return createCalcSolutionAllExpressionCandidateValuesAdapter();
			}
			@Override
			public Adapter caseResetSolutionAllExpressionCandidateValues(ResetSolutionAllExpressionCandidateValues object) {
				return createResetSolutionAllExpressionCandidateValuesAdapter();
			}
			@Override
			public Adapter caseSolutionExpressionPropagatorFunction(SolutionExpressionPropagatorFunction object) {
				return createSolutionExpressionPropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseResetSolutionExpressionCandidateValue(ResetSolutionExpressionCandidateValue object) {
				return createResetSolutionExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseResourceExpression(ResourceExpression object) {
				return createResourceExpressionAdapter();
			}
			@Override
			public Adapter caseCalcResourceExpressionCandidateValue(CalcResourceExpressionCandidateValue object) {
				return createCalcResourceExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseResetResourceExpressionCandidateValue(ResetResourceExpressionCandidateValue object) {
				return createResetResourceExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseTaskExpression(TaskExpression object) {
				return createTaskExpressionAdapter();
			}
			@Override
			public Adapter caseCalcTaskExpressionCandidateValue(CalcTaskExpressionCandidateValue object) {
				return createCalcTaskExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseResetTaskExpressionCandidateValue(ResetTaskExpressionCandidateValue object) {
				return createResetTaskExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseTaskFloatExpression(TaskFloatExpression object) {
				return createTaskFloatExpressionAdapter();
			}
			@Override
			public Adapter caseMoveChange(MoveChange object) {
				return createMoveChangeAdapter();
			}
			@Override
			public Adapter caseScheduleAfter(ScheduleAfter object) {
				return createScheduleAfterAdapter();
			}
			@Override
			public Adapter caseScheduleBefore(ScheduleBefore object) {
				return createScheduleBeforeAdapter();
			}
			@Override
			public Adapter caseScheduleFirst(ScheduleFirst object) {
				return createScheduleFirstAdapter();
			}
			@Override
			public Adapter caseScheduleLast(ScheduleLast object) {
				return createScheduleLastAdapter();
			}
			@Override
			public Adapter caseUnschedule(Unschedule object) {
				return createUnscheduleAdapter();
			}
			@Override
			public Adapter caseResourceExpressionPropagatorFunction(ResourceExpressionPropagatorFunction object) {
				return createResourceExpressionPropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseCalcSolutionExpressionCandidateValue(CalcSolutionExpressionCandidateValue object) {
				return createCalcSolutionExpressionCandidateValueAdapter();
			}
			@Override
			public Adapter caseTaskExpressionPropagatorFunction(TaskExpressionPropagatorFunction object) {
				return createTaskExpressionPropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseSolutionPropagatorFunction(SolutionPropagatorFunction object) {
				return createSolutionPropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseCalcTaksExpressionCandidateValueCumulative(CalcTaksExpressionCandidateValueCumulative object) {
				return createCalcTaksExpressionCandidateValueCumulativeAdapter();
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
			public Adapter caseObjectWithPropagatorFunctions(ObjectWithPropagatorFunctions object) {
				return createObjectWithPropagatorFunctionsAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.Scheduler
	 * @generated
	 */
	public Adapter createSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.Solution
	 * @generated
	 */
	public Adapter createSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.SolutionResource <em>Solution Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource
	 * @generated
	 */
	public Adapter createSolutionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.SolutionTask <em>Solution Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask
	 * @generated
	 */
	public Adapter createSolutionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.SolutionExpression <em>Solution Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.SolutionExpression
	 * @generated
	 */
	public Adapter createSolutionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.MoveExpression <em>Move Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.MoveExpression
	 * @generated
	 */
	public Adapter createMoveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.ResourceExpression <em>Resource Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.ResourceExpression
	 * @generated
	 */
	public Adapter createResourceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.TaskExpression <em>Task Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.TaskExpression
	 * @generated
	 */
	public Adapter createTaskExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue <em>Reset Task Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue
	 * @generated
	 */
	public Adapter createResetTaskExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.TaskFloatExpression <em>Task Float Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.TaskFloatExpression
	 * @generated
	 */
	public Adapter createTaskFloatExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.MoveChange <em>Move Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.MoveChange
	 * @generated
	 */
	public Adapter createMoveChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.ScheduleAfter <em>Schedule After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.ScheduleAfter
	 * @generated
	 */
	public Adapter createScheduleAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.ScheduleBefore <em>Schedule Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.ScheduleBefore
	 * @generated
	 */
	public Adapter createScheduleBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.ScheduleFirst <em>Schedule First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.ScheduleFirst
	 * @generated
	 */
	public Adapter createScheduleFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.ScheduleLast <em>Schedule Last</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.ScheduleLast
	 * @generated
	 */
	public Adapter createScheduleLastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.Unschedule <em>Unschedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.Unschedule
	 * @generated
	 */
	public Adapter createUnscheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.ResourceExpressionPropagatorFunction <em>Resource Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.ResourceExpressionPropagatorFunction
	 * @generated
	 */
	public Adapter createResourceExpressionPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue <em>Calc Task Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue
	 * @generated
	 */
	public Adapter createCalcTaskExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.ResetResourceExpressionCandidateValue <em>Reset Resource Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.ResetResourceExpressionCandidateValue
	 * @generated
	 */
	public Adapter createResetResourceExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.CalcResourceExpressionCandidateValue <em>Calc Resource Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.CalcResourceExpressionCandidateValue
	 * @generated
	 */
	public Adapter createCalcResourceExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.CalcSolutionAllExpressionCandidateValues <em>Calc Solution All Expression Candidate Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.CalcSolutionAllExpressionCandidateValues
	 * @generated
	 */
	public Adapter createCalcSolutionAllExpressionCandidateValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues <em>Reset Solution All Expression Candidate Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues
	 * @generated
	 */
	public Adapter createResetSolutionAllExpressionCandidateValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.SolutionExpressionPropagatorFunction <em>Solution Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.SolutionExpressionPropagatorFunction
	 * @generated
	 */
	public Adapter createSolutionExpressionPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.ResetSolutionExpressionCandidateValue <em>Reset Solution Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.ResetSolutionExpressionCandidateValue
	 * @generated
	 */
	public Adapter createResetSolutionExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.CalcSolutionExpressionCandidateValue <em>Calc Solution Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.CalcSolutionExpressionCandidateValue
	 * @generated
	 */
	public Adapter createCalcSolutionExpressionCandidateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.TaskExpressionPropagatorFunction <em>Task Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.TaskExpressionPropagatorFunction
	 * @generated
	 */
	public Adapter createTaskExpressionPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.SolutionPropagatorFunction <em>Solution Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.SolutionPropagatorFunction
	 * @generated
	 */
	public Adapter createSolutionPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.CalcTaksExpressionCandidateValueCumulative <em>Calc Taks Expression Candidate Value Cumulative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.CalcTaksExpressionCandidateValueCumulative
	 * @generated
	 */
	public Adapter createCalcTaksExpressionCandidateValueCumulativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions <em>Object With Propagator Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions
	 * @generated
	 */
	public Adapter createObjectWithPropagatorFunctionsAdapter() {
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

} //SchedulerAdapterFactory
