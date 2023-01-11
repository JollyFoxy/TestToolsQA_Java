package Interfasces;

import Steps.Xpath.Page.*;
import Steps.Xpath.Elements.ElementDatePicker;
import Steps.css.cssElement.ElementDroppable;
import Steps.css.cssPage.PageButtons;
import Steps.css.cssPage.PageWebTables;

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


}
