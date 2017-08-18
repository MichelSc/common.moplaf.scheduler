/**
 */
package com.misc.common.moplaf.schedulercalc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Task Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.schedulercalc.SetTaskSchedule#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getSetTaskSchedule()
 * @model
 * @generated
 */
public interface SetTaskSchedule extends TaskPropagatorFunction {
	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage#getSetTaskSchedule_ConcreteParent()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SetScheduleScope getConcreteParent();

} // SetTaskSchedule
