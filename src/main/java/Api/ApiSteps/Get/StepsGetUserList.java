package Api.ApiSteps.Get;


import Api.BaseConfRequest;
import Api.Models.Responses.ResponseGetUsersList;
import io.qameta.allure.Step;

import java.util.List;

import static io.restassured.RestAssured.given;
public class StepsGetUserList {
    @Step("Отправить get запрос списка пользователей по URL(https://reqres.in/api/users?page=2)")
    public  List<ResponseGetUsersList> getUsers(String endPoint){
        return given().spec(BaseConfRequest.getReqSpec())
                .get(endPoint)
                .jsonPath()
                .getList("data", ResponseGetUsersList.class);
    }
}
