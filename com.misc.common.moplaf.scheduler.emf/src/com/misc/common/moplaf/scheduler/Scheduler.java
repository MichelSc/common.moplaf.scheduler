/**
 */
package com.misc.common.moplaf.scheduler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Scheduler#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler()
 * @model
 * @generated
 */
public interface Scheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler_Solutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solution> getSolutions();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduler_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Scheduler
