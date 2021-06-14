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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	public DrawChart() {  
	    super();
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		//setContentPane(contentPane);
	  
	     
	    CategoryDataset dataset = createDataset();  
	      
	    //Create chart  
	    JFreeChart chart=ChartFactory.createBarChart(  
	        "Bar Chart Example", //Chart Title  
	        "Year", // Category axis  
	        "Population in Million", // Value axis  
	        dataset,  
	        PlotOrientation.VERTICAL,  
	        true,true,false  
	       );  
	  
	    ChartPanel panel=new ChartPanel(chart);  
	    setContentPane(panel);  
	  }  
	  
	  private CategoryDataset createDataset() {  
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
	  
	    // Population in 2005  
	    dataset.addValue(10, "USA", "2005");  
	    dataset.addValue(15, "India", "2005");  
	    dataset.addValue(20, "China", "2005");  
	  
	    // Population in 2010  
	    dataset.addValue(15, "USA", "2010");  
	    dataset.addValue(20, "India", "2010");  
	    dataset.addValue(25, "China", "2010");  
	  
	    // Population in 2015  
	    dataset.addValue(20, "USA", "2015");  
	    dataset.addValue(25, "India", "2015");  
	    dataset.addValue(30, "China", "2015");  
	  
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
