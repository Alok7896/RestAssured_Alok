package JavaProgramming;

import org.testng.annotations.Test;

public class ReverseNumber {
    @Test
    public void ReverseNumber(){
        int num=53234;
        int rev=0;
        while (num!=0){
            int rem=num%10;
            num=num/10;
            rev=(rev*10)+rem;
        }
        System.out.println("The Number is "+rev);
    }
}
