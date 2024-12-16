package Rest_Assured.Postmethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class JSONOBJECT {

    @Test
    public void PostThroughJsonObject(){
        JSONObject obj=new JSONObject();
        JSONObject comp=new JSONObject();
        comp.put("name","Capgemini Pvt.Ltd");
        comp.put("emailId","alokp6812@gmail.com");
        String []skills={"Java","C"};
        obj.put("name","Alok Pradhan");
        obj.put("job","leader");
        obj.put("skills",skills);
        obj.put("details",comp);
       Response res= RestAssured.given()
                .baseUri("https://reqres.in/api/users")
                .contentType(ContentType.JSON)
                .body(obj.toString()).post();
        System.out.println(res.prettyPrint());
    }
}
