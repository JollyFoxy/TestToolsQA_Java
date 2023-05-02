package Api.ApiSteps.Put;

import Api.BaseConfRequest;
import Api.Models.Requests.RequestUpdateUser;
import Api.Models.Responses.ResponseUpdateUser;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class StepsPutUpdateUser {

    @Step("Отправить put запрос по URL(https://reqres.in/api/users/2)")
    public void updateUser(String endPoint, String name, String job){
        RequestUpdateUser user = RequestUpdateUser.builder()
                .name(name)
                .job(job)
                .build();
        ResponseUpdateUser updateUser = given()
                .spec(BaseConfRequest.getReqSpec())
                .body(user)
                .when()
                .put(endPoint)
                .then()
                .statusCode(200)
                .extract()
                .as(ResponseUpdateUser.class);
        assertThat(updateUser)
                .isNotNull()
                .extracting(ResponseUpdateUser::getJob)
                .isEqualTo(user.getJob());
    }
}
