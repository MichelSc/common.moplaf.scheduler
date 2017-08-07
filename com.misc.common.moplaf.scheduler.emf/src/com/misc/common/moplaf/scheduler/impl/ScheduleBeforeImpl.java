/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleBefore;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Before</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScheduleBeforeImpl extends MoveChangeTaskImpl implements ScheduleBefore {
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
		String is_valid_feedback = this.isValidFeedback();
		if ( is_valid_feedback!=null ) {
			return is_valid_feedback;
		}
		
		String description = String.format("Schedule %s before %s", 
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
		SolutionResource asis_resource = task.getCandidateScheduledResource();
		SolutionTask to_be_task_after = this.getInsertionPoint();
		SolutionResource tobe_resource = to_be_task_after.getCandidateScheduledResource();
		EList<SolutionTask> tobe_task_sequence = tobe_resource.getCandidateScheduledTasks();

		// association scheduled tasks
		int index = tobe_task_sequence.indexOf(to_be_task_after);
		if ( asis_resource==tobe_resource) {
			tobe_task_sequence.move(index, task);
		} else {
			if ( asis_resource!=null) {
				asis_resource.getScheduledTasks().remove(task);
			}
			tobe_task_sequence.add(index, task);
		}
			
		// association previous next
		task.setCandidatePreviousNext(to_be_task_after.getCandidatePreviousTask(), to_be_task_after);
		return true;
	}
} //ScheduleBeforeImpl
