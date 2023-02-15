package Tests.BookStoreApplication;

import Persons.IPerson;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("BookStoreApplication")
public class TestRegisterPage extends BaseTest implements IPerson{
    @Test
    @Link(name = "Book Store Application",url = "https://demoqa.com/register")
    @DisplayName("Тест регистрации")
    public void testBookStoreApplicationRegister(){
        step1();
        step2();
        step3(person.getName());
        step4(person.getLastName());
        step5(person.getUserName());
        step6("Qq-123456!");
        step7();
        step8();
    }
    @Step("Вход в пункт \"Login\"")
    public void step1(){
        loginPage.body.scrollToObject();
        loginPage.transition.transitionAndScroll("div.left-pannel");
    }
    @Step("Нажимание кнопки \"New User\"")
    public void step2(){
        registerUser.btnNewUser.clickBtn();
    }
    @Step("Ввод в поле \"First Name\"")
    public void step3(String first_name){
        registerUser.firstName.setValueInput(first_name);
    }
    @Step("Ввод в поле \"Last Name\"")
    public void step4(String last_name){
        registerUser.lastName.setValueInput(last_name);
    }
    @Step("Ввод в поле \"User Name\"")
    public void step5(String user_name) {
        registerUser.userName.setValueInput(user_name);
    }
    @Step("Ввод в поле \"Password\"")
    public void step6(String pass){
        registerUser.password.setValueInput(pass);
    }
    @Step("нажатие кнопки \"Register\"")
    public void step7(){
        registerUser.register.clickBtn();
    }
    @Step("Нажатие \"reСaptcha\"")
    public void step8(){
        registerUser.captchaClick();
    }
}