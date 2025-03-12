package com.in28minutes.junit.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Test
    void calculateSumOk() {
        int[] values = {1, 2, 3, 4, 5};

        int result = myMath.calculateSum(values);
        int expectedResult = 15;

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void calculateSumZero() {
        int[] values = {};

        int result = myMath.calculateSum(values);
        int expectedResult = 0;

        Assertions.assertEquals(expectedResult, result);
    }
}
