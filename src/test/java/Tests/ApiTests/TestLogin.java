package Tests.ApiTests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Api Tests")
public class TestLogin extends  BaseApiTest{
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
