package Api.ApiSteps;

import Api.BaseConfRequest;
import Api.Models.Requests.RequestPutUpdateUser;
import Api.Models.Responses.ResponsePutUpdateUser;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;



public class StepsPostUpdateUser {

    private ResponsePutUpdateUser updateUser;
    private RequestPutUpdateUser user;

    @Step
    public void confUser(String name, String job){
        user = RequestPutUpdateUser.builder()
                .name(name)
                .job(job)
                .build();
    }
    @Step
    public void updateUser(String endPoint){
        updateUser =given()
                .spec(BaseConfRequest.getReqSpec())
                .body(user)
                .when().put(endPoint)
                .then().statusCode(200)
                .extract().as(ResponsePutUpdateUser.class);
    }
    @Step
    public void checkUpdate(){
        assertThat(updateUser)
                .isNotNull()
                .extracting(ResponsePutUpdateUser::getJob)
                .isEqualTo(user.getJob());
    }
}
