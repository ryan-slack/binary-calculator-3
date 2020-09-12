package edu.bsu.cs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testBinarySqRoot() {
        assertEquals("0010", calculator.binarySqRoot("0100"));
        assertEquals("1001", calculator.binarySqRoot("0011"));
        assertEquals("0000", calculator.binarySqRoot("0000"));
    }

    @Test
    public void testBinarySqrd() {
        assertEquals("0100", calculator.binarySqrd("0010"));
        assertEquals("0011", calculator.binarySqrd("1001"));
        assertEquals("0000", calculator.binarySqrd("0000"));
    }

    @Test
    public void testBinaryAdd() {
        assertEquals("0100", calculator.binaryAdd("0010","0010"));
        assertEquals("1110", calculator.binaryAdd("0010","1100"));
        assertEquals("010101", calculator.binaryAdd("1110", "0111"));
    }

    @Test
    public void testBinarySubtract() {
        assertEquals("0001", calculator.binarySubtract("1110","1110"));
        assertEquals("0111", calculator.binarySubtract("1001","0010"));
        assertEquals("11111", calculator.binarySubtract("11111","00000"));
    }

    @Test
    public void testBinaryMultiply() {
        assertEquals("1000", calculator.binaryMultiply("0010","0100"));
        assertEquals("0000", calculator.binaryMultiply("1110","0000"));
        assertEquals("011100001", calculator.binaryMultiply("1111","1111"));
    }

    @Test
    public void testBinaryDivide() {
        assertEquals("0001", calculator.binaryDivide("1111","1111"));
        assertEquals("0100", calculator.binaryDivide("1000","0010"));
        assertEquals("1100", calculator.binaryDivide("1100","0001"));
    }
}