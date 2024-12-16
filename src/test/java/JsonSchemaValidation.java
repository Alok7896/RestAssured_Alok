import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class JsonSchemaValidation {
    @Test
    public void jsonSchemaValidation() throws IOException {
        String file = FileUtils.readFileToString(new File("C:\\Users\\DELL\\IdeaProjects\\Rest\\src\\test\\java\\schema"), "UTF-8");
        RestAssured.given()
                .contentType(ContentType.JSON)
                .pathParam("id", "99")
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .when().get("/{id}")
                .then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(file));
    }
}
