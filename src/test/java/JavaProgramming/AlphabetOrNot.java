package JavaProgramming;

import org.testng.annotations.Test;

public class AlphabetOrNot {
    @Test
    public void checkAlphabetOrNot(){
        char c='d';
        if (c>='a' && c<='z' || c>='A' && c<='Z'){
            System.out.println("It is alphabet");
        }
        else System.out.println("It is not alphabet");
    }
}
