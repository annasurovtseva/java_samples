package ru.surovtseva.java_samples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {

    private static Arrays arr = new Arrays();


    @Test
    public void getMiddleElementTest (){
        int[] oddArray = {1,3,4,5,6,10,1,3,4};
        int [] evenArray = {1,2,3,4};

        Assertions.assertAll(
                () -> Assertions.assertEquals(6,arr.getMiddleElem(oddArray)),
                () -> Assertions.assertEquals(2,arr.getMiddleElem(evenArray))
        );
    }

}
