package JavaProgramming;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RunTime_argument_pass {
    /*Java Program to Add Two Integers*/

    @Test
    public void PrintInteger() throws IOException {
       int x=5,y=10,z;
       z=x+y;
       System.out.println(z);
    }
}
