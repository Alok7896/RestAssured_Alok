import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class restAssured {

    @Test
    public void example(){
                 given().
                 baseUri("https://7064dce2-0e70-4867-bd8d-56a32ab2fb9b.mock.pstmn.io")
                //.header("x-mock-response-code","200")
                         .log().all()
                         .config(config.logConfig(LogConfig.logConfig().blacklistHeader("x-mock-response-code")))
                .when().get()
                .then().log().body().assertThat().statusCode(200);
                /*.body("[0].title",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"),
                        "id",hasItems(46,47)).extract().response();
        JsonPath jsonPath=new JsonPath(res.asString());
        int x=jsonPath.getInt("[0].userId");
        System.out.println(x);*/
    }
}
