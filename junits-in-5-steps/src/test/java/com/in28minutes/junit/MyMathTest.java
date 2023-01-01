package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    void test_ThreeVariables() {
        assertEquals(6, math.calculateSum(new int[]{1, 2, 3}));
    }

    @Test
    void test_Zero() {
        assertEquals(0, math.calculateSum(new int[]{}));
    }
}
