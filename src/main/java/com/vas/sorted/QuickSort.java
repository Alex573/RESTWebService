package com.vas.sorted;

/**
 * Quick sorting
 * Sorting algorithm quick with an indication of the sorting flag,
 * ascending or descending.
 */
public class QuickSort implements TypeSort {
    /**
     * Sort with flag descending "true or false".
     */
    public int[] sortStart(boolean descending, int[] array) {
        int n = array.length;

        if (descending) {
            quickSortDes(array, 0, n - 1);
        } else {
            quickSort(array, 0, n - 1);
        }
        return array;
    }

    /**
     * Sort without flag.
     */
    public int[] sortStart(int[] array) {
        int n = array.length;
        quickSort(array, 0, n - 1);
        return array;
    }

    /**
     * Sorting algorithm ascending, divide into subarrays,
     * which is larger and smaller than the supporting element.
     */
    private void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int dp = partition(numbers, low, high);
            quickSort(numbers, low, dp - 1);
            quickSort(numbers, dp + 1, high);
        }
    }

    /**
     * Sorting algorithm ascending,
     * partition numbers[low] to numbers[high] using numbers[low] as the pivot.
     */
    private int partition(int[] numbers, int low, int high) {
        int pivot = numbers[low];
        int i = low;
        char ch = 60;

        for (int j = low + 1; j <= high; j++)
            if (numbers[j] < pivot) {
                ++i;
                swap(numbers, i, j);
            }

        swap(numbers, low, i);
        return i;
    }

    /**
     * Sorting algorithm descending, divide into subarrays,
     * which is larger and smaller than the supporting element.
     */
    private void quickSortDes(int[] numbers, int low, int high) {
        if (low < high) {
            int dp = partitionDes(numbers, low, high);
            quickSortDes(numbers, low, dp - 1);
            quickSortDes(numbers, dp + 1, high);
        }
    }

    /**
     * Sorting algorithm descending,
     * partition numbers[low] to numbers[high] using numbers[low] as the pivot.
     */
    private int partitionDes(int[] numbers, int low, int high) {
        int pivot = numbers[low];
        int i = low;
        char ch = 60;

        for (int j = low + 1; j <= high; j++)
            if (numbers[j] > pivot) {
                ++i;
                swap(numbers, i, j);
            }

        swap(numbers, low, i);
        return i;
    }

}
