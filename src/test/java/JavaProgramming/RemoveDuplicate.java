package JavaProgramming;

import org.testng.annotations.Test;

import java.util.*;

public class RemoveDuplicate {
    @Test
    public void RemoveDuplicates(){
        List<Integer> list=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
        Set<Integer> set=new HashSet<>(list);
        System.out.println(set);
    }
}
