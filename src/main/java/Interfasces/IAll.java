package Interfasces;

import Page.BookStoreApplication.PageLogin;
import Page.BookStoreApplication.PageRegister;
import Page.Elements.ElementTimeButton;
import Page.Elements.PageBase;
import Page.Elements.PageButtons;
import Page.Elements.PageTextBox;
import Page.Elements.PageWebTables;
import Page.Elements.UploadAndDownload;
import Page.Forms.PageForms;
import Page.Home.HomePage;
import Page.Interactions.ElementDroppable;
import Page.Widgets.ElementDatePicker;
import Page.Widgets.PageMenu;

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
    HomePage homePage = new HomePage();
    UploadAndDownload upDownload = new UploadAndDownload();
}