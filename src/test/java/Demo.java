import java.util.*;
public class Demo {
    public static void main(String[] args) {
        String s="Alok12Kumar44Pradhan";
        String []s1=s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        System.out.println(Arrays.toString(s1));
        String words="";
        for (int i=0;i< s1.length;i++){
            String word=s1[i];
            if (CheckString(word)){
                for (int j=word.length()-1;j>=0;j--){
                    words+=word.charAt(j);
                }
            }
            else{
                words+=word;
            }

        }
        System.out.println("The Number is "+words);
    }
    public static boolean CheckString(String word){
        for (int k=0;k<word.length();k++){
            if (!Character.isDigit(word.charAt(k))){
                return true;
            }
        }
        return false;
    }
}