/**
 */
package com.misc.common.moplaf.schedulercalc.impl;

import com.misc.common.moplaf.schedulercalc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulerCalcFactoryImpl extends EFactoryImpl implements SchedulerCalcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulerCalcFactory init() {
		try {
			SchedulerCalcFactory theSchedulerCalcFactory = (SchedulerCalcFactory)EPackage.Registry.INSTANCE.getEFactory(SchedulerCalcPackage.eNS_URI);
			if (theSchedulerCalcFactory != null) {
				return theSchedulerCalcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchedulerCalcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerCalcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SchedulerCalcPackage.SOLUTION_PROPAGATOR_FUNCTION: return createSolutionPropagatorFunction();
			case SchedulerCalcPackage.SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION: return createSolutionExpressionPropagatorFunction();
			case SchedulerCalcPackage.RESOURCE_PROPAGATOR_FUNCTION: return createResourcePropagatorFunction();
			case SchedulerCalcPackage.RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION: return createResourceExpressionPropagatorFunction();
			case SchedulerCalcPackage.TASK_PROPAGATOR_FUNCTION: return createTaskPropagatorFunction();
			case SchedulerCalcPackage.TASK_EXPRESSION_PROPAGATOR_FUNCTION: return createTaskExpressionPropagatorFunction();
			case SchedulerCalcPackage.SET_SCHEDULE_SCOPE: return createSetScheduleScope();
			case SchedulerCalcPackage.SET_TASK_SCHEDULE: return createSetTaskSchedule();
			case SchedulerCalcPackage.SET_EXPRESSION_CANDIDATE_VALUE_SCOPE: return createSetExpressionCandidateValueScope();
			case SchedulerCalcPackage.SET_TASK_EXPRESSION_CANDIDATE_VALUE: return createSetTaskExpressionCandidateValue();
			case SchedulerCalcPackage.SET_SOLUTION_EXPRESSION_CANDIDATE_VALUE: return createSetSolutionExpressionCandidateValue();
			case SchedulerCalcPackage.SET_RESOURCE_EXPRESSION_CANDIDATE_VALUE: return createSetResourceExpressionCandidateValue();
			case SchedulerCalcPackage.SET_RESOURCE_SCHEDULE: return createSetResourceSchedule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionExpressionPropagatorFunction createSolutionExpressionPropagatorFunction() {
		SolutionExpressionPropagatorFunctionImpl solutionExpressionPropagatorFunction = new SolutionExpressionPropagatorFunctionImpl();
		return solutionExpressionPropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropagatorFunction createResourcePropagatorFunction() {
		ResourcePropagatorFunctionImpl resourcePropagatorFunction = new ResourcePropagatorFunctionImpl();
		return resourcePropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetExpressionCandidateValueScope createSetExpressionCandidateValueScope() {
		SetExpressionCandidateValueScopeImpl setExpressionCandidateValueScope = new SetExpressionCandidateValueScopeImpl();
		return setExpressionCandidateValueScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTaskExpressionCandidateValue createSetTaskExpressionCandidateValue() {
		SetTaskExpressionCandidateValueImpl setTaskExpressionCandidateValue = new SetTaskExpressionCandidateValueImpl();
		return setTaskExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetSolutionExpressionCandidateValue createSetSolutionExpressionCandidateValue() {
		SetSolutionExpressionCandidateValueImpl setSolutionExpressionCandidateValue = new SetSolutionExpressionCandidateValueImpl();
		return setSolutionExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetResourceExpressionCandidateValue createSetResourceExpressionCandidateValue() {
		SetResourceExpressionCandidateValueImpl setResourceExpressionCandidateValue = new SetResourceExpressionCandidateValueImpl();
		return setResourceExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetResourceSchedule createSetResourceSchedule() {
		SetResourceScheduleImpl setResourceSchedule = new SetResourceScheduleImpl();
		return setResourceSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceExpressionPropagatorFunction createResourceExpressionPropagatorFunction() {
		ResourceExpressionPropagatorFunctionImpl resourceExpressionPropagatorFunction = new ResourceExpressionPropagatorFunctionImpl();
		return resourceExpressionPropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPropagatorFunction createTaskPropagatorFunction() {
		TaskPropagatorFunctionImpl taskPropagatorFunction = new TaskPropagatorFunctionImpl();
		return taskPropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExpressionPropagatorFunction createTaskExpressionPropagatorFunction() {
		TaskExpressionPropagatorFunctionImpl taskExpressionPropagatorFunction = new TaskExpressionPropagatorFunctionImpl();
		return taskExpressionPropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetScheduleScope createSetScheduleScope() {
		SetScheduleScopeImpl setScheduleScope = new SetScheduleScopeImpl();
		return setScheduleScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTaskSchedule createSetTaskSchedule() {
		SetTaskScheduleImpl setTaskSchedule = new SetTaskScheduleImpl();
		return setTaskSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionPropagatorFunction createSolutionPropagatorFunction() {
		SolutionPropagatorFunctionImpl solutionPropagatorFunction = new SolutionPropagatorFunctionImpl();
		return solutionPropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerCalcPackage getSchedulerCalcPackage() {
		return (SchedulerCalcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchedulerCalcPackage getPackage() {
		return SchedulerCalcPackage.eINSTANCE;
	}

} //SchedulerCalcFactoryImpl
