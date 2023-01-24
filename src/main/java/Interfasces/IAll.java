package Interfasces;

import Page.BookStoreApplication.PageLogin;
import Page.BookStoreApplication.PageRegister;
import Page.Elements.Elements.ElementTimeButton;
import Page.Elements.Page.PageBase;
import Page.Elements.Page.PageButtons;
import Page.Elements.Page.PageTextBox;
import Page.Elements.Page.PageWebTables;
import Page.Forms.PageForms;
import Page.Interactions.ElementDroppable;
import Page.Widgets.Elements.ElementDatePicker;
import Page.Widgets.Page.PageMenu;

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