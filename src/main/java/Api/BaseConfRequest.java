package Api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseConfRequest {
    private static final RequestSpecification REQ_SPEC =new RequestSpecBuilder()
            .setBaseUri("https://reqres.in")
            .setBasePath("/api")
            .setContentType(ContentType.JSON)
            .build();
    public static RequestSpecification getReqSpec(){
        return REQ_SPEC;
    }
}
