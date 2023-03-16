package Tests.ApiTests;

import org.junit.jupiter.api.Test;

public class TestPutUpdateUser extends BaseApiTest{
    @Test
    public void testPut(){
        putUpdateUser.confUser("morpheus", "zion resident");
        putUpdateUser.updateUser("/users/2");
        putUpdateUser.checkUpdate();

    }
}
