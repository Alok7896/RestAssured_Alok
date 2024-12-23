package JavaProgramming;

import org.testng.annotations.Test;

import java.util.Arrays;

public class StringCharacter {
    @Test
    public void convertStringToCharacter(){
        String name="Alok Pradhan";
        char[]c=name.toCharArray();
        System.out.println(Arrays.toString(c));
    }
    @Test
    public void convertCharToString(){
        char []c={'a','b','c','d'};
        String name=String.valueOf(c);
        System.out.println(name);
    }
}
