package com.vas.model;

//Model for REST service
public class ModelArray {
    //flag type sorted
    private boolean descending;
    //array model
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
