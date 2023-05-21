package Tests.ApiTests.Post;

import Api.ApiSteps.Post.StepsPostCreatedUser;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic("API tests")
@Feature("Post")
public class TestPostCreateUser {

    private final StepsPostCreatedUser createdUser = new StepsPostCreatedUser();

    @Test
    @DisplayName("Создание пользователя")
    public void testPost(){
        createdUser.postUser("/users","morpheus","leader");
    }
}
