/**
 */
package com.misc.common.moplaf.scheduler.provider;

import com.misc.common.moplaf.emf.edit.command.AcceptCommand;
import com.misc.common.moplaf.emf.edit.command.CloneCommand;
import com.misc.common.moplaf.emf.edit.command.ResetCommand;
import com.misc.common.moplaf.propagator2.provider.ObjectWithPropagatorFunctionsItemProvider;
import com.misc.common.moplaf.scheduler.Move;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Solution;
import com.misc.common.moplaf.schedulercalc.provider.SchedulerEditPlugin;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.scheduler.Solution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionItemProvider 
	extends ObjectWithPropagatorFunctionsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCandidateMovePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Candidate Move feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCandidateMovePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solution_CandidateMove_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solution_CandidateMove_feature", "_UI_Solution_type"),
				 SchedulerPackage.Literals.SOLUTION__CANDIDATE_MOVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SchedulerPackage.Literals.SOLUTION__MOVES);
			childrenFeatures.add(SchedulerPackage.Literals.SOLUTION__TASKS);
			childrenFeatures.add(SchedulerPackage.Literals.SOLUTION__RESOURCES);
			childrenFeatures.add(SchedulerPackage.Literals.SOLUTION__EXPRESSIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Solution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Solution"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Solution solution = (Solution)object;
		return getString("_UI_Solution_type") + " " + solution.getSolutionNr();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Solution.class)) {
			case SchedulerPackage.SOLUTION__SOLUTION_NR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SchedulerPackage.SOLUTION__MOVES:
			case SchedulerPackage.SOLUTION__TASKS:
			case SchedulerPackage.SOLUTION__RESOURCES:
			case SchedulerPackage.SOLUTION__EXPRESSIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SOLUTION__MOVES,
				 SchedulerFactory.eINSTANCE.createMove()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SOLUTION__TASKS,
				 SchedulerFactory.eINSTANCE.createSolutionTask()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SOLUTION__RESOURCES,
				 SchedulerFactory.eINSTANCE.createSolutionResource()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SOLUTION__EXPRESSIONS,
				 SchedulerFactory.eINSTANCE.createSolutionCandidateDateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SOLUTION__EXPRESSIONS,
				 SchedulerFactory.eINSTANCE.createSolutionCandidateFloatExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulerPackage.Literals.SOLUTION__EXPRESSIONS,
				 SchedulerFactory.eINSTANCE.createSolutionCandidateIntExpression()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SchedulerEditPlugin.INSTANCE;
	}

	/**
	 * 
	 * @author michel
	 *
	 */
	public class SolutionResetCommand extends ResetCommand{
		private Solution solution;
		
		public SolutionResetCommand(Solution aSolution)	{
			super();
			this.solution = aSolution;
		}

		@Override
		public void execute() {
			this.solution.reset();
		}
	} // class SolutionResetCommand

	/**
	 * 
	 * @author michel
	 *
	 */
	public class SolutionCloneCommand extends CloneCommand{
		private Solution solution;
		
		public SolutionCloneCommand(Solution aSolution)	{
			super();
			this.solution = aSolution;
		}

		@Override
		public void execute(){
			this.solution.clone();
		}
	} // class SolutionCloneCommand

	/**
	 * 
	 * @author michel
	 *
	 */
	public class SolutionAcceptCommand extends AcceptCommand{
		private Solution solution;
		
		public SolutionAcceptCommand(Solution aSolution)	{
			super();
			this.solution = aSolution;
		}

		@Override
		public void execute(){
			this.solution.acceptCandidate();
		}
	} // class SolutionAcceptCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == ResetCommand.class){
			return new SolutionResetCommand((Solution) object); 
		} else if ( commandClass == CloneCommand.class){
			return new SolutionCloneCommand((Solution) object); 
		} else if ( commandClass == AcceptCommand.class){
			return new SolutionAcceptCommand((Solution) object); 
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

	/**
	 * Implements Command constructGoal
	 */
	public abstract class SolutionCommand extends AbstractCommand {

		protected Solution solution;
		
		public SolutionCommand(Solution solution) {
			super();
			this.solution = solution;
		}

		@Override
		protected boolean prepare(){
			isExecutable = true;
			return isExecutable;
		}

		@Override
		public boolean canUndo() { 
			return false; 
		}

		@Override
		public void redo() {
			execute();		
		}

	}


	public  class SolutionSetCandidateMove extends SolutionCommand{
		private Move move;

		public SolutionSetCandidateMove(Solution solution, Move move) {
			super(solution);
			this.move = move;
		}

		@Override
		public void execute() {
			this.solution.setCandidate(this.move);
		}
	};
		
	protected Command createDropCommand(Object owner, Object droppedObject) {
		Solution solution = (Solution)owner;
		if ( droppedObject instanceof Move){
  	   		Move droppedMove= (Move) droppedObject;
		   	return new SolutionSetCandidateMove(solution, droppedMove);
		} 
		//return super.createDropCommand(owner, droppedObject);
		return null;
	}
	
	/**
	 * Create a drag and drop command for this Run
	 */
	private class SolutionDragAndDropCommand extends DragAndDropCommand {

		public SolutionDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
				int operation, Collection<?> collection) {
			super(domain, owner, location, operations, operation, collection);
		}
	   	
	    /**
	     * This implementation of prepare is called again to implement {@link #validate validate}.
	     * The method {@link #reset} will have been called before doing so.
	     */
	    @Override
	    protected boolean prepare(){
	    	CompoundCommand compound = new CompoundCommand();
			for (Object element : collection){
				Command cmd = SolutionItemProvider.this.createDropCommand(this.owner, element);
				if ( cmd != null ){
					compound.append(cmd);
				}
			}
	    	this.dragCommand = null;
			this.dropCommand = compound;
	    	return true;
	    } // prepare
	};
	
	/**
	 * Create a command for a drag and drop on this Run
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		return new SolutionDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}
}
