package Rest_Assured;

import static io.restassured.RestAssured.*;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ValidateHeaders {
    @Test
    public void validateHeaders(){
        Response response=given().baseUri("https://reqres.in/")
                .basePath("/api/users/2")
                .when().get();
        Headers header=response.headers();
        for (Header h:header){
            System.out.println("Name "+h.getName()+" Value "+h.getValue());
        }
    }
}
