/**
 */
package com.misc.common.moplaf.schedulercalc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Resource Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.SetResourceSchedule#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getSetResourceSchedule()
 * @model
 * @generated
 */
public interface SetResourceSchedule extends ResourcePropagatorFunction {
	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getSetResourceSchedule_ConcreteParent()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SetScheduleScope getConcreteParent();

} // SetResourceSchedule
