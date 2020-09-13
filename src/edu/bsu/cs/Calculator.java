package edu.bsu.cs;

public class Calculator {

    public String binarySqRoot(String binaryInput){
        int binaryToDecimal = Integer.parseInt(binaryInput, 2);
        String binarySqRoot = Integer.toBinaryString(((int)Math.sqrt(binaryToDecimal)));
        return binarySqRoot;
    }

    public String binarySqrd(String binaryInput){
        int binaryToDecimal = Integer.parseInt(binaryInput, 2);
        String binarySqrd = Integer.toBinaryString(binaryToDecimal * binaryToDecimal);
        return binarySqrd;
    }

    public String binaryAdd(String firstBinary, String secondBinary){
        int firstDecimal = Integer.parseInt(firstBinary, 2);
        int secondDecimal = Integer.parseInt(secondBinary, 2);
        int total = firstDecimal + secondDecimal;
        return Integer.toBinaryString(total);
    }

    public String binarySubtract(String firstBinary, String secondBinary){
        int firstDecimal = Integer.parseInt(firstBinary, 2);
        int secondDecimal = Integer.parseInt(secondBinary, 2);
        int total = firstDecimal - secondDecimal;
        if(total < 0) {
            total = -total;
            return "-" + Integer.toBinaryString(total);
        } else {
            return Integer.toBinaryString(total);
        }
    }

    public String binaryMultiply (String firstBinary, String secondBinary) {
        int firstDecimal = Integer.parseInt(firstBinary, 2);
        int secondDecimal = Integer.parseInt(secondBinary, 2);
        int total = firstDecimal * secondDecimal;
        if(total < 0) {
            total = -total;
            return "-" + Integer.toBinaryString(total);
        } else {
            return Integer.toBinaryString(total);
        }
    }

    public String binaryDivide (String firstBinary, String secondBinary) {
        int firstDecimal = Integer.parseInt(firstBinary, 2);
        int secondDecimal = Integer.parseInt(secondBinary, 2);
        if(secondDecimal == 0)
            return "Error";
        else {
            int total = firstDecimal / secondDecimal;
            if(total < 0) {
                total = -total;
                return "-" + Integer.toBinaryString(total);
            } else {
                return Integer.toBinaryString(total);
            }
        }
    }

}
