/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleAfter;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule After</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScheduleAfterImpl extends MoveChangeTaskImpl implements ScheduleAfter {
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
	public boolean change() {
		SolutionTask task = this.getTaskToSchedule();
		SolutionTask to_be_task_before = this.getInsertionPoint();
		SolutionResource tobe_resource = to_be_task_before.getCandidateScheduledResource();
			
		// association previous next
		task.setCandidatePreviousNext(tobe_resource, to_be_task_before, to_be_task_before.getCandidateNextTask());

		// reference to scheduled resource
		task.scheduleCandidateResource(tobe_resource);
		
		return true;
	}
} //ScheduleAfterImpl
