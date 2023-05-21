package Tests.ApiTests.Delete;

import Api.ApiSteps.Delete.StepsDeleteUser;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("API tests")
@Feature("Delete")
public class TestDeleteUser {
    private final StepsDeleteUser deleteUser = new StepsDeleteUser();

    @Test
    @DisplayName("Удаление пользователя")
    public void testDelete(){
        deleteUser.deleteUser("/users/2");
    }
}
