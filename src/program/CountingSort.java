/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.List;

/**
 * Counting sort class
 * @author Saurabh Sharma
 */
public class CountingSort extends SortingAlgorithm {
    /**
     * Sets the time for the sleep by calling the parent constructor.
     * @param sleepTime the value of the sleep time
     */
    public CountingSort(int sleepTime) {
        super(sleepTime);
    }
    
    @Override
    public void Sort(List<Column> columns, boolean highlight) {
        int min = columns.get(0).GetValue();
        int max = columns.get(0).GetValue();
        for(int i = 0; i < columns.size(); i++) {
            if(highlight) {
                columns.get(i).Highlight();
                sleep();
            }
            if(columns.get(i).GetValue() < min)
                min = columns.get(i).GetValue();
            if(columns.get(i).GetValue() > max)
                max = columns.get(i).GetValue();
            if(highlight) columns.get(i).Unhighlight();
        }
        int [] counts = new int[max - min + 1];
        for(int i = 0; i < columns.size(); i++) {
            if(highlight) {
                columns.get(i).Highlight();
                sleep();
            }
            counts[columns.get(i).GetValue() - min]++;
            if(highlight) columns.get(i).Unhighlight();
        }
        for(int i = 0, j = 0; i < counts.length; i++) {
            while(counts[i]-- > 0) {
                columns.get(j).SetValue(i + min);
                if(highlight) {
                    columns.get(j).Highlight();
                    sleep();
                    columns.get(j).Unhighlight();
                }
                j++;
            }
        }
    }
    
    @Override
    public String toString() {
        return "Counting sort";
    }
}
