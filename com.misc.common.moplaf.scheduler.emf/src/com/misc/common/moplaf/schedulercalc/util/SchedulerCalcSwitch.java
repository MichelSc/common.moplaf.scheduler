/**
 */
package com.misc.common.moplaf.schedulercalc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.schedulercalc.*;

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
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage
 * @generated
 */
public class SchedulerCalcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchedulerCalcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerCalcSwitch() {
		if (modelPackage == null) {
			modelPackage = SchedulerCalcPackage.eINSTANCE;
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
			case SchedulerCalcPackage.SOLUTION_PROPAGATOR_FUNCTION: {
				SolutionPropagatorFunction solutionPropagatorFunction = (SolutionPropagatorFunction)theEObject;
				T result = caseSolutionPropagatorFunction(solutionPropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(solutionPropagatorFunction);
				if (result == null) result = casePropagatorFunction(solutionPropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION: {
				SolutionExpressionPropagatorFunction solutionExpressionPropagatorFunction = (SolutionExpressionPropagatorFunction)theEObject;
				T result = caseSolutionExpressionPropagatorFunction(solutionExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(solutionExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunction(solutionExpressionPropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.RESOURCE_PROPAGATOR_FUNCTION: {
				ResourcePropagatorFunction resourcePropagatorFunction = (ResourcePropagatorFunction)theEObject;
				T result = caseResourcePropagatorFunction(resourcePropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(resourcePropagatorFunction);
				if (result == null) result = casePropagatorFunction(resourcePropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION: {
				ResourceExpressionPropagatorFunction resourceExpressionPropagatorFunction = (ResourceExpressionPropagatorFunction)theEObject;
				T result = caseResourceExpressionPropagatorFunction(resourceExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(resourceExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunction(resourceExpressionPropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.TASK_PROPAGATOR_FUNCTION: {
				TaskPropagatorFunction taskPropagatorFunction = (TaskPropagatorFunction)theEObject;
				T result = caseTaskPropagatorFunction(taskPropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(taskPropagatorFunction);
				if (result == null) result = casePropagatorFunction(taskPropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.TASK_EXPRESSION_PROPAGATOR_FUNCTION: {
				TaskExpressionPropagatorFunction taskExpressionPropagatorFunction = (TaskExpressionPropagatorFunction)theEObject;
				T result = caseTaskExpressionPropagatorFunction(taskExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(taskExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunction(taskExpressionPropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: {
				CalcSolutionAllExpressionCandidateValues calcSolutionAllExpressionCandidateValues = (CalcSolutionAllExpressionCandidateValues)theEObject;
				T result = caseCalcSolutionAllExpressionCandidateValues(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = caseSolutionPropagatorFunction(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunctionBindings(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunction(calcSolutionAllExpressionCandidateValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE: {
				CalcSolutionExpressionCandidateValue calcSolutionExpressionCandidateValue = (CalcSolutionExpressionCandidateValue)theEObject;
				T result = caseCalcSolutionExpressionCandidateValue(calcSolutionExpressionCandidateValue);
				if (result == null) result = caseSolutionExpressionPropagatorFunction(calcSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(calcSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(calcSolutionExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE: {
				CalcResourceExpressionCandidateValue calcResourceExpressionCandidateValue = (CalcResourceExpressionCandidateValue)theEObject;
				T result = caseCalcResourceExpressionCandidateValue(calcResourceExpressionCandidateValue);
				if (result == null) result = caseResourceExpressionPropagatorFunction(calcResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(calcResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(calcResourceExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE: {
				CalcTaskExpressionCandidateValue calcTaskExpressionCandidateValue = (CalcTaskExpressionCandidateValue)theEObject;
				T result = caseCalcTaskExpressionCandidateValue(calcTaskExpressionCandidateValue);
				if (result == null) result = caseTaskExpressionPropagatorFunction(calcTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(calcTaskExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE: {
				CalcTaksExpressionCandidateValueCumulative calcTaksExpressionCandidateValueCumulative = (CalcTaksExpressionCandidateValueCumulative)theEObject;
				T result = caseCalcTaksExpressionCandidateValueCumulative(calcTaksExpressionCandidateValueCumulative);
				if (result == null) result = caseCalcTaskExpressionCandidateValue(calcTaksExpressionCandidateValueCumulative);
				if (result == null) result = caseTaskExpressionPropagatorFunction(calcTaksExpressionCandidateValueCumulative);
				if (result == null) result = casePropagatorFunctionBindings(calcTaksExpressionCandidateValueCumulative);
				if (result == null) result = casePropagatorFunction(calcTaksExpressionCandidateValueCumulative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: {
				ResetSolutionAllExpressionCandidateValues resetSolutionAllExpressionCandidateValues = (ResetSolutionAllExpressionCandidateValues)theEObject;
				T result = caseResetSolutionAllExpressionCandidateValues(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = caseSolutionPropagatorFunction(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunctionBindings(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = casePropagatorFunction(resetSolutionAllExpressionCandidateValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE: {
				ResetSolutionExpressionCandidateValue resetSolutionExpressionCandidateValue = (ResetSolutionExpressionCandidateValue)theEObject;
				T result = caseResetSolutionExpressionCandidateValue(resetSolutionExpressionCandidateValue);
				if (result == null) result = caseSolutionExpressionPropagatorFunction(resetSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(resetSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(resetSolutionExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE: {
				ResetResourceExpressionCandidateValue resetResourceExpressionCandidateValue = (ResetResourceExpressionCandidateValue)theEObject;
				T result = caseResetResourceExpressionCandidateValue(resetResourceExpressionCandidateValue);
				if (result == null) result = caseResourceExpressionPropagatorFunction(resetResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(resetResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(resetResourceExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE: {
				ResetTaskExpressionCandidateValue resetTaskExpressionCandidateValue = (ResetTaskExpressionCandidateValue)theEObject;
				T result = caseResetTaskExpressionCandidateValue(resetTaskExpressionCandidateValue);
				if (result == null) result = caseTaskExpressionPropagatorFunction(resetTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(resetTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(resetTaskExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.RESET_TASK_CANDIDATE_NEXT: {
				ResetTaskCandidateNext resetTaskCandidateNext = (ResetTaskCandidateNext)theEObject;
				T result = caseResetTaskCandidateNext(resetTaskCandidateNext);
				if (result == null) result = caseTaskPropagatorFunction(resetTaskCandidateNext);
				if (result == null) result = casePropagatorFunctionBindings(resetTaskCandidateNext);
				if (result == null) result = casePropagatorFunction(resetTaskCandidateNext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE: {
				ResetTaskCandidateScheduledResource resetTaskCandidateScheduledResource = (ResetTaskCandidateScheduledResource)theEObject;
				T result = caseResetTaskCandidateScheduledResource(resetTaskCandidateScheduledResource);
				if (result == null) result = caseTaskPropagatorFunction(resetTaskCandidateScheduledResource);
				if (result == null) result = casePropagatorFunctionBindings(resetTaskCandidateScheduledResource);
				if (result == null) result = casePropagatorFunction(resetTaskCandidateScheduledResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.RESET_RESOURCE_TASKS_CANDIDATE_NEXT: {
				ResetResourceTasksCandidateNext resetResourceTasksCandidateNext = (ResetResourceTasksCandidateNext)theEObject;
				T result = caseResetResourceTasksCandidateNext(resetResourceTasksCandidateNext);
				if (result == null) result = caseResourcePropagatorFunction(resetResourceTasksCandidateNext);
				if (result == null) result = casePropagatorFunctionBindings(resetResourceTasksCandidateNext);
				if (result == null) result = casePropagatorFunction(resetResourceTasksCandidateNext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE: {
				ResetResourceTasksCandidateScheduledResource resetResourceTasksCandidateScheduledResource = (ResetResourceTasksCandidateScheduledResource)theEObject;
				T result = caseResetResourceTasksCandidateScheduledResource(resetResourceTasksCandidateScheduledResource);
				if (result == null) result = caseResourcePropagatorFunction(resetResourceTasksCandidateScheduledResource);
				if (result == null) result = casePropagatorFunctionBindings(resetResourceTasksCandidateScheduledResource);
				if (result == null) result = casePropagatorFunction(resetResourceTasksCandidateScheduledResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE: {
				SetTaskCandidateScheduledResourceScope setTaskCandidateScheduledResourceScope = (SetTaskCandidateScheduledResourceScope)theEObject;
				T result = caseSetTaskCandidateScheduledResourceScope(setTaskCandidateScheduledResourceScope);
				if (result == null) result = caseSolutionPropagatorFunction(setTaskCandidateScheduledResourceScope);
				if (result == null) result = casePropagatorFunctionBindings(setTaskCandidateScheduledResourceScope);
				if (result == null) result = casePropagatorFunction(setTaskCandidateScheduledResourceScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SET_TASK_CANDIDATE_SCHEDULED_RESOURCE: {
				SetTaskCandidateScheduledResource setTaskCandidateScheduledResource = (SetTaskCandidateScheduledResource)theEObject;
				T result = caseSetTaskCandidateScheduledResource(setTaskCandidateScheduledResource);
				if (result == null) result = caseTaskPropagatorFunction(setTaskCandidateScheduledResource);
				if (result == null) result = casePropagatorFunctionBindings(setTaskCandidateScheduledResource);
				if (result == null) result = casePropagatorFunction(setTaskCandidateScheduledResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Propagator Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePropagatorFunction(ResourcePropagatorFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Task Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Propagator Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskPropagatorFunction(TaskPropagatorFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Reset Task Candidate Next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Task Candidate Next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetTaskCandidateNext(ResetTaskCandidateNext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Task Candidate Scheduled Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Task Candidate Scheduled Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetTaskCandidateScheduledResource(ResetTaskCandidateScheduledResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Resource Tasks Candidate Next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Resource Tasks Candidate Next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetResourceTasksCandidateNext(ResetResourceTasksCandidateNext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Resource Tasks Candidate Scheduled Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Resource Tasks Candidate Scheduled Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetResourceTasksCandidateScheduledResource(ResetResourceTasksCandidateScheduledResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Task Candidate Scheduled Resource Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Task Candidate Scheduled Resource Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTaskCandidateScheduledResourceScope(SetTaskCandidateScheduledResourceScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Task Candidate Scheduled Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Task Candidate Scheduled Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTaskCandidateScheduledResource(SetTaskCandidateScheduledResource object) {
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

} //SchedulerCalcSwitch
