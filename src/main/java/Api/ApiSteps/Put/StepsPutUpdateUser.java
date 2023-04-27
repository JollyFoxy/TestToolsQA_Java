package Api.ApiSteps.Put;

import Api.BaseConfRequest;
import Api.Models.Requests.RequestUpdateUser;
import Api.Models.Responses.ResponseUpdateUser;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class StepsPutUpdateUser {

    private ResponseUpdateUser updateUser;
    private RequestUpdateUser user;

    @Step
    public void confUser(String name, String job){
        user = RequestUpdateUser.builder()
                .name(name)
                .job(job)
                .build();
    }
    @Step
    public void updateUser(String endPoint){
        updateUser =given()
                .spec(BaseConfRequest.getReqSpec())
                .body(user)
                .when()
                .put(endPoint)
                .then()
                .statusCode(200)
                .extract()
                .as(ResponseUpdateUser.class);
    }
    @Step
    public void checkUpdate(){
        assertThat(updateUser)
                .isNotNull()
                .extracting(ResponseUpdateUser::getJob)
                .isEqualTo(user.getJob());
    }
}
