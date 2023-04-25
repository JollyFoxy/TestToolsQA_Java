package Api.ApiSteps.Post.Authorization;

import Api.BaseConfRequest;
import Api.Models.Requests.RequestSuccessfulRegisterLogin;
import Api.Models.Requests.RequestUnsuccessfulRegister;
import Api.Models.Responses.ResponseRegisterSuccessful;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class StepsPostRegister {
    private RequestSuccessfulRegisterLogin user = new RequestSuccessfulRegisterLogin();
    private RequestUnsuccessfulRegister user2 =new RequestUnsuccessfulRegister();

    @Step
    public void confUser(String email, String password){
        user= RequestSuccessfulRegisterLogin.builder()
                .email(email)
                .password(password)
                .build();
    }

    @Step
    public void postRegistrationSuccessful(String endPoint){
        given().spec(BaseConfRequest.getReqSpec())
                .body(user).post(endPoint)
                .then().statusCode(200)
                .extract().body()
                .as(ResponseRegisterSuccessful.class);
    }
    @Step
    public void confUser2(String email){
        user2 = RequestUnsuccessfulRegister.builder()
                .email(email)
                .build();
    }
    @Step
    public void postRegisterUnsuccessful(String endPoint){
        given().spec(BaseConfRequest.getReqSpec())
                .body(user2).post(endPoint)
                .then().statusCode(400);
    }
}
