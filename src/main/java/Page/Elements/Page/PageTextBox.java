package Page.Elements.Page;

import Persons.Person;
import io.qameta.allure.Step;
import tools.Elements.*;

public class PageTextBox {
    public final Transition transition = new Transition("Elements","Text Box");
    public final Input fulName = new Input("userName");
    public final Input eMail = new Input("userEmail");
    public final TextArea currentAddress = new TextArea("currentAddress");
    public final TextArea permanentAddress = new TextArea("permanentAddress");
    public final Button btnSubmit = new Button("submit");
    public final P checkName =new P("name");
    public final P checkEmail = new P("email");
    public final P checkCurrentAddress = new P("currentAddress");
    public final P checkPermanentAddress = new P("permanentAddress");


}