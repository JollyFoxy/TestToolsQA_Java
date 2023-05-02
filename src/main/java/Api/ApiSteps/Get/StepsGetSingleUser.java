package Api.ApiSteps.Get;

import Api.BaseConfRequest;
import Api.Models.Responses.GetSingleUser.ResponseGetSingleUser;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class StepsGetSingleUser {
    @Step("Отправить get запрос пользователя по URL(https://reqres.in/api/users/2)")
    public void getSingleUser(String endPoint){
        ResponseGetSingleUser response = given()
                .spec(BaseConfRequest.getReqSpec())
                .when()
                .get(endPoint)
                .then()
                .extract()
                .body()
                .as(ResponseGetSingleUser.class);
    }
}
