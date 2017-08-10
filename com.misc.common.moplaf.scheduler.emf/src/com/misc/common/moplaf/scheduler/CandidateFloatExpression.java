/**
 */
package com.misc.common.moplaf.scheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Candidate Float Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TaskExpression, whose value Type is Float.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.CandidateFloatExpression#getCandidateValue <em>Candidate Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getCandidateFloatExpression()
 * @model
 * @generated
 */
public interface CandidateFloatExpression extends CandidateValueExpression, FloatExpression {
	/**
	 * Returns the value of the '<em><b>Candidate Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Value</em>' attribute.
	 * @see #setCandidateValue(float)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getCandidateFloatExpression_CandidateValue()
	 * @model
	 * @generated
	 */
	float getCandidateValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.CandidateFloatExpression#getCandidateValue <em>Candidate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Value</em>' attribute.
	 * @see #getCandidateValue()
	 * @generated
	 */
	void setCandidateValue(float value);

} // CandidateFloatExpression
