package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsonObjectPostRequest {

    @Test
    public void AddUser(){
        JSONObject user=new JSONObject();
        user.put("name","Fiza");
        user.put("job","Love Of My Life");
        user.put("Mobile","7710935878");
        user.put("Address","Chhachina");

        JSONObject user1=new JSONObject();
        user1.put("name","Fizu");
        user1.put("job","Love Of My Life");
        user1.put("Mobile","7710935878");
        user1.put("Address","kodala");

        JSONArray userList=new JSONArray();
        userList.put(user);
        userList.put(user1);

        Response res=RestAssured.given()
                .baseUri("https://reqres.in/api/users")
                .contentType(ContentType.JSON)
                .body(userList.toString())
                .post();
        String body=res.getBody().prettyPrint();
        System.out.println(body);
        Assert.assertEquals(res.statusCode(),201);
    }
}
