package com.misc.common.moplaf.schedulercalc.util;


import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructors;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsFactory;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetScheduleScope;

public class SetSchedulePropagatorFunctionManager extends PropagatorFunctionManagerAdapter {

	/**
	 * Constructor
	 */
	public SetSchedulePropagatorFunctionManager() {
		super( SetSchedulePropagatorFunctionManager.propagatorFunctionFactory);
	}

	/**
	 * Helper for refreshing a the candidate scheduled tasks of a Solution
	 * @param project
	 */
//	static void refreshSolution(Solution solution){
//		 Plugin.INSTANCE.logInfo("SetCandidateScheduledResource, refresh called: solution "+ solution.getSolutionNr());
//		 SetTaskCandidateScheduledResourceScope scopeSolution= solution.getPropagatorFunction(SetTaskCandidateScheduledResourceScope.class);
//		 if ( scopeSolution !=null){
//			 Plugin.INSTANCE.logInfo("SetCandidateScheduledResource, refresh started: solution "+ solution.getSolutionNr());
//			 scopeSolution.refresh();
//			 Plugin.INSTANCE.logInfo("SetCandidateScheduledResource, refresh finished: solution "+ solution.getSolutionNr());
//		 }
//	}
	
	static PropagatorFunctionsFactory propagatorFunctionFactory = PropagatorFunctionsFactory.constructPropagatorFunctionsFactory
			(SetScheduleScope.scopeIDSetSchedule);
	
	static PropagatorFunctionsConstructors solutionPropagatorFunctionsConstructors =  
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(SchedulerPackage.Literals.SOLUTION)
			.addConstructor(SchedulerCalcPackage.Literals.SET_SCHEDULE_SCOPE);
			;

	static PropagatorFunctionsConstructors taskPropagatorFunctionsConstructors =   
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(SchedulerPackage.Literals.SOLUTION_TASK) 
			.addConstructor(SchedulerCalcPackage.Literals.SET_TASK_SCHEDULE)
			;

	static PropagatorFunctionsConstructors resourcePropagatorFunctionsConstructors =   
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(SchedulerPackage.Literals.SOLUTION_RESOURCE) 
			.addConstructor(SchedulerCalcPackage.Literals.SET_RESOURCE_SCHEDULE)
			;
	
	static PropagatorFunctionsConstructors floatExpressionPropagatorFunctionsConstructors =   
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(SchedulerPackage.Literals.CANDIDATE_FLOAT_EXPRESSION) 
			.addConstructor(SchedulerCalcPackage.Literals.SET_FLOAT_EXPRESSION_SCHEDULE)
			;

}
