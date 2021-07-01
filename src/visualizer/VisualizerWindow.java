package visualizer;

import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import program.BubbleSort;
import program.CocktailShakerSort;
import program.Column;
import program.ColumnPanel;
import program.CombSort;
import program.CountingSort;
import program.GnomeSort;
import program.HeapSort;
import program.InsertSort;
import program.MergeSort;
import program.QuickSort;
import program.SelectSort;
import program.ShellSort;
import program.SortingAlgorithm;

public class VisualizerWindow {

	public JFrame frame;
	private JTextField txtArraySize;
	private JTextArea txtArrayElement;
	public static JPanel panel_3;
	private JLabel saLabel = new JLabel("Sorting Algorithm");
	private JLabel cLabel = new JLabel("Array Size");
	private JComboBox<Integer> counts = new JComboBox<Integer>();
	private JComboBox<SortingAlgorithm> sortingAlgorithms = new JComboBox<SortingAlgorithm>();
	JLabel lblNewLabel_2,lblNewLabel_4;
	int arr[] = new int[10000];
	public static int size = 20;
	JPanel barpanel = new JPanel();
	public static Choice choice;
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					VisualizerWindow window = new VisualizerWindow();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	public VisualizerWindow() {
		
		initialize();
		
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(60, 30, 1280, 700);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 164, 96));
		panel.setBounds(10, 73, 235, 555);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		txtArraySize = new JTextField();
		txtArraySize.setHorizontalAlignment(SwingConstants.CENTER);
		txtArraySize.setBounds(10, 92, 215, 30);
		txtArraySize.setFont(new Font("Times New Roman Baltic", Font.BOLD, 12));
		panel.add(txtArraySize);
		txtArraySize.setColumns(20);
		
		txtArrayElement = new JTextArea();
		txtArrayElement.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtArrayElement.setBounds(10, 188, 215, 356);
		panel.add(txtArrayElement);
		
		JLabel lblNewLabel = new JLabel("Array Size");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 62, 215, 29);
		lblNewLabel.setFont(new Font("Times New Roman Baltic", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Array Element");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman Baltic", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 153, 215, 32);
		panel.add(lblNewLabel_1);
		
		

		lblNewLabel_2 = new JLabel("Please Wait");
		lblNewLabel_2.setBackground(new Color(230, 230, 250));
		lblNewLabel_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(166, 636, 954, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(244, 164, 96));
		panel_2.setBounds(72, 11, 195, 51);
		panel_2.setLayout(null);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Speed");
		lblNewLabel_3.setFont(new Font("Times New Roman Baltic", Font.BOLD, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 12, 59, 29);
		panel_2.add(lblNewLabel_3);
		
	    choice = new Choice();
		choice.setFont(new Font("Dialog", Font.BOLD, 18));
		choice.addItem("Fast");
		choice.addItem("Normal");
		choice.addItem("Slow");
		choice.setBounds(65, 11, 120, 30);
		panel_2.add(choice);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(230, 230, 250));
		panel_2_1_1.setBounds(577, 11, 244, 51);
		frame.getContentPane().add(panel_2_1_1);
		
		lblNewLabel_4 = new JLabel("Algorithm Visualization");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_4.setBounds(0, 11, 234, 29);
		panel_2_1_1.add(lblNewLabel_4);
		
		

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(244, 164, 96));
		panel_2_1.setBounds(320, 11, 215, 51);
		frame.getContentPane().add(panel_2_1);
				
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(new Color(244, 164, 96));
		panel_2_2.setBounds(873, 11, 363, 51);
		frame.getContentPane().add(panel_2_2);
	    
		cLabel.setBounds(10, 11, 88, 20);
        cLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		panel_2_1.add(cLabel);
        
		sortingAlgorithms.setBounds(179, 10, 174, 30);
        sortingAlgorithms.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_2_2.add(sortingAlgorithms);
		
		counts.setBounds(108, 7, 98, 29);
        counts.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_2_1.add(counts);
		
		saLabel.setVisible(true);
        saLabel.setBounds(10, 11, 182, 29);
        saLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		panel_2_2.add(saLabel);
		
        class ColumnWindow  {
            /**
        	 * 
        	 */
            
            private int [] countArray = {10, 15, 20, 30, 40, 50, 60, 80, 100, 150, 250, 375, 750};
            private List<Column> columns;
            private ColumnPanel [] panels = new ColumnPanel[2];
            private int sortingSleepTime;
            private Random rnd = new Random();
            
            
            /**
             * Subclass for running the sorting thread.
             */
           class Execution implements Runnable {
                @Override
                public void run() {
                    panels[1].GetColumns().Sort(true);
                }
            }
            private Thread sortingThread = new Thread(new Execution());
            
            /**
             * Constructor which sets the width and height of the window and the column collection, it also works as a main method of the class, so it will show the window and run all the needed threads.
             * @param w window width
             * @param h window height
             * @param columns column collection which implements the List interface
             */
            public ColumnWindow(int w, int h) {
               
            	frame.addWindowListener(new WindowAdapter() {
                    @SuppressWarnings("deprecation")
        			@Override
                    public void windowClosing(WindowEvent winEvt) {
                        sortingThread.stop();
                    }
                });
                this.columns = getRndColumnArray(countArray[0]);
                sortingSleepTime = 2000 / columns.size();
                for(int i = 0; i < countArray.length; i++)
                    counts.addItem(countArray[i]);
                setPanels(w, h);
                setSortingAlgorithms();
                setCounts(size,false,true);
                barpanel.setLayout(panels[0].getLayout());
                barpanel.setVisible(true);
                barpanel.setBounds(255, 80,w + 10, h + 85);
                panels[1].GetColumns().Sort(false);
                startRepaintThread();
                sortingThread.start();
            }
            
            /**
             * Generates random column sequence.
             * @param count column count
             * @return generated sequence
             */
            private ArrayList<Column> getRndColumnArray(int count) {
                ArrayList<Column> columns = new ArrayList<Column>(0);
                for(int i = 0; i < count; i++)
                    columns.add(new Column(rnd.nextInt(99) + 1));
                return columns;
            }
            
            private ArrayList<Column> getCustomArray(int count) {
                ArrayList<Column> columns = new ArrayList<Column>(0);
                for(int i = 0; i < count; i++)
                    columns.add(new Column(arr[i]%100));
                return columns;
            }
            
            /**
             * Adds all the sorting algorithms into the sortingAlgorithms combobox and sets the change value event for the combobox
             */
            private void setSortingAlgorithms() {
            	
                sortingAlgorithms.setVisible(true);
                sortingAlgorithms.addItem(new InsertSort(sortingSleepTime));
                sortingAlgorithms.addItem(new BubbleSort(sortingSleepTime));
                sortingAlgorithms.addItem(new CocktailShakerSort(sortingSleepTime));
                sortingAlgorithms.addItem(new CombSort(sortingSleepTime));
                sortingAlgorithms.addItem(new SelectSort(sortingSleepTime));
                sortingAlgorithms.addItem(new GnomeSort(sortingSleepTime));
                sortingAlgorithms.addItem(new ShellSort(sortingSleepTime));
                sortingAlgorithms.addItem(new HeapSort(sortingSleepTime));
                sortingAlgorithms.addItem(new MergeSort(sortingSleepTime));
                sortingAlgorithms.addItem(new QuickSort(sortingSleepTime));
                sortingAlgorithms.addItem(new CountingSort(sortingSleepTime));
             //   barpanel.add(sortingAlgorithms);
                sortingAlgorithms.addActionListener(new ActionListener() {
                    @SuppressWarnings("deprecation")
        			@Override
                    public void actionPerformed(ActionEvent e) {
                        sortingThread.stop();
                        panels[1].GetColumns().SetColumns(columns);
                        panels[1].GetColumns().SetSortingAlgorithm((SortingAlgorithm)sortingAlgorithms.getSelectedItem());
                        panels[1].GetColumns().GetSortingAlgorithm().SetSleepTime(sortingSleepTime);
                        sortingThread = new Thread(new Execution());
                        sortingThread.start();
                    }
                });
                panels[1].GetColumns().SetSortingAlgorithm((SortingAlgorithm)sortingAlgorithms.getSelectedItem());
            }
            
            /**
             * Adds all the required values into the counts combobox and sets change value event for that combobox
             */
            @SuppressWarnings("deprecation")
			public void setCounts(int size,boolean custom_array,boolean randam_array) {
                cLabel.setVisible(true);
                counts.setVisible(true);
               
                if(custom_array) {
                	sortingThread.stop();
                    columns = (randam_array)?getRndColumnArray(size):getCustomArray(size);
                    for(int i = 0; i < panels.length; i++) {
                        panels[i].GetColumns().SetColumns(columns);
                        panels[i].repaint();
                    }
                    sortingSleepTime = 2000 / columns.size();
                    panels[1].GetColumns().GetSortingAlgorithm().SetSleepTime(sortingSleepTime);
                    sortingThread = new Thread(new Execution());
                    sortingThread.start();
                }
                counts.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        sortingThread.stop();
                        columns = getRndColumnArray((int)counts.getSelectedItem());
                        for(int i = 0; i < panels.length; i++) {
                            panels[i].GetColumns().SetColumns(columns);
                            panels[i].repaint();
                        }
                        sortingSleepTime = 2000 / columns.size();
                        panels[1].GetColumns().GetSortingAlgorithm().SetSleepTime(sortingSleepTime);
                        sortingThread = new Thread(new Execution());
                        sortingThread.start();
                    }
                });
            }
            
            /**
             * Sets panels for drawing columns
             * @param w whole window width
             * @param h whole window height
             */
            private void setPanels(int w, int h) {
                panels[0] = new ColumnPanel("Unsorted", columns);
                panels[1] = new ColumnPanel("Sorting process", columns);
                panels[0].setLocation(220, 300);
                panels[1].setLocation(500, 200);
                for(int i = 0; i < panels.length; i++) {
                    panels[i].setPreferredSize(new Dimension(w, h / panels.length));
                    panels[i].setVisible(true);
                    barpanel.add(panels[i]);
                }
            }
            
            /**
             * Starts re-rendering thread of the third (bottom) panel, this thread will run untill the window is not closed.
             */
            private void startRepaintThread() {
                Thread t = new Thread(new Runnable() {
                   @Override
                   public void run() {
                       while(true) {
                           panels[1].repaint();
                           try {
                                Thread.sleep(10);
                           }
                           catch(Exception ex){}
                       }
                   }
                });
                t.start();
            }
        }
        
        ColumnWindow obj = new ColumnWindow(970, 450);
		frame.getContentPane().add(barpanel);
		frame.setBackground(Color.blue);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btnNewButton_10 = new JButton("Update Array");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					size = Integer.parseInt(txtArraySize.getText().toString());
					String temp[] = (txtArrayElement.getText().toString()).split(",");
					if(size != temp.length || temp[0].isEmpty()) {
						lblNewLabel_2.setText("Your Input is invalid...");
						obj.setCounts(size,true,true);
					}
					else {
						for(int i =0;i<temp.length;i++) 
							arr[i] = Integer.parseInt(temp[i]);
						obj.setCounts(size,true,false);
					}
				}
				catch (Exception e1) {
					lblNewLabel_2.setText("Your Input is invalid...");
				}
			}
		});
		btnNewButton_10.setFont(new Font("Verdana", Font.BOLD, 18));
		btnNewButton_10.setBackground(new Color(0, 255, 0));
		btnNewButton_10.setBounds(10, 11, 215, 30);
		panel.add(btnNewButton_10);
        
        
		
	}		
}
