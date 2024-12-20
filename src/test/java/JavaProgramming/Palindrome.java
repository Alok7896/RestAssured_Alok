package JavaProgramming;

import org.testng.annotations.Test;

public class Palindrome {

    @Test
    public void Palindrome(){
        int num=534;
        int num1=num;
        int rev=0;
        while (num!=0){
            int rem=num%10;
            num=num/10;
            rev=(rev*10)+rem;
        }
        if (num1==rev)
            System.out.println("It is palindrome");
        else System.out.println("It is not palindrome");
    }
}
