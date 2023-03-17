package Api.ApiSteps;

import Api.BaseConfRequest;
import Api.Models.Responses.ResponseGetUsersList;
import io.qameta.allure.Step;

import java.util.List;

import static io.restassured.RestAssured.given;
public class StepsGetUserList {
    @Step
    public static List<ResponseGetUsersList> getUsers(String endPoint){
        return given().spec(BaseConfRequest.getReqSpec())
                .get(endPoint)
                .jsonPath()
                .getList("data", ResponseGetUsersList.class);
    }
}
