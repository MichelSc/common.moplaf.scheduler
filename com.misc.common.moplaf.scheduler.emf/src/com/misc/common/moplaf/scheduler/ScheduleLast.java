/**
 */
package com.misc.common.moplaf.scheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Last</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.ScheduleLast#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleLast()
 * @model
 * @generated
 */
public interface ScheduleLast extends MoveChange {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(SolutionResource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleLast_Resource()
	 * @model required="true"
	 * @generated
	 */
	SolutionResource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.ScheduleLast#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(SolutionResource value);

} // ScheduleLast
