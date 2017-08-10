/**
 */
package com.misc.common.moplaf.scheduler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.ResourceExpression#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResourceExpression()
 * @model abstract="true"
 * @generated
 */
public interface ResourceExpression extends OwnerExpression {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.SolutionResource#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' container reference.
	 * @see #setResource(SolutionResource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResourceExpression_Resource()
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getExpressions
	 * @model opposite="Expressions" required="true" transient="false"
	 * @generated
	 */
	SolutionResource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.ResourceExpression#getResource <em>Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' container reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(SolutionResource value);

} // ResourceExpression
