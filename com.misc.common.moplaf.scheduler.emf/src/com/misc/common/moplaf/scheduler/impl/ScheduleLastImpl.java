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
		SolutionResource tobe_resource = this.getInsertionPoint();
		SolutionTask tobe_resource_asis_last = tobe_resource.getCandidateLastTask();

		// association previous next
		task.setCandidatePreviousNext(tobe_resource, tobe_resource_asis_last, null);

		// reference to scheduled resource
		task.scheduleCandidateResource(tobe_resource);
		
		return true;
	}
} //ScheduleLastImpl
