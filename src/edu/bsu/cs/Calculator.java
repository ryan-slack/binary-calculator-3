package edu.bsu.cs;

public class Calculator {

    //TODO: Write application logic

    public String binarySqRoot(String binaryInput){
        int binaryToDecimal = Integer.parseInt(binaryInput, 2);
        String binarySqRoot = Integer.toBinaryString(((int)Math.sqrt(binaryToDecimal)));
        return binarySqRoot;
    }

    public String binarySqrd( String binaryInput){
        int binaryToDecimal = Integer.parseInt(binaryInput, 2);
        String binarySqrd = Integer.toBinaryString(binaryToDecimal * binaryToDecimal);
        return binarySqrd;
    }

    public String binarySubtract(String firstBinary, String secondBinary){
        int firstDecimal = Integer.parseInt(firstBinary, 2);
        int secondDecimal = Integer.parseInt(secondBinary, 2);
        int total = firstDecimal + secondDecimal;
        return Integer.toBinaryString(total);
    }

    public String binaryAdd(String firstBinary, String secondBinary){
        int firstDecimal = Integer.parseInt(firstBinary, 2);
        int secondDecimal = Integer.parseInt(secondBinary, 2);
        int total = firstDecimal - secondDecimal;
        return Integer.toBinaryString(total);
    }

}
