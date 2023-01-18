package Interfasces;

import Steps.Elements.ElementDatePicker;
import Steps.Elements.ElementDroppable;
import Steps.Elements.ElementTimeButton;
import Steps.Page.*;

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