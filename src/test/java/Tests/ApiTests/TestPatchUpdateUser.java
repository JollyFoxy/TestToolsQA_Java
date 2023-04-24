package Tests.ApiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Api Tests")
public class TestPatchUpdateUser extends BaseApiTest{
    @Test
    @DisplayName("Обновление пользователя через \"Patch\"")
    public void patchUpdateUser(){
        patchUpdateUser.confUser("morpheus", "zion resident");
        patchUpdateUser.updateUser("/users/2");
        patchUpdateUser.checkUpdate();
    }
}
