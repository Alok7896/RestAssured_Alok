package JavaProgramming;

import java.util.Comparator;

public class ObjectComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.roll> o2.roll)
            return -1;
        else return 1;
    }
}
