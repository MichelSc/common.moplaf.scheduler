/**
 */
package com.misc.common.moplaf.scheduler.util;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.scheduler.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage
 * @generated
 */
public class SchedulerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchedulerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerSwitch() {
		if (modelPackage == null) {
			modelPackage = SchedulerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SchedulerPackage.SCHEDULER: {
				Scheduler scheduler = (Scheduler)theEObject;
				T result = caseScheduler(scheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SOLUTION: {
				Solution solution = (Solution)theEObject;
				T result = caseSolution(solution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.MOVE: {
				Move move = (Move)theEObject;
				T result = caseMove(move);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SOLUTION_RESOURCE: {
				SolutionResource solutionResource = (SolutionResource)theEObject;
				T result = caseSolutionResource(solutionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SOLUTION_TASK: {
				SolutionTask solutionTask = (SolutionTask)theEObject;
				T result = caseSolutionTask(solutionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SOLUTION_EXPRESSION: {
				SolutionExpression solutionExpression = (SolutionExpression)theEObject;
				T result = caseSolutionExpression(solutionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.MOVE_EXPRESSION: {
				MoveExpression moveExpression = (MoveExpression)theEObject;
				T result = caseMoveExpression(moveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESOURCE_EXPRESSION: {
				ResourceExpression resourceExpression = (ResourceExpression)theEObject;
				T result = caseResourceExpression(resourceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.TASK_EXPRESSION: {
				TaskExpression taskExpression = (TaskExpression)theEObject;
				T result = caseTaskExpression(taskExpression);
				if (result == null) result = caseObjectWithPropagatorFunctions(taskExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE: {
				ResetTaskExpressionCandidateValue resetTaskExpressionCandidateValue = (ResetTaskExpressionCandidateValue)theEObject;
				T result = caseResetTaskExpressionCandidateValue(resetTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(resetTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(resetTaskExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE: {
				CalcTaskExpressionCandidateValue calcTaskExpressionCandidateValue = (CalcTaskExpressionCandidateValue)theEObject;
				T result = caseCalcTaskExpressionCandidateValue(calcTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(calcTaskExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE: {
				ResetResourceExpressionCandidateValue resetResourceExpressionCandidateValue = (ResetResourceExpressionCandidateValue)theEObject;
				T result = caseResetResourceExpressionCandidateValue(resetResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(resetResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(resetResourceExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE: {
				CalcResourceExpressionCandidateValue calcResourceExpressionCandidateValue = (CalcResourceExpressionCandidateValue)theEObject;
				T result = caseCalcResourceExpressionCandidateValue(calcResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(calcResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(calcResourceExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: {
				CalcSolutionAllExpressionCandidateValues calcSolutionAllExpressionCandidateValues = (CalcSolutionAllExpressionCandidateValues)theEObject;
				T result = caseCalcSolutionAllExpressionCandidateValues(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunctionBindings(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunction(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: {
				ResetSolutionAllExpressionCandidateValues resetSolutionAllExpressionCandidateValues = (ResetSolutionAllExpressionCandidateValues)theEObject;
				T result = caseResetSolutionAllExpressionCandidateValues(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunctionBindings(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunction(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE: {
				ResetSolutionExpressionCandidateValue resetSolutionExpressionCandidateValue = (ResetSolutionExpressionCandidateValue)theEObject;
				T result = caseResetSolutionExpressionCandidateValue(resetSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(resetSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(resetSolutionExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE: {
				CalcSolutionExpressionCandidateValue calcSolutionExpressionCandidateValue = (CalcSolutionExpressionCandidateValue)theEObject;
				T result = caseCalcSolutionExpressionCandidateValue(calcSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(calcSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(calcSolutionExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduler(Scheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionResource(SolutionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionTask(SolutionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionExpression(SolutionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveExpression(MoveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceExpression(ResourceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskExpression(TaskExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Task Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Task Expression Candidate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetTaskExpressionCandidateValue(ResetTaskExpressionCandidateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Task Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Task Expression Candidate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskExpressionCandidateValue(CalcTaskExpressionCandidateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Resource Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Resource Expression Candidate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetResourceExpressionCandidateValue(ResetResourceExpressionCandidateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Resource Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Resource Expression Candidate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcResourceExpressionCandidateValue(CalcResourceExpressionCandidateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Solution All Expression Candidate Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Solution All Expression Candidate Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSolutionAllExpressionCandidateValues(CalcSolutionAllExpressionCandidateValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Solution All Expression Candidate Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Solution All Expression Candidate Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetSolutionAllExpressionCandidateValues(ResetSolutionAllExpressionCandidateValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Solution Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Solution Expression Candidate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetSolutionExpressionCandidateValue(ResetSolutionExpressionCandidateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Solution Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Solution Expression Candidate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSolutionExpressionCandidateValue(CalcSolutionExpressionCandidateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object With Propagator Functions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object With Propagator Functions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectWithPropagatorFunctions(ObjectWithPropagatorFunctions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunction(PropagatorFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunctionBindings(PropagatorFunctionBindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SchedulerSwitch
