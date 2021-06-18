package drawbarchart;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Demo extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private static final String ROW_KEY = "Values";
    private static final Random r = new Random();

    public void display(int arr[]) {

        JFrame f = new JFrame("Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final DefaultCategoryDataset model = new DefaultCategoryDataset();
        for(int i =0;i<arr.length;i++) {
	    	model.addValue(arr[i], "Array Elements",String.valueOf(arr[i]));
	    }
        JFreeChart chart = ChartFactory.createBarChart("Proxi", "Sensors",
            "Value", model, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel barPanel = new ChartPanel(chart) 
        {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public Dimension getPreferredSize() {
                return new Dimension(320, 240);
            }
        };
        f.add(barPanel);
        f.add(new JButton(new AbstractAction("Update") 
        {
			private static final long serialVersionUID = 1L;
			@Override
            public void actionPerformed(ActionEvent e) {
                model.setValue(r.nextDouble() * 3, ROW_KEY, "2");
            }
        }), BorderLayout.SOUTH);

        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
        	int arr[] = {5,2,8,4,7};
            @Override
            public void run() {
                new Demo().display(arr);
            }
        });
    }
}