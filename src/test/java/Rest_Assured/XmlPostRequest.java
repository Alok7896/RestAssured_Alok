package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class XmlPostRequest {

    @Test
    public void XmlPostRequest(){
        String xmlObject="<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<name>Fiza</name>\n" +
                "<job>Owner Of My House</job>";

        Response res=RestAssured.given()
                .baseUri("https://reqres.in/")
                .basePath("api/users")
                .header("accept","text/xml")
                .header("Content-Type","text/xml")
                .body(xmlObject)
                .post();
        String  resBody=res.body().asString();
        System.out.println("Response Body "+resBody);
        XmlPath xmlPath=new XmlPath(res.asString());
        String getId=xmlPath.get("id").toString();
        System.out.println(getId);
    }
}
