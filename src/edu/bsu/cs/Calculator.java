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

}
