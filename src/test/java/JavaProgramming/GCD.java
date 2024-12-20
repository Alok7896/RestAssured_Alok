package JavaProgramming;

import org.testng.annotations.Test;

public class GCD {
    @Test
    public void findGCD(){
        int a=4,b=6;
        int GCD=1;

        for (int i=1;i<=a&&i<=b;i++){
            if (a%i==0 && b%i==0)
                GCD=i;
        }
        System.out.println("GCD of "+a+" &"+b +"is "+GCD);
    }
}
