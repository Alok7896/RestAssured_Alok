package JavaProgramming;

import org.testng.annotations.Test;

public class Factorial {
    @Test
    public void Factorial(){
        int n=5;
        int fact=1;
        while (n!=0){
            fact=(fact*n);
            n--;
        }
        System.out.println("Factorial of the number is "+fact);
    }
}
