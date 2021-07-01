/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.List;

/**
 * Coctail shaker sort class.
 * @author Saurabh Sharma
 */
public class CocktailShakerSort extends SortingAlgorithm {
    /**
     * Sets the time for the sleep by calling the parent constructor.
     * @param sleepTime the value of the sleep time
     */
    public CocktailShakerSort(int sleepTime) {
        super(sleepTime);
    }
    
    @Override
    public void Sort(List<Column> columns, boolean highlight) {
        boolean done = false;
        for(int last = columns.size(), first = 0; last > first && !done; last--, first++) {
            done = true;
            for(int j = first; j < last - 1; j++) {
                if(highlight) {
                    columns.get(j).Highlight();
                    columns.get(j + 1).Highlight();
                    sleep();
                }
                if(columns.get(j).GetValue() > columns.get(j + 1).GetValue()) {
                    Column temp = columns.get(j);
                    columns.set(j, columns.get(j + 1));
                    columns.set(j + 1,  temp);
                    done = false;
                    if(highlight) sleep();
                }
                if(highlight) {
                    columns.get(j).Unhighlight();
                    columns.get(j + 1).Unhighlight();
                }
            }
            done = true;
            for(int j = last - 2; j > first - 1; j--) {
                if(highlight) {
                    columns.get(j).Highlight();
                    columns.get(j + 1).Highlight();
                    sleep();
                }
                if(columns.get(j).GetValue() > columns.get(j + 1).GetValue()) {
                    Column temp = columns.get(j);
                    columns.set(j, columns.get(j + 1));
                    columns.set(j + 1,  temp);
                    done = false;
                    if(highlight) sleep();
                }
                if(highlight) {
                    columns.get(j).Unhighlight();
                    columns.get(j + 1).Unhighlight();
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return "Cocktail shaker sort";
    }
}
