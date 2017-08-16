/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleFirst;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
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
		SolutionTask tobe_resource_asis_first = tobe_resource.getCandidateFirstTask();
		// association previous next
		task.setCandidatePreviousNext(tobe_resource, null, tobe_resource_asis_first);
		// reference to scheduled resource
		task.scheduleCandidateResource(tobe_resource);
		return true;
	}
} //ScheduleFirstImpl
