/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

import org.eclipse.emf.ecore.EAttribute;
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Current Solutionntr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__CURRENT_SOLUTIONNTR = 4;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__RESOURCES = 2;

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
	 * The feature id for the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_NR = 5;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SCHEDULER = 6;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CLONE = 0;

	/**
	 * The operation id for the '<em>Set Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___SET_CANDIDATE__MOVE = 1;

	/**
	 * The operation id for the '<em>Reset Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___RESET_CANDIDATE = 2;

	/**
	 * The operation id for the '<em>Accept Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___ACCEPT_CANDIDATE = 3;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___RESET = 4;

	/**
	 * The operation id for the '<em>Construct Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CONSTRUCT_TASK__TASK = 5;

	/**
	 * The operation id for the '<em>Construct Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CONSTRUCT_RESOURCE__RESOURCE = 6;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl <em>Solution Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionResource()
	 * @generated
	 */
	int SOLUTION_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Scheduled Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__SCHEDULED_TASKS = 1;

	/**
	 * The feature id for the '<em><b>Candidate Scheduled Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS = 2;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__EXPRESSIONS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__SOLUTION = 5;

	/**
	 * The number of structural features of the '<em>Solution Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE_FEATURE_COUNT = 6;

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
	int SOLUTION_TASK = 5;

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
	 * The feature id for the '<em><b>Scheduled Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__SCHEDULED_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Candidate Scheduled Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE = 4;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__SOLUTION = 9;

	/**
	 * The number of structural features of the '<em>Solution Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Solution Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.MoveImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 6;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__EXPRESSIONS = 0;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__CHANGES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.MoveExpressionImpl <em>Move Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.MoveExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveExpression()
	 * @generated
	 */
	int MOVE_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Move Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Move Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionExpressionImpl <em>Solution Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionExpression()
	 * @generated
	 */
	int SOLUTION_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION__SOLUTION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Solution Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Solution Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionPropagatorFunctionImpl <em>Solution Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionPropagatorFunctionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionPropagatorFunction()
	 * @generated
	 */
	int SOLUTION_PROPAGATOR_FUNCTION = 29;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__SOLUTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Solution Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.CalcSolutionAllExpressionCandidateValuesImpl <em>Calc Solution All Expression Candidate Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.CalcSolutionAllExpressionCandidateValuesImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcSolutionAllExpressionCandidateValues()
	 * @generated
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__PARENT = SOLUTION_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ANTECEDENTS = SOLUTION_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ANTECEDENTS_SIBLING = SOLUTION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHED = SOLUTION_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHED_CHILDREN = SOLUTION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHERS = SOLUTION_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ENABLED = SOLUTION_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = SOLUTION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TYPE = SOLUTION_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__OBJECT = SOLUTION_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__INSTANCE = SOLUTION_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__DESCRIPTION = SOLUTION_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__SOLUTION = SOLUTION_PROPAGATOR_FUNCTION__SOLUTION;

	/**
	 * The number of structural features of the '<em>Calc Solution All Expression Candidate Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES_FEATURE_COUNT = SOLUTION_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___INIT = SOLUTION_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___ENABLE = SOLUTION_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DISABLE = SOLUTION_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___RESET = SOLUTION_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___TOUCH__EOBJECT = SOLUTION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___UNTOUCH = SOLUTION_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_ANTECEDENTS = SOLUTION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_THIS = SOLUTION_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_CHILDREN_AND_THIS = SOLUTION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH = SOLUTION_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_ANTECEDENTS = SOLUTION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_PARENT = SOLUTION_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_REFRESH = SOLUTION_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_REFRESH__EOBJECT = SOLUTION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___GET_SCOPE = SOLUTION_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_BINDINGS = SOLUTION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = SOLUTION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Solution All Expression Candidate Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES_OPERATION_COUNT = SOLUTION_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResetSolutionAllExpressionCandidateValuesImpl <em>Reset Solution All Expression Candidate Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResetSolutionAllExpressionCandidateValuesImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetSolutionAllExpressionCandidateValues()
	 * @generated
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__PARENT = SOLUTION_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ANTECEDENTS = SOLUTION_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ANTECEDENTS_SIBLING = SOLUTION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHED = SOLUTION_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHED_CHILDREN = SOLUTION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHERS = SOLUTION_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__ENABLED = SOLUTION_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = SOLUTION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TYPE = SOLUTION_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__OBJECT = SOLUTION_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__INSTANCE = SOLUTION_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__DESCRIPTION = SOLUTION_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__SOLUTION = SOLUTION_PROPAGATOR_FUNCTION__SOLUTION;

	/**
	 * The number of structural features of the '<em>Reset Solution All Expression Candidate Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES_FEATURE_COUNT = SOLUTION_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___INIT = SOLUTION_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___ENABLE = SOLUTION_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DISABLE = SOLUTION_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___RESET = SOLUTION_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___TOUCH__EOBJECT = SOLUTION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___UNTOUCH = SOLUTION_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_ANTECEDENTS = SOLUTION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_THIS = SOLUTION_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH_CHILDREN_AND_THIS = SOLUTION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___REFRESH = SOLUTION_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_ANTECEDENTS = SOLUTION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_PARENT = SOLUTION_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_REFRESH = SOLUTION_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_REFRESH__EOBJECT = SOLUTION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___GET_SCOPE = SOLUTION_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_GET_BINDINGS = SOLUTION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = SOLUTION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Solution All Expression Candidate Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES_OPERATION_COUNT = SOLUTION_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionExpressionPropagatorFunctionImpl <em>Solution Expression Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionExpressionPropagatorFunctionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionExpressionPropagatorFunction()
	 * @generated
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__SOLUTION_EXPRESSION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution Expression Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Solution Expression Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResetSolutionExpressionCandidateValueImpl <em>Reset Solution Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResetSolutionExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetSolutionExpressionCandidateValue()
	 * @generated
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__PARENT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHED = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ENABLED = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TYPE = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__OBJECT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__INSTANCE = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__SOLUTION_EXPRESSION = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__SOLUTION_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Reset Solution Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___INIT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___ENABLE = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DISABLE = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___RESET = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Solution Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceExpressionImpl <em>Resource Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResourceExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResourceExpression()
	 * @generated
	 */
	int RESOURCE_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Resource Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceExpressionPropagatorFunctionImpl <em>Resource Expression Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResourceExpressionPropagatorFunctionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResourceExpressionPropagatorFunction()
	 * @generated
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION = 26;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resource Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__RESOURCE_EXPRESSION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Expression Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Resource Expression Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

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
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__PARENT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHED = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ENABLED = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TYPE = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__OBJECT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__INSTANCE = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resource Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__RESOURCE_EXPRESSION = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__RESOURCE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Calc Resource Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___INIT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___ENABLE = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DISABLE = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___RESET = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Resource Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResetResourceExpressionCandidateValueImpl <em>Reset Resource Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResetResourceExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetResourceExpressionCandidateValue()
	 * @generated
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__PARENT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHED = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__ENABLED = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TYPE = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__OBJECT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__INSTANCE = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resource Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__RESOURCE_EXPRESSION = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__RESOURCE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Reset Resource Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___INIT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___ENABLE = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DISABLE = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___RESET = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___REFRESH = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Resource Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.TaskExpressionImpl <em>Task Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.TaskExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTaskExpression()
	 * @generated
	 */
	int TASK_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION__TASK = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION__ROLE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 3;

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
	 * The operation id for the '<em>Reset Value Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION___RESET_VALUE_CANDIDATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Value Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION___REFRESH_VALUE_CANDIDATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.TaskExpressionPropagatorFunctionImpl <em>Task Expression Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.TaskExpressionPropagatorFunctionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTaskExpressionPropagatorFunction()
	 * @generated
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__TASK_EXPRESSION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Expression Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Task Expression Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.CalcTaskExpressionCandidateValueImpl <em>Calc Task Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.CalcTaskExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcTaskExpressionCandidateValue()
	 * @generated
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__PARENT = TASK_EXPRESSION_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = TASK_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = TASK_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__ENABLED = TASK_EXPRESSION_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TASK_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TYPE = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__OBJECT = TASK_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__INSTANCE = TASK_EXPRESSION_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = TASK_EXPRESSION_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TASK_EXPRESSION = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TASK_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Calc Task Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = TASK_EXPRESSION_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___INIT = TASK_EXPRESSION_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___ENABLE = TASK_EXPRESSION_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DISABLE = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___RESET = TASK_EXPRESSION_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = TASK_EXPRESSION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = TASK_EXPRESSION_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH = TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = TASK_EXPRESSION_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Task Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = TASK_EXPRESSION_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResetTaskExpressionCandidateValueImpl <em>Reset Task Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResetTaskExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetTaskExpressionCandidateValue()
	 * @generated
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE = 18;

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
	 * The feature id for the '<em><b>Task Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TASK_EXPRESSION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.TaskFloatExpressionImpl <em>Task Float Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.TaskFloatExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTaskFloatExpression()
	 * @generated
	 */
	int TASK_FLOAT_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION__PROPAGATOR_FUNCTIONS = TASK_EXPRESSION__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION__TASK = TASK_EXPRESSION__TASK;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION__DESCRIPTION = TASK_EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION__ROLE = TASK_EXPRESSION__ROLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION__VALUE = TASK_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Candidate Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION__CANDIDATE_VALUE = TASK_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Float Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION_FEATURE_COUNT = TASK_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = TASK_EXPRESSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION___GET_PROPAGATOR_FUNCTION__ECLASS = TASK_EXPRESSION___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Reset Value Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION___RESET_VALUE_CANDIDATE = TASK_EXPRESSION___RESET_VALUE_CANDIDATE;

	/**
	 * The operation id for the '<em>Refresh Value Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION___REFRESH_VALUE_CANDIDATE = TASK_EXPRESSION___REFRESH_VALUE_CANDIDATE;

	/**
	 * The number of operations of the '<em>Task Float Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FLOAT_EXPRESSION_OPERATION_COUNT = TASK_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.MoveChangeImpl <em>Move Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.MoveChangeImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveChange()
	 * @generated
	 */
	int MOVE_CHANGE = 20;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE__TASK_TO_SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Move Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE___CHANGE = 0;

	/**
	 * The number of operations of the '<em>Move Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleAfterImpl <em>Schedule After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleAfterImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleAfter()
	 * @generated
	 */
	int SCHEDULE_AFTER = 21;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__TASK_TO_SCHEDULE = MOVE_CHANGE__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__DESCRIPTION = MOVE_CHANGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Task Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__TASK_BEFORE = MOVE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schedule After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER_FEATURE_COUNT = MOVE_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER___CHANGE = MOVE_CHANGE___CHANGE;

	/**
	 * The number of operations of the '<em>Schedule After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER_OPERATION_COUNT = MOVE_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl <em>Schedule Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleBefore()
	 * @generated
	 */
	int SCHEDULE_BEFORE = 22;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__TASK_TO_SCHEDULE = MOVE_CHANGE__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__DESCRIPTION = MOVE_CHANGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Task After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__TASK_AFTER = MOVE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schedule Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE_FEATURE_COUNT = MOVE_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE___CHANGE = MOVE_CHANGE___CHANGE;

	/**
	 * The number of operations of the '<em>Schedule Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE_OPERATION_COUNT = MOVE_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleFirstImpl <em>Schedule First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleFirstImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleFirst()
	 * @generated
	 */
	int SCHEDULE_FIRST = 23;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST__TASK_TO_SCHEDULE = MOVE_CHANGE__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST__DESCRIPTION = MOVE_CHANGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST__RESOURCE = MOVE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schedule First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST_FEATURE_COUNT = MOVE_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST___CHANGE = MOVE_CHANGE___CHANGE;

	/**
	 * The number of operations of the '<em>Schedule First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST_OPERATION_COUNT = MOVE_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleLastImpl <em>Schedule Last</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleLastImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleLast()
	 * @generated
	 */
	int SCHEDULE_LAST = 24;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST__TASK_TO_SCHEDULE = MOVE_CHANGE__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST__DESCRIPTION = MOVE_CHANGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST__RESOURCE = MOVE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schedule Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST_FEATURE_COUNT = MOVE_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST___CHANGE = MOVE_CHANGE___CHANGE;

	/**
	 * The number of operations of the '<em>Schedule Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST_OPERATION_COUNT = MOVE_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.UnscheduleImpl <em>Unschedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.UnscheduleImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getUnschedule()
	 * @generated
	 */
	int UNSCHEDULE = 25;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__TASK_TO_SCHEDULE = MOVE_CHANGE__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__DESCRIPTION = MOVE_CHANGE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Unschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE_FEATURE_COUNT = MOVE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE___CHANGE = MOVE_CHANGE___CHANGE;

	/**
	 * The number of operations of the '<em>Unschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE_OPERATION_COUNT = MOVE_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.CalcSolutionExpressionCandidateValueImpl <em>Calc Solution Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.CalcSolutionExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcSolutionExpressionCandidateValue()
	 * @generated
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE = 27;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__PARENT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHED = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__ENABLED = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TYPE = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__OBJECT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__INSTANCE = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__SOLUTION_EXPRESSION = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__SOLUTION_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Calc Solution Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___INIT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___ENABLE = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DISABLE = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___RESET = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___REFRESH = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Solution Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.CalcTaksExpressionCandidateValueCumulativeImpl <em>Calc Taks Expression Candidate Value Cumulative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.CalcTaksExpressionCandidateValueCumulativeImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcTaksExpressionCandidateValueCumulative()
	 * @generated
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE = 30;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__PARENT = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__ANTECEDENTS = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__ANTECEDENTS_SIBLING = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__TOUCHED = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__TOUCHED_CHILDREN = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__TOUCHERS = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__ENABLED = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__TYPE = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__OBJECT = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__INSTANCE = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__DESCRIPTION = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__TASK_EXPRESSION = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TASK_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Calc Taks Expression Candidate Value Cumulative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE_FEATURE_COUNT = CALC_TASK_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___INIT = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___ENABLE = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___DISABLE = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___RESET = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___TOUCH__EOBJECT = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___UNTOUCH = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___REFRESH_ANTECEDENTS = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___REFRESH_THIS = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___REFRESH_CHILDREN_AND_THIS = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___REFRESH = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___DO_GET_ANTECEDENTS = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___DO_GET_PARENT = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___DO_REFRESH = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___DO_REFRESH__EOBJECT = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___GET_SCOPE = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___DO_GET_BINDINGS = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Taks Expression Candidate Value Cumulative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE_OPERATION_COUNT = CALC_TASK_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Scheduler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.scheduler.Scheduler#getName()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Scheduler#getCurrentSolutionntr <em>Current Solutionntr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Solutionntr</em>'.
	 * @see com.misc.common.moplaf.scheduler.Scheduler#getCurrentSolutionntr()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_CurrentSolutionntr();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.scheduler.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.scheduler.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Solution#getSolutionNr <em>Solution Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution Nr</em>'.
	 * @see com.misc.common.moplaf.scheduler.Solution#getSolutionNr()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_SolutionNr();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.scheduler.Solution#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scheduler</em>'.
	 * @see com.misc.common.moplaf.scheduler.Solution#getScheduler()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Scheduler();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Solution#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Solution#clone()
	 * @generated
	 */
	EOperation getSolution__Clone();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Solution#resetCandidate() <em>Reset Candidate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Candidate</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Solution#resetCandidate()
	 * @generated
	 */
	EOperation getSolution__ResetCandidate();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Solution#acceptCandidate() <em>Accept Candidate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Candidate</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Solution#acceptCandidate()
	 * @generated
	 */
	EOperation getSolution__AcceptCandidate();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Solution#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Solution#reset()
	 * @generated
	 */
	EOperation getSolution__Reset();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Solution#constructTask(com.misc.common.moplaf.scheduler.Task) <em>Construct Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Task</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Solution#constructTask(com.misc.common.moplaf.scheduler.Task)
	 * @generated
	 */
	EOperation getSolution__ConstructTask__Task();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Solution#constructResource(com.misc.common.moplaf.scheduler.Resource) <em>Construct Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Resource</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Solution#constructResource(com.misc.common.moplaf.scheduler.Resource)
	 * @generated
	 */
	EOperation getSolution__ConstructResource__Resource();

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
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.scheduler.SolutionResource#getScheduledTasks <em>Scheduled Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled Tasks</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getScheduledTasks()
	 * @see #getSolutionResource()
	 * @generated
	 */
	EReference getSolutionResource_ScheduledTasks();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.scheduler.SolutionResource#getCandidateScheduledTasks <em>Candidate Scheduled Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Candidate Scheduled Tasks</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getCandidateScheduledTasks()
	 * @see #getSolutionResource()
	 * @generated
	 */
	EReference getSolutionResource_CandidateScheduledTasks();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.SolutionResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getDescription()
	 * @see #getSolutionResource()
	 * @generated
	 */
	EAttribute getSolutionResource_Description();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.scheduler.SolutionResource#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getSolution()
	 * @see #getSolutionResource()
	 * @generated
	 */
	EReference getSolutionResource_Solution();

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
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionTask#getScheduledResource <em>Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduled Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getScheduledResource()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_ScheduledResource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionTask#getCandidateScheduledResource <em>Candidate Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Candidate Scheduled Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getCandidateScheduledResource()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_CandidateScheduledResource();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.SolutionTask#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getDescription()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EAttribute getSolutionTask_Description();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.scheduler.SolutionTask#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getSolution()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EReference getSolutionTask_Solution();

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
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Move#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changes</em>'.
	 * @see com.misc.common.moplaf.scheduler.Move#getChanges()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Changes();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Move#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.scheduler.Move#getName()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Name();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.MoveExpression#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveExpression#getDescription()
	 * @see #getMoveExpression()
	 * @generated
	 */
	EAttribute getMoveExpression_Description();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.scheduler.SolutionExpression#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionExpression#getSolution()
	 * @see #getSolutionExpression()
	 * @generated
	 */
	EReference getSolutionExpression_Solution();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.SolutionExpression#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionExpression#getDescription()
	 * @see #getSolutionExpression()
	 * @generated
	 */
	EAttribute getSolutionExpression_Description();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues <em>Reset Solution All Expression Candidate Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Solution All Expression Candidate Values</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetSolutionAllExpressionCandidateValues
	 * @generated
	 */
	EClass getResetSolutionAllExpressionCandidateValues();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.SolutionExpressionPropagatorFunction <em>Solution Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Expression Propagator Function</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionExpressionPropagatorFunction
	 * @generated
	 */
	EClass getSolutionExpressionPropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionExpressionPropagatorFunction#getSolutionExpression <em>Solution Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionExpressionPropagatorFunction#getSolutionExpression()
	 * @see #getSolutionExpressionPropagatorFunction()
	 * @generated
	 */
	EReference getSolutionExpressionPropagatorFunction_SolutionExpression();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ResourceExpression <em>Resource Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResourceExpression
	 * @generated
	 */
	EClass getResourceExpression();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.scheduler.ResourceExpression#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResourceExpression#getResource()
	 * @see #getResourceExpression()
	 * @generated
	 */
	EReference getResourceExpression_Resource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.ResourceExpression#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResourceExpression#getDescription()
	 * @see #getResourceExpression()
	 * @generated
	 */
	EAttribute getResourceExpression_Description();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ResetResourceExpressionCandidateValue <em>Reset Resource Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Resource Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetResourceExpressionCandidateValue
	 * @generated
	 */
	EClass getResetResourceExpressionCandidateValue();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.scheduler.TaskExpression#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskExpression#getTask()
	 * @see #getTaskExpression()
	 * @generated
	 */
	EReference getTaskExpression_Task();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.TaskExpression#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskExpression#getDescription()
	 * @see #getTaskExpression()
	 * @generated
	 */
	EAttribute getTaskExpression_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.TaskExpression#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskExpression#getRole()
	 * @see #getTaskExpression()
	 * @generated
	 */
	EAttribute getTaskExpression_Role();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.TaskExpression#resetValueCandidate() <em>Reset Value Candidate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Value Candidate</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.TaskExpression#resetValueCandidate()
	 * @generated
	 */
	EOperation getTaskExpression__ResetValueCandidate();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.TaskExpression#refreshValueCandidate() <em>Refresh Value Candidate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Value Candidate</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.TaskExpression#refreshValueCandidate()
	 * @generated
	 */
	EOperation getTaskExpression__RefreshValueCandidate();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue <em>Reset Task Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Task Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResetTaskExpressionCandidateValue
	 * @generated
	 */
	EClass getResetTaskExpressionCandidateValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.TaskFloatExpression <em>Task Float Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Float Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskFloatExpression
	 * @generated
	 */
	EClass getTaskFloatExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.TaskFloatExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskFloatExpression#getValue()
	 * @see #getTaskFloatExpression()
	 * @generated
	 */
	EAttribute getTaskFloatExpression_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.TaskFloatExpression#getCandidateValue <em>Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidate Value</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskFloatExpression#getCandidateValue()
	 * @see #getTaskFloatExpression()
	 * @generated
	 */
	EAttribute getTaskFloatExpression_CandidateValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.MoveChange <em>Move Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Change</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveChange
	 * @generated
	 */
	EClass getMoveChange();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.MoveChange#getTaskToSchedule <em>Task To Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task To Schedule</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveChange#getTaskToSchedule()
	 * @see #getMoveChange()
	 * @generated
	 */
	EReference getMoveChange_TaskToSchedule();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.MoveChange#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveChange#getDescription()
	 * @see #getMoveChange()
	 * @generated
	 */
	EAttribute getMoveChange_Description();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.MoveChange#change() <em>Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.MoveChange#change()
	 * @generated
	 */
	EOperation getMoveChange__Change();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ScheduleAfter <em>Schedule After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule After</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleAfter
	 * @generated
	 */
	EClass getScheduleAfter();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.ScheduleAfter#getTaskBefore <em>Task Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Before</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleAfter#getTaskBefore()
	 * @see #getScheduleAfter()
	 * @generated
	 */
	EReference getScheduleAfter_TaskBefore();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ScheduleBefore <em>Schedule Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Before</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleBefore
	 * @generated
	 */
	EClass getScheduleBefore();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.ScheduleBefore#getTaskAfter <em>Task After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task After</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleBefore#getTaskAfter()
	 * @see #getScheduleBefore()
	 * @generated
	 */
	EReference getScheduleBefore_TaskAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ScheduleFirst <em>Schedule First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule First</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleFirst
	 * @generated
	 */
	EClass getScheduleFirst();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.ScheduleFirst#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleFirst#getResource()
	 * @see #getScheduleFirst()
	 * @generated
	 */
	EReference getScheduleFirst_Resource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ScheduleLast <em>Schedule Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Last</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleLast
	 * @generated
	 */
	EClass getScheduleLast();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.ScheduleLast#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleLast#getResource()
	 * @see #getScheduleLast()
	 * @generated
	 */
	EReference getScheduleLast_Resource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Unschedule <em>Unschedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unschedule</em>'.
	 * @see com.misc.common.moplaf.scheduler.Unschedule
	 * @generated
	 */
	EClass getUnschedule();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ResourceExpressionPropagatorFunction <em>Resource Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Expression Propagator Function</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResourceExpressionPropagatorFunction
	 * @generated
	 */
	EClass getResourceExpressionPropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.ResourceExpressionPropagatorFunction#getResourceExpression <em>Resource Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.ResourceExpressionPropagatorFunction#getResourceExpression()
	 * @see #getResourceExpressionPropagatorFunction()
	 * @generated
	 */
	EReference getResourceExpressionPropagatorFunction_ResourceExpression();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.TaskExpressionPropagatorFunction <em>Task Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Expression Propagator Function</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskExpressionPropagatorFunction
	 * @generated
	 */
	EClass getTaskExpressionPropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.TaskExpressionPropagatorFunction#getTaskExpression <em>Task Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Expression</em>'.
	 * @see com.misc.common.moplaf.scheduler.TaskExpressionPropagatorFunction#getTaskExpression()
	 * @see #getTaskExpressionPropagatorFunction()
	 * @generated
	 */
	EReference getTaskExpressionPropagatorFunction_TaskExpression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.SolutionPropagatorFunction <em>Solution Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Propagator Function</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionPropagatorFunction
	 * @generated
	 */
	EClass getSolutionPropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.SolutionPropagatorFunction#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionPropagatorFunction#getSolution()
	 * @see #getSolutionPropagatorFunction()
	 * @generated
	 */
	EReference getSolutionPropagatorFunction_Solution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.CalcTaksExpressionCandidateValueCumulative <em>Calc Taks Expression Candidate Value Cumulative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Taks Expression Candidate Value Cumulative</em>'.
	 * @see com.misc.common.moplaf.scheduler.CalcTaksExpressionCandidateValueCumulative
	 * @generated
	 */
	EClass getCalcTaksExpressionCandidateValueCumulative();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER__NAME = eINSTANCE.getScheduler_Name();

		/**
		 * The meta object literal for the '<em><b>Current Solutionntr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER__CURRENT_SOLUTIONNTR = eINSTANCE.getScheduler_CurrentSolutionntr();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

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
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__TASKS = eINSTANCE.getSolution_Tasks();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__RESOURCES = eINSTANCE.getSolution_Resources();

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
		 * The meta object literal for the '<em><b>Solution Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__SOLUTION_NR = eINSTANCE.getSolution_SolutionNr();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__SCHEDULER = eINSTANCE.getSolution_Scheduler();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___CLONE = eINSTANCE.getSolution__Clone();

		/**
		 * The meta object literal for the '<em><b>Set Candidate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___SET_CANDIDATE__MOVE = eINSTANCE.getSolution__SetCandidate__Move();

		/**
		 * The meta object literal for the '<em><b>Reset Candidate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___RESET_CANDIDATE = eINSTANCE.getSolution__ResetCandidate();

		/**
		 * The meta object literal for the '<em><b>Accept Candidate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___ACCEPT_CANDIDATE = eINSTANCE.getSolution__AcceptCandidate();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___RESET = eINSTANCE.getSolution__Reset();

		/**
		 * The meta object literal for the '<em><b>Construct Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___CONSTRUCT_TASK__TASK = eINSTANCE.getSolution__ConstructTask__Task();

		/**
		 * The meta object literal for the '<em><b>Construct Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___CONSTRUCT_RESOURCE__RESOURCE = eINSTANCE.getSolution__ConstructResource__Resource();

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
		 * The meta object literal for the '<em><b>Scheduled Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_RESOURCE__SCHEDULED_TASKS = eINSTANCE.getSolutionResource_ScheduledTasks();

		/**
		 * The meta object literal for the '<em><b>Candidate Scheduled Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS = eINSTANCE.getSolutionResource_CandidateScheduledTasks();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_RESOURCE__EXPRESSIONS = eINSTANCE.getSolutionResource_Expressions();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_RESOURCE__DESCRIPTION = eINSTANCE.getSolutionResource_Description();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_RESOURCE__SOLUTION = eINSTANCE.getSolutionResource_Solution();

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
		 * The meta object literal for the '<em><b>Scheduled Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__SCHEDULED_RESOURCE = eINSTANCE.getSolutionTask_ScheduledResource();

		/**
		 * The meta object literal for the '<em><b>Candidate Scheduled Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE = eINSTANCE.getSolutionTask_CandidateScheduledResource();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_TASK__DESCRIPTION = eINSTANCE.getSolutionTask_Description();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_TASK__SOLUTION = eINSTANCE.getSolutionTask_Solution();

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
		 * The meta object literal for the '<em><b>Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__CHANGES = eINSTANCE.getMove_Changes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__NAME = eINSTANCE.getMove_Name();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_EXPRESSION__DESCRIPTION = eINSTANCE.getMoveExpression_Description();

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
		 * The meta object literal for the '<em><b>Solution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_EXPRESSION__SOLUTION = eINSTANCE.getSolutionExpression_Solution();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_EXPRESSION__DESCRIPTION = eINSTANCE.getSolutionExpression_Description();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResetSolutionAllExpressionCandidateValuesImpl <em>Reset Solution All Expression Candidate Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResetSolutionAllExpressionCandidateValuesImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetSolutionAllExpressionCandidateValues()
		 * @generated
		 */
		EClass RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = eINSTANCE.getResetSolutionAllExpressionCandidateValues();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionExpressionPropagatorFunctionImpl <em>Solution Expression Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.SolutionExpressionPropagatorFunctionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionExpressionPropagatorFunction()
		 * @generated
		 */
		EClass SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION = eINSTANCE.getSolutionExpressionPropagatorFunction();

		/**
		 * The meta object literal for the '<em><b>Solution Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__SOLUTION_EXPRESSION = eINSTANCE.getSolutionExpressionPropagatorFunction_SolutionExpression();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceExpressionImpl <em>Resource Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResourceExpressionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResourceExpression()
		 * @generated
		 */
		EClass RESOURCE_EXPRESSION = eINSTANCE.getResourceExpression();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_EXPRESSION__RESOURCE = eINSTANCE.getResourceExpression_Resource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_EXPRESSION__DESCRIPTION = eINSTANCE.getResourceExpression_Description();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResetResourceExpressionCandidateValueImpl <em>Reset Resource Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResetResourceExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetResourceExpressionCandidateValue()
		 * @generated
		 */
		EClass RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getResetResourceExpressionCandidateValue();

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
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EXPRESSION__TASK = eINSTANCE.getTaskExpression_Task();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_EXPRESSION__DESCRIPTION = eINSTANCE.getTaskExpression_Description();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_EXPRESSION__ROLE = eINSTANCE.getTaskExpression_Role();

		/**
		 * The meta object literal for the '<em><b>Reset Value Candidate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_EXPRESSION___RESET_VALUE_CANDIDATE = eINSTANCE.getTaskExpression__ResetValueCandidate();

		/**
		 * The meta object literal for the '<em><b>Refresh Value Candidate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_EXPRESSION___REFRESH_VALUE_CANDIDATE = eINSTANCE.getTaskExpression__RefreshValueCandidate();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResetTaskExpressionCandidateValueImpl <em>Reset Task Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResetTaskExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResetTaskExpressionCandidateValue()
		 * @generated
		 */
		EClass RESET_TASK_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getResetTaskExpressionCandidateValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.TaskFloatExpressionImpl <em>Task Float Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.TaskFloatExpressionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTaskFloatExpression()
		 * @generated
		 */
		EClass TASK_FLOAT_EXPRESSION = eINSTANCE.getTaskFloatExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_FLOAT_EXPRESSION__VALUE = eINSTANCE.getTaskFloatExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Candidate Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_FLOAT_EXPRESSION__CANDIDATE_VALUE = eINSTANCE.getTaskFloatExpression_CandidateValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.MoveChangeImpl <em>Move Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.MoveChangeImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveChange()
		 * @generated
		 */
		EClass MOVE_CHANGE = eINSTANCE.getMoveChange();

		/**
		 * The meta object literal for the '<em><b>Task To Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_CHANGE__TASK_TO_SCHEDULE = eINSTANCE.getMoveChange_TaskToSchedule();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_CHANGE__DESCRIPTION = eINSTANCE.getMoveChange_Description();

		/**
		 * The meta object literal for the '<em><b>Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOVE_CHANGE___CHANGE = eINSTANCE.getMoveChange__Change();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleAfterImpl <em>Schedule After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ScheduleAfterImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleAfter()
		 * @generated
		 */
		EClass SCHEDULE_AFTER = eINSTANCE.getScheduleAfter();

		/**
		 * The meta object literal for the '<em><b>Task Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_AFTER__TASK_BEFORE = eINSTANCE.getScheduleAfter_TaskBefore();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl <em>Schedule Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleBefore()
		 * @generated
		 */
		EClass SCHEDULE_BEFORE = eINSTANCE.getScheduleBefore();

		/**
		 * The meta object literal for the '<em><b>Task After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_BEFORE__TASK_AFTER = eINSTANCE.getScheduleBefore_TaskAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleFirstImpl <em>Schedule First</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ScheduleFirstImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleFirst()
		 * @generated
		 */
		EClass SCHEDULE_FIRST = eINSTANCE.getScheduleFirst();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_FIRST__RESOURCE = eINSTANCE.getScheduleFirst_Resource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleLastImpl <em>Schedule Last</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ScheduleLastImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleLast()
		 * @generated
		 */
		EClass SCHEDULE_LAST = eINSTANCE.getScheduleLast();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_LAST__RESOURCE = eINSTANCE.getScheduleLast_Resource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.UnscheduleImpl <em>Unschedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.UnscheduleImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getUnschedule()
		 * @generated
		 */
		EClass UNSCHEDULE = eINSTANCE.getUnschedule();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceExpressionPropagatorFunctionImpl <em>Resource Expression Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResourceExpressionPropagatorFunctionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResourceExpressionPropagatorFunction()
		 * @generated
		 */
		EClass RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION = eINSTANCE.getResourceExpressionPropagatorFunction();

		/**
		 * The meta object literal for the '<em><b>Resource Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__RESOURCE_EXPRESSION = eINSTANCE.getResourceExpressionPropagatorFunction_ResourceExpression();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.TaskExpressionPropagatorFunctionImpl <em>Task Expression Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.TaskExpressionPropagatorFunctionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTaskExpressionPropagatorFunction()
		 * @generated
		 */
		EClass TASK_EXPRESSION_PROPAGATOR_FUNCTION = eINSTANCE.getTaskExpressionPropagatorFunction();

		/**
		 * The meta object literal for the '<em><b>Task Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EXPRESSION_PROPAGATOR_FUNCTION__TASK_EXPRESSION = eINSTANCE.getTaskExpressionPropagatorFunction_TaskExpression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionPropagatorFunctionImpl <em>Solution Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.SolutionPropagatorFunctionImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionPropagatorFunction()
		 * @generated
		 */
		EClass SOLUTION_PROPAGATOR_FUNCTION = eINSTANCE.getSolutionPropagatorFunction();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_PROPAGATOR_FUNCTION__SOLUTION = eINSTANCE.getSolutionPropagatorFunction_Solution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.CalcTaksExpressionCandidateValueCumulativeImpl <em>Calc Taks Expression Candidate Value Cumulative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.CalcTaksExpressionCandidateValueCumulativeImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getCalcTaksExpressionCandidateValueCumulative()
		 * @generated
		 */
		EClass CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE = eINSTANCE.getCalcTaksExpressionCandidateValueCumulative();

	}

} //SchedulerPackage
