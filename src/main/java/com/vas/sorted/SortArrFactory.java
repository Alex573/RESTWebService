package com.vas.sorted;

//Factory Sorted
public class SortArrFactory {
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
