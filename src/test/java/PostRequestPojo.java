import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PostRequestPojo {
    @Test
    public void createPostRequest() throws JsonProcessingException {
        Users user=new Users(1,101,"books","New Set of books of graduation");
        Users user1=new Users(1,102,"Cities","New Set of Cities of States");
        List<Users> l=new ArrayList<>();
        l.add(user);
        l.add(user1);
        ObjectMapper map=new ObjectMapper();
        String payload=map.writerWithDefaultPrettyPrinter().writeValueAsString(l);
        Response res=RestAssured.given()
                .contentType(ContentType.JSON)
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .body(payload)
                .post();
        JSONObject obj=new JSONObject(res.body().asString());
        String value = null;
        Set<String> keys=obj.keySet();
        for (String key:keys){
            JSONObject obj1=obj.getJSONObject(key);
            if (obj1.get("id").toString().equals("102")){
                value= obj1.get("id").toString();
                break;
            }
        }
        Response res1=RestAssured.given()
                .contentType(ContentType.JSON)
                .pathParam("id",99)
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .when()
                .get("{id}");
        System.out.println(res1.prettyPrint());

    }
}
