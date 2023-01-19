package Tests.BookStoreApplication;

import Persons.IPerson;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("BookStoreApplication")
public class TestRegisterPage extends BaseTest implements IPerson{
    @Test
    @Link(name = "Book Store Application",url = "https://demoqa.com/register")
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