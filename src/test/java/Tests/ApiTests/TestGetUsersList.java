package Tests.ApiTests;

import Api.ApiSteps.StepsGetUserList;
import Api.Models.Responses.ResponseGetUsersList;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@Epic("API tests")
@Feature("Api Tests")
public class TestGetUsersList {

    @Test
    @DisplayName("Получение списка пользователей")
    public void testGet(){
        List<ResponseGetUsersList> users  = StepsGetUserList.getUsers("/users?page=2");
        assertThat(users)
                .isNotNull().extracting(ResponseGetUsersList::getEmail)
                .contains("tobias.funke@reqres.in");
    }
}
