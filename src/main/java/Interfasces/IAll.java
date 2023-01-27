package Interfasces;

import Page.BookStoreApplication.PageLogin;
import Page.BookStoreApplication.PageRegister;
import Page.Elements.PageTimeButton;
import Page.Elements.PageBase;
import Page.Elements.PageButtons;
import Page.Elements.PageTextBox;
import Page.Elements.PageWebTables;
import Page.Elements.UploadAndDownload;
import Page.Forms.PageForms;
import Page.Home.HomePage;
import Page.Interactions.PageDroppable;
import Page.Widgets.PageDatePicker;
import Page.Widgets.PageMenu;

public interface IAll {
    PageDroppable elementDroppable =new PageDroppable();
    PageWebTables webTables= new PageWebTables();
    PageButtons pageButtons = new PageButtons();
    PageTextBox textBox = new PageTextBox();
    PageForms forms = new PageForms();
    PageRegister registerUser= new PageRegister();
    PageMenu menu = new PageMenu();
    PageDatePicker datePicker = new PageDatePicker();
    PageLogin loginPage = new PageLogin();
    PageBase pageBase = new PageBase();
    PageTimeButton elementTimeButton = new PageTimeButton();
    HomePage homePage = new HomePage();
    UploadAndDownload upDownload = new UploadAndDownload();
}