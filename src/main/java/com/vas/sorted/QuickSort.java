package com.vas.sorted;

import java.util.Arrays;

public class QuickSort implements ITypeSort{

    public int[] sortStart(boolean descending, int[] list){
        int n = list.length;
        if (descending){
        quickSortDes(list, 0, n-1);
        }else {
            quickSort(list, 0, n-1);
        }
        return list;
    }
    public int[] sortStart(int[] list ){
        int n = list.length;
        quickSort(list, 0, n-1);
        return list;

    }

    // Quick sort algorithm
    private void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int dp = partition(numbers, low, high);
            quickSort(numbers, low, dp-1);
            quickSort(numbers, dp+1, high);
        }
    }
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
    // Quick sort algorithm descending
    private void quickSortDes(int[] numbers, int low, int high) {
        if (low < high) {
            int dp = partitionDes(numbers, low, high);
            quickSortDes(numbers, low, dp-1);
            quickSortDes(numbers, dp+1, high);
        }
    }
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


    //test
    public static void main(String[] args) {
        int[] list = new int[]{5,7,2,15,11};
        new QuickSort().sortStart(false,list);
        System.out.println(Arrays.toString(list));
        new QuickSort().sortStart(true,list);
        System.out.println(Arrays.toString(list));

    }
}
