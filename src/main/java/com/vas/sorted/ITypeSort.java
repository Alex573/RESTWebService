package com.vas.sorted;

public interface ITypeSort {
    //Sort with flag
    int[] sortStart(boolean descending, int[] list);
    //Sort without flag
    int[] sortStart(int[] list);
    //replacement of elements
    default  void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
