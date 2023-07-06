package Tests.ApiTests.Get;

import Api.ApiSteps.Get.StepsGetSingleUser;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Get")
public class TestGetSingleUser {
    private final StepsGetSingleUser getSingleUser = new StepsGetSingleUser();

    @Test
    @DisplayName("Получение одногнопользователя")
    public void testSingleUser() {
        getSingleUser.getSingleUser("users/2");
    }
}
