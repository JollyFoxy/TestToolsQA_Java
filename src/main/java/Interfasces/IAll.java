package Interfasces;

import Steps.Elements.Page.PageWebTables;
import Steps.Widgets.Elements.ElementDatePicker;
import Steps.Interactions.ElementDroppable;
import Steps.Elements.Elements.ElementTimeButton;
import Steps.BookStoreApplication.*;
import Steps.Elements.Page.PageBase;
import Steps.Elements.Page.PageButtons;
import Steps.Elements.Page.PageTextBox;
import Steps.Forms.PageForms;
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

}