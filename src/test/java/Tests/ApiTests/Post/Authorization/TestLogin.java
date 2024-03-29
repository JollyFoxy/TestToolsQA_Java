package Tests.ApiTests.Post.Authorization;

import Api.ApiSteps.Post.Authorization.StepsPostLogin;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Post")
@Story("Authorization")
public class TestLogin {
    private final StepsPostLogin postLogin = new StepsPostLogin();

    @Test
    @Order(1)
    @DisplayName("Тест авторизации (негативный)")
    public void testLoginUnsuccessful(){
        postLogin.postLoginUnsuccessful("/login", "peter@klaven");
    }

    @Test
    @Order(2)
    @DisplayName("Тест авторизации (позитивный)")
    public void testLogin(){
        postLogin.postLogin("/login", "eve.holt@reqres.in","cityslicka");
    }

}
