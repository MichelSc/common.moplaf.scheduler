package com.misc.common.moplaf.schedulercalc.util;


import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructors;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsFactory;
import com.misc.common.moplaf.scheduler.Plugin;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.schedulercalc.SchedulerCalcPackage;
import com.misc.common.moplaf.schedulercalc.SetExpressionCandidateValueScope;

public class SetCandidateValuePropagatorFunctionManager extends PropagatorFunctionManagerAdapter {

	/**
	 * Constructor
	 */
	public SetCandidateValuePropagatorFunctionManager() {
		super( SetCandidateValuePropagatorFunctionManager.propagatorFunctionFactory);
	}

	/**
	 * Helper for refreshing the candidate values of a Solution
	 * @param project
	 */
	static void refreshSolution(Solution solution){
		 Plugin.INSTANCE.logInfo("SetCandidateValue, refresh called: solution "+ solution.getSolutionNr());
		 SetExpressionCandidateValueScope scopeSolution= solution.getPropagatorFunction(SetExpressionCandidateValueScope.class);
		 if ( scopeSolution !=null){
			 Plugin.INSTANCE.logInfo("SetCandidateValue, refresh started: solution "+ solution.getSolutionNr());
			 scopeSolution.refresh();
			 Plugin.INSTANCE.logInfo("SetCandidateValue, refresh finished: solution "+ solution.getSolutionNr());
		 }
	}
	
	static public PropagatorFunctionsFactory propagatorFunctionFactory = PropagatorFunctionsFactory.constructPropagatorFunctionsFactory
			 (SetExpressionCandidateValueScope.scopeIDCalcCandidateValue);
	
	static PropagatorFunctionsConstructors solutionPropagatorFunctionsConstructors =  
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(SchedulerPackage.Literals.SOLUTION)
			.addConstructor(SchedulerCalcPackage.Literals.SET_EXPRESSION_CANDIDATE_VALUE_SCOPE);
			;

}
