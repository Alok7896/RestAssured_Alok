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

        List<Map.Entry<Integer,String>> entries=new LinkedList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                if ((o1.getValue().compareTo(o2.getValue()))>0)
                    return 1;
                 else if ((o1.getValue().compareTo(o2.getValue()))<0) {
                  return -1;
               }
                else return 0;
            }
        });
        LinkedHashMap<Integer,String> sortedMap=new LinkedHashMap<>();
        for (Map.Entry<Integer,String>sorted:entries){
            int key=sorted.getKey();
            String value=sorted.getValue();
            sortedMap.put(key,value);
        }
        System.out.println(sortedMap);
    }
}
