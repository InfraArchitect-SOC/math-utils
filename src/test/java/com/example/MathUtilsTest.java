package com.example;

import org.junit.Test; // JUnit 4 Test annotation
import org.junit.Assert; // JUnit 4 Assert class (for assertEquals, etc.)

public class MathUtilsTest {

    @Test // JUnit 4 @Test annotation
    public void testAddPositiveNumbers() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(3, 5);
        Assert.assertEquals(8, result); // JUnit 4 assertion
    }

    @Test
    public void testAddNegativeNumbers() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(-2, -7);
        Assert.assertEquals(-9, result);
    }

    @Test
    public void testAddPositiveAndNegative() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(10, -4);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testAddZero() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(5, 0);
        Assert.assertEquals(5, result);
    }
}
