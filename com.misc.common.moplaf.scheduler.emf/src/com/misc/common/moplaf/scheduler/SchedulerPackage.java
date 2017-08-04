/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.scheduler.SchedulerFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scheduler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/scheduler/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sched";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulerPackage eINSTANCE = com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 0;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SOLUTIONS = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__TASKS = 2;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResourceImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.TaskImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 3;

	/**
	 * The feature id for the '<em><b>Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__MOVES = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__TASKS = 2;

	/**
	 * The feature id for the '<em><b>Candidate Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CANDIDATE_MOVE = 3;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__EXPRESSIONS = 4;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Duplicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___DUPLICATE = 0;

	/**
	 * The operation id for the '<em>Set Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___SET_CANDIDATE__MOVE = 1;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.MoveImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 4;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE___ACCEPT = 0;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl <em>Solution Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionResource()
	 * @generated
	 */
	int SOLUTION_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Assigned Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__ASSIGNED_TASKS = 1;

	/**
	 * The feature id for the '<em><b>Candidate Assigned Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS = 2;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__EXPRESSIONS = 3;

	/**
	 * The number of structural features of the '<em>Solution Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Solution Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl <em>Solution Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionTask()
	 * @generated
	 */
	int SOLUTION_TASK = 6;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__TASK = 0;

	/**
	 * The feature id for the '<em><b>Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__NEXT_TASK = 1;

	/**
	 * The feature id for the '<em><b>Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__PREVIOUS_TASK = 2;

	/**
	 * The feature id for the '<em><b>Assigned Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__ASSIGNED_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Candidate Assigned Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Candidate Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__CANDIDATE_NEXT_TASK = 5;

	/**
	 * The feature id for the '<em><b>Candidate Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK = 6;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__EXPRESSIONS = 7;

	/**
	 * The number of structural features of the '<em>Solution Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Solution Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionExpressionImpl <em>Solution Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionExpression()
	 * @generated
	 */
	int SOLUTION_EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>Solution Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Solution Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.MoveExpressionImpl <em>Move Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.MoveExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveExpression()
	 * @generated
	 */
	int MOVE_EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>Move Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Move Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceExpressionImpl <em>Resource Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResourceExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResourceExpression()
	 * @generated
	 */
	int RESOURCE_EXPRESSION = 9;

	/**
	 * The number of structural features of the '<em>Resource Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Resource Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.TaskExpressionImpl <em>Task Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.TaskExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTaskExpression()
	 * @generated
	 */
	int TASK_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Reset Candidate Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION__RESET_CANDIDATE_VALUE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calc Candidate Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION__CALC_CANDIDATE_VALUE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The number of operations of the '<em>Task Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResetTaskExpressionCandidateValueImpl <em>Reset Task Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResetTaskExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetTaskExpressionCandidateValue()
	 * @generated
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reset Task Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Task Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.CalcTaskExpressionCandidateValueImpl <em>Calc Task Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.CalcTaskExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcTaskExpressionCandidateValue()
	 * @generated
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Task Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResetResourceExpressionCandidateValueImpl <em>Reset Resource Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResetResourceExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetResourceExpressionCandidateValue()
	 * @generated
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reset Resource Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Resource Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.CalcResourceExpressionCandidateValueImpl <em>Calc Resource Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.CalcResourceExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcResourceExpressionCandidateValue()
	 * @generated
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Resource Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Resource Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.CalcSolutionAllExpressionCandidateValuesImpl <em>Calc Solution All Expression Candidate Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.CalcSolutionAllExpressionCandidateValuesImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcSolutionAllExpressionCandidateValues()
	 * @generated
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__SOLUTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Solution All Expression Candidate Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Solution All Expression Candidate Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResetSolutionAllExpressionCandidateValuesImpl <em>Reset Solution All Expression Candidate Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResetSolutionAllExpressionCandidateValuesImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetSolutionAllExpressionCandidateValues()
	 * @generated
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = 16;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__SOLUTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reset Solution All Expression Candidate Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Solution All Expression Candidate Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResetSolutionExpressionCandidateValueImpl <em>Reset Solution Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResetSolutionExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetSolutionExpressionCandidateValue()
	 * @generated
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reset Solution Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Solution Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.CalcSolutionExpressionCandidateValueImpl <em>Calc Solution Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.CalcSolutionExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcSolutionExpressionCandidateValue()
	 * @generated
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Solution Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Solution Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see com.misc.common.moplaf.scheduler.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Scheduler#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see com.misc.common.moplaf.scheduler.Scheduler#getSolutions()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Solutions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Scheduler#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.common.moplaf.scheduler.Scheduler#getResources()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Scheduler#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see com.misc.common.moplaf.scheduler.Scheduler#getTasks()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Tasks();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.scheduler.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Solution#getMoves <em>Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moves</em>'.
	 * @see com.misc.common.moplaf.scheduler.Solution#getMoves()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Moves();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Solution#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.common.moplaf.scheduler.Solution#getResources()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Solution#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see com.misc.common.moplaf.scheduler.Solution#getTasks()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Tasks();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.Solution#getCandidateMove <em>Candidate Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Candidate Move</em>'.
	 * @see com.misc.common.moplaf.scheduler.Solution#getCandidateMove()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_CandidateMove();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Solution#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.misc.common.moplaf.scheduler.Solution#getExpressions()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Expressions();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Solution#duplicate() <em>Duplicate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Duplicate</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Solution#duplicate()
	 * @generated
	 */
	EOperation getSolution__Duplicate();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Solution#setCandidate(com.misc.common.moplaf.scheduler.Move) <em>Set Candidate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Candidate</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Solution#setCandidate(com.misc.common.moplaf.scheduler.Move)
	 * @generated
	 */
	EOperation getSolution__SetCandidate__Move();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see com.misc.common.moplaf.scheduler.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Move#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.misc.common.moplaf.scheduler.Move#getExpressions()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Expressions();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Move#accept() <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Move#accept()
	 * @generated
	 */
	EOperation getMove__Accept();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.SolutionResource <em>Solution Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource
	 * @generated
	 */
	EClass getSolutionResource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getResource()
	 * @see #getSolutionResource()
	 * @generated
	 */
	EReference getSolutionResource_Resource();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.scheduler.SolutionResource#getAssignedTasks <em>Assigned Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Tasks</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getAssignedTasks()
	 * @see #getSolutionResource()
	 * @generated
	 */
	EReference getSolutionResource_AssignedTasks();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateAssignedTasks <em>Candidate Assigned Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Candidate Assigned Tasks</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getCandidateAssignedTasks()
	 * @see #getSolutionResource()
	 * @generated
	 */
	EReference getSolutionResource_CandidateAssignedTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.SolutionResource#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getExpressions()
	 * @see #getSolutionResource()
	 * @generated
	 */
	EReference getSolutionResource_Expressions();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.SolutionTask <em>Solution Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask
	 * @generated
	 */
	EClass getSolutionTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionTask#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getTask()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_Task();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionTask#getNextTask <em>Next Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getNextTask()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_NextTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionTask#getPreviousTask <em>Previous Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getPreviousTask()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_PreviousTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionTask#getAssignedResource <em>Assigned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getAssignedResource()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_AssignedResource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateAssignedResource <em>Candidate Assigned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Candidate Assigned Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getCandidateAssignedResource()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_CandidateAssignedResource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateNextTask <em>Candidate Next Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Candidate Next Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getCandidateNextTask()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_CandidateNextTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidatePreviousTask <em>Candidate Previous Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Candidate Previous Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getCandidatePreviousTask()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_CandidatePreviousTask();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.SolutionTask#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getExpressions()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_Expressions();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.SolutionExpression <em>Solution Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionExpression
	 * @generated
	 */
	EClass getSolutionExpression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.MoveExpression <em>Move Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveExpression
	 * @generated
	 */
	EClass getMoveExpression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ResourceExpression <em>Resource Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResourceExpression
	 * @generated
	 */
	EClass getResourceExpression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.TaskExpression <em>Task Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskExpression
	 * @generated
	 */
	EClass getTaskExpression();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.TaskExpression#getResetCandidateValue <em>Reset Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskExpression#getResetCandidateValue()
	 * @see #getTaskExpression()
	 * @generated
	 */
	EReference getTaskExpression_ResetCandidateValue();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.TaskExpression#getCalcCandidateValue <em>Calc Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calc Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskExpression#getCalcCandidateValue()
	 * @see #getTaskExpression()
	 * @generated
	 */
	EReference getTaskExpression_CalcCandidateValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue <em>Reset Task Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Task Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue
	 * @generated
	 */
	EClass getResetTaskExpressionCandidateValue();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue#getExpression()
	 * @see #getResetTaskExpressionCandidateValue()
	 * @generated
	 */
	EReference getResetTaskExpressionCandidateValue_Expression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue <em>Calc Task Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue
	 * @generated
	 */
	EClass getCalcTaskExpressionCandidateValue();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.CalcTaskExpressionCandidateValue#getExpression()
	 * @see #getCalcTaskExpressionCandidateValue()
	 * @generated
	 */
	EReference getCalcTaskExpressionCandidateValue_Expression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ResetResourceExpressionCandidateValue <em>Reset Resource Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Resource Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetResourceExpressionCandidateValue
	 * @generated
	 */
	EClass getResetResourceExpressionCandidateValue();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.ResetResourceExpressionCandidateValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetResourceExpressionCandidateValue#getExpression()
	 * @see #getResetResourceExpressionCandidateValue()
	 * @generated
	 */
	EReference getResetResourceExpressionCandidateValue_Expression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.CalcResourceExpressionCandidateValue <em>Calc Resource Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Resource Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.CalcResourceExpressionCandidateValue
	 * @generated
	 */
	EClass getCalcResourceExpressionCandidateValue();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.CalcResourceExpressionCandidateValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.CalcResourceExpressionCandidateValue#getExpression()
	 * @see #getCalcResourceExpressionCandidateValue()
	 * @generated
	 */
	EReference getCalcResourceExpressionCandidateValue_Expression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.CalcSolutionAllExpressionCandidateValues <em>Calc Solution All Expression Candidate Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Solution All Expression Candidate Values</em>'.
	 * @see com.misc.common.moplaf.scheduler.CalcSolutionAllExpressionCandidateValues
	 * @generated
	 */
	EClass getCalcSolutionAllExpressionCandidateValues();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.CalcSolutionAllExpressionCandidateValues#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.scheduler.CalcSolutionAllExpressionCandidateValues#getSolution()
	 * @see #getCalcSolutionAllExpressionCandidateValues()
	 * @generated
	 */
	EReference getCalcSolutionAllExpressionCandidateValues_Solution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues <em>Reset Solution All Expression Candidate Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Solution All Expression Candidate Values</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues
	 * @generated
	 */
	EClass getResetSolutionAllExpressionCandidateValues();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues#getSolution()
	 * @see #getResetSolutionAllExpressionCandidateValues()
	 * @generated
	 */
	EReference getResetSolutionAllExpressionCandidateValues_Solution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ResetSolutionExpressionCandidateValue <em>Reset Solution Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Solution Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetSolutionExpressionCandidateValue
	 * @generated
	 */
	EClass getResetSolutionExpressionCandidateValue();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.ResetSolutionExpressionCandidateValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetSolutionExpressionCandidateValue#getExpression()
	 * @see #getResetSolutionExpressionCandidateValue()
	 * @generated
	 */
	EReference getResetSolutionExpressionCandidateValue_Expression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.CalcSolutionExpressionCandidateValue <em>Calc Solution Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Solution Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.CalcSolutionExpressionCandidateValue
	 * @generated
	 */
	EClass getCalcSolutionExpressionCandidateValue();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.CalcSolutionExpressionCandidateValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.CalcSolutionExpressionCandidateValue#getExpression()
	 * @see #getCalcSolutionExpressionCandidateValue()
	 * @generated
	 */
	EReference getCalcSolutionExpressionCandidateValue_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchedulerFactory getSchedulerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__SOLUTIONS = eINSTANCE.getScheduler_Solutions();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__RESOURCES = eINSTANCE.getScheduler_Resources();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__TASKS = eINSTANCE.getScheduler_Tasks();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResourceImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.TaskImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.SolutionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Moves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__MOVES = eINSTANCE.getSolution_Moves();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__RESOURCES = eINSTANCE.getSolution_Resources();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__TASKS = eINSTANCE.getSolution_Tasks();

		/**
		 * The meta object literal for the '<em><b>Candidate Move</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__CANDIDATE_MOVE = eINSTANCE.getSolution_CandidateMove();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__EXPRESSIONS = eINSTANCE.getSolution_Expressions();

		/**
		 * The meta object literal for the '<em><b>Duplicate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___DUPLICATE = eINSTANCE.getSolution__Duplicate();

		/**
		 * The meta object literal for the '<em><b>Set Candidate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___SET_CANDIDATE__MOVE = eINSTANCE.getSolution__SetCandidate__Move();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.MoveImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__EXPRESSIONS = eINSTANCE.getMove_Expressions();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOVE___ACCEPT = eINSTANCE.getMove__Accept();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl <em>Solution Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionResource()
		 * @generated
		 */
		EClass SOLUTION_RESOURCE = eINSTANCE.getSolutionResource();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_RESOURCE__RESOURCE = eINSTANCE.getSolutionResource_Resource();

		/**
		 * The meta object literal for the '<em><b>Assigned Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_RESOURCE__ASSIGNED_TASKS = eINSTANCE.getSolutionResource_AssignedTasks();

		/**
		 * The meta object literal for the '<em><b>Candidate Assigned Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_RESOURCE__CANDIDATE_ASSIGNED_TASKS = eINSTANCE.getSolutionResource_CandidateAssignedTasks();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_RESOURCE__EXPRESSIONS = eINSTANCE.getSolutionResource_Expressions();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl <em>Solution Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionTask()
		 * @generated
		 */
		EClass SOLUTION_TASK = eINSTANCE.getSolutionTask();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__TASK = eINSTANCE.getSolutionTask_Task();

		/**
		 * The meta object literal for the '<em><b>Next Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__NEXT_TASK = eINSTANCE.getSolutionTask_NextTask();

		/**
		 * The meta object literal for the '<em><b>Previous Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__PREVIOUS_TASK = eINSTANCE.getSolutionTask_PreviousTask();

		/**
		 * The meta object literal for the '<em><b>Assigned Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__ASSIGNED_RESOURCE = eINSTANCE.getSolutionTask_AssignedResource();

		/**
		 * The meta object literal for the '<em><b>Candidate Assigned Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__CANDIDATE_ASSIGNED_RESOURCE = eINSTANCE.getSolutionTask_CandidateAssignedResource();

		/**
		 * The meta object literal for the '<em><b>Candidate Next Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__CANDIDATE_NEXT_TASK = eINSTANCE.getSolutionTask_CandidateNextTask();

		/**
		 * The meta object literal for the '<em><b>Candidate Previous Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK = eINSTANCE.getSolutionTask_CandidatePreviousTask();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__EXPRESSIONS = eINSTANCE.getSolutionTask_Expressions();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionExpressionImpl <em>Solution Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.SolutionExpressionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionExpression()
		 * @generated
		 */
		EClass SOLUTION_EXPRESSION = eINSTANCE.getSolutionExpression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.MoveExpressionImpl <em>Move Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.MoveExpressionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveExpression()
		 * @generated
		 */
		EClass MOVE_EXPRESSION = eINSTANCE.getMoveExpression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceExpressionImpl <em>Resource Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResourceExpressionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResourceExpression()
		 * @generated
		 */
		EClass RESOURCE_EXPRESSION = eINSTANCE.getResourceExpression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.TaskExpressionImpl <em>Task Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.TaskExpressionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTaskExpression()
		 * @generated
		 */
		EClass TASK_EXPRESSION = eINSTANCE.getTaskExpression();

		/**
		 * The meta object literal for the '<em><b>Reset Candidate Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EXPRESSION__RESET_CANDIDATE_VALUE = eINSTANCE.getTaskExpression_ResetCandidateValue();

		/**
		 * The meta object literal for the '<em><b>Calc Candidate Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EXPRESSION__CALC_CANDIDATE_VALUE = eINSTANCE.getTaskExpression_CalcCandidateValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResetTaskExpressionCandidateValueImpl <em>Reset Task Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResetTaskExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetTaskExpressionCandidateValue()
		 * @generated
		 */
		EClass RESET_TASK_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getResetTaskExpressionCandidateValue();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESET_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = eINSTANCE.getResetTaskExpressionCandidateValue_Expression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.CalcTaskExpressionCandidateValueImpl <em>Calc Task Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.CalcTaskExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcTaskExpressionCandidateValue()
		 * @generated
		 */
		EClass CALC_TASK_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getCalcTaskExpressionCandidateValue();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = eINSTANCE.getCalcTaskExpressionCandidateValue_Expression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResetResourceExpressionCandidateValueImpl <em>Reset Resource Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResetResourceExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetResourceExpressionCandidateValue()
		 * @generated
		 */
		EClass RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getResetResourceExpressionCandidateValue();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = eINSTANCE.getResetResourceExpressionCandidateValue_Expression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.CalcResourceExpressionCandidateValueImpl <em>Calc Resource Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.CalcResourceExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcResourceExpressionCandidateValue()
		 * @generated
		 */
		EClass CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getCalcResourceExpressionCandidateValue();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = eINSTANCE.getCalcResourceExpressionCandidateValue_Expression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.CalcSolutionAllExpressionCandidateValuesImpl <em>Calc Solution All Expression Candidate Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.CalcSolutionAllExpressionCandidateValuesImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcSolutionAllExpressionCandidateValues()
		 * @generated
		 */
		EClass CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = eINSTANCE.getCalcSolutionAllExpressionCandidateValues();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__SOLUTION = eINSTANCE.getCalcSolutionAllExpressionCandidateValues_Solution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResetSolutionAllExpressionCandidateValuesImpl <em>Reset Solution All Expression Candidate Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResetSolutionAllExpressionCandidateValuesImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetSolutionAllExpressionCandidateValues()
		 * @generated
		 */
		EClass RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = eINSTANCE.getResetSolutionAllExpressionCandidateValues();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__SOLUTION = eINSTANCE.getResetSolutionAllExpressionCandidateValues_Solution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResetSolutionExpressionCandidateValueImpl <em>Reset Solution Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResetSolutionExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetSolutionExpressionCandidateValue()
		 * @generated
		 */
		EClass RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getResetSolutionExpressionCandidateValue();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = eINSTANCE.getResetSolutionExpressionCandidateValue_Expression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.CalcSolutionExpressionCandidateValueImpl <em>Calc Solution Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.CalcSolutionExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcSolutionExpressionCandidateValue()
		 * @generated
		 */
		EClass CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getCalcSolutionExpressionCandidateValue();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__EXPRESSION = eINSTANCE.getCalcSolutionExpressionCandidateValue_Expression();

	}

} //SchedulerPackage
