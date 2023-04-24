package Tests.UI.BookStoreApplication;

import Persons.IPerson;
import Tests.UI.BaseTest;
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
        pageRegisterUser.step1_Transition();
        pageRegisterUser.step2_NewUser();
        pageRegisterUser.step3_InputFirstName(person.getName());
        pageRegisterUser.step4_InputLastName(person.getLastName());
        pageRegisterUser.step5_InputUserName(person.getUserName());
        pageRegisterUser.step6_InputPassword("Qq-123456!");
        pageRegisterUser.step7_InputRegister();
        pageRegisterUser.step8_reCaptcha();
    }
}