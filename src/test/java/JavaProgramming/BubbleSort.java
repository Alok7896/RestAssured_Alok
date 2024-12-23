package JavaProgramming;

import org.testng.annotations.Test;

import java.util.Arrays;

public class BubbleSort {
    @Test
    public void BubbleSort(){
        int []x={-9, -2, 0, 11, 45};
        int temp;
        for(int i=0;i<x.length;i++){
            for (int j=i+1;j<x.length;j++){
                if (x[i]>x[j]){
                    temp=x[i];
                    x[j]=x[i];
                    x[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
