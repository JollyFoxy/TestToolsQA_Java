package Api.ApiSteps.Delete;


import Api.BaseConfRequest;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class StepsDeleteUser {
    @Step("Отправить delete запрос по URL(https://reqres.in/api/users/2)")
    public void deleteUser(String endPoint){
        given()
                .spec(BaseConfRequest.getReqSpec())
                .when()
                .delete(endPoint)
                .then()
                .statusCode(204);
    }
}
