package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class BearerToken {
    @Test
    public void BearerTokenAuthorization(){
        Response res=RestAssured.given().
                baseUri("https://gorest.co.in")
                .basePath("/public/v2/users")
                .header("Authorization","Bearer dd994c6a9b1916c5aa4ece33be972ce67f953c1796428c1e292b8f6c339254c1")
                .get();
        System.out.println(res.asString());
    }

    @Test
    public void BearerTokenAuthorisationPost(){
        JSONObject obj=new JSONObject();
        obj.put("name","Ashok");
        obj.put("email","ashokp13@gmail.com");
        obj.put("gender","Male");
        obj.put("status","Active");
        RequestSpecification reqs=RestAssured.given()
                .baseUri("https://gorest.co.in")
                .basePath("/public/v2/users")
                .header("Authorization","Bearer dd994c6a9b1916c5aa4ece33be972ce67f953c1796428c1e292b8f6c339254c1")
                .contentType(ContentType.JSON)
                .body(obj.toString());
        reqs.when().post().then().log().all();
    }
}
