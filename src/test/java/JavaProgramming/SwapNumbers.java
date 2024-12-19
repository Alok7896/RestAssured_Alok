package JavaProgramming;

import org.testng.annotations.Test;

public class SwapNumbers {
    @Test
    public void swapNumbersWithOutTemp(){
        int a=5;
        int b=10;
        System.out.println("Before Swap");
        System.out.println("a is " +a+" b is "+b);
        a=a+b;  //15;
        b=a-b; //5
        a=a-b; //10
        System.out.println("After Swap");
        System.out.println("a is " +a+" b is "+b);

    }
}
