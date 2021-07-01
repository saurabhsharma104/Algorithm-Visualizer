/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.util.List;

/**
 * Quick sort class
 * @author Saurabh Sharma
 */
public class QuickSort extends SortingAlgorithm {
    /**
     * Sets the time for the sleep by calling the parent constructor.
     * @param sleepTime the value of the sleep time
     */
    public QuickSort(int sleepTime) {
        super(sleepTime);
    }
    
    /**
     * Method which does the sorting, it recursively calls itself in each level for another part of the collection.
     * @param columns column collection
     * @param begin the index of the first item in the part of the collection which is currently being processed
     * @param end the index of the last item in the part of the collection which is currently being processed
     * @param highlight whether to highlight the columns that are being sorted or not, the thread sleep is related with this
     */
    private void quickSort(List<Column> columns, int begin, int end, boolean highlight) {
        int b = begin;
        int e = end;
        int pivot = columns.get((b + e) / 2).GetValue();
        while(b < e) {
            if(highlight) columns.get(e).Highlight();
            while(columns.get(b).GetValue() < pivot && b < e) {
                if(highlight) {
                    columns.get(b).Highlight();
                    sleep();
                }
                b++;
                if(highlight) columns.get(b - 1).Unhighlight();
            }
            if(highlight) columns.get(b).Highlight();
            while(columns.get(e).GetValue() > pivot && b < e) {
                if(highlight) {
                    columns.get(e).Highlight();
                    sleep();
                }
                e--;
                if(highlight) columns.get(e + 1).Unhighlight();
            }
            if(highlight) {
                columns.get(e).Highlight();
                sleep();
            }
            if(b < e)
            {
                Column temp = columns.get(b);
                columns.set(b, columns.get(e));
                columns.set(e, temp);
                if(columns.get(e).GetValue() == columns.get(b).GetValue()) {
                    if(highlight) columns.get(e).Unhighlight();
                    e--;
                    if(highlight) {
                        columns.get(e).Highlight();
                        sleep();
                    }
                }
            }
            if(highlight) {
                columns.get(b).Unhighlight();
                columns.get(e).Unhighlight();
            }
        }
        if(b > begin)
            quickSort(columns, begin, b, highlight);
        if(e < end)
            quickSort(columns, e + 1, end, highlight);
    }
    
    @Override
    public void Sort(List<Column> columns, boolean highlight) {
        quickSort(columns, 0, columns.size() - 1, highlight);
    }
    
    @Override
    public String toString() {
        return "Quick sort";
    }
}
