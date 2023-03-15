package Api.ApiSteps;

import Api.BaseConfRequest;

import static io.restassured.RestAssured.given;

public class StepsDeleteUser {
    public void deleteUser(String endPoint){
        given()
                .spec(BaseConfRequest.getReqSpec())
                .when().delete(endPoint)
                .then().statusCode(204);
    }
}
