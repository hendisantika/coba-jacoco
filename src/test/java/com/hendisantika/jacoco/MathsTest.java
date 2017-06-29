package com.hendisantika.jacoco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hendisantika on 6/30/17.
 */
public class MathsTest {
    @Test
    public void testAddition() {
        assertEquals(20, Maths.addition(10, 10));
    }

    @Test
    public void testSubtraction() {
        assertEquals(0, Maths.subtraction(10, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(100, Maths.multiplication(10, 10));
    }

    @Test
    public void testDivision() {
        assertEquals(1, Maths.division(10, 10));
    }
}
