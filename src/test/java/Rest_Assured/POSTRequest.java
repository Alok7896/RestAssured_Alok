package Rest_Assured;

import io.restassured.RestAssured;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class POSTRequest {

    @Test
    public void POSTRequest_JSONObject(){
        JSONObject jsondata=new JSONObject();
        jsondata.put("name","Alok");
        jsondata.put("job","Tester");
        RestAssured.baseURI="";
        RestAssured.given().baseUri("https://reqres.in/api/users")
                .body(jsondata)
                .when().post()
                .then().log().body().statusCode(201);
    }
}
