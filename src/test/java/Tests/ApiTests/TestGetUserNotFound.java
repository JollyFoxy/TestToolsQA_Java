package Tests.ApiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Api Tests")
public class TestGetUserNotFound extends BaseApiTest{
    @Test
    @DisplayName("Получение не существующего пользователя")
    public void testNotFoundUser(){
        getUserNotFound.getUser("users/23");
    }

}
