package visualizer;

import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.events.*;

public class HomeWindow {
	protected Shell shell;
	//private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	Display display;
	
	public static void main(String[] args) {
		try {
			HomeWindow window = new HomeWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.CLOSE | SWT.TITLE | SWT.MIN);
		shell.setImage(SWTResourceManager.getImage("\\Image\\logo.png"));
		shell.setBackgroundImage(SWTResourceManager.getImage("Image\\background.jpg"));
		shell.setSize(1000,650);
		shell.setLocation(200,50);
		shell.setText("Algorithm.Visualizer");
		shell.setLayout(null);
		
		Button btnNewButton = new Button(shell, SWT.BORDER);
		btnNewButton.setImage(SWTResourceManager.getImage("Image\\e_lecture.png"));
		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnNewButton.setBounds(100, 201, 193, 218);
				
		Button btnNewButton_1 = new Button(shell, SWT.BORDER);
		btnNewButton_1.setImage(SWTResourceManager.getImage("Image\\Visulization.png"));
		btnNewButton_1.setBounds(590, 201, 193, 218);
		btnNewButton_1.setBackground(SWTResourceManager.getColor(106, 90, 205));
		
		Button btnNewButton_3 = new Button(shell, SWT.FLAT | SWT.CENTER);
		
		btnNewButton_3.setFont(SWTResourceManager.getFont("Copperplate Gothic Bold", 16, SWT.BOLD | SWT.ITALIC));
		btnNewButton_3.setBounds(100, 447, 193, 38);
		btnNewButton_3.setBackground(SWTResourceManager.getColor(106, 90, 205));
		btnNewButton_3.setText("Visualizer");
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				VisualizerWindow.main(null);
			}
		});
		
		Button btnNewButton_4 = new Button(shell, SWT.FLAT | SWT.CENTER);
		btnNewButton_4.setFont(SWTResourceManager.getFont("Copperplate Gothic Bold", 13, SWT.BOLD | SWT.ITALIC));
		btnNewButton_4.setBounds(586, 447, 193, 38);
		btnNewButton_4.setBackground(SWTResourceManager.getColor(106, 90, 205));
		btnNewButton_4.setText("Algorithm");
		btnNewButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AboutAlgo aboutAlgo = new AboutAlgo();
				aboutAlgo.open();
			}
		});
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBackground(SWTResourceManager.getColor(106, 90, 205));
		lblNewLabel.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 40, SWT.BOLD));
		lblNewLabel.setBounds(124, 73, 704, 72);
		lblNewLabel.setText("ALGORITHM VISUALIZER");
		

	}
}
