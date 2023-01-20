package Interfasces;

import Steps.BookStoreApplication.PageLogin;
import Steps.BookStoreApplication.PageRegister;
import Steps.Elements.Elements.ElementTimeButton;
import Steps.Elements.Page.PageBase;
import Steps.Elements.Page.PageButtons;
import Steps.Elements.Page.PageTextBox;
import Steps.Elements.Page.PageWebTables;
import Steps.Forms.PageForms;
import Steps.Interactions.ElementDroppable;
import Steps.Widgets.Elements.ElementDatePicker;
import Steps.Widgets.Page.PageMenu;

public interface IAll {
    ElementDroppable elementDroppable =new ElementDroppable();
    PageWebTables webTables= new PageWebTables();
    PageButtons pageButtons = new PageButtons();
    PageTextBox textBox = new PageTextBox();
    PageForms forms = new PageForms();
    PageRegister registerUser= new PageRegister();
    PageMenu menu = new PageMenu();
    ElementDatePicker datePicker = new ElementDatePicker();
    PageLogin loginPage = new PageLogin();
    PageBase pageBase = new PageBase();
    ElementTimeButton elementTimeButton = new ElementTimeButton();
    String baseUrl ="https://demoqa.com/";
}