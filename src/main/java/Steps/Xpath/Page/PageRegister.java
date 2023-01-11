package Steps.Xpath.Page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import Steps.tools.Button;
import Steps.tools.Input;

public class PageRegister {

    private final Button btnNewUser = new Button("newUser");
    private final Input firstName= new Input("firstname");
    private final Input lastName = new Input("lastname");
    private final Input userName = new Input("userName");
    private final Input password = new Input("password");
    private final Button register = new  Button("register");


    @Step("Нажимание кнопки \"New User\"")
    public void newUser(){
        btnNewUser.click();
    }
    @Step("Ввод в поле \"First Name\"")
    public void inputFirstName(String first_name){
        firstName.setValue(first_name);
    }
    @Step("Ввод в поле \"Last Name\"")
    public void inputLastName(String last_name){
        lastName.setValue(last_name);
    }
    @Step("Ввод в поле \"User Name\"")
    public void inputUserName(String user_name) {
        userName.setValue(user_name);
    }
    @Step("Ввод в поле \"Password\"")
    public void inputPassword(String pass){
        password.setValue(pass);
    }
    @Step("нажатие кнопки \"Register\"")
    public void registerNewUser (){
        register.click();
    }
}
