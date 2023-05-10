package Tests.UITests.BookStoreApplication;

import Persons.IPerson;
import Tests.UITests.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Ui tests")
@Feature("BookStoreApplication")
public class TestRegisterPage extends BaseTest implements IPerson{
    @Test
    @Link(name = "Book Store Application",url = "https://demoqa.com/register")
    @DisplayName("Тест регистрации")
    public void testBookStoreApplicationRegister() {
        pageRegisterUser.transition();
        pageRegisterUser.newUser();
        pageRegisterUser.inputFirstName(person.getName());
        pageRegisterUser.inputLastName(person.getLastName());
        pageRegisterUser.inputUserName(person.getUserName());
        pageRegisterUser.inputPassword(person.getPassword());
        pageRegisterUser.inputRegister();
        pageRegisterUser.reCaptcha();
    }
}