package visualizer;


import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;

public class AboutProject {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AboutProject window = new AboutProject();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
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
		shell.setBackgroundImage(SWTResourceManager.getImage("D:\\Algorithm Visualizer\\Image\\background.jpg"));
		shell.setSize(1000,650);
		shell.setLocation(200,50);
		shell.setText("Algorithm.Visualizer");
		shell.setLayout(null);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBackground(SWTResourceManager.getColor(106, 90, 205));
		lblNewLabel.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 25, SWT.BOLD | SWT.ITALIC));
		lblNewLabel.setBounds(229, 78, 543, 43);
		lblNewLabel.setText("Our Team Member");

	}
}
