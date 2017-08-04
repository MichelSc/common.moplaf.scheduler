/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reset Solution All Expression Candidate Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResetSolutionAllExpressionCandidateValues()
 * @model
 * @generated
 */
public interface ResetSolutionAllExpressionCandidateValues extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' reference.
	 * @see #setSolution(Solution)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResetSolutionAllExpressionCandidateValues_Solution()
	 * @model required="true"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues#getSolution <em>Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

} // ResetSolutionAllExpressionCandidateValues
