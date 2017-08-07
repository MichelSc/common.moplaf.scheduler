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
			case SchedulerCalcPackage.CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: return createCalcSolutionAllExpressionCandidateValues();
			case SchedulerCalcPackage.RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES: return createResetSolutionAllExpressionCandidateValues();
			case SchedulerCalcPackage.SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION: return createSolutionExpressionPropagatorFunction();
			case SchedulerCalcPackage.RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE: return createResetSolutionExpressionCandidateValue();
			case SchedulerCalcPackage.CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE: return createCalcResourceExpressionCandidateValue();
			case SchedulerCalcPackage.RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE: return createResetResourceExpressionCandidateValue();
			case SchedulerCalcPackage.CALC_TASK_EXPRESSION_CANDIDATE_VALUE: return createCalcTaskExpressionCandidateValue();
			case SchedulerCalcPackage.RESET_TASK_EXPRESSION_CANDIDATE_VALUE: return createResetTaskExpressionCandidateValue();
			case SchedulerCalcPackage.RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION: return createResourceExpressionPropagatorFunction();
			case SchedulerCalcPackage.CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE: return createCalcSolutionExpressionCandidateValue();
			case SchedulerCalcPackage.TASK_EXPRESSION_PROPAGATOR_FUNCTION: return createTaskExpressionPropagatorFunction();
			case SchedulerCalcPackage.SOLUTION_PROPAGATOR_FUNCTION: return createSolutionPropagatorFunction();
			case SchedulerCalcPackage.CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE: return createCalcTaksExpressionCandidateValueCumulative();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSolutionAllExpressionCandidateValues createCalcSolutionAllExpressionCandidateValues() {
		CalcSolutionAllExpressionCandidateValuesImpl calcSolutionAllExpressionCandidateValues = new CalcSolutionAllExpressionCandidateValuesImpl();
		return calcSolutionAllExpressionCandidateValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetSolutionAllExpressionCandidateValues createResetSolutionAllExpressionCandidateValues() {
		ResetSolutionAllExpressionCandidateValuesImpl resetSolutionAllExpressionCandidateValues = new ResetSolutionAllExpressionCandidateValuesImpl();
		return resetSolutionAllExpressionCandidateValues;
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
	public ResetSolutionExpressionCandidateValue createResetSolutionExpressionCandidateValue() {
		ResetSolutionExpressionCandidateValueImpl resetSolutionExpressionCandidateValue = new ResetSolutionExpressionCandidateValueImpl();
		return resetSolutionExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcResourceExpressionCandidateValue createCalcResourceExpressionCandidateValue() {
		CalcResourceExpressionCandidateValueImpl calcResourceExpressionCandidateValue = new CalcResourceExpressionCandidateValueImpl();
		return calcResourceExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetResourceExpressionCandidateValue createResetResourceExpressionCandidateValue() {
		ResetResourceExpressionCandidateValueImpl resetResourceExpressionCandidateValue = new ResetResourceExpressionCandidateValueImpl();
		return resetResourceExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskExpressionCandidateValue createCalcTaskExpressionCandidateValue() {
		CalcTaskExpressionCandidateValueImpl calcTaskExpressionCandidateValue = new CalcTaskExpressionCandidateValueImpl();
		return calcTaskExpressionCandidateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetTaskExpressionCandidateValue createResetTaskExpressionCandidateValue() {
		ResetTaskExpressionCandidateValueImpl resetTaskExpressionCandidateValue = new ResetTaskExpressionCandidateValueImpl();
		return resetTaskExpressionCandidateValue;
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
	public CalcSolutionExpressionCandidateValue createCalcSolutionExpressionCandidateValue() {
		CalcSolutionExpressionCandidateValueImpl calcSolutionExpressionCandidateValue = new CalcSolutionExpressionCandidateValueImpl();
		return calcSolutionExpressionCandidateValue;
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
	public SolutionPropagatorFunction createSolutionPropagatorFunction() {
		SolutionPropagatorFunctionImpl solutionPropagatorFunction = new SolutionPropagatorFunctionImpl();
		return solutionPropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaksExpressionCandidateValueCumulative createCalcTaksExpressionCandidateValueCumulative() {
		CalcTaksExpressionCandidateValueCumulativeImpl calcTaksExpressionCandidateValueCumulative = new CalcTaksExpressionCandidateValueCumulativeImpl();
		return calcTaksExpressionCandidateValueCumulative;
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
