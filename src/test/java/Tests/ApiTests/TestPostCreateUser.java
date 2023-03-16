package Tests.ApiTests;

import org.junit.jupiter.api.Test;

public class TestPostCreateUser extends BaseApiTest {

    @Test
    public void testPost(){
        createdUser.newUser("morpheus","leader");
        createdUser.postUser("/users");
        createdUser.checkName();
    }
}
