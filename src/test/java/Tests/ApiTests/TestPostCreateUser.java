package Tests.ApiTests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Api Tests")
public class TestPostCreateUser extends BaseApiTest {

    @Test
    @DisplayName("Создание пользователя")
    public void testPost(){
        createdUser.newUser("morpheus","leader");
        createdUser.postUser("/users");
        createdUser.checkName();
    }
}
