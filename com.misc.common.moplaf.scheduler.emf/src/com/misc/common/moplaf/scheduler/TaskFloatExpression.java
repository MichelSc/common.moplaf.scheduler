/**
 */
package com.misc.common.moplaf.scheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Float Expression</b></em>'.
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
 *   <li>{@link com.misc.common.moplaf.scheduler.TaskFloatExpression#getValue <em>Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.TaskFloatExpression#getCandidateValue <em>Candidate Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskFloatExpression()
 * @model
 * @generated
 */
public interface TaskFloatExpression extends TaskExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskFloatExpression_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.TaskFloatExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTaskFloatExpression_CandidateValue()
	 * @model
	 * @generated
	 */
	float getCandidateValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.TaskFloatExpression#getCandidateValue <em>Candidate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Value</em>' attribute.
	 * @see #getCandidateValue()
	 * @generated
	 */
	void setCandidateValue(float value);

} // TaskFloatExpression
