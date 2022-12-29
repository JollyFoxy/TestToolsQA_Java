package Tests;

import Steps.Elements.ElementDatePicker;
import Steps.PageForms;
import Steps.PageRegister;
import Steps.PageTextBox;
import Steps.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainTest {
    private static String baseUrl ="https://demoqa.com/";

    PageTextBox textBox = new PageTextBox();
    PageForms forms = new PageForms();
    PageRegister registerUser= new PageRegister();
    PageMenu menu = new PageMenu();
    ElementDatePicker datePicker = new ElementDatePicker();
    PageLogin loginPage = new PageLogin();
    PageDroppable pageDroppable=new PageDroppable();


    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000;
        Configuration.browserSize = "1620x1080";
    }
    @BeforeEach
    public void before() {
        open(baseUrl);
    }

    @Test
    public void testElementsTextBox(){
        textBox.transitionTextBox();
        textBox.inputFullName("Павел");
        textBox.inputEmail("pavel@mial.com");
        textBox.inputCurrentAddress("Пушкина 23");
        textBox.inputPermanentAddress("Советская 43");
        textBox.submit();
        textBox.checkInfo();
    }

    @Test
    public void testFormsPracticeForm(){
        forms.transitionForms();
        forms.inputFirstName("Павел");
        forms.inputLastName("Мизирев");
        forms.inputEmail("pavel@mial.com");
        forms.inputGender();
        forms.inputNumber("88005553535");
        forms.inputDateOfBirth();
        forms.inputHobbies();
        forms.avatarUpload();
        forms.inputAddress("Пушкина 23");
        forms.submit();
        forms.closeWidow();
    }

    @Test
    public void testBookStoreApplicationRegister(){
        loginPage.skroleBody();
        loginPage.transitionBookStoreApplication();
        registerUser.newUser();
        registerUser.inputFirstName("Павел");
        registerUser.inputLastName("Мизирев");
        registerUser.inputUserName("JellyFox");
        registerUser.inputPassword("Qq-123456!");
        registerUser.registerNewUser();
    }


    @Test
    public void testWidgetsMenu(){
        menu.transitionMenu();
        menu.hoverMainItem2();
        menu.hoverSubList();
        menu.hoverSubItem2();
    }

    @Test
    public void testWidgetsDatePicker(){
        datePicker.transitionDatePicker();
        datePicker.inputDate("November 23 2009 16:20","November 23, 2009 4:20 PM");
        datePicker.inputDate("15/03/2012/16:20","January 1, 2022 12:00 AM");
        datePicker.inputDate("afafaaffaafafaffafaafaf","");
        datePicker.inputDate("??????????????????????????????????????????????????????????????????????????????????????????????????????????????????","");
    }

    @Test
    public void testInteractionsDroppable(){
        pageDroppable.transitionDroppable();
        pageDroppable.drop();
    }
}