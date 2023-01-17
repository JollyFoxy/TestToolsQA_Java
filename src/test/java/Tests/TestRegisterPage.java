package Tests;

import Persons.IPerson;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestRegisterPage extends BaseTest implements IPerson{
    @Test
    @DisplayName("Тест регистрации")
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
