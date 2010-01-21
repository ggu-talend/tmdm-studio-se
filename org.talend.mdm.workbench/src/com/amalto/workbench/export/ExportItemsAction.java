package com.amalto.workbench.export;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchPage;

import com.amalto.workbench.image.EImage;
import com.amalto.workbench.image.ImageCache;
import com.amalto.workbench.models.TreeObject;
import com.amalto.workbench.views.ServerView;

public class ExportItemsAction extends Action {
	private ServerView view = null;
	private TreeObject xobject = null;
	private IWorkbenchPage page = null;
	
	
	public ExportItemsAction(TreeObject xobject, IWorkbenchPage page) {
		super();
		this.xobject = xobject;
		this.page = page;
		setDetails();
	}
	
	public ExportItemsAction(ServerView view) {
		super();
		this.view = view;
		setDetails();
	}
	
	private void setDetails() {
		setImageDescriptor(ImageCache.getImage( EImage.EXPORT.getPath()));
		setText("Export");
		setToolTipText("Export Items");		
	}
	
	public void run() {
		try {
			super.run();
			ISelection selection=null;
			if (this.view != null) { //called from ServerView
				selection = view.getViewer().getSelection();
				xobject = (TreeObject)((IStructuredSelection)selection).getFirstElement();
			}			
            
			ExportItemsWizard wizard=new ExportItemsWizard((IStructuredSelection)selection);
			WizardDialog dialog = new WizardDialog(view.getSite().getShell(),
					wizard);
			dialog.create();
			dialog.getShell().setText("Export items");
			dialog.open(); 
//            DataClusterExportDialog dialog=new DataClusterExportDialog(view.getSite().getShell(),xobject);
//            dialog.create();
//            //dialog.getShell().setSize(new Point(500,200));
//            dialog.open();
		}catch (Exception e) {
			e.printStackTrace();
			MessageDialog.openError(
					view.getSite().getShell(),
					"Error", 
					"An error occured trying to Export Data Container: "+e.getLocalizedMessage()
			);
		}		
	}
}
