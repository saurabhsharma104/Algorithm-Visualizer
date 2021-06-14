package visualizer;


import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;

public class MainWindow {

	protected Shell shell;
	private Text txtHint;
	private Text text_1;
	public static Composite composite;


	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
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
		
		shell = new Shell();
		shell.setTouchEnabled(true);
		shell.setBackgroundImage(SWTResourceManager.getImage("D:\\Algorithm Visualizer\\Image\\background.jpg"));
		shell.setSize(1280,700);
		shell.setLocation(60,30);
		shell.setText("Algorithm Visualizer");
		
		shell.setLayout(null);
		
		composite = new Composite(shell, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(255, 255, 255));
		composite.setBounds(237, 124, 1017, 498);
		
		Label lblNewLabel_5 = new Label(composite, SWT.NONE);
		lblNewLabel_5.setBounds(10, 10, 997, 478);
		lblNewLabel_5.setText("SAURABH Hello");
		//BarChartDraw barChartDraw = new BarChartDraw("Demo");
		//barChartDraw.getChart();
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setBackground(SWTResourceManager.getColor(255, 215, 0));
		composite_1.setBounds(10, 71, 221, 551);
		
		Button btnCheckButton = new Button(composite_1, SWT.CHECK);
		btnCheckButton.setFont(SWTResourceManager.getFont("Times New Roman TUR", 15, SWT.BOLD));
		btnCheckButton.setBounds(10, 10, 201, 30);
		btnCheckButton.setText("CUSTOM  ARRAY");
		
		txtHint = new Text(composite_1, SWT.MULTI | SWT.BORDER);
		txtHint.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		txtHint.setBounds(10, 172, 201, 369);
		
		Label lblNewLabel = new Label(composite_1, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBounds(10, 56, 201, 30);
		lblNewLabel.setText(" Array Size");
		
		text_1 = new Text(composite_1, SWT.BORDER);
		text_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		text_1.setBounds(10, 97, 201, 30);
		
		Label lblNewLabel_1 = new Label(composite_1, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Times New Roman CE", 12, SWT.BOLD));
		lblNewLabel_1.setAlignment(SWT.CENTER);
		lblNewLabel_1.setBounds(10, 136, 201, 30);
		lblNewLabel_1.setText("Array Element");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBackground(SWTResourceManager.getColor(255, 204, 102));
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 12, SWT.ITALIC));
		lblNewLabel_2.setText("Please Wait.......");
		lblNewLabel_2.setAlignment(SWT.CENTER);
		lblNewLabel_2.setBounds(47, 628, 1169, 23);
		
		Composite composite_2 = new Composite(shell, SWT.NONE);
		composite_2.setBackground(SWTResourceManager.getColor(175, 238, 238));
		composite_2.setBounds(237, 71, 1017, 47);
		
		Button btnNewButton = new Button(composite_2, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.BOLD));
		btnNewButton.setBounds(14, 10, 132, 27);
		btnNewButton.setText("Insertion Sort");
		
		Button btnNewButton_1 = new Button(composite_2, SWT.NONE);
		btnNewButton_1.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.BOLD));
		btnNewButton_1.setBounds(171, 10, 132, 27);
		btnNewButton_1.setText("Selection Sort");
		
		Button btnNewButton_2 = new Button(composite_2, SWT.NONE);
		btnNewButton_2.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.BOLD));
		btnNewButton_2.setBounds(339, 10, 132, 27);
		btnNewButton_2.setText("Bubble Sort");
		
		Button btnNewButton_2_1 = new Button(composite_2, SWT.NONE);
		btnNewButton_2_1.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.BOLD));
		btnNewButton_2_1.setText("Marge Sort");
		btnNewButton_2_1.setBounds(513, 10, 132, 27);
		
		Button btnNewButton_2_2 = new Button(composite_2, SWT.NONE);
		btnNewButton_2_2.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.BOLD));
		btnNewButton_2_2.setText("Quick Sort");
		btnNewButton_2_2.setBounds(696, 10, 132, 27);
		
		Button btnNewButton_2_3 = new Button(composite_2, SWT.NONE);
		btnNewButton_2_3.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.BOLD));
		btnNewButton_2_3.setText("Count Sort");
		btnNewButton_2_3.setBounds(867, 10, 132, 27);
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.setFont(SWTResourceManager.getFont("Tahoma", 13, SWT.BOLD));
		btnNewButton_3.setBounds(10, 26, 75, 31);
		btnNewButton_3.setText("Back");
		
		Composite composite_3 = new Composite(shell, SWT.NONE);
		composite_3.setBackground(SWTResourceManager.getColor(255, 204, 102));
		composite_3.setBounds(192, 10, 247, 55);
		
		Combo combo = new Combo(composite_3, SWT.READ_ONLY);
		combo.setBounds(85, 10, 152, 32);
		combo.setItems(new String[] {"Very Slow", "Slow", "Normal", "Fast", "Very Fast"});
		combo.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 16, SWT.BOLD));
		combo.setText("Speed");
		combo.select(2);
		
		Label lblNewLabel_4 = new Label(composite_3, SWT.NONE);
		lblNewLabel_4.setFont(SWTResourceManager.getFont("Yu Gothic Medium", 15, SWT.BOLD));
		lblNewLabel_4.setBounds(10, 10, 69, 32);
		lblNewLabel_4.setText("Speed");
		
		Composite composite_4 = new Composite(shell, SWT.NONE);
		composite_4.setBackground(SWTResourceManager.getColor(255, 204, 102));
		composite_4.setBounds(847, 10, 369, 55);
		
		Button btnNewButton_4 = new Button(composite_4, SWT.NONE);
		btnNewButton_4.setFont(SWTResourceManager.getFont("Times New Roman Greek", 13, SWT.BOLD));
		btnNewButton_4.setBounds(10, 10, 89, 35);
		btnNewButton_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		btnNewButton_4.setText("Reset");
		
		Button btnNewButton_4_1 = new Button(composite_4, SWT.NONE);
		btnNewButton_4_1.setFont(SWTResourceManager.getFont("Times New Roman Greek", 13, SWT.BOLD));
		btnNewButton_4_1.setText("Pause");
		btnNewButton_4_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnNewButton_4_1.setBounds(137, 10, 89, 35);
		
		Button btnNewButton_4_2 = new Button(composite_4, SWT.NONE);
		btnNewButton_4_2.setFont(SWTResourceManager.getFont("Times New Roman Greek", 13, SWT.BOLD));
		btnNewButton_4_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		btnNewButton_4_2.setText("Start");
		btnNewButton_4_2.setBounds(270, 10, 89, 35);
		
		Label lblNewLabel_3 = new Label(shell, SWT.CENTER);
		lblNewLabel_3.setAlignment(SWT.CENTER);
		lblNewLabel_3.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 16, SWT.BOLD));
		lblNewLabel_3.setBounds(500, 10, 306, 55);
		lblNewLabel_3.setText("Selected Insertion Sort");
		
		
	}
}
