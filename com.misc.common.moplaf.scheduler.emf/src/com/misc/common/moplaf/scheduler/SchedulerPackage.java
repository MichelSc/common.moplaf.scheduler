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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Current Solutionntr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__CURRENT_SOLUTIONNTR = 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__TASKS = 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__RESOURCES = 4;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 1;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__MOVES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__TASKS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__RESOURCES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Candidate Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CANDIDATE_MOVE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__EXPRESSIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_NR = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SCHEDULER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CLONE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___SET_CANDIDATE__MOVE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Reset Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___RESET_CANDIDATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___ACCEPT_CANDIDATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___RESET = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Construct Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CONSTRUCT_TASK__EOBJECT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Construct Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CONSTRUCT_RESOURCE__EOBJECT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl <em>Solution Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionResource()
	 * @generated
	 */
	int SOLUTION_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Scheduled Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__SCHEDULED_TASKS = 0;

	/**
	 * The feature id for the '<em><b>Candidate Scheduled Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS = 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__EXPRESSIONS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__SOLUTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE__RESOURCE = 6;

	/**
	 * The number of structural features of the '<em>Solution Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_RESOURCE_FEATURE_COUNT = 7;

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
	int SOLUTION_TASK = 3;

	/**
	 * The feature id for the '<em><b>Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__NEXT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__PREVIOUS_TASK = 1;

	/**
	 * The feature id for the '<em><b>Scheduled Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__SCHEDULED_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Candidate Scheduled Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Candidate Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__CANDIDATE_NEXT_TASK = 4;

	/**
	 * The feature id for the '<em><b>Candidate Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK = 5;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__EXPRESSIONS = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__SOLUTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__NAME = 9;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK__TASK = 10;

	/**
	 * The number of structural features of the '<em>Solution Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Unset Candidate Previous Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK___UNSET_CANDIDATE_PREVIOUS_NEXT = 0;

	/**
	 * The operation id for the '<em>Set Candidate Previous Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK___SET_CANDIDATE_PREVIOUS_NEXT__SOLUTIONTASK_SOLUTIONTASK = 1;

	/**
	 * The number of operations of the '<em>Solution Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_TASK_OPERATION_COUNT = 2;

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
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SOLUTION = 3;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = 4;

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
	int MOVE_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The number of operations of the '<em>Move Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EXPRESSION_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SolutionExpressionImpl <em>Solution Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SolutionExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSolutionExpression()
	 * @generated
	 */
	int SOLUTION_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION__SOLUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solution Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The number of operations of the '<em>Solution Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceExpressionImpl <em>Resource Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResourceExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResourceExpression()
	 * @generated
	 */
	int RESOURCE_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION__RESOURCE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The number of operations of the '<em>Resource Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.TaskExpressionImpl <em>Task Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.TaskExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTaskExpression()
	 * @generated
	 */
	int TASK_EXPRESSION = 8;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.TaskFloatExpressionImpl <em>Task Float Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.TaskFloatExpressionImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTaskFloatExpression()
	 * @generated
	 */
	int TASK_FLOAT_EXPRESSION = 9;

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
	int MOVE_CHANGE = 10;

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
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE__VALID = 2;

	/**
	 * The feature id for the '<em><b>Move</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE__MOVE = 3;

	/**
	 * The number of structural features of the '<em>Move Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_FEATURE_COUNT = 4;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.MoveChangeTaskImpl <em>Move Change Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.MoveChangeTaskImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveChangeTask()
	 * @generated
	 */
	int MOVE_CHANGE_TASK = 11;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_TASK__TASK_TO_SCHEDULE = MOVE_CHANGE__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_TASK__DESCRIPTION = MOVE_CHANGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_TASK__VALID = MOVE_CHANGE__VALID;

	/**
	 * The feature id for the '<em><b>Move</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_TASK__MOVE = MOVE_CHANGE__MOVE;

	/**
	 * The feature id for the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_TASK__INSERTION_POINT = MOVE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Change Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_TASK_FEATURE_COUNT = MOVE_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_TASK___CHANGE = MOVE_CHANGE___CHANGE;

	/**
	 * The number of operations of the '<em>Move Change Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_TASK_OPERATION_COUNT = MOVE_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleAfterImpl <em>Schedule After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleAfterImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleAfter()
	 * @generated
	 */
	int SCHEDULE_AFTER = 12;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__TASK_TO_SCHEDULE = MOVE_CHANGE_TASK__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__DESCRIPTION = MOVE_CHANGE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__VALID = MOVE_CHANGE_TASK__VALID;

	/**
	 * The feature id for the '<em><b>Move</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__MOVE = MOVE_CHANGE_TASK__MOVE;

	/**
	 * The feature id for the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__INSERTION_POINT = MOVE_CHANGE_TASK__INSERTION_POINT;

	/**
	 * The number of structural features of the '<em>Schedule After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER_FEATURE_COUNT = MOVE_CHANGE_TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER___CHANGE = MOVE_CHANGE_TASK___CHANGE;

	/**
	 * The number of operations of the '<em>Schedule After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER_OPERATION_COUNT = MOVE_CHANGE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl <em>Schedule Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleBefore()
	 * @generated
	 */
	int SCHEDULE_BEFORE = 13;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__TASK_TO_SCHEDULE = MOVE_CHANGE_TASK__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__DESCRIPTION = MOVE_CHANGE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__VALID = MOVE_CHANGE_TASK__VALID;

	/**
	 * The feature id for the '<em><b>Move</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__MOVE = MOVE_CHANGE_TASK__MOVE;

	/**
	 * The feature id for the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__INSERTION_POINT = MOVE_CHANGE_TASK__INSERTION_POINT;

	/**
	 * The number of structural features of the '<em>Schedule Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE_FEATURE_COUNT = MOVE_CHANGE_TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE___CHANGE = MOVE_CHANGE_TASK___CHANGE;

	/**
	 * The number of operations of the '<em>Schedule Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE_OPERATION_COUNT = MOVE_CHANGE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.MoveChangeResourceImpl <em>Move Change Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.MoveChangeResourceImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveChangeResource()
	 * @generated
	 */
	int MOVE_CHANGE_RESOURCE = 14;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_RESOURCE__TASK_TO_SCHEDULE = MOVE_CHANGE__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_RESOURCE__DESCRIPTION = MOVE_CHANGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_RESOURCE__VALID = MOVE_CHANGE__VALID;

	/**
	 * The feature id for the '<em><b>Move</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_RESOURCE__MOVE = MOVE_CHANGE__MOVE;

	/**
	 * The feature id for the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_RESOURCE__INSERTION_POINT = MOVE_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Change Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_RESOURCE_FEATURE_COUNT = MOVE_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_RESOURCE___CHANGE = MOVE_CHANGE___CHANGE;

	/**
	 * The number of operations of the '<em>Move Change Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CHANGE_RESOURCE_OPERATION_COUNT = MOVE_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleFirstImpl <em>Schedule First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleFirstImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleFirst()
	 * @generated
	 */
	int SCHEDULE_FIRST = 15;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST__TASK_TO_SCHEDULE = MOVE_CHANGE_RESOURCE__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST__DESCRIPTION = MOVE_CHANGE_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST__VALID = MOVE_CHANGE_RESOURCE__VALID;

	/**
	 * The feature id for the '<em><b>Move</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST__MOVE = MOVE_CHANGE_RESOURCE__MOVE;

	/**
	 * The feature id for the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST__INSERTION_POINT = MOVE_CHANGE_RESOURCE__INSERTION_POINT;

	/**
	 * The number of structural features of the '<em>Schedule First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST_FEATURE_COUNT = MOVE_CHANGE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST___CHANGE = MOVE_CHANGE_RESOURCE___CHANGE;

	/**
	 * The number of operations of the '<em>Schedule First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FIRST_OPERATION_COUNT = MOVE_CHANGE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleLastImpl <em>Schedule Last</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleLastImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleLast()
	 * @generated
	 */
	int SCHEDULE_LAST = 16;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST__TASK_TO_SCHEDULE = MOVE_CHANGE_RESOURCE__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST__DESCRIPTION = MOVE_CHANGE_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST__VALID = MOVE_CHANGE_RESOURCE__VALID;

	/**
	 * The feature id for the '<em><b>Move</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST__MOVE = MOVE_CHANGE_RESOURCE__MOVE;

	/**
	 * The feature id for the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST__INSERTION_POINT = MOVE_CHANGE_RESOURCE__INSERTION_POINT;

	/**
	 * The number of structural features of the '<em>Schedule Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST_FEATURE_COUNT = MOVE_CHANGE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST___CHANGE = MOVE_CHANGE_RESOURCE___CHANGE;

	/**
	 * The number of operations of the '<em>Schedule Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_LAST_OPERATION_COUNT = MOVE_CHANGE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.UnscheduleImpl <em>Unschedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.UnscheduleImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getUnschedule()
	 * @generated
	 */
	int UNSCHEDULE = 17;

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
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__VALID = MOVE_CHANGE__VALID;

	/**
	 * The feature id for the '<em><b>Move</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__MOVE = MOVE_CHANGE__MOVE;

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
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.scheduler.Scheduler#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see com.misc.common.moplaf.scheduler.Scheduler#getResources()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Resources();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.scheduler.Scheduler#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Solution#constructTask(org.eclipse.emf.ecore.EObject) <em>Construct Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Task</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Solution#constructTask(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSolution__ConstructTask__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Solution#constructResource(org.eclipse.emf.ecore.EObject) <em>Construct Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Resource</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Solution#constructResource(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSolution__ConstructResource__EObject();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.SolutionResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionResource#getName()
	 * @see #getSolutionResource()
	 * @generated
	 */
	EAttribute getSolutionResource_Name();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.SolutionTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#getName()
	 * @see #getSolutionTask()
	 * @generated
	 */
	EAttribute getSolutionTask_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.SolutionTask#unsetCandidatePreviousNext() <em>Unset Candidate Previous Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unset Candidate Previous Next</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#unsetCandidatePreviousNext()
	 * @generated
	 */
	EOperation getSolutionTask__UnsetCandidatePreviousNext();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.SolutionTask#setCandidatePreviousNext(com.misc.common.moplaf.scheduler.SolutionTask, com.misc.common.moplaf.scheduler.SolutionTask) <em>Set Candidate Previous Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Candidate Previous Next</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.SolutionTask#setCandidatePreviousNext(com.misc.common.moplaf.scheduler.SolutionTask, com.misc.common.moplaf.scheduler.SolutionTask)
	 * @generated
	 */
	EOperation getSolutionTask__SetCandidatePreviousNext__SolutionTask_SolutionTask();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.scheduler.Move#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.scheduler.Move#getSolution()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Solution();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.MoveChange#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveChange#isValid()
	 * @see #getMoveChange()
	 * @generated
	 */
	EAttribute getMoveChange_Valid();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.scheduler.MoveChange#getMove <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Move</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveChange#getMove()
	 * @see #getMoveChange()
	 * @generated
	 */
	EReference getMoveChange_Move();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.MoveChangeTask <em>Move Change Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Change Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveChangeTask
	 * @generated
	 */
	EClass getMoveChangeTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.MoveChangeTask#getInsertionPoint <em>Insertion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insertion Point</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveChangeTask#getInsertionPoint()
	 * @see #getMoveChangeTask()
	 * @generated
	 */
	EReference getMoveChangeTask_InsertionPoint();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ScheduleBefore <em>Schedule Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Before</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleBefore
	 * @generated
	 */
	EClass getScheduleBefore();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.MoveChangeResource <em>Move Change Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Change Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveChangeResource
	 * @generated
	 */
	EClass getMoveChangeResource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.MoveChangeResource#getInsertionPoint <em>Insertion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insertion Point</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveChangeResource#getInsertionPoint()
	 * @see #getMoveChangeResource()
	 * @generated
	 */
	EReference getMoveChangeResource_InsertionPoint();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ScheduleLast <em>Schedule Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Last</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleLast
	 * @generated
	 */
	EClass getScheduleLast();

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
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__RESOURCES = eINSTANCE.getScheduler_Resources();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
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
		EOperation SOLUTION___CONSTRUCT_TASK__EOBJECT = eINSTANCE.getSolution__ConstructTask__EObject();

		/**
		 * The meta object literal for the '<em><b>Construct Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___CONSTRUCT_RESOURCE__EOBJECT = eINSTANCE.getSolution__ConstructResource__EObject();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_RESOURCE__NAME = eINSTANCE.getSolutionResource_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_TASK__NAME = eINSTANCE.getSolutionTask_Name();

		/**
		 * The meta object literal for the '<em><b>Unset Candidate Previous Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_TASK___UNSET_CANDIDATE_PREVIOUS_NEXT = eINSTANCE.getSolutionTask__UnsetCandidatePreviousNext();

		/**
		 * The meta object literal for the '<em><b>Set Candidate Previous Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_TASK___SET_CANDIDATE_PREVIOUS_NEXT__SOLUTIONTASK_SOLUTIONTASK = eINSTANCE.getSolutionTask__SetCandidatePreviousNext__SolutionTask_SolutionTask();

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
		 * The meta object literal for the '<em><b>Solution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__SOLUTION = eINSTANCE.getMove_Solution();

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
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_CHANGE__VALID = eINSTANCE.getMoveChange_Valid();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_CHANGE__MOVE = eINSTANCE.getMoveChange_Move();

		/**
		 * The meta object literal for the '<em><b>Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOVE_CHANGE___CHANGE = eINSTANCE.getMoveChange__Change();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.MoveChangeTaskImpl <em>Move Change Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.MoveChangeTaskImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveChangeTask()
		 * @generated
		 */
		EClass MOVE_CHANGE_TASK = eINSTANCE.getMoveChangeTask();

		/**
		 * The meta object literal for the '<em><b>Insertion Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_CHANGE_TASK__INSERTION_POINT = eINSTANCE.getMoveChangeTask_InsertionPoint();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl <em>Schedule Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleBefore()
		 * @generated
		 */
		EClass SCHEDULE_BEFORE = eINSTANCE.getScheduleBefore();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.MoveChangeResourceImpl <em>Move Change Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.MoveChangeResourceImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveChangeResource()
		 * @generated
		 */
		EClass MOVE_CHANGE_RESOURCE = eINSTANCE.getMoveChangeResource();

		/**
		 * The meta object literal for the '<em><b>Insertion Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_CHANGE_RESOURCE__INSERTION_POINT = eINSTANCE.getMoveChangeResource_InsertionPoint();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleLastImpl <em>Schedule Last</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ScheduleLastImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleLast()
		 * @generated
		 */
		EClass SCHEDULE_LAST = eINSTANCE.getScheduleLast();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.UnscheduleImpl <em>Unschedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.UnscheduleImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getUnschedule()
		 * @generated
		 */
		EClass UNSCHEDULE = eINSTANCE.getUnschedule();

	}

} //SchedulerPackage
