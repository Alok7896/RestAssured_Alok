package JavaProgramming;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ReverseOfString {

    String s="Alok123Kumar456Pradhan";
    @Test
    public void ReverseOfString(){
        String[] words=s.split("((?<=\\D)(?=\\d))|((?<=\\d)(?=\\D))");
        System.out.println(Arrays.toString(words));
        StringBuffer buffer= new StringBuffer();
        int i=0;
        for (String word:words){
           String rev="";
           for (int j=word.length()-1;j>=0;j--){
               rev+=word.charAt(j);
           }
           buffer.append(rev);
        }
        System.out.println(buffer);
    }
}
