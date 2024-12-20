package JavaProgramming;

import org.testng.annotations.Test;

public class LargestElementOfArray {

    @Test
    public void LargestElementOfArray(){
        int []nums={10,20,30,40,50};
        int max=nums[0];
        for (int i=0;i<nums.length;i++){
            if (nums[i]>max)
                max=nums[i];
        }
        System.out.println("Largest element of the array is "+max);
    }
}
