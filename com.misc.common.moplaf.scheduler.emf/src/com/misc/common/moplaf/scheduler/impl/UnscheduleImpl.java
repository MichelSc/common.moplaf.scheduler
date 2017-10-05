/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.common.moplaf.scheduler.Unschedule;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unschedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnscheduleImpl extends MoveScheduleImpl implements Unschedule {
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
	public String isValidFeedback() {
		String feedback = super.isValidFeedback();
		if ( feedback!=null) {
			return feedback;
		} else if ( this.getTaskToSchedule().getScheduledResource()==null) {
			return "Task not scedulerd";
		}
		return null;
	}

	/**
	 * 
	 */
	@Override
	public void doImpl() {
		Task task = this.getTaskToSchedule();
		Resource scheduled_resource = task.getScheduledResource();
		if ( scheduled_resource==null) {
		}

		// association previous next
		task.unsetPreviousNext();

		// reference to scheduled resource
		task.scheduleResource(null);

	}

} //UnscheduleImpl
