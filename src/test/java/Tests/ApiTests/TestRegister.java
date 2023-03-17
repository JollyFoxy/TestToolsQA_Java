package Tests.ApiTests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Api Tests")
public class TestRegister extends BaseApiTest {
    @Test
    @DisplayName("Тест регистрации (позитивный)")
    public void testRegisterSuccessful(){
        postRegister.confUser("eve.holt@reqres.in","pistol");
        postRegister.postRegistrationSuccessful("register");
    }
    @Test
    @DisplayName("Тест регистрации (негативный)")
    public void testRegisterUnsuccessful(){
        postRegister.confUser2("sydney@fife");
        postRegister.postRegisterUnsuccessful("register");
    }
}
