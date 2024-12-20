package JavaProgramming;

import org.testng.annotations.Test;

public class LCD {
    int a=72,b=120;
    int gcd=1;
    int lcm=1;
    @Test
    public void LCD(){
        int gcd=GCD();
        lcm=(a*b)/gcd;
        System.out.println("LCD is "+lcm);
    }

    public int GCD(){
        for (int i=1;i<=a&&i<=b;i++){
            if (a%i==0 && b%i==0)
              gcd=i;
        }
        return gcd;
    }
}
