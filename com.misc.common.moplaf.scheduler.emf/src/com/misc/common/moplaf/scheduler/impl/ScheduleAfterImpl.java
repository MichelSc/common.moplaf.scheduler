/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleAfter;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Task;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule After</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScheduleAfterImpl extends MoveTaskImpl implements ScheduleAfter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleAfterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULE_AFTER;
	}

	/**
	 * 
	 */
	@Override
	public String getDescription() {
		String is_valid_feedback = this.isValidFeedback();
		if ( is_valid_feedback!=null ) {
			return is_valid_feedback;
		}
		
		String description = String.format("Schedule %s after %s", 
				                           this.getTaskToSchedule().getName(),
				                           this.getInsertionPoint().getName());
		return description;
	}

	/**
	 * 
	 */
	@Override
	public void apply() {
		Task task = this.getTaskToSchedule();
		Task to_be_task_before = this.getInsertionPoint();
		Resource tobe_resource = to_be_task_before.getScheduledResource();
			
		// association previous next
		task.setPreviousNext(tobe_resource, to_be_task_before, to_be_task_before.getNextTask());

		// reference to scheduled resource
		task.scheduleResource(tobe_resource);
	}
} //ScheduleAfterImpl
