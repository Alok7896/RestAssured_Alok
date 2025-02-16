package Rest_Assured;

import static io.restassured.RestAssured.given;

public class Student {
    final String name="Alok Pradhan";
    int age;
    String role;
    Student(int age,String role){
        this.age=age;
        this.role=role;
    }
    public static void main(String[] args) {
        Student s=new Student(29,"Software Tester");
        System.out.println(s.age+" "+s.role+" "+s.name);

    }
}
