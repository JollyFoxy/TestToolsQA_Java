package Steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Register {
    private SelenideElement body = $(By.xpath("//div[@class='body-height']"));
    private SelenideElement bookStoreApplication =$(By.xpath("//div[@class='card-body']//h5[.='Book Store Application']"));
    private SelenideElement login = $(By.xpath("//div[@class='element-group']//li[@id='item-0']//span[.='Login']"));
    private SelenideElement btnNewUser = $(By.xpath("//button[@id='newUser']"));
    private SelenideElement firstName = $(By.xpath("//input[@id='firstname']"));
    private SelenideElement lastName = $(By.xpath("//input[@id='lastname']"));
    private SelenideElement userName = $(By.xpath("//input[@id='userName']"));
    private SelenideElement password = $(By.xpath("//input[@id='password']"));
    private SelenideElement register = $(By.xpath("//button[@id='register']"));

    @Step("Прокрутка страницы")
    public void skroleBody(){
        body.scrollIntoView(false);
    }
    @Step("Вход в пункт \"Login\"")
    public void inputBookStoreApplication (){
        bookStoreApplication.click();
        login.click();
    }
    @Step("Нажимание кнопки \"New User\"")
    public void newUser(){
        btnNewUser.click();
    }
    @Step("Ввод в поле \"First Name\"")
    public void inputFirstName(String first_name){
        firstName.val(first_name);
    }
    @Step("Ввод в поле \"Last Name\"")
    public void inputLastName(String last_name){
        lastName.val(last_name);
    }
    @Step("Ввод в поле \"User Name\"")
    public void inputUserName(String user_name) {
        userName.val(user_name);
    }
    @Step("Ввод в поле \"Password\"")
    public void inputPassword(String pass){
        password.val(pass);
    }
    @Step("нажатие кнопки \"Register\"")
    public void registerNewUser (){
        register.click();
    }
}
