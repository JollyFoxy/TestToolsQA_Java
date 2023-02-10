package Pages.BookStoreApplication;

import Pages.BasePage;
import tools.Elements.Button;
import tools.Elements.Input;

public class PageRegister extends BasePage {

    public final Button btnNewUser = new Button("newUser");
    public final Input firstName= new Input("firstname");
    public final Input lastName = new Input("lastname");
    public final Input userName = new Input("userName");
    public final Input password = new Input("password");
    public final Button register = new  Button("register");

}