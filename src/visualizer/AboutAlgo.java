package visualizer;



import java.io.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AboutAlgo {

	protected Shell shell;
	Display display;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AboutAlgo window = new AboutAlgo();
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
		shell.setImage(SWTResourceManager.getImage("Image\\logo.png"));
		shell.setBackgroundImage(SWTResourceManager.getImage("Image\\background.jpg"));
		shell.setSize(1000,650);
		shell.setLocation(200,50);
		shell.setText("Algorithm.Visualizer");
		shell.setLayout(null);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBackground(SWTResourceManager.getColor(106, 90, 205));
		lblNewLabel.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 25, SWT.BOLD | SWT.ITALIC));
		lblNewLabel.setBounds(226, 0, 543, 43);
		lblNewLabel.setText("Concept of Algorithm");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(255, 215, 0));
		composite.setBounds(23, 114, 200, 497);
		
		Button algorithm = new Button(composite, SWT.NONE);
		algorithm.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		algorithm.setBounds(10, 22, 180, 31);
		algorithm.setText("What is Algorithm?");
		
		Button sorting = new Button(composite, SWT.NONE);
		sorting.setBounds(10, 80, 180, 31);
		sorting.setText("What is Sorting?");
		
		Button insertion = new Button(composite, SWT.NONE);
		insertion.setBounds(10, 147, 180, 31);
		insertion.setText("Insertion Sort");
		
		Button selection = new Button(composite, SWT.NONE);
		selection.setBounds(10, 203, 180, 31);
		selection.setText("Selection Sort");
		
		Button bubble = new Button(composite, SWT.NONE);
		bubble.setBounds(10, 265, 180, 31);
		bubble.setText("Bubble Sort");
		
		Button count = new Button(composite, SWT.NONE);
		count.setBounds(10, 331, 180, 31);
		count.setText("Count Sort");
		
		Button quick = new Button(composite, SWT.NONE);
		quick.setBounds(10, 386, 180, 31);
		quick.setText("Quick Sort");
		
		Button marge = new Button(composite, SWT.NONE);
		marge.setText("Marge Sort");
		marge.setBounds(10, 443, 180, 25);
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setBackground(SWTResourceManager.getColor(255, 215, 0));
		composite_1.setBounds(342, 166, 532, 390);
		
		Button btnNewButton_8 = new Button(composite_1, SWT.NONE);
		btnNewButton_8.setImage(SWTResourceManager.getImage("Image\\lt.jpg"));
		btnNewButton_8.setBounds(10, 167, 29, 25);
		
		Button btnNewButton_9 = new Button(composite_1, SWT.NONE);
		btnNewButton_9.setImage(SWTResourceManager.getImage("Image\\gt.jpg"));
		btnNewButton_9.setBounds(493, 167, 29, 25);
		
		Label lblNewLabel_1 = new Label(composite_1, SWT.HORIZONTAL);
		lblNewLabel_1.setAlignment(SWT.CENTER);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.BOLD));
		lblNewLabel_1.setTouchEnabled(true);
		lblNewLabel_1.setBounds(56, 66, 420, 280);
		lblNewLabel_1.setText("Click On Button");
		
		Label title = new Label(shell, SWT.NONE);
		title.setFont(SWTResourceManager.getFont("Sitka Small", 21, SWT.BOLD));
		title.setBackground(SWTResourceManager.getColor(173, 255, 47));
		title.setAlignment(SWT.CENTER);
		title.setBounds(401, 122, 386, 43);
		title.setText("What is Algorithm?");
		
		Button btnNewButton_10 = new Button(shell, SWT.NONE);
		btnNewButton_10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				HomeWindow homeWindow = new HomeWindow();
				homeWindow.open();
			}
		});
		btnNewButton_10.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.BOLD));
		btnNewButton_10.setBounds(10, 10, 96, 30);
		btnNewButton_10.setText("BACK");
		
		
		algorithm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				title.setText(algorithm.getText());
				final String fileLoc = "Tutorial\\algorithm.txt";
				 String text;
			        try (BufferedReader br = new BufferedReader(new FileReader(fileLoc))) {
			            while((text = br.readLine()) != null) {
			                if (text.contains("<STUFF>")) {
			                    text = text.replace("<STUFF>", "This is text to replace \"<STUFF>\"");
			                    lblNewLabel_1.setText(text);
			                } else {
			                	lblNewLabel_1.setText(text);
			                }
			            }
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }
				
			}
		});
		
		sorting.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				title.setText(sorting.getText());
				final String fileLoc = "Tutorial\\sorting.txt";
				 String text;
			        try (BufferedReader br = new BufferedReader(new FileReader(fileLoc))) {
			            while((text = br.readLine()) != null) {
			                if (text.contains("<STUFF>")) {
			                    text = text.replace("<STUFF>", "This is text to replace \"<STUFF>\"");
			                    lblNewLabel_1.setText(text);
			                } else {
			                	lblNewLabel_1.setText(text);
			                }
			            }
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }
			}
		});
		
		bubble.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				title.setText(bubble.getText());
				final String fileLoc = "Tutorial\\bubble.txt";
				 String text;
			        try (BufferedReader br = new BufferedReader(new FileReader(fileLoc))) {
			            while((text = br.readLine()) != null) {
			                if (text.contains("<STUFF>")) {
			                    text = text.replace("<STUFF>", "This is text to replace \"<STUFF>\"");
			                    lblNewLabel_1.setText(text);
			                } else {
			                	lblNewLabel_1.setText(text);
			                }
			            }
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }
			}
		});
		
		count.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				title.setText(count.getText());
				final String fileLoc = "Tutorial\\count.txt";
				 String text;
			        try (BufferedReader br = new BufferedReader(new FileReader(fileLoc))) {
			            while((text = br.readLine()) != null) {
			                if (text.contains("<STUFF>")) {
			                    text = text.replace("<STUFF>", "This is text to replace \"<STUFF>\"");
			                    lblNewLabel_1.setText(text);
			                } else {
			                	lblNewLabel_1.setText(text);
			                }
			            }
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }
			}
		});
		
		selection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				title.setText(selection.getText());
				final String fileLoc = "Tutorial\\selection.txt";
				 String text;
			        try (BufferedReader br = new BufferedReader(new FileReader(fileLoc))) {
			            while((text = br.readLine()) != null) {
			                if (text.contains("<STUFF>")) {
			                    text = text.replace("<STUFF>", "This is text to replace \"<STUFF>\"");
			                    lblNewLabel_1.setText(text);
			                } else {
			                	lblNewLabel_1.setText(text);
			                }
			            }
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }
			}
		});
		
		quick.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				title.setText(quick.getText());
				final String fileLoc = "Tutorial\\quick.txt";
				 String text;
			        try (BufferedReader br = new BufferedReader(new FileReader(fileLoc))) {
			            while((text = br.readLine()) != null) {
			                if (text.contains("<STUFF>")) {
			                    text = text.replace("<STUFF>", "This is text to replace \"<STUFF>\"");
			                    lblNewLabel_1.setText(text);
			                } else {
			                	lblNewLabel_1.setText(text);
			                }
			            }
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }
			}
		});
		
		marge.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				title.setText(marge.getText());
				final String fileLoc = "Tutorial\\marge.txt";
				 String text;
			        try (BufferedReader br = new BufferedReader(new FileReader(fileLoc))) {
			            while((text = br.readLine()) != null) {
			                if (text.contains("<STUFF>")) {
			                    text = text.replace("<STUFF>", "This is text to replace \"<STUFF>\"");
			                    lblNewLabel_1.setText(text);
			                } else {
			                	lblNewLabel_1.setText(text);
			                }
			            }
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }
			}
		});
		
		insertion.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				title.setText(insertion.getText());
				final String fileLoc = "Tutorial\\insertion.txt";
				 String text;
			        try (BufferedReader br = new BufferedReader(new FileReader(fileLoc))) {
			            while((text = br.readLine()) != null) {
			                if (text.contains("<STUFF>")) {
			                    text = text.replace("<STUFF>", "This is text to replace \"<STUFF>\"");
			                    lblNewLabel_1.setText(text);
			                } else {
			                	lblNewLabel_1.setText(text);
			                }
			            }
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }
			}
		});

	}
}
