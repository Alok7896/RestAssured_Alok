package Rest_Assured;

import Rest_Assured.Serialization.EmloyeeDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class MockAPICreation {
    @Test
    public void createMockAPI() throws JsonProcessingException {
        Response res=RestAssured.given()
                .baseUri("https://run.mocky.io/v3/d6abeeb2-24e5-4f59-99c0-85e1c460cb2c")
                .get();
        String response=res.asString();
        ObjectMapper obj=new ObjectMapper();
        EmloyeeDetails emp=obj.readValue(response,EmloyeeDetails.class);
        System.out.println(emp.getFirstName());
        System.out.println(emp.getAddress());



    }
}
