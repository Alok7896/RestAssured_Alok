package JavaProgramming;

import org.testng.annotations.Test;

import java.util.*;

public class ConvertArrayToSet {

    @Test
    public void ConvertArrayToSet(){
        Integer []x={1,2,3,4,5,6,7};
        List<Integer> list= Arrays.asList(x);
        Set<Integer> set=new HashSet<>(list);
        Iterator<Integer> it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
