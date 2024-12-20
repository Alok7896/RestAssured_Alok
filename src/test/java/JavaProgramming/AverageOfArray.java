package JavaProgramming;

import org.testng.annotations.Test;

public class AverageOfArray {

    @Test
    public void AverageOfArray(){
        int []nums={10,20,30,40,50};
        int sum=0;
        for (int num:nums){
            sum+=num;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average of the array is "+sum/nums.length);
    }
}
