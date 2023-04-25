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
public class TestLogin extends BaseApiTest {
    @Test
    @DisplayName("Тест авторизации (позитивный)")
    public void testLogin(){
        postLogin.confUser("eve.holt@reqres.in","cityslicka");
        postLogin.postLogin("/login");
    }
    @Test
    @DisplayName("Тест авторизации (негативный)")
    public void testLoginUnsuccessful(){
        postLogin.confUser2("peter@klaven");
        postLogin.postLoginUnsuccessful("/login");
    }

}
