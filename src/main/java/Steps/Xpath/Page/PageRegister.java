package Steps.Xpath.Page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import Steps.tools.Button;
import Steps.tools.Input;

public class PageRegister {

    private final SelenideElement btnNewUser = Button.getButton("newUser");
    private final SelenideElement firstName= Input.getXpathInput("firstname");
    private final SelenideElement lastName = Input.getXpathInput("lastname");
    private final SelenideElement userName = Input.getXpathInput("userName");
    private final SelenideElement password = Input.getXpathInput("password");
    private final SelenideElement register = Button.getButton("register");


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
