/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.List;

/**
 * Shell sort class
 * @author Saurabh Sharma
 */
public class ShellSort extends SortingAlgorithm {
    /**
     * Sets the time for the sleep by calling the parent constructor.
     * @param sleepTime the value of the sleep time
     */
    public ShellSort(int sleepTime) {
        super(sleepTime);
    }

    @Override
    public void Sort(List<Column> columns, boolean highlight) {
        for (int space = columns.size() / 2; space > 0; space /= 2)
            for (int i = space; i < columns.size(); i++) {
                int moving = columns.get(i).GetValue();
                int pos = i;
                for (int j = i - space; j >= 0; j -= space) {
                    if (highlight) {
                        columns.get(j + space).Highlight();
                        sleep();
                        columns.get(j + space).Unhighlight();
                    }
                    if (moving < columns.get(j).GetValue()) {
                        pos = j;
                        columns.get(j + space).SetValue(columns.get(j).GetValue());
                    }
                    else
                        break;
                }
                columns.get(pos).SetValue(moving);
                    if(highlight) {
                        columns.get(pos).Highlight();
                        sleep();
                        columns.get(pos).Unhighlight();
                    }
            }
    }

    @Override
    public String toString() {
        return "Shell sort";
    }
}
