/**
 */
package com.misc.common.moplaf.schedulercalc;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see com.misc.common.moplaf.schedulercalc.SchedulerCalcFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulerCalcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schedulercalc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/scheduler/calc/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schedc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulerCalcPackage eINSTANCE = com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.SolutionPropagatorFunctionImpl <em>Solution Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.SolutionPropagatorFunctionImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getSolutionPropagatorFunction()
	 * @generated
	 */
	int SOLUTION_PROPAGATOR_FUNCTION = 0;

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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROPAGATOR_FUNCTION___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.SolutionExpressionPropagatorFunctionImpl <em>Solution Expression Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.SolutionExpressionPropagatorFunctionImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getSolutionExpressionPropagatorFunction()
	 * @generated
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION = 1;

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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResourcePropagatorFunctionImpl <em>Resource Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.ResourcePropagatorFunctionImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResourcePropagatorFunction()
	 * @generated
	 */
	int RESOURCE_PROPAGATOR_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION__RESOURCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Resource Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPAGATOR_FUNCTION_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResourceExpressionPropagatorFunctionImpl <em>Resource Expression Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.ResourceExpressionPropagatorFunctionImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResourceExpressionPropagatorFunction()
	 * @generated
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION = 3;

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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.TaskPropagatorFunctionImpl <em>Task Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.TaskPropagatorFunctionImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getTaskPropagatorFunction()
	 * @generated
	 */
	int TASK_PROPAGATOR_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION__TASK = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Task Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPAGATOR_FUNCTION_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.TaskExpressionPropagatorFunctionImpl <em>Task Expression Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.TaskExpressionPropagatorFunctionImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getTaskExpressionPropagatorFunction()
	 * @generated
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION = 5;

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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXPRESSION_PROPAGATOR_FUNCTION___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.CalcSolutionAllExpressionCandidateValuesImpl <em>Calc Solution All Expression Candidate Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.CalcSolutionAllExpressionCandidateValuesImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getCalcSolutionAllExpressionCandidateValues()
	 * @generated
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = 6;

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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHED_PARENT = SOLUTION_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___GET_FACTORY_ID = SOLUTION_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.CalcSolutionExpressionCandidateValueImpl <em>Calc Solution Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.CalcSolutionExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getCalcSolutionExpressionCandidateValue()
	 * @generated
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE = 7;

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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHED_PARENT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE___GET_FACTORY_ID = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.CalcResourceExpressionCandidateValueImpl <em>Calc Resource Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.CalcResourceExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getCalcResourceExpressionCandidateValue()
	 * @generated
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE = 8;

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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHED_PARENT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE___GET_FACTORY_ID = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.CalcTaskExpressionCandidateValueImpl <em>Calc Task Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.CalcTaskExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getCalcTaskExpressionCandidateValue()
	 * @generated
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE = 9;

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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED_PARENT = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_EXPRESSION_CANDIDATE_VALUE___GET_FACTORY_ID = TASK_EXPRESSION_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.CalcTaksExpressionCandidateValueCumulativeImpl <em>Calc Taks Expression Candidate Value Cumulative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.CalcTaksExpressionCandidateValueCumulativeImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getCalcTaksExpressionCandidateValueCumulative()
	 * @generated
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE = 10;

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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE__TOUCHED_PARENT = CALC_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE___GET_FACTORY_ID = CALC_TASK_EXPRESSION_CANDIDATE_VALUE___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetSolutionAllExpressionCandidateValuesImpl <em>Reset Solution All Expression Candidate Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.ResetSolutionAllExpressionCandidateValuesImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetSolutionAllExpressionCandidateValues()
	 * @generated
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = 11;

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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES__TOUCHED_PARENT = SOLUTION_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES___GET_FACTORY_ID = SOLUTION_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetSolutionExpressionCandidateValueImpl <em>Reset Solution Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.ResetSolutionExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetSolutionExpressionCandidateValue()
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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE__TOUCHED_PARENT = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE___GET_FACTORY_ID = SOLUTION_EXPRESSION_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetResourceExpressionCandidateValueImpl <em>Reset Resource Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.ResetResourceExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetResourceExpressionCandidateValue()
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
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE__TOUCHED_PARENT = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

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
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE___GET_FACTORY_ID = RESOURCE_EXPRESSION_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetTaskExpressionCandidateValueImpl <em>Reset Task Expression Candidate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.ResetTaskExpressionCandidateValueImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetTaskExpressionCandidateValue()
	 * @generated
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__PARENT = TASK_EXPRESSION_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS = TASK_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__ANTECEDENTS_SIBLING = TASK_EXPRESSION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED_CHILDREN = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHERS = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__ENABLED = TASK_EXPRESSION_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TASK_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TYPE = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__OBJECT = TASK_EXPRESSION_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__INSTANCE = TASK_EXPRESSION_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__DESCRIPTION = TASK_EXPRESSION_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TOUCHED_PARENT = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE__TASK_EXPRESSION = TASK_EXPRESSION_PROPAGATOR_FUNCTION__TASK_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Reset Task Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE_FEATURE_COUNT = TASK_EXPRESSION_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___INIT = TASK_EXPRESSION_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___ENABLE = TASK_EXPRESSION_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DISABLE = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___RESET = TASK_EXPRESSION_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___TOUCH__EOBJECT = TASK_EXPRESSION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___UNTOUCH = TASK_EXPRESSION_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_ANTECEDENTS = TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_THIS = TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH_CHILDREN_AND_THIS = TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___REFRESH = TASK_EXPRESSION_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_ANTECEDENTS = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_PARENT = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_REFRESH__EOBJECT = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___GET_SCOPE = TASK_EXPRESSION_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___GET_FACTORY_ID = TASK_EXPRESSION_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_GET_BINDINGS = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TASK_EXPRESSION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Task Expression Candidate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_EXPRESSION_CANDIDATE_VALUE_OPERATION_COUNT = TASK_EXPRESSION_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetTaskCandidateNextImpl <em>Reset Task Candidate Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.ResetTaskCandidateNextImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetTaskCandidateNext()
	 * @generated
	 */
	int RESET_TASK_CANDIDATE_NEXT = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__PARENT = TASK_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__ANTECEDENTS = TASK_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__ANTECEDENTS_SIBLING = TASK_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__TOUCHED = TASK_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__TOUCHED_CHILDREN = TASK_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__TOUCHERS = TASK_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__ENABLED = TASK_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TASK_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__TYPE = TASK_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__OBJECT = TASK_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__INSTANCE = TASK_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__DESCRIPTION = TASK_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__TOUCHED_PARENT = TASK_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT__TASK = TASK_PROPAGATOR_FUNCTION__TASK;

	/**
	 * The number of structural features of the '<em>Reset Task Candidate Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT_FEATURE_COUNT = TASK_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___INIT = TASK_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___ENABLE = TASK_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___DISABLE = TASK_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___RESET = TASK_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___TOUCH__EOBJECT = TASK_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___UNTOUCH = TASK_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___REFRESH_ANTECEDENTS = TASK_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___REFRESH_THIS = TASK_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___REFRESH_CHILDREN_AND_THIS = TASK_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___REFRESH = TASK_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___DO_GET_ANTECEDENTS = TASK_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___DO_GET_PARENT = TASK_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___DO_REFRESH = TASK_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___DO_REFRESH__EOBJECT = TASK_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___GET_SCOPE = TASK_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___GET_FACTORY_ID = TASK_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___DO_GET_BINDINGS = TASK_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TASK_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Task Candidate Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_NEXT_OPERATION_COUNT = TASK_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetTaskCandidateScheduledResourceImpl <em>Reset Task Candidate Scheduled Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.ResetTaskCandidateScheduledResourceImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetTaskCandidateScheduledResource()
	 * @generated
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE = 16;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__PARENT = TASK_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__ANTECEDENTS = TASK_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__ANTECEDENTS_SIBLING = TASK_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TOUCHED = TASK_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TOUCHED_CHILDREN = TASK_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TOUCHERS = TASK_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__ENABLED = TASK_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TASK_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TYPE = TASK_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__OBJECT = TASK_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__INSTANCE = TASK_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__DESCRIPTION = TASK_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TOUCHED_PARENT = TASK_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TASK = TASK_PROPAGATOR_FUNCTION__TASK;

	/**
	 * The number of structural features of the '<em>Reset Task Candidate Scheduled Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE_FEATURE_COUNT = TASK_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___INIT = TASK_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___ENABLE = TASK_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DISABLE = TASK_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___RESET = TASK_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___TOUCH__EOBJECT = TASK_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___UNTOUCH = TASK_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___REFRESH_ANTECEDENTS = TASK_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___REFRESH_THIS = TASK_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___REFRESH_CHILDREN_AND_THIS = TASK_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___REFRESH = TASK_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_GET_ANTECEDENTS = TASK_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_GET_PARENT = TASK_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_REFRESH = TASK_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_REFRESH__EOBJECT = TASK_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___GET_SCOPE = TASK_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___GET_FACTORY_ID = TASK_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_GET_BINDINGS = TASK_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TASK_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Task Candidate Scheduled Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE_OPERATION_COUNT = TASK_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetResourceTasksCandidateNextImpl <em>Reset Resource Tasks Candidate Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.ResetResourceTasksCandidateNextImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetResourceTasksCandidateNext()
	 * @generated
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__PARENT = RESOURCE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__ANTECEDENTS = RESOURCE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__ANTECEDENTS_SIBLING = RESOURCE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__TOUCHED = RESOURCE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__TOUCHED_CHILDREN = RESOURCE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__TOUCHERS = RESOURCE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__ENABLED = RESOURCE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = RESOURCE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__TYPE = RESOURCE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__OBJECT = RESOURCE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__INSTANCE = RESOURCE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__DESCRIPTION = RESOURCE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__TOUCHED_PARENT = RESOURCE_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT__RESOURCE = RESOURCE_PROPAGATOR_FUNCTION__RESOURCE;

	/**
	 * The number of structural features of the '<em>Reset Resource Tasks Candidate Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT_FEATURE_COUNT = RESOURCE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___INIT = RESOURCE_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___ENABLE = RESOURCE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___DISABLE = RESOURCE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___RESET = RESOURCE_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___TOUCH__EOBJECT = RESOURCE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___UNTOUCH = RESOURCE_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___REFRESH_ANTECEDENTS = RESOURCE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___REFRESH_THIS = RESOURCE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___REFRESH_CHILDREN_AND_THIS = RESOURCE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___REFRESH = RESOURCE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___DO_GET_ANTECEDENTS = RESOURCE_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___DO_GET_PARENT = RESOURCE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___DO_REFRESH = RESOURCE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___DO_REFRESH__EOBJECT = RESOURCE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___GET_SCOPE = RESOURCE_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___GET_FACTORY_ID = RESOURCE_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___DO_GET_BINDINGS = RESOURCE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = RESOURCE_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Resource Tasks Candidate Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_NEXT_OPERATION_COUNT = RESOURCE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetResourceTasksCandidateScheduledResourceImpl <em>Reset Resource Tasks Candidate Scheduled Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.ResetResourceTasksCandidateScheduledResourceImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetResourceTasksCandidateScheduledResource()
	 * @generated
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE = 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__PARENT = RESOURCE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__ANTECEDENTS = RESOURCE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__ANTECEDENTS_SIBLING = RESOURCE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__TOUCHED = RESOURCE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__TOUCHED_CHILDREN = RESOURCE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__TOUCHERS = RESOURCE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__ENABLED = RESOURCE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = RESOURCE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__TYPE = RESOURCE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__OBJECT = RESOURCE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__INSTANCE = RESOURCE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__DESCRIPTION = RESOURCE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__TOUCHED_PARENT = RESOURCE_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE__RESOURCE = RESOURCE_PROPAGATOR_FUNCTION__RESOURCE;

	/**
	 * The number of structural features of the '<em>Reset Resource Tasks Candidate Scheduled Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE_FEATURE_COUNT = RESOURCE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___INIT = RESOURCE_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___ENABLE = RESOURCE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___DISABLE = RESOURCE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___RESET = RESOURCE_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___TOUCH__EOBJECT = RESOURCE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___UNTOUCH = RESOURCE_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___REFRESH_ANTECEDENTS = RESOURCE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___REFRESH_THIS = RESOURCE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___REFRESH_CHILDREN_AND_THIS = RESOURCE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___REFRESH = RESOURCE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___DO_GET_ANTECEDENTS = RESOURCE_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___DO_GET_PARENT = RESOURCE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___DO_REFRESH = RESOURCE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___DO_REFRESH__EOBJECT = RESOURCE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___GET_SCOPE = RESOURCE_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___GET_FACTORY_ID = RESOURCE_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___DO_GET_BINDINGS = RESOURCE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = RESOURCE_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Reset Resource Tasks Candidate Scheduled Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE_OPERATION_COUNT = RESOURCE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.SetTaskCandidateScheduledResourceScopeImpl <em>Set Task Candidate Scheduled Resource Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.SetTaskCandidateScheduledResourceScopeImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getSetTaskCandidateScheduledResourceScope()
	 * @generated
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE = 19;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__PARENT = SOLUTION_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__ANTECEDENTS = SOLUTION_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__ANTECEDENTS_SIBLING = SOLUTION_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__TOUCHED = SOLUTION_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__TOUCHED_CHILDREN = SOLUTION_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__TOUCHERS = SOLUTION_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__ENABLED = SOLUTION_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = SOLUTION_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__TYPE = SOLUTION_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__OBJECT = SOLUTION_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__INSTANCE = SOLUTION_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__DESCRIPTION = SOLUTION_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__TOUCHED_PARENT = SOLUTION_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE__SOLUTION = SOLUTION_PROPAGATOR_FUNCTION__SOLUTION;

	/**
	 * The number of structural features of the '<em>Set Task Candidate Scheduled Resource Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE_FEATURE_COUNT = SOLUTION_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___INIT = SOLUTION_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___ENABLE = SOLUTION_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___DISABLE = SOLUTION_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___RESET = SOLUTION_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___TOUCH__EOBJECT = SOLUTION_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___UNTOUCH = SOLUTION_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___REFRESH_ANTECEDENTS = SOLUTION_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___REFRESH_THIS = SOLUTION_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___REFRESH_CHILDREN_AND_THIS = SOLUTION_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___REFRESH = SOLUTION_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___DO_GET_ANTECEDENTS = SOLUTION_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___DO_GET_PARENT = SOLUTION_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___DO_REFRESH = SOLUTION_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___DO_REFRESH__EOBJECT = SOLUTION_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___GET_SCOPE = SOLUTION_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___GET_FACTORY_ID = SOLUTION_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___DO_GET_BINDINGS = SOLUTION_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = SOLUTION_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Set Task Candidate Scheduled Resource Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE_OPERATION_COUNT = SOLUTION_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.schedulercalc.impl.SetTaskCandidateScheduledResourceImpl <em>Set Task Candidate Scheduled Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.schedulercalc.impl.SetTaskCandidateScheduledResourceImpl
	 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getSetTaskCandidateScheduledResource()
	 * @generated
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE = 20;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__PARENT = TASK_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__ANTECEDENTS = TASK_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__ANTECEDENTS_SIBLING = TASK_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TOUCHED = TASK_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TOUCHED_CHILDREN = TASK_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TOUCHERS = TASK_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__ENABLED = TASK_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TASK_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TYPE = TASK_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__OBJECT = TASK_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__INSTANCE = TASK_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__DESCRIPTION = TASK_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TOUCHED_PARENT = TASK_PROPAGATOR_FUNCTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__TASK = TASK_PROPAGATOR_FUNCTION__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__CONCRETE_PARENT = TASK_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Task Candidate Scheduled Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_FEATURE_COUNT = TASK_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___INIT = TASK_PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___ENABLE = TASK_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DISABLE = TASK_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___RESET = TASK_PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___TOUCH__EOBJECT = TASK_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___UNTOUCH = TASK_PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___REFRESH_ANTECEDENTS = TASK_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___REFRESH_THIS = TASK_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___REFRESH_CHILDREN_AND_THIS = TASK_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___REFRESH = TASK_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_GET_ANTECEDENTS = TASK_PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_GET_PARENT = TASK_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_REFRESH = TASK_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_REFRESH__EOBJECT = TASK_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___GET_SCOPE = TASK_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___GET_FACTORY_ID = TASK_PROPAGATOR_FUNCTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_GET_BINDINGS = TASK_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TASK_PROPAGATOR_FUNCTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Set Task Candidate Scheduled Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_OPERATION_COUNT = TASK_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction <em>Solution Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Propagator Function</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction
	 * @generated
	 */
	EClass getSolutionPropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.SolutionPropagatorFunction#getSolution()
	 * @see #getSolutionPropagatorFunction()
	 * @generated
	 */
	EReference getSolutionPropagatorFunction_Solution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction <em>Solution Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Expression Propagator Function</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction
	 * @generated
	 */
	EClass getSolutionExpressionPropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction#getSolutionExpression <em>Solution Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution Expression</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.SolutionExpressionPropagatorFunction#getSolutionExpression()
	 * @see #getSolutionExpressionPropagatorFunction()
	 * @generated
	 */
	EReference getSolutionExpressionPropagatorFunction_SolutionExpression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction <em>Resource Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Propagator Function</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction
	 * @generated
	 */
	EClass getResourcePropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResourcePropagatorFunction#getResource()
	 * @see #getResourcePropagatorFunction()
	 * @generated
	 */
	EReference getResourcePropagatorFunction_Resource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.ResourceExpressionPropagatorFunction <em>Resource Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Expression Propagator Function</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResourceExpressionPropagatorFunction
	 * @generated
	 */
	EClass getResourceExpressionPropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.schedulercalc.ResourceExpressionPropagatorFunction#getResourceExpression <em>Resource Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Expression</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResourceExpressionPropagatorFunction#getResourceExpression()
	 * @see #getResourceExpressionPropagatorFunction()
	 * @generated
	 */
	EReference getResourceExpressionPropagatorFunction_ResourceExpression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction <em>Task Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Propagator Function</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction
	 * @generated
	 */
	EClass getTaskPropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.TaskPropagatorFunction#getTask()
	 * @see #getTaskPropagatorFunction()
	 * @generated
	 */
	EReference getTaskPropagatorFunction_Task();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.TaskExpressionPropagatorFunction <em>Task Expression Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Expression Propagator Function</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.TaskExpressionPropagatorFunction
	 * @generated
	 */
	EClass getTaskExpressionPropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.schedulercalc.TaskExpressionPropagatorFunction#getTaskExpression <em>Task Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Expression</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.TaskExpressionPropagatorFunction#getTaskExpression()
	 * @see #getTaskExpressionPropagatorFunction()
	 * @generated
	 */
	EReference getTaskExpressionPropagatorFunction_TaskExpression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.CalcSolutionAllExpressionCandidateValues <em>Calc Solution All Expression Candidate Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Solution All Expression Candidate Values</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.CalcSolutionAllExpressionCandidateValues
	 * @generated
	 */
	EClass getCalcSolutionAllExpressionCandidateValues();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.CalcSolutionExpressionCandidateValue <em>Calc Solution Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Solution Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.CalcSolutionExpressionCandidateValue
	 * @generated
	 */
	EClass getCalcSolutionExpressionCandidateValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.CalcResourceExpressionCandidateValue <em>Calc Resource Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Resource Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.CalcResourceExpressionCandidateValue
	 * @generated
	 */
	EClass getCalcResourceExpressionCandidateValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.CalcTaskExpressionCandidateValue <em>Calc Task Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.CalcTaskExpressionCandidateValue
	 * @generated
	 */
	EClass getCalcTaskExpressionCandidateValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.CalcTaksExpressionCandidateValueCumulative <em>Calc Taks Expression Candidate Value Cumulative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Taks Expression Candidate Value Cumulative</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.CalcTaksExpressionCandidateValueCumulative
	 * @generated
	 */
	EClass getCalcTaksExpressionCandidateValueCumulative();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.ResetSolutionAllExpressionCandidateValues <em>Reset Solution All Expression Candidate Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Solution All Expression Candidate Values</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResetSolutionAllExpressionCandidateValues
	 * @generated
	 */
	EClass getResetSolutionAllExpressionCandidateValues();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.ResetSolutionExpressionCandidateValue <em>Reset Solution Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Solution Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResetSolutionExpressionCandidateValue
	 * @generated
	 */
	EClass getResetSolutionExpressionCandidateValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.ResetResourceExpressionCandidateValue <em>Reset Resource Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Resource Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResetResourceExpressionCandidateValue
	 * @generated
	 */
	EClass getResetResourceExpressionCandidateValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.ResetTaskExpressionCandidateValue <em>Reset Task Expression Candidate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Task Expression Candidate Value</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResetTaskExpressionCandidateValue
	 * @generated
	 */
	EClass getResetTaskExpressionCandidateValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.ResetTaskCandidateNext <em>Reset Task Candidate Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Task Candidate Next</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResetTaskCandidateNext
	 * @generated
	 */
	EClass getResetTaskCandidateNext();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.ResetTaskCandidateScheduledResource <em>Reset Task Candidate Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Task Candidate Scheduled Resource</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResetTaskCandidateScheduledResource
	 * @generated
	 */
	EClass getResetTaskCandidateScheduledResource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.ResetResourceTasksCandidateNext <em>Reset Resource Tasks Candidate Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Resource Tasks Candidate Next</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResetResourceTasksCandidateNext
	 * @generated
	 */
	EClass getResetResourceTasksCandidateNext();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.ResetResourceTasksCandidateScheduledResource <em>Reset Resource Tasks Candidate Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Resource Tasks Candidate Scheduled Resource</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.ResetResourceTasksCandidateScheduledResource
	 * @generated
	 */
	EClass getResetResourceTasksCandidateScheduledResource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResourceScope <em>Set Task Candidate Scheduled Resource Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Task Candidate Scheduled Resource Scope</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResourceScope
	 * @generated
	 */
	EClass getSetTaskCandidateScheduledResourceScope();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResource <em>Set Task Candidate Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Task Candidate Scheduled Resource</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResource
	 * @generated
	 */
	EClass getSetTaskCandidateScheduledResource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResource#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.schedulercalc.SetTaskCandidateScheduledResource#getConcreteParent()
	 * @see #getSetTaskCandidateScheduledResource()
	 * @generated
	 */
	EReference getSetTaskCandidateScheduledResource_ConcreteParent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchedulerCalcFactory getSchedulerCalcFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.SolutionPropagatorFunctionImpl <em>Solution Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.SolutionPropagatorFunctionImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getSolutionPropagatorFunction()
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
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.SolutionExpressionPropagatorFunctionImpl <em>Solution Expression Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.SolutionExpressionPropagatorFunctionImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getSolutionExpressionPropagatorFunction()
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
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResourcePropagatorFunctionImpl <em>Resource Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.ResourcePropagatorFunctionImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResourcePropagatorFunction()
		 * @generated
		 */
		EClass RESOURCE_PROPAGATOR_FUNCTION = eINSTANCE.getResourcePropagatorFunction();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROPAGATOR_FUNCTION__RESOURCE = eINSTANCE.getResourcePropagatorFunction_Resource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResourceExpressionPropagatorFunctionImpl <em>Resource Expression Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.ResourceExpressionPropagatorFunctionImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResourceExpressionPropagatorFunction()
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
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.TaskPropagatorFunctionImpl <em>Task Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.TaskPropagatorFunctionImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getTaskPropagatorFunction()
		 * @generated
		 */
		EClass TASK_PROPAGATOR_FUNCTION = eINSTANCE.getTaskPropagatorFunction();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROPAGATOR_FUNCTION__TASK = eINSTANCE.getTaskPropagatorFunction_Task();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.TaskExpressionPropagatorFunctionImpl <em>Task Expression Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.TaskExpressionPropagatorFunctionImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getTaskExpressionPropagatorFunction()
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
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.CalcSolutionAllExpressionCandidateValuesImpl <em>Calc Solution All Expression Candidate Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.CalcSolutionAllExpressionCandidateValuesImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getCalcSolutionAllExpressionCandidateValues()
		 * @generated
		 */
		EClass CALC_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = eINSTANCE.getCalcSolutionAllExpressionCandidateValues();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.CalcSolutionExpressionCandidateValueImpl <em>Calc Solution Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.CalcSolutionExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getCalcSolutionExpressionCandidateValue()
		 * @generated
		 */
		EClass CALC_SOLUTION_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getCalcSolutionExpressionCandidateValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.CalcResourceExpressionCandidateValueImpl <em>Calc Resource Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.CalcResourceExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getCalcResourceExpressionCandidateValue()
		 * @generated
		 */
		EClass CALC_RESOURCE_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getCalcResourceExpressionCandidateValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.CalcTaskExpressionCandidateValueImpl <em>Calc Task Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.CalcTaskExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getCalcTaskExpressionCandidateValue()
		 * @generated
		 */
		EClass CALC_TASK_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getCalcTaskExpressionCandidateValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.CalcTaksExpressionCandidateValueCumulativeImpl <em>Calc Taks Expression Candidate Value Cumulative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.CalcTaksExpressionCandidateValueCumulativeImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getCalcTaksExpressionCandidateValueCumulative()
		 * @generated
		 */
		EClass CALC_TAKS_EXPRESSION_CANDIDATE_VALUE_CUMULATIVE = eINSTANCE.getCalcTaksExpressionCandidateValueCumulative();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetSolutionAllExpressionCandidateValuesImpl <em>Reset Solution All Expression Candidate Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.ResetSolutionAllExpressionCandidateValuesImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetSolutionAllExpressionCandidateValues()
		 * @generated
		 */
		EClass RESET_SOLUTION_ALL_EXPRESSION_CANDIDATE_VALUES = eINSTANCE.getResetSolutionAllExpressionCandidateValues();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetSolutionExpressionCandidateValueImpl <em>Reset Solution Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.ResetSolutionExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetSolutionExpressionCandidateValue()
		 * @generated
		 */
		EClass RESET_SOLUTION_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getResetSolutionExpressionCandidateValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetResourceExpressionCandidateValueImpl <em>Reset Resource Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.ResetResourceExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetResourceExpressionCandidateValue()
		 * @generated
		 */
		EClass RESET_RESOURCE_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getResetResourceExpressionCandidateValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetTaskExpressionCandidateValueImpl <em>Reset Task Expression Candidate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.ResetTaskExpressionCandidateValueImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetTaskExpressionCandidateValue()
		 * @generated
		 */
		EClass RESET_TASK_EXPRESSION_CANDIDATE_VALUE = eINSTANCE.getResetTaskExpressionCandidateValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetTaskCandidateNextImpl <em>Reset Task Candidate Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.ResetTaskCandidateNextImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetTaskCandidateNext()
		 * @generated
		 */
		EClass RESET_TASK_CANDIDATE_NEXT = eINSTANCE.getResetTaskCandidateNext();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetTaskCandidateScheduledResourceImpl <em>Reset Task Candidate Scheduled Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.ResetTaskCandidateScheduledResourceImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetTaskCandidateScheduledResource()
		 * @generated
		 */
		EClass RESET_TASK_CANDIDATE_SCHEDULED_RESOURCE = eINSTANCE.getResetTaskCandidateScheduledResource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetResourceTasksCandidateNextImpl <em>Reset Resource Tasks Candidate Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.ResetResourceTasksCandidateNextImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetResourceTasksCandidateNext()
		 * @generated
		 */
		EClass RESET_RESOURCE_TASKS_CANDIDATE_NEXT = eINSTANCE.getResetResourceTasksCandidateNext();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.ResetResourceTasksCandidateScheduledResourceImpl <em>Reset Resource Tasks Candidate Scheduled Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.ResetResourceTasksCandidateScheduledResourceImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getResetResourceTasksCandidateScheduledResource()
		 * @generated
		 */
		EClass RESET_RESOURCE_TASKS_CANDIDATE_SCHEDULED_RESOURCE = eINSTANCE.getResetResourceTasksCandidateScheduledResource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.SetTaskCandidateScheduledResourceScopeImpl <em>Set Task Candidate Scheduled Resource Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.SetTaskCandidateScheduledResourceScopeImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getSetTaskCandidateScheduledResourceScope()
		 * @generated
		 */
		EClass SET_TASK_CANDIDATE_SCHEDULED_RESOURCE_SCOPE = eINSTANCE.getSetTaskCandidateScheduledResourceScope();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.schedulercalc.impl.SetTaskCandidateScheduledResourceImpl <em>Set Task Candidate Scheduled Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.schedulercalc.impl.SetTaskCandidateScheduledResourceImpl
		 * @see com.misc.common.moplaf.schedulercalc.impl.SchedulerCalcPackageImpl#getSetTaskCandidateScheduledResource()
		 * @generated
		 */
		EClass SET_TASK_CANDIDATE_SCHEDULED_RESOURCE = eINSTANCE.getSetTaskCandidateScheduledResource();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_TASK_CANDIDATE_SCHEDULED_RESOURCE__CONCRETE_PARENT = eINSTANCE.getSetTaskCandidateScheduledResource_ConcreteParent();

	}

} //SchedulerCalcPackage
