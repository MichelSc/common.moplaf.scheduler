/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleFirst;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.common.moplaf.scheduler.Resource;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule First</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScheduleFirstImpl extends MoveResourceImpl implements ScheduleFirst {
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
	public void apply() {
		Task task = this.getTaskToSchedule();
		Resource tobe_resource = this.getInsertionPoint();
		Task tobe_resource_asis_first = tobe_resource.getFirstTask();
		// association previous next
		task.setPreviousNext(tobe_resource, null, tobe_resource_asis_first);
		// reference to scheduled resource
		task.scheduleResource(tobe_resource);
	}
} //ScheduleFirstImpl
