package JavaProgramming;

import org.testng.annotations.Test;

import java.util.*;

public class Interasaction {
    @Test
    public void Intersaction(){
        Set<Integer> l= new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        Set<Integer> l1= new HashSet<>(Arrays.asList(4,5,7));
        l.retainAll(l1);
        System.out.println(l);

    }
}
