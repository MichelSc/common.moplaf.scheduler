/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleLast;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Task;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Last</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScheduleLastImpl extends MoveResourceImpl implements ScheduleLast {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleLastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULE_LAST;
	}

	/**
	 * 
	 */
	@Override
	public String getDescription() {
			Task task1 = this.getTaskToSchedule();
			Resource resource = this.getInsertionPoint();
			String description = String.format("Schedule %s last in %s", 
							task1 == null ? "null" : task1.getName(),
	                        resource == null ? "null" : resource.getName());
			return description;
	}
	
	/**
	 * 
	 */
	@Override
	public void doImpl() {
		Task task = this.getTaskToSchedule();
		Resource tobe_resource = this.getInsertionPoint();
		Task tobe_resource_asis_last = tobe_resource.getLastTask();

		// association previous next
		task.setPreviousNext(tobe_resource, tobe_resource_asis_last, null);

		// reference to scheduled resource
		task.scheduleResource(tobe_resource);
	}
} //ScheduleLastImpl
