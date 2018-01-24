package com.vas.Model;


public class ModelArray {

    private boolean descending;
    private int[] array;

    public boolean isDescending() {
        return descending;
    }

    public void setDescending(boolean descending) {
        this.descending = descending;
    }

    public int[]  getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public ModelArray(boolean descending, int[] array) {
        this.descending = descending;
        this.array = array;
    }

    public ModelArray() {
    }

}
