package JavaProgramming;

import org.testng.annotations.Test;

import java.util.*;
import java.util.LinkedList;

public class ConvertMapToList {

    @Test
    public void setHashMap(){
        Map<String,String> map=new HashMap<>();
        map.put("Name","Alok Pradhan");
        map.put("Address","Odisha");
        map.put("Phone Number","7710935878");
        map.put("Occupation","Test Engineer");
        List<Map.Entry<String,String>> list=new LinkedList<>(map.entrySet());
        for (Map.Entry<String,String> l:list){
            System.out.println(l.getKey()+" "+l.getValue());
        }
    }
}
