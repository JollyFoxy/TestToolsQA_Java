package Api.ApiSteps.Post.Authorization;

import Api.BaseConfRequest;
import Api.Models.Requests.RequestSuccessfulRegisterLogin;
import Api.Models.Responses.ResponsesLogin;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class StepsPostLogin{

    @Step("Отправить post запрос по URL(https://reqres.in/api/login)")
    public void postLogin(String endPoint, String email, String password){
        RequestSuccessfulRegisterLogin user = RequestSuccessfulRegisterLogin.builder()
                .email(email)
                .password(password)
                .build();
        given().spec(BaseConfRequest.getReqSpec())
                .body(user).post(endPoint)
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(ResponsesLogin.class);
    }
    @Step("Отправить post запрос по URL(https://reqres.in/api/login)")
    public void postLoginUnsuccessful(String endPoint, String email){
        RequestSuccessfulRegisterLogin user2 = RequestSuccessfulRegisterLogin.builder()
                .email(email)
                .build();
        given().spec(BaseConfRequest.getReqSpec())
                .body(user2)
                .post(endPoint)
                .then()
                .statusCode(400);
    }
}
