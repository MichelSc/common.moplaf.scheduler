/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.Unschedule;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unschedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnscheduleImpl extends MoveChangeImpl implements Unschedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnscheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.UNSCHEDULE;
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
		
		String description = String.format("Unschedule %s", 
				                           this.getTaskToSchedule().getName());
		return description;
	}

	/**
	 * 
	 */
	@Override
	public boolean change() {
		SolutionTask task = this.getTaskToSchedule();
		SolutionResource scheduled_resource = task.getCandidateScheduledResource();
		if ( scheduled_resource==null) {
			return false;
		}

		// association scheduled tasks
		scheduled_resource.getCandidateScheduledTasks().remove(task);

		// association previous next
		task.unsetCandidatePreviousNext();
		return true;
	}

} //UnscheduleImpl
