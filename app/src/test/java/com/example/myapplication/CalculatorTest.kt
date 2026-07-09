package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.001)
        assertEquals(-1.0, calculator.add(2.0, -3.0), 0.001)
    }

    @Test
    fun testSubtract() {
        assertEquals(-1.0, calculator.subtract(2.0, 3.0), 0.001)
        assertEquals(5.0, calculator.subtract(2.0, -3.0), 0.001)
    }

    @Test
    fun testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.001)
        assertEquals(-6.0, calculator.multiply(2.0, -3.0), 0.001)
        assertEquals(0.0, calculator.multiply(2.0, 0.0), 0.001)
    }

    @Test
    fun testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.001)
        assertEquals(-2.0, calculator.divide(6.0, -3.0), 0.001)
        assertEquals(Double.NaN, calculator.divide(6.0, 0.0), 0.001)
    }
}
