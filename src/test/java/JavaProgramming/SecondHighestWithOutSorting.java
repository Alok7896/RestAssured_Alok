package JavaProgramming;

import org.testng.annotations.Test;

public class SecondHighestWithOutSorting {

    @Test
    public void SecondHighest(){
        int x[]={12, 35, 1, 10, 34, 1};
        int max=x[0];
        int secondHighest=0;
        for (int i=0;i<x.length;i++){
            if (x[i]>max){
                secondHighest=max;
                max=x[i];
            }
            else if (x[i]<max && x[i]>secondHighest){
                secondHighest=x[i];
            }
        }
        System.out.println("Second Highest is "+secondHighest);
    }
}
