package com.vas.sorted;

public interface ITypeSort {
    int[] sortStart(boolean descending, int[] list);
    int[] sortStart(int[] list);
    default  void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
