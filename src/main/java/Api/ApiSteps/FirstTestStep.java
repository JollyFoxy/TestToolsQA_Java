package Api.ApiSteps;

import Api.ApiSteps.Users.User;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import static io.restassured.RestAssured.given;
public class FirstTestStep {
    private static final RequestSpecification REQ_SPEC =new RequestSpecBuilder()
            .setBaseUri("https://reqres.in")
            .setBasePath("/api")
            .setContentType(ContentType.JSON)
            .build();

    public static RequestSpecification getReqSpec(){
        return REQ_SPEC;
    }


    public static List<User> getUsers(String url){
        return given().spec(REQ_SPEC)
                .get(url)
                .jsonPath()
                .getList("data", User.class);
    }


}
