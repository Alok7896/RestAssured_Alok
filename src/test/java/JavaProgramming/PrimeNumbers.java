package JavaProgramming;

import org.testng.annotations.Test;

public class PrimeNumbers {

    @Test
    public void checkPrimeNumber(){
        int num=6;
        boolean flag=true;
        if (num==1){
            System.out.println("It is not a prime number");
            return;
        }
        else {
            for (int i=2;i<=num/2;i++){
                if (num%i==0){
                   flag=false;
                }
            }
        }
        if (flag)
            System.out.println(num+" It is Prime Numbers");
        else System.out.println(num+" It is not Prime Numbers");
    }

    @Test
    public void CheckPrimeNumbers(){
        boolean flag;
        for (int i=50;i<=100;i++){
            flag=true;
            for (int j=2;j<=i/2;j++){
                if (i%j==0)
                    flag=false;
            }
            if (flag)
                System.out.print(i+" ");
        }
    }
}
