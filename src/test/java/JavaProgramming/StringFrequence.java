package JavaProgramming;

import org.testng.annotations.Test;

import java.util.Locale;

public class StringFrequence {

    @Test
    public void StringFreq(){
        String s="My Name is Alok Pradhan";
        s=s.replaceAll(" ","").toLowerCase();
        char[] c=s.toCharArray();
        int freq[]=new int[c.length];
        for (int i=0;i<c.length;i++){
            freq[i]=1;
            for (int j=i+1;j<c.length;j++){
                if (c[i]==c[j] && c[i]!='0'){
                    freq[i]++;
                    c[j]='0';
                }
            }
        }
        for (int i=0;i<c.length;i++){
            if (c[i]!=0){
                System.out.println(c[i]+" No of times appears "+freq[i]);
            }
        }
    }
}
