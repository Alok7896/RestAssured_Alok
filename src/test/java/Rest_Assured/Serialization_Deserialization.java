package Rest_Assured;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Serialization_Deserialization {
    @Test
    public void Serialization() throws JsonProcessingException {
        Employee emp=new Employee();
        emp.setName("Babu");
        emp.setAge(23);
        ObjectMapper obj=new ObjectMapper();
        String jsonString=obj.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
        Response res=RestAssured.given()
                .baseUri("http://localhost:3000/users")
                .contentType(ContentType.JSON)
                .body(jsonString).post();
        System.out.println(res.asString());
        Employee emp1=obj.readValue(jsonString,Employee.class);
        System.out.println(emp1.getName());
        System.out.println(emp1.getAge());
    }
}
