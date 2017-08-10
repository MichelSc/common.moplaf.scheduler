/**
 */
package com.misc.common.moplaf.scheduler.util;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
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
				if (result == null) result = caseObjectWithPropagatorFunctions(solution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SOLUTION_RESOURCE: {
				SolutionResource solutionResource = (SolutionResource)theEObject;
				T result = caseSolutionResource(solutionResource);
				if (result == null) result = caseObjectWithPropagatorFunctions(solutionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SOLUTION_TASK: {
				SolutionTask solutionTask = (SolutionTask)theEObject;
				T result = caseSolutionTask(solutionTask);
				if (result == null) result = caseObjectWithPropagatorFunctions(solutionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.MOVE: {
				Move move = (Move)theEObject;
				T result = caseMove(move);
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
			case SchedulerPackage.OWNER_EXPRESSION: {
				OwnerExpression ownerExpression = (OwnerExpression)theEObject;
				T result = caseOwnerExpression(ownerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.MOVE_EXPRESSION: {
				MoveExpression moveExpression = (MoveExpression)theEObject;
				T result = caseMoveExpression(moveExpression);
				if (result == null) result = caseOwnerExpression(moveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.SOLUTION_EXPRESSION: {
				SolutionExpression solutionExpression = (SolutionExpression)theEObject;
				T result = caseSolutionExpression(solutionExpression);
				if (result == null) result = caseOwnerExpression(solutionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESOURCE_EXPRESSION: {
				ResourceExpression resourceExpression = (ResourceExpression)theEObject;
				T result = caseResourceExpression(resourceExpression);
				if (result == null) result = caseOwnerExpression(resourceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.TASK_EXPRESSION: {
				TaskExpression taskExpression = (TaskExpression)theEObject;
				T result = caseTaskExpression(taskExpression);
				if (result == null) result = caseOwnerExpression(taskExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.VALUE_EXPRESSION: {
				ValueExpression valueExpression = (ValueExpression)theEObject;
				T result = caseValueExpression(valueExpression);
				if (result == null) result = caseOwnerExpression(valueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.FLOAT_EXPRESSION: {
				FloatExpression floatExpression = (FloatExpression)theEObject;
				T result = caseFloatExpression(floatExpression);
				if (result == null) result = caseValueExpression(floatExpression);
				if (result == null) result = caseOwnerExpression(floatExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.INT_EXPRESSION: {
				IntExpression intExpression = (IntExpression)theEObject;
				T result = caseIntExpression(intExpression);
				if (result == null) result = caseValueExpression(intExpression);
				if (result == null) result = caseOwnerExpression(intExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.DATE_EXPRESSION: {
				DateExpression dateExpression = (DateExpression)theEObject;
				T result = caseDateExpression(dateExpression);
				if (result == null) result = caseValueExpression(dateExpression);
				if (result == null) result = caseOwnerExpression(dateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CANDIDATE_VALUE_EXPRESSION: {
				CandidateValueExpression candidateValueExpression = (CandidateValueExpression)theEObject;
				T result = caseCandidateValueExpression(candidateValueExpression);
				if (result == null) result = caseObjectWithPropagatorFunctions(candidateValueExpression);
				if (result == null) result = caseValueExpression(candidateValueExpression);
				if (result == null) result = caseOwnerExpression(candidateValueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CANDIDATE_FLOAT_EXPRESSION: {
				CandidateFloatExpression candidateFloatExpression = (CandidateFloatExpression)theEObject;
				T result = caseCandidateFloatExpression(candidateFloatExpression);
				if (result == null) result = caseCandidateValueExpression(candidateFloatExpression);
				if (result == null) result = caseFloatExpression(candidateFloatExpression);
				if (result == null) result = caseObjectWithPropagatorFunctions(candidateFloatExpression);
				if (result == null) result = caseValueExpression(candidateFloatExpression);
				if (result == null) result = caseOwnerExpression(candidateFloatExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CANDIDATE_DATE_EXPRESSION: {
				CandidateDateExpression candidateDateExpression = (CandidateDateExpression)theEObject;
				T result = caseCandidateDateExpression(candidateDateExpression);
				if (result == null) result = caseCandidateValueExpression(candidateDateExpression);
				if (result == null) result = caseDateExpression(candidateDateExpression);
				if (result == null) result = caseObjectWithPropagatorFunctions(candidateDateExpression);
				if (result == null) result = caseValueExpression(candidateDateExpression);
				if (result == null) result = caseOwnerExpression(candidateDateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.CANDIDATE_INT_EXPRESSION: {
				CandidateIntExpression candidateIntExpression = (CandidateIntExpression)theEObject;
				T result = caseCandidateIntExpression(candidateIntExpression);
				if (result == null) result = caseCandidateValueExpression(candidateIntExpression);
				if (result == null) result = caseIntExpression(candidateIntExpression);
				if (result == null) result = caseObjectWithPropagatorFunctions(candidateIntExpression);
				if (result == null) result = caseValueExpression(candidateIntExpression);
				if (result == null) result = caseOwnerExpression(candidateIntExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.TASK_CANDIDATE_FLOAT_EXPRESSION: {
				TaskCandidateFloatExpression taskCandidateFloatExpression = (TaskCandidateFloatExpression)theEObject;
				T result = caseTaskCandidateFloatExpression(taskCandidateFloatExpression);
				if (result == null) result = caseCandidateFloatExpression(taskCandidateFloatExpression);
				if (result == null) result = caseTaskExpression(taskCandidateFloatExpression);
				if (result == null) result = caseCandidateValueExpression(taskCandidateFloatExpression);
				if (result == null) result = caseFloatExpression(taskCandidateFloatExpression);
				if (result == null) result = caseObjectWithPropagatorFunctions(taskCandidateFloatExpression);
				if (result == null) result = caseValueExpression(taskCandidateFloatExpression);
				if (result == null) result = caseOwnerExpression(taskCandidateFloatExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.TASK_CANDIDATE_DATE_EXPRESSION: {
				TaskCandidateDateExpression taskCandidateDateExpression = (TaskCandidateDateExpression)theEObject;
				T result = caseTaskCandidateDateExpression(taskCandidateDateExpression);
				if (result == null) result = caseCandidateDateExpression(taskCandidateDateExpression);
				if (result == null) result = caseTaskExpression(taskCandidateDateExpression);
				if (result == null) result = caseCandidateValueExpression(taskCandidateDateExpression);
				if (result == null) result = caseDateExpression(taskCandidateDateExpression);
				if (result == null) result = caseObjectWithPropagatorFunctions(taskCandidateDateExpression);
				if (result == null) result = caseValueExpression(taskCandidateDateExpression);
				if (result == null) result = caseOwnerExpression(taskCandidateDateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESOURCE_CANDIDATE_FLOAT_EXPRESSION: {
				ResourceCandidateFloatExpression resourceCandidateFloatExpression = (ResourceCandidateFloatExpression)theEObject;
				T result = caseResourceCandidateFloatExpression(resourceCandidateFloatExpression);
				if (result == null) result = caseCandidateFloatExpression(resourceCandidateFloatExpression);
				if (result == null) result = caseResourceExpression(resourceCandidateFloatExpression);
				if (result == null) result = caseCandidateValueExpression(resourceCandidateFloatExpression);
				if (result == null) result = caseFloatExpression(resourceCandidateFloatExpression);
				if (result == null) result = caseObjectWithPropagatorFunctions(resourceCandidateFloatExpression);
				if (result == null) result = caseValueExpression(resourceCandidateFloatExpression);
				if (result == null) result = caseOwnerExpression(resourceCandidateFloatExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchedulerPackage.RESOURCE_CANDIDATE_DATE_EXPRESSION: {
				ResourceCandidateDateExpression resourceCandidateDateExpression = (ResourceCandidateDateExpression)theEObject;
				T result = caseResourceCandidateDateExpression(resourceCandidateDateExpression);
				if (result == null) result = caseCandidateDateExpression(resourceCandidateDateExpression);
				if (result == null) result = caseResourceExpression(resourceCandidateDateExpression);
				if (result == null) result = caseCandidateValueExpression(resourceCandidateDateExpression);
				if (result == null) result = caseDateExpression(resourceCandidateDateExpression);
				if (result == null) result = caseObjectWithPropagatorFunctions(resourceCandidateDateExpression);
				if (result == null) result = caseValueExpression(resourceCandidateDateExpression);
				if (result == null) result = caseOwnerExpression(resourceCandidateDateExpression);
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
	 * Returns the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueExpression(ValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatExpression(FloatExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntExpression(IntExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateExpression(DateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidate Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidate Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidateValueExpression(CandidateValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidate Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidate Float Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidateFloatExpression(CandidateFloatExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidate Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidate Date Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidateDateExpression(CandidateDateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidate Int Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidate Int Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidateIntExpression(CandidateIntExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Candidate Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Candidate Float Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskCandidateFloatExpression(TaskCandidateFloatExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Candidate Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Candidate Date Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskCandidateDateExpression(TaskCandidateDateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Candidate Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Candidate Float Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceCandidateFloatExpression(ResourceCandidateFloatExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Candidate Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Candidate Date Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceCandidateDateExpression(ResourceCandidateDateExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Owner Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owner Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnerExpression(OwnerExpression object) {
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
