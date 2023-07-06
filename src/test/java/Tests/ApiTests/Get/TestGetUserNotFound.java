package Tests.ApiTests.Get;

import Api.ApiSteps.Get.StepsNotFoundUser;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("API tests")
@Feature("Get")
public class TestGetUserNotFound {

    private final StepsNotFoundUser getUserNotFound = new StepsNotFoundUser();

    @Test
    @DisplayName("Получение не существующего пользователя")
    public void testNotFoundUser(){
        getUserNotFound.getUser("users/23");
    }

}
