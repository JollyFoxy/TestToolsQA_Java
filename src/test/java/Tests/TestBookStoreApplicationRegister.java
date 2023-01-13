package Tests;

import Persons.IPerson;
import org.junit.jupiter.api.Test;

public class TestBookStoreApplicationRegister extends BaseTest implements IPerson{
    @Test
    public void testBookStoreApplicationRegister(){
        loginPage.skrollrBody();
        loginPage.transitionBookStoreApplication();
        registerUser.newUser();
        registerUser.inputFirstName(person.getName());
        registerUser.inputLastName(person.getLastName());
        registerUser.inputUserName(person.getUserName());
        registerUser.inputPassword("Qq-123456!");
        registerUser.registerNewUser();
    }
}
