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
			case SchedulerPackage.SOLUTION: {
				Solution solution = (Solution)theEObject;
				T result = caseSolution(solution);
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
			case SchedulerPackage.MOVE: {
				Move move = (Move)theEObject;
				T result = caseMove(move);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.MOVE_EXPRESSION: {
				MoveExpression moveExpression = (MoveExpression)theEObject;
				T result = caseMoveExpression(moveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SOLUTION_EXPRESSION: {
				SolutionExpression solutionExpression = (SolutionExpression)theEObject;
				T result = caseSolutionExpression(solutionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: {
				CalcSolutionAllExpressionCandidateValues calcSolutionAllExpressionCandidateValues = (CalcSolutionAllExpressionCandidateValues)theEObject;
				T result = caseCalcSolutionAllExpressionCandidateValues(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = caseSolutionPropagatorFunction(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunctionBindings(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunction(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: {
				ResetSolutionAllExpressionCandidateValues resetSolutionAllExpressionCandidateValues = (ResetSolutionAllExpressionCandidateValues)theEObject;
				T result = caseResetSolutionAllExpressionCandidateValues(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = caseSolutionPropagatorFunction(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunctionBindings(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunction(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION: {
				SolutionExpressionPropagatorFunction solutionExpressionPropagatorFunction = (SolutionExpressionPropagatorFunction)theEObject;
				T result = caseSolutionExpressionPropagatorFunction(solutionExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(solutionExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunction(solutionExpressionPropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE: {
				ResetSolutionExpressionCandidateValue resetSolutionExpressionCandidateValue = (ResetSolutionExpressionCandidateValue)theEObject;
				T result = caseResetSolutionExpressionCandidateValue(resetSolutionExpressionCandidateValue);
				if (result == null) result = caseSolutionExpressionPropagatorFunction(resetSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(resetSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(resetSolutionExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESOURCE_EXPRESSION: {
				ResourceExpression resourceExpression = (ResourceExpression)theEObject;
				T result = caseResourceExpression(resourceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE: {
				CalcResourceExpressionCandidateValue calcResourceExpressionCandidateValue = (CalcResourceExpressionCandidateValue)theEObject;
				T result = caseCalcResourceExpressionCandidateValue(calcResourceExpressionCandidateValue);
				if (result == null) result = caseResourceExpressionPropagatorFunction(calcResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(calcResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(calcResourceExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE: {
				ResetResourceExpressionCandidateValue resetResourceExpressionCandidateValue = (ResetResourceExpressionCandidateValue)theEObject;
				T result = caseResetResourceExpressionCandidateValue(resetResourceExpressionCandidateValue);
				if (result == null) result = caseResourceExpressionPropagatorFunction(resetResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(resetResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(resetResourceExpressionCandidateValue);
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
			case SchedulerPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE: {
				CalcTaskExpressionCandidateValue calcTaskExpressionCandidateValue = (CalcTaskExpressionCandidateValue)theEObject;
				T result = caseCalcTaskExpressionCandidateValue(calcTaskExpressionCandidateValue);
				if (result == null) result = caseTaskExpressionPropagatorFunction(calcTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(calcTaskExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE: {
				ResetTaskExpressionCandidateValue resetTaskExpressionCandidateValue = (ResetTaskExpressionCandidateValue)theEObject;
				T result = caseResetTaskExpressionCandidateValue(resetTaskExpressionCandidateValue);
				if (result == null) result = caseTaskExpressionPropagatorFunction(resetTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(resetTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(resetTaskExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.TASK_FLOAT_EXPRESSION: {
				TaskFloatExpression taskFloatExpression = (TaskFloatExpression)theEObject;
				T result = caseTaskFloatExpression(taskFloatExpression);
				if (result == null) result = caseTaskExpression(taskFloatExpression);
				if (result == null) result = caseObjectWithPropagatorFunctions(taskFloatExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.MOVE_CHANGE: {
				MoveChange moveChange = (MoveChange)theEObject;
				T result = caseMoveChange(moveChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.MOVE_CHANGE_TASK: {
				MoveChangeTask moveChangeTask = (MoveChangeTask)theEObject;
				T result = caseMoveChangeTask(moveChangeTask);
				if (result == null) result = caseMoveChange(moveChangeTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SCHEDULE_AFTER: {
				ScheduleAfter scheduleAfter = (ScheduleAfter)theEObject;
				T result = caseScheduleAfter(scheduleAfter);
				if (result == null) result = caseMoveChangeTask(scheduleAfter);
				if (result == null) result = caseMoveChange(scheduleAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SCHEDULE_BEFORE: {
				ScheduleBefore scheduleBefore = (ScheduleBefore)theEObject;
				T result = caseScheduleBefore(scheduleBefore);
				if (result == null) result = caseMoveChangeTask(scheduleBefore);
				if (result == null) result = caseMoveChange(scheduleBefore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.MOVE_CHANGE_RESOURCE: {
				MoveChangeResource moveChangeResource = (MoveChangeResource)theEObject;
				T result = caseMoveChangeResource(moveChangeResource);
				if (result == null) result = caseMoveChange(moveChangeResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SCHEDULE_FIRST: {
				ScheduleFirst scheduleFirst = (ScheduleFirst)theEObject;
				T result = caseScheduleFirst(scheduleFirst);
				if (result == null) result = caseMoveChangeResource(scheduleFirst);
				if (result == null) result = caseMoveChange(scheduleFirst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SCHEDULE_LAST: {
				ScheduleLast scheduleLast = (ScheduleLast)theEObject;
				T result = caseScheduleLast(scheduleLast);
				if (result == null) result = caseMoveChangeResource(scheduleLast);
				if (result == null) result = caseMoveChange(scheduleLast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.UNSCHEDULE: {
				Unschedule unschedule = (Unschedule)theEObject;
				T result = caseUnschedule(unschedule);
				if (result == null) result = caseMoveChange(unschedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION: {
				ResourceExpressionPropagatorFunction resourceExpressionPropagatorFunction = (ResourceExpressionPropagatorFunction)theEObject;
				T result = caseResourceExpressionPropagatorFunction(resourceExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(resourceExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunction(resourceExpressionPropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE: {
				CalcSolutionExpressionCandidateValue calcSolutionExpressionCandidateValue = (CalcSolutionExpressionCandidateValue)theEObject;
				T result = caseCalcSolutionExpressionCandidateValue(calcSolutionExpressionCandidateValue);
				if (result == null) result = caseSolutionExpressionPropagatorFunction(calcSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(calcSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(calcSolutionExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.TASK_EXPRESSION_PROPAGATOR_FUNCTION: {
				TaskExpressionPropagatorFunction taskExpressionPropagatorFunction = (TaskExpressionPropagatorFunction)theEObject;
				T result = caseTaskExpressionPropagatorFunction(taskExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(taskExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunction(taskExpressionPropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SOLUTION_PROPAGATOR_FUNCTION: {
				SolutionPropagatorFunction solutionPropagatorFunction = (SolutionPropagatorFunction)theEObject;
				T result = caseSolutionPropagatorFunction(solutionPropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(solutionPropagatorFunction);
				if (result == null) result = casePropagatorFunction(solutionPropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE: {
				CalcTaksExpressionCandidateValueCumulative calcTaksExpressionCandidateValueCumulative = (CalcTaksExpressionCandidateValueCumulative)theEObject;
				T result = caseCalcTaksExpressionCandidateValueCumulative(calcTaksExpressionCandidateValueCumulative);
				if (result == null) result = caseCalcTaskExpressionCandidateValue(calcTaksExpressionCandidateValueCumulative);
				if (result == null) result = caseTaskExpressionPropagatorFunction(calcTaksExpressionCandidateValueCumulative);
				if (result == null) result = casePropagatorFunctionBindings(calcTaksExpressionCandidateValueCumulative);
				if (result == null) result = casePropagatorFunction(calcTaksExpressionCandidateValueCumulative);
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
	 * Returns the result of interpreting the object as an instance of '<em>Task Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Float Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskFloatExpression(TaskFloatExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveChange(MoveChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Change Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Change Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveChangeTask(MoveChangeTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleAfter(ScheduleAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleBefore(ScheduleBefore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Change Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Change Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveChangeResource(MoveChangeResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleFirst(ScheduleFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Last</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Last</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleLast(ScheduleLast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unschedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unschedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnschedule(Unschedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Expression Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Expression Propagator Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceExpressionPropagatorFunction(ResourceExpressionPropagatorFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Solution Expression Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Expression Propagator Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionExpressionPropagatorFunction(SolutionExpressionPropagatorFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Task Expression Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Expression Propagator Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskExpressionPropagatorFunction(TaskExpressionPropagatorFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Propagator Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionPropagatorFunction(SolutionPropagatorFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Taks Expression Candidate Value Cumulative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Taks Expression Candidate Value Cumulative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaksExpressionCandidateValueCumulative(CalcTaksExpressionCandidateValueCumulative object) {
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
