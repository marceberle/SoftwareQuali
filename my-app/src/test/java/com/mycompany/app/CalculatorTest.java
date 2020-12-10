package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calc;

    @Before
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(2, calc.addition(1, 1));
    }

    @Test
    public void testNegativeAddition() {
        assertEquals(0, calc.addition(-1, 1));
    }

    @Test
    public void testSubtraction() {
        assertEquals(0, calc.subtraction(1, 1));
    }

    @Test
    public void testNegativeSubtraction() {
        assertEquals(0, calc.subtraction(-1, -1));
    }

    @Test
    public void testMultiplication() {
        assertEquals(4, calc.multiplication(2, 2));
    }

    @Test
    public void testNegativeMultiplication() {
        assertEquals(-4, calc.multiplication(2, -2));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.division(10, 5));
    }

    @Test
    public void testNegativeDivision() {
        assertEquals(-2, calc.division(-10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void zeroDivision() {
        calc.division(1, 0);
    }

    @After
    public void teardown() {
        calc = null;
    }

}
