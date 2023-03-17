package Api.ApiSteps;

import Api.BaseConfRequest;
import Api.Models.Responses.GetSingleUser.ResponseGetSingleUser;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class StepsGetSingleUser {
    private ResponseGetSingleUser response;
    @Step
    public void getSingleUser(String endPoint){
         response = given()
                .spec(BaseConfRequest.getReqSpec())
                .when().get(endPoint)
                .then().extract().body()
                .as(ResponseGetSingleUser.class);
    }
}
