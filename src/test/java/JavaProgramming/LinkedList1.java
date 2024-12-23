package JavaProgramming;

import org.testng.annotations.Test;

import java.util.*;
import java.util.LinkedList;

public class LinkedList1 {

    @Test
    public void practiceDifferentMethods(){
        LinkedList<String> list= new LinkedList<>(new ArrayList<>(Arrays.asList("Alok","Ashok","Mantu")));
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2)>0){
                    return 1;
                }
                else return -1;

            }
        });
        System.out.println(list);
    }
}
