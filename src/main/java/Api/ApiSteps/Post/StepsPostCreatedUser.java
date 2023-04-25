package Api.ApiSteps.Post;

import Api.BaseConfRequest;
import Api.Models.Requests.RequestBodyPostCreateUser;
import Api.Models.Responses.ResponseBodyPostCreateUser;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class StepsPostCreatedUser {
    private RequestBodyPostCreateUser user = new RequestBodyPostCreateUser();
    private ResponseBodyPostCreateUser createdUser = new ResponseBodyPostCreateUser();

    @Step
    public void newUser(String name, String job){
        user = RequestBodyPostCreateUser.builder()
                .name(name)
                .job(job)
                .build();
    }
    @Step
    public void postUser(String endPoint){
         createdUser = given()
                .spec(BaseConfRequest.getReqSpec())
                .body(user)
                .when().post(endPoint)
                .then().statusCode(201)
                .extract().as(ResponseBodyPostCreateUser.class);
    }
    @Step
    public void checkName(){
        assertThat(createdUser)
                .isNotNull()
                .extracting(ResponseBodyPostCreateUser::getName)
                .isEqualTo(user.getName());
    }
}
