package Page.Elements;

import Page.BasePage;
import io.qameta.allure.Step;
import tools.Elements.Button;
import tools.Elements.Input;
import tools.Elements.Transition;

public class PageWebTables extends BasePage {
    public final Transition transition =new Transition("Elements","Web Tables");
    public final Button btnAdd =new Button("addNewRecordButton");
    public final Input firstName = new Input("firstName");
    public final Input lastName = new Input("lastName");
    public final Input eMail = new  Input("userEmail");
    public final Input age = new Input("age");
    public final Input salary = new Input("salary");
    public final Input department = new Input("department");
    public final Button submit= new Button("submit");
    
}