package org.eclipse.sensinact.studio.language.ecaverifier.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.sensinact.studio.language.ecaverifier.DeploymentManagerWrapper;
import org.eclipse.sensinact.studio.language.ecaverifier.IdentifiedConflict;

public class ConflictsInfoDialog  extends TitleAreaDialog{

	private final List<IdentifiedConflict> conflicts;
	/**
	 * The label of the conflict Text
	 */
	private Label resultLabel;

	/**
	 * The Text widget to display the recommended, modified eca rule to resolve the conflict
	 */
	private Text resultText;
	
	private boolean stopDeployment;
	
	public ConflictsInfoDialog(Shell parentShell, List<IdentifiedConflict> conflicts, boolean stopDeployment) {
		super(parentShell);
		// TODO Auto-generated constructor stub
		
		this.conflicts = conflicts;
		this.stopDeployment = stopDeployment;
		setHelpAvailable(false);
	}
	
	@Override
	public void create() {
		super.create();
		setTitle("Application Conflicts Identified");
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE | SWT.MAX);
		
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		configureDialogArea(area);
		
		//TODO set up the text...
		resultLabel = new Label(area, SWT.NONE);
		resultLabel.setText("Conflicts are identified between the following apps: ");
		
		resultText = new Text(area, SWT.BORDER | SWT.READ_ONLY | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
		GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gridData.heightHint = 6 * resultText.getLineHeight();
		resultText.setLayoutData(gridData);
		setText(getConflicts());
		return area;
	}
	
	@Override
	protected Control createContents(Composite parent) {
		Control control = super.createContents(parent);
		updateWidgets();
		return control;
	}
	
	private static void configureDialogArea(Composite area) {
		GridLayout gridLayout = (GridLayout) area.getLayout();
		gridLayout.marginRight = 5;
		gridLayout.marginLeft = 5;
		GridData gridData = (GridData) area.getLayoutData();
		gridData.widthHint = 640;
	}
	
	public void updateWidgets() {
		//TODO yet to be determined
		
		getShell().pack(true);
		getShell().setSize(getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT, true));	
		if(stopDeployment == true) 
			getButton(IDialogConstants.PROCEED_ID).setText("Stop Deployment");
		
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.PROCEED_ID, "Auto-resolve", true);
		getButton(IDialogConstants.PROCEED_ID).setEnabled(true);
		super.createButtonsForButtonBar(parent);
		getButton(OK).setVisible(false);
		getButton(CANCEL).setText("Close");
		setDialogHelpAvailable(false);
		getButton(IDialogConstants.PROCEED_ID).addMouseListener(new MouseListener() {		
			@Override
			public void mouseUp(MouseEvent e) {
				//launchRequest(e);
				//TODO update the editor text to the suggested, modified eca rule.....
				System.out.println(" button up");
				
				autoResolveConflicts();				
			}

			@Override
			public void mouseDown(MouseEvent e) {}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				System.out.println("button double clicked!");
				mouseUp(e);//////////////testing
			}
		});
	}
	
	public void autoResolveConflicts() {
		
		if(stopDeployment == true) {
			
		} else {
			
			for(IdentifiedConflict conf : conflicts) {
				IFile modified = DeploymentManagerWrapper.getFile(conf.getModifiedAppID());
				
				if(modified == null) {
					System.out.println("ConflictInfoDialog --> to be modified app" + conf.getModifiedAppID());
					System.out.println("Null pointer for the modified IFile - auto resolve conflicts...");/////////////////////testing
				} else {
					System.out.println("auto-resolve conflict = IFile not null for: " + modified.getName());////////////
					File file = new File(DeploymentManagerWrapper.getBaseFile(), "output/"+modified.getName());
					if(file.exists()) {
						try {
							/**
							 * update the file!!!
							 */
							System.out.println("going to auto-resolve conflict by modifying this file: " + modified.getName());////////////
							modified.setContents(new FileInputStream(file), true, true, null);
							System.out.println("IFile Modification finished....");
							
						} catch (FileNotFoundException | CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						System.out.println("auto resolve conflict --> File not found for "+ modified.getName());
					}
				}
			}
		}

	}
	
	public void setText(String text) {
		resultText.setText(text);
	}
	
	private String getConflicts() {
		String result = "";
		
		for(IdentifiedConflict conf : conflicts) {
			
			result += "The app \'" + conf.getAppID1() + "\' is in conflict with the app \'" + conf.getAppID2() + "\'."; 
			String modified = conf.getModifiedAppID();
			
			if(modified == null) {
				//indicate that no resolution has been found to resolve the conflict
				result += " But we have not found a solution to resolve the conflict. We suggest to stop the deployment!";
			} else {
				//indicate there is a recommended solution to resolve the conflict
				result += "We suggested to modify \'"+conf.getModifiedAppID()+"\' to the following rule: \n\n";
				File file = new File(DeploymentManagerWrapper.getBaseFile(), "output/"+modified+".sna");
				try {
					String tmp  = readFile(file.getAbsolutePath());
					
					result += tmp + "\n";
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
		}
		
		return result;	
	}
	
	private String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	        	if(line.length()<=2) {
	        		line = br.readLine();
	        		continue;
	        	}
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}

}
