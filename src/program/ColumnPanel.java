/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.awt.*;
import java.util.List;
import javax.swing.*;
/**
 * Represents canvas for drawing the columns.
 * @author Saurabh Sharma
 */
public class ColumnPanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sign;
    private ColumnCollection columns;
    
    /**
     * Constructor for initialization of the heading and the column collection.
     * @param sign panel heading
     * @param columns column collection
     */
    public ColumnPanel(String sign, List<Column> columns) {
        this.sign = sign;
        this.columns = new ColumnCollection(columns);
    }
    
    /**
     * Method for drawing the background of the panel (number scale)
     * @param xBegin x beginning of the space for drawing the background
     * @param xEnd x end of the space for drawing the background
     * @param yBegin y beginning of the space for drawing the background
     * @param height height of the space for drawing the background
     * @param g canvas
     */
    private void drawBackground(int xBegin, int xEnd, int yBegin, int height, Graphics g) {
        g.setColor(Color.blue);
        super.paintComponent(g);
        g.drawString(sign, 5, 15);
        for(int i = 10; i >= 0; i--) {
            int h = yBegin + (height / 11) * i;
            g.setColor(Color.black);
            g.drawString(String.valueOf(100 - i * 10), xBegin + 3, h);
            g.setColor(Color.lightGray);
            g.drawLine(xBegin, h + 1, xEnd, h + 1);
        }
        g.drawLine(xBegin, yBegin - 10, xBegin, yBegin + (height /11) * 10);
    }
    
    /**
     * Method for drawing the component (draws the background and columns)
     * @param g canvas
     */
    @Override
    public void paintComponent(Graphics g) {
        final int HEIGHT = this.getHeight() - 30;
        final int X_BEGIN = 5;
        final int X_END = this.getWidth() - 10;
        final int Y_BEGIN = 35;
        final int Y_END = Y_BEGIN + (HEIGHT / 11) * 10;
        drawBackground(X_BEGIN, X_END, Y_BEGIN, HEIGHT, g);
        columns.Draw(X_BEGIN + 30, X_END, Y_BEGIN, Y_END, false, 10, 10, g);
    }
    
    /**
     * Column collection getter
     * @return column collection in the object of type ColumnCollection
     */
    public ColumnCollection GetColumns() {
        return columns;
    }
}
