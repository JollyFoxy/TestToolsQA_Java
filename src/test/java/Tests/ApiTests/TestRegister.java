package Tests.ApiTests;

import org.junit.jupiter.api.Test;

public class TestRegister extends BaseApiTest {
    @Test
    public void testRegisterSuccessful(){
        postRegister.confUser("eve.holt@reqres.in","pistol");
        postRegister.postRegistrationSuccessful("register");
    }
    @Test
    public void testRegisterUnsuccessful(){
        postRegister.confUser2("sydney@fife");
        postRegister.postRegisterUnsuccessful("register");
    }
}
