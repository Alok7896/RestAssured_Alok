import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;

import org.json.JSONArray;
import org.testng.annotations.Test;
import com.jayway.jsonpath.JsonPath;
import java.io.File;
import java.io.IOException;

public class PostRequestUsingFile {

    @Test
    public void createPostRequest() throws IOException {
        String dir=System.getProperty("user.dir");
        String fileName=FileUtils.readFileToString(new File(dir+"\\src\\test\\java\\File.txt"),"UTF-8");
        Response res=RestAssured.given()
                .contentType(ContentType.JSON)
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .when().get()
                .then().log().body().extract().response();
        int x=JsonPath.read(res.body().asString(),"$.[3].id");
        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .pathParam("id",x)
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .when()
                .get("/{id}",x).then().log().body();


    }
}
