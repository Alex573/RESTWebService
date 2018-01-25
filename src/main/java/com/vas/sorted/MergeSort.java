package com.vas.sorted;


public class MergeSort implements ITypeSort{
    //Sort with flag
    public int[] sortStart(boolean descending, int[] list){
        if (descending){
            shellSortDes(list);
        }else {
            shellSort(list);
        }
        return list;
    }
    //Sort without flag
    public int[] sortStart(int[] list ){
        shellSort(list);
        return list;
    }
    // Shell sort algorithm
    private void shellSort(int[] array) {
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            hSort(array, h);
            h = h/3;
        }
    }
    private void hSort(int[] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }
    // Shell sort algorithm descending
    private void shellSortDes(int[] array) {
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            hSortDes(array, h);
            h = h/3;
        }
    }
    private void hSortDes(int[] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] > array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }

}
