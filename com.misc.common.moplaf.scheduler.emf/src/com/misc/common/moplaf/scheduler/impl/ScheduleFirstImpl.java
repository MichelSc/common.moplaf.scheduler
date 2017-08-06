/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleFirst;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;

import java.util.ListIterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule First</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScheduleFirstImpl extends MoveChangeResourceImpl implements ScheduleFirst {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleFirstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULE_FIRST;
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
		
		String description = String.format("Schedule %s first in %s", 
				                           this.getTaskToSchedule().getTask().getName(),
				                           this.getInsertionPoint().getResource().getName());
		return description;
	}

	/**
	 * 
	 */
	@Override
	public boolean change() {
		SolutionTask task = this.getTaskToSchedule();
		SolutionResource asis_resource = task.getCandidateScheduledResource();
		SolutionResource tobe_resource = this.getInsertionPoint();
		EList<SolutionTask> tobe_task_sequence = tobe_resource.getCandidateScheduledTasks();
		ListIterator<SolutionTask> before_first = tobe_task_sequence.listIterator(0);
		SolutionTask tobe_resource_asis_first = before_first.hasNext() ? before_first.next() : null;

		// association scheduled tasks
		if ( asis_resource==tobe_resource) {
			tobe_task_sequence.move(0, task);
		} else {
			if ( asis_resource!=null) {
				asis_resource.getCandidateScheduledTasks().remove(task);
			}
			tobe_task_sequence.add(0, task);
		}
			
		// association previous next
		task.unsetCandidatePreviousNext();
		task.setCandidatePreviousNext(null, tobe_resource_asis_first);
		return true;
	}
} //ScheduleFirstImpl
