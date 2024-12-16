import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UserRequest {

    @Test
    public void getDetails(){
        RestAssured.baseURI="https://reqres.in/api/users";
        Response response=given().header("Content-Type","application/json").queryParam("page","2").get();
        response.getBody().prettyPrint();
        JsonPath jsonpath=response.jsonPath();
        int num=jsonpath.get("data[0]['id']");
        assertThat(num,equalTo(7));
        //System.out.println(page);
    }
}
