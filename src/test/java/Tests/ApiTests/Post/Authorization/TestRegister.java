package Tests.ApiTests.Post.Authorization;

import Tests.ApiTests.BaseApiTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Post")
@Story("Authorization")
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
