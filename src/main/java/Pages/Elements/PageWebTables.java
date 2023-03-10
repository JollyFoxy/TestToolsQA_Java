package Pages.Elements;

import Pages.BasePage;
import Utils.Elements.Button;
import Utils.Elements.Input;
import Utils.Elements.Transition;

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