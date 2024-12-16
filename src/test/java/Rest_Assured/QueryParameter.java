package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class QueryParameter {

    @Test
    public void QueryParameterValidation(){
        Response res=RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .queryParam("page",2)
                .queryParam("id",7)
                .get();
        System.out.println(res.getBody().asString());
       JsonPath path= res.jsonPath();
       String name=path.get("data.first_name");
        System.out.println(name);
    }
}
