package Tests.ApiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Api Tests")
public class TestPutUpdateUser extends BaseApiTest{
    @Test
    @DisplayName("Обновление пользователя через \"Put\"")
    public void testPut(){
        putUpdateUser.confUser("morpheus", "zion resident");
        putUpdateUser.updateUser("/users/2");
        putUpdateUser.checkUpdate();
    }
}
