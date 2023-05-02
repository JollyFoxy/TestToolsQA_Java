package Tests.ApiTests.Delete;

import Tests.ApiTests.BaseApiTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("API tests")
@Feature("Delete")
public class TestDeleteUser extends BaseApiTest {
    @Test
    @DisplayName("Удаление пользователя")
    public void testDelete(){
        deleteUser.deleteUser("/users/2");
    }
}