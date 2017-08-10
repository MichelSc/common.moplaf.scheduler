package com.misc.common.moplaf.scheduler.util;

import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.TaskCandidateFloatExpression;

public class Util {

	static public TaskCandidateFloatExpression addFloatExpression(SolutionTask task, String role) {
		TaskCandidateFloatExpression expression = SchedulerFactory.eINSTANCE.createTaskCandidateFloatExpression();
		expression.setRole("distance");
		task.getExpressions().add(expression);
		return expression;
	}
}
