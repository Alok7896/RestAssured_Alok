package JavaProgramming;

import org.testng.annotations.Test;

public class LeapYear {
    @Test
    public void checkLeapYear(){
        int year=2012;
        boolean leap=false;

        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    leap=true;
                }
                else leap=false;
            }
            else leap=true;
        }
        else leap=false;
        if (leap)
            System.out.println(year +" is leap Year");
        else System.out.println(year +" is not leap Year");
    }
}
