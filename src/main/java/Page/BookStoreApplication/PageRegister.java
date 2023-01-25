package Page.BookStoreApplication;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Elements.Button;
import tools.Elements.Input;

import static com.codeborne.selenide.Selenide.$;

public class PageRegister {

    public final Button btnNewUser = new Button("newUser");
    public final Input firstName= new Input("firstname");
    public final Input lastName = new Input("lastname");
    public final Input userName = new Input("userName");
    public final Input password = new Input("password");
    public final Button register = new  Button("register");
    @Step
    public void captchaClick(){
       $(By.xpath("//iframe[starts-with(@name, 'a-') and " +
               "starts-with(@src, 'https://www.google.com/recaptcha')]")).click();

    }
}