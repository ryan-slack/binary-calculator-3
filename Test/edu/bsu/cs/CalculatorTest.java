package edu.bsu.cs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testBinarySqRoot() {
        assertEquals("10", calculator.binarySqRoot("0100"));
        assertEquals("1", calculator.binarySqRoot("11"));
        assertEquals("0", calculator.binarySqRoot("0000"));
    }

    @Test
    public void testBinarySqrd() {
        assertEquals("100", calculator.binarySqrd("0010"));
        assertEquals("1010001", calculator.binarySqrd("1001"));
        assertEquals("0", calculator.binarySqrd("0000"));
    }

    @Test
    public void testBinaryAdd() {
        assertEquals("100", calculator.binaryAdd("0010","0010"));
        assertEquals("1110", calculator.binaryAdd("0010","1100"));
        assertEquals("10101", calculator.binaryAdd("1110", "0111"));
    }

    @Test
    public void testBinarySubtract() {
        assertEquals("0", calculator.binarySubtract("1110","1110"));
        assertEquals("111", calculator.binarySubtract("1001","0010"));
        assertEquals("11111", calculator.binarySubtract("11111","00000"));
    }

    @Test
    public void testBinaryMultiply() {
        assertEquals("1000", calculator.binaryMultiply("0010","0100"));
        assertEquals("0", calculator.binaryMultiply("1110","0000"));
        assertEquals("11100001", calculator.binaryMultiply("1111","1111"));
    }

    @Test
    public void testBinaryDivide() {
        assertEquals("1", calculator.binaryDivide("1111","1111"));
        assertEquals("100", calculator.binaryDivide("1000","0010"));
        assertEquals("1100", calculator.binaryDivide("1100","0001"));
    }
}