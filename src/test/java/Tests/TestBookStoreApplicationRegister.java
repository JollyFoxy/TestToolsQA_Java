package Tests;

import Interfasces.ILogin;
import Interfasces.IPerson;
import Interfasces.IRegister;
import org.junit.jupiter.api.Test;

public class TestBookStoreApplicationRegister extends BaseTest implements IPerson, ILogin, IRegister{
    @Test
    public void testBookStoreApplicationRegister(){
        loginPage.skroleBody();
        loginPage.transitionBookStoreApplication();
        registerUser.newUser();
        registerUser.inputFirstName(person.getName());
        registerUser.inputLastName(person.getLastName());
        registerUser.inputUserName(person.getUserName());
        registerUser.inputPassword("Qq-123456!");
        registerUser.registerNewUser();
    }
}
