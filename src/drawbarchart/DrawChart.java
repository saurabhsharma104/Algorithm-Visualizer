package drawbarchart;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class DrawChart extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	public DrawChart() {  
	    super();
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5,5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		int arr[] = {5,2,8,4,7};
		JFreeChart chart = drawChart(arr);
		ChartPanel panel=new ChartPanel(chart);  
	    setContentPane(panel); 
	}
	
	public static JFreeChart drawChart(int arr[]) {
	     
	    CategoryDataset dataset = createDataset(arr);
	    
	      
	    //Create chart  
	    JFreeChart chart=ChartFactory.createBarChart(  
	        "Bar Chart Example", //Chart Title  
	        "No of Element",         // Category axis  
	        "Array Element Size", // Value axis  
	        dataset,  
	        PlotOrientation.VERTICAL,  
	        false,true,false  
	       );
	  
	    return chart; 
	  }  
	  
	  public static CategoryDataset createDataset(int arr[]) {  
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
	    for(int i =0;i<arr.length;i++) {
	    	dataset.addValue(arr[i], "Array Elements",String.valueOf(arr[i]));
	    }
	    
	   //dataset.addValue(15);  
	   // dataset.addValue(20, "China", "2005");  
	    
	    return dataset;  
	  }  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawChart frame = new DrawChart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}		
}
