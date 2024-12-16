package Rest_Assured.Serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Serialization_Desrialization {

    @Test
    public void Serialization() throws JsonProcessingException {
        CompanyDetails comp=new CompanyDetails();
        EmloyeeDetails emp=new EmloyeeDetails();
        EmloyeeDetails emp1=new EmloyeeDetails();
        Address adr=new Address();
        Address adr1=new Address();
        emp.setFirstName("Alok");
        emp.setLastName("Pradhan");
        emp.setGender("Male");
        emp.setAge(30);
        emp.setSalary(20000);
        emp.setAddress(adr);
        adr.setCity("Kodala");
        adr.setState("Odisha");
        adr.setStreet("Adua Sahi");
        adr.setPincode(12345);

        emp1.setFirstName("Ashok");
        emp1.setLastName("Pradhan");
        emp1.setGender("Male");
        emp1.setAge(25);
        emp1.setSalary(30000);
        emp1.setAddress(adr);
        adr1.setCity("Banglore");
        adr1.setState("Karnataka");
        adr1.setStreet("Adua Sahi");
        adr1.setPincode(12335);
        List<EmloyeeDetails> list=new ArrayList<>();
        list.add(emp);
        list.add(emp1);
        comp.setCompanyName("Capgemini Pvt.Ltd");
        comp.setStreet("Hinjewadi Phase III");
        comp.setCity("Pune");
        comp.setState("Maharastra");
        comp.setPin(761032);
        comp.setEmp(list);

        ObjectMapper obj=new ObjectMapper();
        String getString=obj.writerWithDefaultPrettyPrinter().writeValueAsString(comp);

        Response res=RestAssured.given()
                .baseUri("http://localhost:3000/users")
                .contentType(ContentType.JSON)
                .body(comp)
               // .body(getString)
                .post();
        System.out.println(res.getBody().prettyPrint());
    }

    @Test
    public void Serialization_Alok() throws JsonProcessingException {
        UserDetails user=new UserDetails("Alok","Test Engineer","Capgemini", new String[]{"selenium,java,restassured"});
        ObjectMapper obj=new ObjectMapper();
        String body=obj.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        RequestSpecification specification=RestAssured.given()
                .baseUri("https://reqres.in/")
                .basePath("api/users")
                .contentType(ContentType.JSON);
        user=new UserDetails("Ashok","Test Engineer","Deloite", new String[]{"selenium,java,restassured"});

       Response res1= specification.body(user).put("user/932");
       res1.then().log().body().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\DELL\\IdeaProjects\\Rest\\src\\test\\java\\Rest_Assured\\Serialization\\schema.json")));
    }
}
