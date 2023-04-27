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
    public void step1_Transition(){
        pageLogin.getBody().scrollToObject();
        pageLogin.getTransition().transitionAndScroll("div.left-pannel");
    }
    @Step("Нажимание кнопки \"New User\"")
    public void step2_NewUser(){
        pageLogin.getBtnNewUser().clickBtn();
    }
    @Step("Ввод в поле \"First Name\"")
    public void step3_InputFirstName(String first_name){
        firstName.setValueInput(first_name);
    }
    @Step("Ввод в поле \"Last Name\"")
    public void step4_InputLastName(String last_name){
        lastName.setValueInput(last_name);
    }
    @Step("Ввод в поле \"User Name\"")
    public void step5_InputUserName(String user_name) {
        userName.setValueInput(user_name);
    }
    @Step("Ввод в поле \"Password\"")
    public void step6_InputPassword(String pass){
        password.setValueInput(pass);
    }
    @Step("нажатие кнопки \"Register\"")
    public void step7_InputRegister(){
        register.clickBtn();
    }
    @Step("Нажатие \"reСaptcha\"")
    public void step8_reCaptcha(){
        captchaClick();
    }

}