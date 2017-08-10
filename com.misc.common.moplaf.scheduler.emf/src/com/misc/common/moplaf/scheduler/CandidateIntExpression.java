/**
 */
package com.misc.common.moplaf.scheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Candidate Int Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.CandidateIntExpression#getCandidateValue <em>Candidate Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getCandidateIntExpression()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='MomentInterval'"
 * @generated
 */
public interface CandidateIntExpression extends CandidateValueExpression, IntExpression {
	/**
	 * Returns the value of the '<em><b>Candidate Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Value</em>' attribute.
	 * @see #setCandidateValue(int)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getCandidateIntExpression_CandidateValue()
	 * @model default="0"
	 * @generated
	 */
	int getCandidateValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.CandidateIntExpression#getCandidateValue <em>Candidate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Value</em>' attribute.
	 * @see #getCandidateValue()
	 * @generated
	 */
	void setCandidateValue(int value);

} // CandidateIntExpression
