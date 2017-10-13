/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleBefore;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Task;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Before</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScheduleBeforeImpl extends MoveTaskImpl implements ScheduleBefore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleBeforeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULE_BEFORE;
	}

	/**
	 * 
	 */
	@Override
	public String getDescription() {
		Task task1 = this.getTaskToSchedule();
		Task task2 = this.getInsertionPoint();
		String description = String.format("Schedule %s before %s", 
						task1 == null ? "null" : task1.getName(),
                        task2 == null ? "null" : task2.getName());
		return description;
	}
	
	/**
	 * 
	 */
	@Override
	public void doImpl() {
		Task task = this.getTaskToSchedule();
		Task to_be_task_after = this.getInsertionPoint();
		Resource tobe_resource = to_be_task_after.getScheduledResource();
			
		// association previous next
		task.setPreviousNext(tobe_resource, to_be_task_after.getPreviousTask(), to_be_task_after);

		// reference to scheduled resource
		task.scheduleResource(tobe_resource);
	}
} //ScheduleBeforeImpl
