/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionExpression#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.SolutionExpression#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionExpression()
 * @model abstract="true"
 * @generated
 */
public interface SolutionExpression extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Solution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Solution#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' container reference.
	 * @see #setSolution(Solution)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionExpression_Solution()
	 * @see com.misc.common.moplaf.scheduler.Solution#getExpressions
	 * @model opposite="Expressions" required="true" transient="false"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.SolutionExpression#getSolution <em>Solution</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' container reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSolutionExpression_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

} // SolutionExpression
