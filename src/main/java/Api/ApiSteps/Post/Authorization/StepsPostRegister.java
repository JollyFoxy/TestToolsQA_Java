package Api.ApiSteps.Post.Authorization;

import Api.BaseConfRequest;
import Api.Models.Requests.RequestSuccessfulRegisterLogin;
import Api.Models.Requests.RequestUnsuccessfulRegister;
import Api.Models.Responses.ResponseRegisterSuccessful;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class StepsPostRegister {

    @Step("Отправить post запрос по URL(https://reqres.in/api/register)")
    public void postRegistrationSuccessful(String endPoint, String email, String password){
        RequestSuccessfulRegisterLogin user = RequestSuccessfulRegisterLogin.builder()
                .email(email)
                .password(password)
                .build();
        given().spec(BaseConfRequest.getReqSpec())
                .body(user)
                .post(endPoint)
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(ResponseRegisterSuccessful.class);
    }
    @Step("Отправить post запрос по URL(https://reqres.in/api/register)")
    public void postRegisterUnsuccessful(String endPoint, String email){
        RequestUnsuccessfulRegister user2 = RequestUnsuccessfulRegister.builder()
                .email(email)
                .build();
        given().spec(BaseConfRequest.getReqSpec())
                .body(user2)
                .post(endPoint)
                .then()
                .statusCode(400);
    }
}
