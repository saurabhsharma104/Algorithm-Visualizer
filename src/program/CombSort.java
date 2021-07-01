/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.List;

/**
 * Comb sort class
 * @author Saurabh Sharma
 */
public class CombSort extends SortingAlgorithm {
    /**
     * Sets the time for the sleep by calling the parent constructor.
     * @param sleepTime the value of the sleep time
     */
    public CombSort(int sleepTime) {
        super(sleepTime);
    }
    
    @Override
    public void Sort(List<Column> columns, boolean highlight) {
        boolean swapped = true;
        double divider = 4/3.0;
        for (int space = (int)(columns.size() / divider); swapped || space > 1; space /= space > divider ? divider : 1) {
            swapped = false;
            for (int first = 0; first < columns.size() - space; first++) {
                if(highlight) {
                    columns.get(first).Highlight();
                    columns.get(first + space).Highlight();
                    sleep();
                }
                if(columns.get(first).GetValue() > columns.get(first + space).GetValue()) {
                    Column temp = columns.get(first);
                    columns.set(first, columns.get(first + space));
                    columns.set(first + space,  temp);
                    swapped = true;
                    if(highlight) sleep();
                }
                if(highlight) {
                    columns.get(first).Unhighlight();
                    columns.get(first + space).Unhighlight();
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return "Comb sort";
    }
}
