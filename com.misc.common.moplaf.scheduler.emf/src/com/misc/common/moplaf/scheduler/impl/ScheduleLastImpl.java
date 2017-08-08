/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleLast;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Last</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScheduleLastImpl extends MoveChangeResourceImpl implements ScheduleLast {
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
		String is_valid_feedback = this.isValidFeedback();
		if ( is_valid_feedback!=null ) {
			return is_valid_feedback;
		}
		
		String description = String.format("Schedule %s last in %s", 
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
//		SolutionResource asis_resource = task.getCandidateScheduledResource();
		SolutionResource tobe_resource = this.getInsertionPoint();
//		EList<SolutionTask> tobe_task_sequence = tobe_resource.getCandidateScheduledTasks();
//		ListIterator<SolutionTask> after_last = tobe_task_sequence.listIterator(tobe_task_sequence.size());
//		SolutionTask tobe_resource_asis_last = after_last.hasPrevious() ? after_last.previous() : null;
		SolutionTask tobe_resource_asis_last = tobe_resource.getCandidateLastTask();

		// association scheduled tasks
//		if ( asis_resource==tobe_resource) {
//			tobe_task_sequence.move(tobe_task_sequence.size()-1, task);
//		} else {
//			if ( asis_resource!=null) {
//				asis_resource.getCandidateScheduledTasks().remove(task);
//			}
//			tobe_task_sequence.add(tobe_task_sequence.size(), task);
//		}
			
		// association previous next
		task.setCandidatePreviousNext(tobe_resource, tobe_resource_asis_last, null);
		return true;
	}
} //ScheduleLastImpl
