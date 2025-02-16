package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class BearerToken {

    @Test
    public void updateRequest(){
        RestAssured.given()
                .contentType(ContentType.JSON)
                .baseUri("https://dummyjson.com/auth/me")
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxMDY1OTExNCwiZXhwIjoxNzEwNjYyNzE0fQ.AIDeNk9Pm9Os1gNP75DwvzQ-uXjfB3TQ4DwMYwTu8-k")
                .when().get().then().log().body();
    }

}
