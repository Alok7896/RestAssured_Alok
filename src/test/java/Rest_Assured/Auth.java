package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Auth {

    static String accessToken;

    @Test(priority = 0)
    public void setBasicAuth(){
        Response res=RestAssured.given()
                .baseUri("https://api-m.sandbox.paypal.com/v1/oauth2/token")
                .auth().preemptive().basic("AX5XWT2V21RuM9kdFtQWBxUnw6624QPIQ9vv9Crso2KKbMhV0Cdlf8kBESUMVuAOPDTwZDMe5ZV1XWKS","ELPaNQQ3jRWtv_56cxeKOJiOJGg1kuXgweLmjvg7ZplURMEaS0CYTOgtyUbeuDbdhrb4BW65PT98vPpc")
                .param("grant_type","client_credentials")
                .post();
        accessToken=res.getBody().path("access_token");
    }

    @Test(priority = 1)
    public void APIChaining(){
        RestAssured.given()
                .baseUri("https://api-m.sandbox.paypal.com/v1/invoicing/invoices")
                .queryParam("page",3).queryParam("page_size",4)
                .queryParam("total_count_required",true)
                .contentType(ContentType.JSON)
                .auth().oauth2("Bearer "+accessToken)
                .get().then().log().all();
    }
}
