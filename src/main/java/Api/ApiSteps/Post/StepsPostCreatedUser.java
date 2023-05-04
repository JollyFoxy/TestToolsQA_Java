package Api.ApiSteps.Post;

import Api.BaseConfRequest;
import Api.Models.Requests.RequestBodyPostCreateUser;
import Api.Models.Responses.ResponseBodyPostCreateUser;
import io.qameta.allure.Step;
import org.assertj.core.api.Assertions;

import static io.restassured.RestAssured.given;

public class StepsPostCreatedUser {

    @Step("Отправить post запрос по URL(https://reqres.in/api/users)")
    public void postUser(String endPoint, String name, String job){
        RequestBodyPostCreateUser user = RequestBodyPostCreateUser.builder()
                .name(name)
                .job(job)
                .build();
        ResponseBodyPostCreateUser createdUser = given()
                .spec(BaseConfRequest.getReqSpec())
                .body(user)
                .when()
                .post(endPoint)
                .then()
                .statusCode(201)
                .extract()
                .as(ResponseBodyPostCreateUser.class);
        Assertions.assertThat(createdUser)
                .isNotNull()
                .extracting(ResponseBodyPostCreateUser::getName)
                .isEqualTo(user.getName());
    }
}
