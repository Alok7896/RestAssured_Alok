package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class Deserialization {

    @Test
    public void Deserialisation(){
        JSONObject object=new JSONObject();
        object.put("name","Mantu");
        object.put("job","leader");
        Response res=RestAssured.given()
                .baseUri("https://reqres.in/api/users")
                .contentType(ContentType.JSON)
                .body(object.toString()).post();
        System.out.println(res.getBody().asString());
        ValidateResponse validate=res.as(ValidateResponse.class);
       System.out.println(validate.name+" "+validate.id);
    }
}
