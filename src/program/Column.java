package program;

import java.awt.*;
/**
 * Column class.
 * @author Saurabh Sharma
 */
public class Column {
    private static final Color H_COL = new Color(255,0,0);
    private static final Color NH_COL = new Color(0,255,0);
    private static final Color DARK_H_COL = new Color(127,0,0);
    private static final Color DARK_NH_COL = new Color(0,127,0); 
    private int value;
    private boolean highlighted = false;
    
    /**
     * Constructor for setting the column value.
     * @param value column value
     */
    public Column(int value) {
        this.value = value;
    }
    
    /**
     * Column value getter
     * @return column value
     */
    public int GetValue() {
        return value;
    }
    
    /**
     * Column value setter
     * @param value 
     */
    public void SetValue(int value) {
        this.value = value;
    }
    
    /**
     * Highlights the column.
     */
    public void Highlight() {
        this.highlighted = true;
    }
    
    /**
     * Cancels the column highlighting
     */
    public void Unhighlight() {
        this.highlighted = false;
    }
    
    /**
     * Draws the column.
     * @param bottom bottom position of column y
     * @param xPos left position of column x
     * @param width column width
     * @param unit multiplier of the column height, the resulting height is (value * unit) pixels
     * @param shadow whether to draw the shadow behind the column or not
     * @param shLineEnd x bounding for lines in the column shadow, no line in the shadow may pass this bounding (from left)
     * @param lineSpaces size of the spaces between lines in the shadow
     * @param lineNumber position (from bottom) of the biggest line in the shadow, no line may be drawn above this one
     * @param g canvas
     */
    public void Draw(int bottom, int xPos, int width, float unit, boolean shadow, int shLineEnd, int lineSpaces, int lineNumber, Graphics g) {
        final int Y_POS = (int)(bottom - unit * value + 1);
        final int HEIGHT = (int)(bottom - unit * value);
        final int DEPTH = (width < 100 ? width / 4 : 25);
//        if(shadow) {
//            final int SHADOW_DEPTH = (int)(2 * DEPTH);
//            final int SHADOW_LINE_YSTART = SHADOW_DEPTH - SHADOW_DEPTH % (int)(10 * unit) + (int)(10 * unit);
//            final int SHADOW_LINE_XPOS1 = xPos + SHADOW_DEPTH;
//            final int SHADOW_LINE_XPOS2 = SHADOW_LINE_XPOS1 - 1 + width;
//            g.setColor(new Color(0,127,0));
//            g.fillRect(xPos + SHADOW_DEPTH, Y_POS - SHADOW_DEPTH, width, bottom - HEIGHT);
//            g.setColor(new Color(0,127,0));
//            if(shLineEnd > 0)
//                for(int i = SHADOW_LINE_YSTART;
//                    i <= value * unit + SHADOW_DEPTH && i <= (lineNumber * lineSpaces + 1) * unit;
//                    i += lineSpaces * unit)
//                    if(i > 0) {
//                        final int LINE_Y = bottom - i + 1;
//                        g.drawLine(SHADOW_LINE_XPOS1, LINE_Y, SHADOW_LINE_XPOS2 <= shLineEnd ? SHADOW_LINE_XPOS2 : shLineEnd, LINE_Y);
//                    }
//        }
        g.setColor(highlighted ? DARK_H_COL : DARK_NH_COL);
        for(int i = DEPTH + 1; i >= 1; i--)
            g.fillRect(xPos + i, Y_POS - i, width, bottom - HEIGHT);
        g.setColor(highlighted ? H_COL : NH_COL);
        g.fillRect(xPos, (int)(bottom - unit * value + 1), width, bottom - (int)(bottom - unit * value));
        g.setColor(Color.black);
        if(width > 18)
            g.drawString(String.valueOf(value), xPos + width / 2 - 7, bottom + 12);
    }
}
