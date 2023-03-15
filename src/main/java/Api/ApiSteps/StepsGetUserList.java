package Api.ApiSteps;

import Api.BaseConfRequest;
import Api.Users.User;
import io.qameta.allure.Step;

import java.util.List;

import static io.restassured.RestAssured.given;
public class StepsGetUserList {
    @Step
    public static List<User> getUsers(String endPoint){
        return given().spec(BaseConfRequest.getReqSpec())
                .get(endPoint)
                .jsonPath()
                .getList("data", User.class);
    }
}
