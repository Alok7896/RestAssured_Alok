package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.entity.ContentType;
import org.testng.annotations.Test;

import java.io.File;

public class FileUpload {

    @Test
    public void FileUpload(){
        Response res=RestAssured.given()
                .baseUri("https://httpbin.org/post")
                .contentType("multipart/form-data")
                .multiPart(new File("C:\\Users\\DELL\\Downloads\\test.txt"))
                .post();

        System.out.println(res.asString());
    }

    @Test
    public void ImageUpload(){
        Response res=RestAssured.given()
                .baseUri("https://petstore.swagger.io/v2/pet/1/uploadImage")
                .contentType("multipart/form-data")
                .multiPart(new File("C:\\Users\\DELL\\Downloads\\baby.jpg"))
                .post();
        System.out.println(res.asString());
    }
}
