package JavaProgramming;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

import java.nio.charset.Charset;
import java.util.*;
import java.util.LinkedList;

public class String_Practice {
    @Test
    public void Min_MaxOccurance(){
        int []nums={10,40,5,30,75,65,79,80};
        int max=nums[0];
        int secondmax=nums[0];
        for (int i=0;i<nums.length;i++){
            if (nums[i]>max){
                secondmax=max;
                max=nums[i];
            }
            if (nums[i]<secondmax)
                secondmax=nums[i];
        }
        System.out.println("Maximum Number is "+max+" Minimum Number is "+secondmax);
    }
    @Test
    public void SecondMax(){
        Integer []nums={10,40,5,30,75,65,79,80};
        Set<Integer> s=new TreeSet<>(Arrays.asList(nums));
        System.out.println(s);
    }
}
