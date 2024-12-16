import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest {
    @Test
    public void getRequest(){
       Response response= RestAssured.given().contentType(ContentType.JSON).baseUri("https://jsonplaceholder.typicode.com/posts")
                .when().get()
                .then().assertThat().statusCode(200).header("Content-Type","application/json; charset=utf-8")
                .extract().response();
       int value=response.path("id[1]");
       RestAssured.given()
               .contentType(ContentType.JSON)
               .pathParam("id",value)
               .baseUri("https://jsonplaceholder.typicode.com/posts/")
               .when()
               .get("{id}")
               .then()
               .assertThat().log().body();
    }
}
