/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.List;

/**
 * Gnome sort class
 * @author Saurabh Sharma
 */
public class GnomeSort extends SortingAlgorithm {
    /**
     * Sets the time for the sleep by calling the parent constructor.
     * @param sleepTime the value of the sleep time
     */
    public GnomeSort(int sleepTime) {
        super(sleepTime);
    }
    
    @Override
    public void Sort(List<Column> columns, boolean highlight) {
        for(int i = 1; i < columns.size(); i++) {
            if(highlight) {
                columns.get(i).Highlight();
                sleep();
            }
            for(int j = i; columns.get(j).GetValue() < columns.get(j > 0 ? j - 1 : j).GetValue(); j--) {
                if(highlight) {
                    columns.get(j).Highlight();
                    columns.get(j > 0 ? j - 1 : j).Highlight();
                    sleep();
                }
                Column temp = columns.get(j);
                columns.set(j, columns.get(j - 1));
                columns.set(j - 1,  temp);
                if(highlight) {
                    sleep();
                    columns.get(j).Unhighlight();
                    columns.get(j > 0 ? j - 1 : j).Unhighlight();
                }
            }
            if(highlight) columns.get(i).Unhighlight();
        }
    }
    
    @Override
    public String toString() {
        return "Gnome sort";
    }
}
