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
			case SchedulerCalcPackage.CANDIDATE_EXPRESSION_PROPAGATOR_FUNCTION: {
				CandidateExpressionPropagatorFunction candidateExpressionPropagatorFunction = (CandidateExpressionPropagatorFunction)theEObject;
				T result = caseCandidateExpressionPropagatorFunction(candidateExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunctionBindings(candidateExpressionPropagatorFunction);
				if (result == null) result = casePropagatorFunction(candidateExpressionPropagatorFunction);
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
			case SchedulerCalcPackage.SET_SCHEDULE_SCOPE: {
				SetScheduleScope setScheduleScope = (SetScheduleScope)theEObject;
				T result = caseSetScheduleScope(setScheduleScope);
				if (result == null) result = caseSolutionPropagatorFunction(setScheduleScope);
				if (result == null) result = casePropagatorFunctionBindings(setScheduleScope);
				if (result == null) result = casePropagatorFunction(setScheduleScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SET_TASK_SCHEDULE: {
				SetTaskSchedule setTaskSchedule = (SetTaskSchedule)theEObject;
				T result = caseSetTaskSchedule(setTaskSchedule);
				if (result == null) result = caseTaskPropagatorFunction(setTaskSchedule);
				if (result == null) result = casePropagatorFunctionBindings(setTaskSchedule);
				if (result == null) result = casePropagatorFunction(setTaskSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SET_EXPRESSION_CANDIDATE_VALUE_SCOPE: {
				SetExpressionCandidateValueScope setExpressionCandidateValueScope = (SetExpressionCandidateValueScope)theEObject;
				T result = caseSetExpressionCandidateValueScope(setExpressionCandidateValueScope);
				if (result == null) result = caseSolutionPropagatorFunction(setExpressionCandidateValueScope);
				if (result == null) result = casePropagatorFunctionBindings(setExpressionCandidateValueScope);
				if (result == null) result = casePropagatorFunction(setExpressionCandidateValueScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SET_TASK_EXPRESSION_CANDIDATE_VALUE: {
				SetTaskExpressionCandidateValue setTaskExpressionCandidateValue = (SetTaskExpressionCandidateValue)theEObject;
				T result = caseSetTaskExpressionCandidateValue(setTaskExpressionCandidateValue);
				if (result == null) result = caseTaskExpressionPropagatorFunction(setTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(setTaskExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(setTaskExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SET_SOLUTION_EXPRESSION_CANDIDATE_VALUE: {
				SetSolutionExpressionCandidateValue setSolutionExpressionCandidateValue = (SetSolutionExpressionCandidateValue)theEObject;
				T result = caseSetSolutionExpressionCandidateValue(setSolutionExpressionCandidateValue);
				if (result == null) result = caseSolutionExpressionPropagatorFunction(setSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(setSolutionExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(setSolutionExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SET_RESOURCE_EXPRESSION_CANDIDATE_VALUE: {
				SetResourceExpressionCandidateValue setResourceExpressionCandidateValue = (SetResourceExpressionCandidateValue)theEObject;
				T result = caseSetResourceExpressionCandidateValue(setResourceExpressionCandidateValue);
				if (result == null) result = caseResourceExpressionPropagatorFunction(setResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunctionBindings(setResourceExpressionCandidateValue);
				if (result == null) result = casePropagatorFunction(setResourceExpressionCandidateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SET_RESOURCE_SCHEDULE: {
				SetResourceSchedule setResourceSchedule = (SetResourceSchedule)theEObject;
				T result = caseSetResourceSchedule(setResourceSchedule);
				if (result == null) result = caseResourcePropagatorFunction(setResourceSchedule);
				if (result == null) result = casePropagatorFunctionBindings(setResourceSchedule);
				if (result == null) result = casePropagatorFunction(setResourceSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SET_EXPRESSION_SCHEDULE: {
				SetExpressionSchedule setExpressionSchedule = (SetExpressionSchedule)theEObject;
				T result = caseSetExpressionSchedule(setExpressionSchedule);
				if (result == null) result = caseCandidateExpressionPropagatorFunction(setExpressionSchedule);
				if (result == null) result = casePropagatorFunctionBindings(setExpressionSchedule);
				if (result == null) result = casePropagatorFunction(setExpressionSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerCalcPackage.SET_FLOAT_EXPRESSION_SCHEDULE: {
				SetFloatExpressionSchedule setFloatExpressionSchedule = (SetFloatExpressionSchedule)theEObject;
				T result = caseSetFloatExpressionSchedule(setFloatExpressionSchedule);
				if (result == null) result = caseSetExpressionSchedule(setFloatExpressionSchedule);
				if (result == null) result = caseCandidateExpressionPropagatorFunction(setFloatExpressionSchedule);
				if (result == null) result = casePropagatorFunctionBindings(setFloatExpressionSchedule);
				if (result == null) result = casePropagatorFunction(setFloatExpressionSchedule);
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
	 * Returns the result of interpreting the object as an instance of '<em>Candidate Expression Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidate Expression Propagator Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidateExpressionPropagatorFunction(CandidateExpressionPropagatorFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Set Schedule Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Schedule Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetScheduleScope(SetScheduleScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Task Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Task Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTaskSchedule(SetTaskSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Expression Candidate Value Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Expression Candidate Value Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetExpressionCandidateValueScope(SetExpressionCandidateValueScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Task Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Task Expression Candidate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTaskExpressionCandidateValue(SetTaskExpressionCandidateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Solution Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Solution Expression Candidate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetSolutionExpressionCandidateValue(SetSolutionExpressionCandidateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Resource Expression Candidate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Resource Expression Candidate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetResourceExpressionCandidateValue(SetResourceExpressionCandidateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Resource Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Resource Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetResourceSchedule(SetResourceSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Expression Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Expression Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetExpressionSchedule(SetExpressionSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Float Expression Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Float Expression Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetFloatExpressionSchedule(SetFloatExpressionSchedule object) {
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
