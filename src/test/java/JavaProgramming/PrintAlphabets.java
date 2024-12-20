package JavaProgramming;

import org.testng.annotations.Test;

public class PrintAlphabets {

    @Test
    public void PrintAlphabets(){
        for (char i='a';i<='z';i++){
            System.out.print(i+" ");
        }
    }
}
