package org.eclipse.sensinact.studio.language.ecaverifier.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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
import org.eclipse.sensinact.studio.language.ecaverifier.ResolvedConflict;

public class ConflictsInfoDialog  extends TitleAreaDialog{

	private final List<ResolvedConflict> conflicts;
	/**
	 * The label of the conflict Text
	 */
	private Label resultLabel;

	/**
	 * The Text widget to display the recommended, modified eca rule to resolve the conflict
	 */
	private Text resultText;
	
	public ConflictsInfoDialog(Shell parentShell, List<ResolvedConflict> conflicts) {
		super(parentShell);
		// TODO Auto-generated constructor stub
		
		this.conflicts = conflicts;
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
		
		resultText = new Text(area, SWT.BORDER | SWT.READ_ONLY | SWT.MULTI | SWT.WRAP);
		GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gridData.heightHint = 5 * resultText.getLineHeight();
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
		
		getButton(IDialogConstants.PROCEED_ID).setText("Auto-resolve");
		
		
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.PROCEED_ID, "Proceed", true);
		getButton(IDialogConstants.PROCEED_ID).setEnabled(false);
		super.createButtonsForButtonBar(parent);
		getButton(OK).setVisible(false);
		getButton(CANCEL).setText("Close");
		setDialogHelpAvailable(false);
		getButton(IDialogConstants.PROCEED_ID).addMouseListener(new MouseListener() {		
			@Override
			public void mouseUp(MouseEvent e) {
				//launchRequest(e);
			}

			@Override
			public void mouseDown(MouseEvent e) {}

			@Override
			public void mouseDoubleClick(MouseEvent e) {}
		});
	}
	
	public void setText(String text) {
		resultText.setText(text);
	}
	
	private String getConflicts() {
		String result = "";
		
		for(ResolvedConflict conf : conflicts) {
			result += "The app \'" + conf.getAppID1() + "\' is in conflict with the app \'" + conf.getAppID2() +
					"\'. We suggested to modify \'"+conf.getModifiedAppID()+"\' to: \n";
			String modified = conf.getModifiedAppID();
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
		
		return result;
		
	}
	
	private String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
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
