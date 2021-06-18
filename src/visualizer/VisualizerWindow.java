package visualizer;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import drawbarchart.DrawChart;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VisualizerWindow {

	private JFrame frame;
	private JTextField txtArraySize;
	private JTextArea txtArrayElement;
	public static JPanel panel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizerWindow window = new VisualizerWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VisualizerWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
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
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("CUSTOM  ARRAY");
		chckbxNewCheckBox.setBounds(10, 10, 215, 30);
		chckbxNewCheckBox.setFont(new Font("Times New Roman Baltic", Font.BOLD, 15));
		panel.add(chckbxNewCheckBox);
		
		txtArraySize = new JTextField();
		txtArraySize.setHorizontalAlignment(SwingConstants.CENTER);
		txtArraySize.setBounds(10, 105, 215, 30);
		txtArraySize.setFont(new Font("Times New Roman Baltic", Font.BOLD, 12));
		panel.add(txtArraySize);
		txtArraySize.setColumns(20);
		
		txtArrayElement = new JTextArea();
		txtArrayElement.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtArrayElement.setBounds(10, 188, 215, 356);
		panel.add(txtArrayElement);
		
		JLabel lblNewLabel = new JLabel("Array Size");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 65, 215, 29);
		lblNewLabel.setFont(new Font("Times New Roman Baltic", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Array Element");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman Baltic", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 146, 215, 32);
		panel.add(lblNewLabel_1);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(255, 73, 999, 47);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setFont(new Font("Times New Roman Baltic", Font.BOLD, 12));
		btnNewButton_5.setBounds(14, 10, 132, 27);
		btnNewButton_5.setText("Insertion Sort");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setFont(new Font("Times New Roman Baltic", Font.BOLD, 12));
		btnNewButton_4.setBounds(171, 10, 132, 27);
		btnNewButton_4.setText("Selection Sort");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setFont(new Font("Times New Roman Baltic", Font.BOLD, 12));
		btnNewButton_3.setText("Count Sort");
		btnNewButton_3.setBounds(850, 10, 132, 27);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setFont(new Font("Times New Roman Baltic", Font.BOLD, 12));
		btnNewButton_2.setBounds(339, 10, 132, 27);
		btnNewButton_2.setText("Bubble Sort");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setText("Marge Sort");
		btnNewButton_1.setFont(new Font("Times New Roman Baltic", Font.BOLD, 12));
		btnNewButton_1.setBounds(513, 10, 132, 27);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Times New Roman Baltic", Font.BOLD, 12));
		btnNewButton.setText("Quick Sort");
		btnNewButton.setBounds(696, 10, 132, 27);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Please Wait");
		lblNewLabel_2.setBackground(new Color(230, 230, 250));
		lblNewLabel_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(166, 636, 954, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_6 = new JButton("BACK");
		btnNewButton_6.setBounds(10, 25, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(244, 164, 96));
		panel_2.setBounds(177, 11, 244, 51);
		panel_2.setLayout(null);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Speed");
		lblNewLabel_3.setFont(new Font("Times New Roman Baltic", Font.BOLD, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 11, 69, 29);
		panel_2.add(lblNewLabel_3);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Dialog", Font.BOLD, 18));
		choice.addItem("Very Slow");
		choice.addItem("Slow");
		choice.addItem("Normal");
		choice.addItem("Fast");
		choice.addItem("Very Fast");
		choice.setBounds(102, 11, 132, 29);
		panel_2.add(choice);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(244, 164, 96));
		panel_2_1.setBounds(897, 11, 338, 51);
		frame.getContentPane().add(panel_2_1);
		
		JButton btnNewButton_7 = new JButton("Reset");
		btnNewButton_7.setForeground(new Color(0, 0, 0));
		btnNewButton_7.setFont(new Font("Times New Roman Greek", Font.BOLD, 18));
		btnNewButton_7.setBackground(Color.YELLOW);
		btnNewButton_7.setBounds(10, 11, 89, 23);
		panel_2_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Pause");
		btnNewButton_8.setBounds(120, 11, 89, 23);
		btnNewButton_8.setFont(new Font("Times New Roman Greek", Font.BOLD, 18));
		btnNewButton_8.setBackground(Color.RED);
		panel_2_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Start");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtArrayElement.getText().isEmpty() || txtArraySize.getText().isEmpty()) {
					int arr[] = {5,7,12,6,3,12,6,18,8,6,2};
					txtArrayElement.setText("Done if blook");
					drawChartFromArray(arr);
				}
				else
				{
					String temp[] = txtArrayElement.getText().split(",");
					int arr[] = new int[Integer.valueOf(txtArraySize.getText())];
					for(int i =0;i<temp.length;i++) {
						arr[i] = Integer.valueOf(temp[i]);
					}
					txtArrayElement.setText("Done else blook");
					drawChartFromArray(arr);
				}
				
			}
		});
		btnNewButton_9.setBounds(234, 11, 89, 23);
		btnNewButton_9.setFont(new Font("Times New Roman Greek", Font.BOLD, 18));
		btnNewButton_9.setBackground(Color.GREEN);
		panel_2_1.add(btnNewButton_9);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(230, 230, 250));
		panel_2_1_1.setBounds(470, 11, 338, 51);
		frame.getContentPane().add(panel_2_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Insertion Sort Visualization");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_4.setBounds(20, 11, 295, 29);
		panel_2_1_1.add(lblNewLabel_4);
		
		int arr[] = {5,7,12,6,3,12,6,18,8,6,2,6,12,15,8,19,13,11};
		JFreeChart chart = DrawChart.drawChart(arr);
		ChartPanel chartpanel=new ChartPanel(chart);
		chartpanel.setBounds(255, 131, 980, 494);
		frame.getContentPane().add(chartpanel);
		
		frame.setBackground(Color.blue);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	void drawChartFromArray(int arr[]) {
		JFreeChart chart = DrawChart.drawChart(arr);
		ChartPanel chartpanel=new ChartPanel(chart);
		chartpanel.setBounds(255, 131, 980, 494);
		frame.getContentPane().add(chartpanel);
	}
}
