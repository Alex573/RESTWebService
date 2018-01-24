package com.vas.sorted;

public class SortedArray {
    public ITypeSort sortType(String type){
        switch (type) {
            case "Quick":
                return new QuickSort();
            case "Merge":
                return new MergeSort();
            default:
                return null;
        }
    }

}
