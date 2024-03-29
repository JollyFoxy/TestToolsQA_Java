package Tests.ApiTests.Put;

import Api.ApiSteps.Put.StepsPutUpdateUser;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Put")
public class TestPutUpdateUser {

    StepsPutUpdateUser putUpdateUser = new StepsPutUpdateUser();

    @Test
    @DisplayName("Обновление пользователя через \"Put\"")
    public void testPut(){
        putUpdateUser.updateUser("/users/2", "morpheus", "zion resident");
    }
}
