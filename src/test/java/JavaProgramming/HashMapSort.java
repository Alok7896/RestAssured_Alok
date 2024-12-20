package JavaProgramming;

import org.testng.annotations.Test;

import java.util.*;

public class HashMapSort {

    @Test
    public void SortedMap(){
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"Fizulu");
        map.put(2,"Babu");
        map.put(3,"Mama");

        List<Map.Entry<Integer,String>>ll=new ArrayList<>(map.entrySet());
        Collections.sort(ll, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
               if (o1.getValue().compareTo(o2.getValue())>0)
                   return -1;
               else return 1;
            }
        });
        for (Map.Entry<Integer,String> entry:ll){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
