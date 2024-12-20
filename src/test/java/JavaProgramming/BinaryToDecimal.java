package JavaProgramming;

import org.testng.annotations.Test;

public class BinaryToDecimal {

    @Test
    public void BinaryToDecimal(){
        long num=110110111;
        int decimal=Integer.parseInt(String.valueOf(num),2);
        System.out.println(decimal);
    }

    @Test
    public void DecimalToBinary(){
        int decimal=439;
        long binary= Long.parseLong(Integer.toBinaryString(decimal));
        System.out.println("Binary Number is "+binary);
    }
}
