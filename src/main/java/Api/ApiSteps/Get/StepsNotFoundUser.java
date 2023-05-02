package Api.ApiSteps.Get;



import Api.BaseConfRequest;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class StepsNotFoundUser{
    @Step("Отправить get запрос пользователя по URL(https://reqres.in/api/users/23)")
    public void getUser(String endPoint){
        given().spec(BaseConfRequest.getReqSpec())
                .get(endPoint)
                .then()
                .statusCode(404);
    }
}
