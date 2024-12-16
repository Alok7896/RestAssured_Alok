import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class postRequest {
    public static void main(String args[]) {
        JSONObject obj=new JSONObject();
        obj.put("userId",10);
        obj.put("Id",101);
        obj.put("title","Alok");
        obj.put("body","cupiditate quo est a modi nesciunt soluta\\nipsa voluptas error itaque dicta in\\nautem qui minus magnam et distinctio eum\\naccusamus ratione error aut");
        RestAssured.given().contentType(ContentType.JSON).body(obj.toString()).post("https://jsonplaceholder.typicode.com/posts")
                .then().log().ifValidationFails().assertThat().statusCode(201).body("title", Matchers.equalTo("Alok"));
    }
}
