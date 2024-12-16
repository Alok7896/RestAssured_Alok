package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OwnAPITesting_CRUDOperation {

    @BeforeClass
    public void initialization(){
        RequestSpecification request=RestAssured.given().
                baseUri("http://localhost:3000").
                basePath("/users");
        RestAssured.requestSpecification=request;
    }

    @Test
    public void getUserDetails(){
        Response res=RestAssured.given()
                .get();
        System.out.println(res.asString());
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void addNewUser(){
        JSONObject object=new JSONObject();
        object.put("name","mantu");
        object.put("age","25");
        Response res=RestAssured.given().
                contentType(ContentType.JSON)
                .body(object.toString())
                .post();
    }
    @Test
    public void DeleteUser(){
        Response res=RestAssured.given().delete("/5");
        System.out.println(res.prettyPrint());
    }

    @Test
    public void PutRequest(){
        JSONObject object=new JSONObject();
        object.put("name","Anvesh");
        object.put("age",22);
        object.put("id",1);
        Response res=RestAssured.given()
                .contentType(ContentType.JSON).body(object.toString()).put("/1");
        System.out.println(res.prettyPrint());
    }
}
