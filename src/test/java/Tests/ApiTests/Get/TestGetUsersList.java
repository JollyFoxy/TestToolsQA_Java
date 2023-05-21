package Tests.ApiTests.Get;

import Api.ApiSteps.Get.StepsGetUserList;
import Api.Models.Responses.ResponseGetUsersList;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


@Epic("API tests")
@Feature("Get")
public class TestGetUsersList {
    private final StepsGetUserList getUserList = new StepsGetUserList();
    @Test
    @DisplayName("Получение списка пользователей")
    public void testGet(){
        List<ResponseGetUsersList> users  = getUserList.getUsers("/users?page=2");
        Assertions.assertThat(users)
                .isNotNull().extracting(ResponseGetUsersList::getEmail)
                .contains("tobias.funke@reqres.in");
    }
}
