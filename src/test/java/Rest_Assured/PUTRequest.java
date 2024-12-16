package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class PUTRequest {

    @Test
    public void PUTRequest(){
        JSONObject object=new JSONObject();
        object.put("name","Fizulu");
        object.put("job","HouseOwner");
        RestAssured.baseURI="https://reqres.in/api/users/619";
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(object).when().put()
                .then().statusCode(200).log().body();
    }
}
