package Tests.ApiTests.Post.Authorization;

import Api.ApiSteps.Post.Authorization.StepsPostRegister;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Post")
@Story("Authorization")
public class TestRegister {
    private final StepsPostRegister postRegister = new StepsPostRegister();
    @Test
    @DisplayName("Тест регистрации (позитивный)")
    public void testRegisterSuccessful(){
        postRegister.postRegistrationSuccessful("register", "eve.holt@reqres.in","pistol");
    }
    @Test
    @DisplayName("Тест регистрации (негативный)")
    public void testRegisterUnsuccessful(){
        postRegister.postRegisterUnsuccessful("register", "sydney@fife");
    }
}
