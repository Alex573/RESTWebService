package com.vas.sorted;

/**
 * Shell sorting
 * Sorting algorithm shell with an indication of the sorting flag,
 * ascending or descending.
 */
public class ShellSort implements TypeSort {
    /**
     * Sort with flag descending "true or false".
     */
    public int[] sortStart(boolean descending, int[] array) {
        if (descending) {
            shellSortDes(array);
        } else {
            shellSort(array);
        }
        return array;
    }

    /**
     * Sort without flag.
     */
    public int[] sortStart(int[] array) {
        shellSort(array);
        return array;
    }

    /**
     * Sorting algorithm ascending, sequence of partial sorts.
     */
    private void shellSort(int[] array) {
        int h = 1;

        while (h * 3 < array.length)
            h = h * 3 + 1;

        while (h >= 1) {
            hSort(array, h);
            h = h / 3;
        }
    }

    /**
     * Sorting algorithm ascending, hope.
     */
    private void hSort(int[] array, int h) {
        for (int i = h; i < array.length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }

    /**
     * Sorting algorithm descending, sequence of partial sorts.
     */
    private void shellSortDes(int[] array) {
        int h = 1;

        while (h * 3 < array.length)
            h = h * 3 + 1;

        while (h >= 1) {
            hSortDes(array, h);
            h = h / 3;
        }
    }

    /**
     * Sorting algorithm descending, hope.
     */
    private void hSortDes(int[] array, int h) {
        for (int i = h; i < array.length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] > array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }

}
