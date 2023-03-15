package Api.ApiSteps;

import Api.BaseConfRequest;
import Api.Models.Responses.GetSingleUser.ResponseGetSingleUser;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class StepsGetSingleUser {
    @Step
    public void getSingleUser(){
        given()
                .spec(BaseConfRequest.getReqSpec())
                .when().get()
                .then().extract().as(ResponseGetSingleUser.class);
    }
}
