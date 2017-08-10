/**
 */
package com.misc.common.moplaf.scheduler;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Candidate Date Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.CandidateDateExpression#getCandidateValue <em>Candidate Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getCandidateDateExpression()
 * @model
 * @generated
 */
public interface CandidateDateExpression extends CandidateValueExpression, DateExpression {
	/**
	 * Returns the value of the '<em><b>Candidate Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Value</em>' attribute.
	 * @see #setCandidateValue(Date)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getCandidateDateExpression_CandidateValue()
	 * @model
	 * @generated
	 */
	Date getCandidateValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.CandidateDateExpression#getCandidateValue <em>Candidate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Value</em>' attribute.
	 * @see #getCandidateValue()
	 * @generated
	 */
	void setCandidateValue(Date value);

} // CandidateDateExpression
