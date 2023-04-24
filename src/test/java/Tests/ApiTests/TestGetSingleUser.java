package Tests.ApiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Api Tests")
public class TestGetSingleUser extends BaseApiTest{
    @Test
    @DisplayName("Получение одногнопользователя")
    public void testSingleUser() {
        getSingleUser.getSingleUser("users/2");

    }
}
