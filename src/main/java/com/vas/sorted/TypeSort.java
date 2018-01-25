package com.vas.sorted;

/**
 *  Type sorting description
 */
public interface TypeSort {
    /** Sort with flag */
    int[] sortStart(boolean descending, int[] array);

    /** Sort without flag */
    int[] sortStart(int[] list);

    /** Replacement of elements */
    default void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
