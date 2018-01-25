package com.vas.sorted;

/**
 * Creating factory sorting.
 * Selecting the sort type:
 * "Quick" - algoritm sorting quck sort,
 * "Shell" - algoritm sorting shell sort.
 */
public class SortArrFactory {
    /**
     * Selecting the sort type
     */
    public TypeSort sortType(String type) {
        switch (type) {
            case "Quick":
                return new QuickSort();
            case "Shell":
                return new ShellSort();
            default:
                return null;
        }
    }

}
