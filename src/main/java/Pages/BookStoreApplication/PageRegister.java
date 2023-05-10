package Pages.BookStoreApplication;

import Pages.BasePage;
import Utils.Elements.Button;
import Utils.Elements.Input;
import io.qameta.allure.Step;

/**Страница Регистрации*/
public class PageRegister extends BasePage {

    private final Input firstName= new Input("firstname");
    private final Input lastName = new Input("lastname");
    private final Input userName = new Input("userName");
    private final Input password = new Input("password");
    private final Button register = new  Button("register");
    private final PageLogin pageLogin = new PageLogin();

    @Step("Вход в пункт \"Login\"")
    public void transition(){
        pageLogin.getBody().scrollToObject();
        pageLogin.getTransition().transitionAndScroll("div.left-pannel");
    }
    @Step("Нажимание кнопки \"New User\"")
    public void newUser(){
        pageLogin.getBtnNewUser().clickBtn();
    }
    @Step("Ввод в поле \"First Name\"")
    public void inputFirstName(String first_name){
        firstName.setValueInput(first_name);
    }
    @Step("Ввод в поле \"Last Name\"")
    public void inputLastName(String last_name){
        lastName.setValueInput(last_name);
    }
    @Step("Ввод в поле \"User Name\"")
    public void inputUserName(String user_name) {
        userName.setValueInput(user_name);
    }
    @Step("Ввод в поле \"Password\"")
    public void inputPassword(String pass){
        password.setValueInput(pass);
    }
    @Step("нажатие кнопки \"Register\"")
    public void inputRegister(){
        register.clickBtn();
    }
    @Step("Нажатие \"reСaptcha\"")
    public void reCaptcha(){
        captchaClick();
    }

}