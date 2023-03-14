package Tests.ApiTests;

import Api.ApiSteps.FirstTestStep;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestDeleteUser extends BaseApiTest{
    @Test
    public void testDelete(){
        given()
                .spec(FirstTestStep.getReqSpec())
                .when().delete("/users/2")
                .then().statusCode(204);
    }
}
