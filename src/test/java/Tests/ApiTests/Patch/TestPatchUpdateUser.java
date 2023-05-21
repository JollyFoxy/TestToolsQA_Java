package Tests.ApiTests.Patch;

import Api.ApiSteps.Putch.StepsPatchUpdateUser;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Patch")
public class TestPatchUpdateUser {

    StepsPatchUpdateUser patchUpdateUser = new StepsPatchUpdateUser();

    @Test
    @DisplayName("Обновление пользователя через \"Patch\"")
    public void patchUpdateUser(){
        patchUpdateUser.updateUser("/users/2","morpheus", "zion resident");
    }
}
