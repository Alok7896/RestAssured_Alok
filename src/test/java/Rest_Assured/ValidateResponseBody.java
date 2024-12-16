package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateResponseBody {

    @Test
    public void validateResponse(){
        Response res=RestAssured.given()
                .baseUri("https://reqres.in/api/users?page=2")
                .get();
        JsonPath path=res.jsonPath();
        int name=path.get("page");
        Assert.assertEquals(name,1);
    }
}
