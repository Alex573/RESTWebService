package com.vas.sorted;

import java.util.Arrays;

public class MergeSort implements ITypeSort{

    public int[] sortStart(boolean descending, int[] list){
        if (descending){
            shellSortDes(list);
        }else {
            shellSort(list);
        }
        return list;
    }
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


    //test
    public static void main(String[] args) {
        int[] list = new int[]{5,7,2,15,11};
        new MergeSort().sortStart(false,list);
        System.out.println(Arrays.toString(list));
        new MergeSort().sortStart(true,list);
        System.out.println(Arrays.toString(list));

    }
}
