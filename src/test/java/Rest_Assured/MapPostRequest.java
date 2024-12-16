package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPostRequest {

    @Test
    public void MapPostRequest(){
        List<String> list=new ArrayList<>();
        list.add("BCA");
        list.add("MCA");
        Map<String,Object> mapObject=new HashMap<>();
        mapObject.put("name","Alok Pradhan");
        mapObject.put("job","leader");
        mapObject.put("Mobile","7710935878");
        mapObject.put("Qualification",list);

        Map<String,Object> mapObject1=new HashMap<>();
        mapObject1.put("name","Ashok Pradhan");
        mapObject1.put("job","Automation Tester");
        mapObject1.put("Mobile","7710935878");
        mapObject1.put("Qualification",list);

        List<Map<String,Object>> l1=new ArrayList<>();
        l1.add(mapObject1);
        l1.add(mapObject);
        Response res=RestAssured.given()
                .baseUri("https://reqres.in/api/users")
                .contentType(ContentType.JSON)
                .body(l1).post();
       String getBody=res.getBody().prettyPrint();
        System.out.println(getBody);
    }
}
