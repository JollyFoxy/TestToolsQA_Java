package Tests.ApiTests.Patch;

import Tests.ApiTests.BaseApiTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Patch")
public class TestPatchUpdateUser extends BaseApiTest {
    @Test
    @DisplayName("Обновление пользователя через \"Patch\"")
    public void patchUpdateUser(){
        patchUpdateUser.updateUser("/users/2","morpheus", "zion resident");
    }
}