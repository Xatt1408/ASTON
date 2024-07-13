import io.restassured.builder.*;
import io.restassured.specification.*;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class ApiTest {
    private final static String RESPONSE = "This is expected to be sent back as part of response body.";

    @BeforeEach
    public void setURLandOK200() {
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://postman-echo.com")
                .build();

        ResponseSpecification responseSpecOK200 = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();

        requestSpecification = requestSpec;
        responseSpecification = responseSpecOK200;
    }

    @Test
    public void getRequestTest() {

        given()
                .when()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .log().all()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void postRawTextTest() {

        given()
                .body("")
                .when()
                .post("/post")
                .then()
                .log().all()
                .body("json", equalTo(null));
    }

    @Test
    public void postFormDataTest() {

        given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .log().all()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    public void putRequestTest() {

        given()
                .body(RESPONSE)
                .when()
                .put("/put")
                .then()
                .log().all()
                .body("data", equalTo(RESPONSE));
    }

    @Test
    public void patchRequestTest() {

        given()
                .body(RESPONSE)
                .when()
                .patch("/patch")
                .then()
                .log().all()
                .body("data", equalTo(RESPONSE));
    }

    @Test
    public void deleteRequestTest() {

        given()
                .when()
                .delete("/delete")
                .then()
                .log().all()
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}
