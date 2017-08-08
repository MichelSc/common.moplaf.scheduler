package com.misc.common.moplaf.schedulercalc.util;


import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructors;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsFactory;
import com.misc.common.moplaf.scheduler.Plugin;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResourceScope;

public class SetCandidateScheduledResourcePropagatorFunctionManager extends PropagatorFunctionManagerAdapter {

	/**
	 * Constructor
	 */
	public SetCandidateScheduledResourcePropagatorFunctionManager() {
		super( SetCandidateScheduledResourcePropagatorFunctionManager.propagatorFunctionFactory);
	}

	/**
	 * Helper for refreshing a the candidate scheduled tasks of a Solution
	 * @param project
	 */
	static void refreshSolution(Solution solution){
		 Plugin.INSTANCE.logInfo("SetCandidateScheduledResource, refresh called: solution "+ solution.getSolutionNr());
		 SetTaskCandidateScheduledResourceScope scopeSolution= solution.getPropagatorFunction(SetTaskCandidateScheduledResourceScope.class);
		 if ( scopeSolution !=null){
			 Plugin.INSTANCE.logInfo("SetCandidateScheduledResource, refresh started: solution "+ solution.getSolutionNr());
			 scopeSolution.refresh();
			 Plugin.INSTANCE.logInfo("SetCandidateScheduledResource, refresh finished: solution "+ solution.getSolutionNr());
		 }
	}
	
	static PropagatorFunctionsFactory propagatorFunctionFactory = PropagatorFunctionsFactory.constructPropagatorFunctionsFactory(SetTaskCandidateScheduledResourceScope.factoryID);
	
	static PropagatorFunctionsConstructors solutionPropagatorFunctionsConstructors =  
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(SchedulerPackage.Literals.SOLUTION)
			.addConstructor(SchedulerCalcPackage.Literals.SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE);
			;

	static PropagatorFunctionsConstructors taskPropagatorFunctionsConstructors =   
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(SchedulerPackage.Literals.SOLUTION_TASK) 
			.addConstructor(SchedulerCalcPackage.Literals.SET_TASK_CANDIDATE_SCHEDULED_RESOURCE)
			;

}
