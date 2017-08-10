package com.misc.common.moplaf.scheduler.util;

import com.misc.common.moplaf.scheduler.ResourceCandidateDateExpression;
import com.misc.common.moplaf.scheduler.ResourceCandidateFloatExpression;
import com.misc.common.moplaf.scheduler.ResourceCandidateIntExpression;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.scheduler.SolutionCandidateDateExpression;
import com.misc.common.moplaf.scheduler.SolutionCandidateFloatExpression;
import com.misc.common.moplaf.scheduler.SolutionCandidateIntExpression;
import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.TaskCandidateDateExpression;
import com.misc.common.moplaf.scheduler.TaskCandidateFloatExpression;
import com.misc.common.moplaf.scheduler.TaskCandidateIntExpression;

public class Util {
	// solution expressions
	static public SolutionCandidateDateExpression addDateExpression(Solution solution, String role) {
		SolutionCandidateDateExpression expression = SchedulerFactory.eINSTANCE.createSolutionCandidateDateExpression();
		expression.setRole(role);
		solution.getExpressions().add(expression);
		return expression;
	}
	static public SolutionCandidateFloatExpression addFloatExpression(Solution solution, String role) {
		SolutionCandidateFloatExpression expression = SchedulerFactory.eINSTANCE.createSolutionCandidateFloatExpression();
		expression.setRole(role);
		solution.getExpressions().add(expression);
		return expression;
	}
	static public SolutionCandidateIntExpression addInteExpression(Solution solution, String role) {
		SolutionCandidateIntExpression expression = SchedulerFactory.eINSTANCE.createSolutionCandidateIntExpression();
		expression.setRole(role);
		solution.getExpressions().add(expression);
		return expression;
	}

	// resource expressions
	static public ResourceCandidateDateExpression addDateExpression(SolutionResource resource, String role) {
		ResourceCandidateDateExpression expression = SchedulerFactory.eINSTANCE.createResourceCandidateDateExpression();
		expression.setRole(role);
		resource.getExpressions().add(expression);
		return expression;
	}
	static public ResourceCandidateFloatExpression addFloatExpression(SolutionResource resource, String role) {
		ResourceCandidateFloatExpression expression = SchedulerFactory.eINSTANCE.createResourceCandidateFloatExpression();
		expression.setRole(role);
		resource.getExpressions().add(expression);
		return expression;
	}
	static public ResourceCandidateIntExpression addInteExpression(SolutionResource resource, String role) {
		ResourceCandidateIntExpression expression = SchedulerFactory.eINSTANCE.createResourceCandidateIntExpression();
		expression.setRole(role);
		resource.getExpressions().add(expression);
		return expression;
	}

	// task expressions
	static public TaskCandidateDateExpression addDateExpression(SolutionTask task, String role) {
		TaskCandidateDateExpression expression = SchedulerFactory.eINSTANCE.createTaskCandidateDateExpression();
		expression.setRole(role);
		task.getExpressions().add(expression);
		return expression;
	}
	static public TaskCandidateFloatExpression addFloatExpression(SolutionTask task, String role) {
		TaskCandidateFloatExpression expression = SchedulerFactory.eINSTANCE.createTaskCandidateFloatExpression();
		expression.setRole(role);
		task.getExpressions().add(expression);
		return expression;
	}
	static public TaskCandidateIntExpression addInteExpression(SolutionTask task, String role) {
		TaskCandidateIntExpression expression = SchedulerFactory.eINSTANCE.createTaskCandidateIntExpression();
		expression.setRole(role);
		task.getExpressions().add(expression);
		return expression;
	}
}
