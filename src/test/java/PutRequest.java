import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class PutRequest {
    @Test
    public void getRequest() throws IOException {
        String fileName=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\test\\java\\File.txt"));
        Response res=RestAssured.given()
                .contentType(ContentType.JSON)
                .baseUri("https://jsonplaceholder.typicode.com/users/")
                .pathParam("id",1)
                .body(fileName)
                .when().put("/{id}").then().log().body().assertThat().statusCode(200).extract().response();

        JsonPath.read(res.body().asString(),"$.name");
    }
}
