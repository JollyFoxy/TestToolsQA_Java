package Api.ApiSteps.Post.Authorization;

import Api.BaseConfRequest;
import Api.Models.Requests.RequestSuccessfulRegisterLogin;
import Api.Models.Responses.ResponsesLogin;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class StepsPostLogin{
    private RequestSuccessfulRegisterLogin user;
    private RequestSuccessfulRegisterLogin user2;
    @Step
    public void confUser(String email, String password){
        user = RequestSuccessfulRegisterLogin.builder()
                .email(email)
                .password(password)
                .build();
    }
    @Step
    public void postLogin(String endPoint){
        given().spec(BaseConfRequest.getReqSpec())
                .body(user).post(endPoint)
                .then().statusCode(200)
                .extract().body()
                .as(ResponsesLogin.class);
    }
    @Step
    public void confUser2(String email){
        user2 = RequestSuccessfulRegisterLogin.builder()
                .email(email)
                .build();
    }
    @Step
    public void postLoginUnsuccessful(String endPoint){
        given().spec(BaseConfRequest.getReqSpec())
                .body(user2).post(endPoint)
                .then().statusCode(400);
    }
}
