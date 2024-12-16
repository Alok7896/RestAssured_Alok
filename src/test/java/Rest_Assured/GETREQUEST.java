package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GETREQUEST {

    @Test
    public void GetRequest(){
        Response res=RestAssured.get("https://jsonplaceholder.typicode.com/posts");
        System.out.println(res.getStatusCode());
        System.out.println(res.getBody().asString());
        System.out.println(res.getTime());
    }

    @Test
    public void GetRequestRestAssured(){
        RestAssured.given().baseUri("https://jsonplaceholder.typicode.com/posts").when().get().then().statusCode(200);
    }
}
