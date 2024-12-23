package JavaProgramming;

import org.testng.annotations.Test;

public class CheckInteger {

    @Test
    public void checkInteger(){
        String x="Alok";
        boolean flag = true;
        try{
            int y=Integer.parseInt(x);
        }
        catch (Exception e){
            flag=false;
        }
       if(!flag)
           System.out.println("It can't be converted");
    }
}
