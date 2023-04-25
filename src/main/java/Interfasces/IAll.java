package Interfasces;

import Pages.BookStoreApplication.PageLogin;
import Pages.BookStoreApplication.PageRegister;
import Pages.Elements.*;
import Pages.Forms.PageForms;
import Pages.Interactions.PageDroppable;
import Pages.Widgets.PageDatePicker;
import Pages.Widgets.PageMenu;

public interface IAll {
    PageDroppable pageDroppable =new PageDroppable();
    PageWebTables pageWebTables= new PageWebTables();
    PageButtons pageButtons = new PageButtons();
    PageTextBox pageTextBox = new PageTextBox();
    PageForms pageForms = new PageForms();
    PageRegister pageRegisterUser= new PageRegister();
    PageMenu menu = new PageMenu();
    PageDatePicker datePicker = new PageDatePicker();
    PageLogin loginPage = new PageLogin();
    PageBase pageBase = new PageBase();
    PageTimeButton pageTimeButton = new PageTimeButton();
}