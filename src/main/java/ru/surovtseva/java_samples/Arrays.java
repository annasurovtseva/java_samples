package ru.surovtseva.java_samples;

public class Arrays {

    public static void main(String[] args) {


    }

    public int getMiddleElem (int[] array) {
        int middleElem;
        if(array.length % 2 == 0) {
            middleElem = array[array.length/2 - 1];
        } else {
            middleElem =array[array.length/2];
        }
        return middleElem;
    }



}
