package Tests.ApiTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class BaseApiTest {
    @BeforeEach
    public void configureRestAssured() {
        RestAssured.baseURI = "http://cookiemonster.com";
        RestAssured.basePath = "";
    }
}
