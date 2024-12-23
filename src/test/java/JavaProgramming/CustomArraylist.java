package JavaProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomArraylist {

    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Alok",10,"Pune"));
        list.add(new Student("Ashok",20,"Banglore"));
        list.add(new Student("Mantu",30,"Odisha"));

        Collections.sort(list,new ObjectComparator());

        for (Student s:list){
            System.out.println(s.name+" "+s.roll+" "+s.address);
        }
    }
}
