package Interfasces;

import Pages.BookStoreApplication.PageLogin;
import Pages.BookStoreApplication.PageRegister;
import Pages.Elements.*;
import Pages.Forms.PageForms;
import Pages.Home.HomePage;
import Pages.Interactions.PageDroppable;
import Pages.Widgets.PageDatePicker;
import Pages.Widgets.PageMenu;

public interface IAll {
    PageDroppable pageDroppable =new PageDroppable();
    PageWebTables webTables= new PageWebTables();
    PageButtons pageButtons = new PageButtons();
    PageTextBox textBox = new PageTextBox();
    PageForms forms = new PageForms();
    PageRegister registerUser= new PageRegister();
    PageMenu menu = new PageMenu();
    PageDatePicker datePicker = new PageDatePicker();
    PageLogin loginPage = new PageLogin();
    PageBase pageBase = new PageBase();
    PageTimeButton pageTimeButton = new PageTimeButton();
    HomePage homePage = new HomePage();
}