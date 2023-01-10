package Tests;

import Persons.Person;
import Steps.Elements.ElementDatePicker;
import Steps.Elements.ElementDroppable;
import Steps.Page.Forms.PageForms;
import Steps.Page.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainTest {
    private static final String baseUrl ="https://demoqa.com/";

    PageTextBox textBox = new PageTextBox();
    PageForms forms = new PageForms();
    PageRegister registerUser= new PageRegister();
    PageMenu menu = new PageMenu();
    ElementDatePicker datePicker = new ElementDatePicker();
    PageLogin loginPage = new PageLogin();
    ElementDroppable elementDroppable =new ElementDroppable();
    Person person =new Person("Павел","Мизирев",
            "JellyFox","Советская 43",
            "Пушкина 23","pavel@mial.com",
            "88005553535");

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
        textBox.inputFullName(person.getName());
        textBox.inputEmail(person.getEMail());
        textBox.inputCurrentAddress(person.getCurrentAddress());
        textBox.inputPermanentAddress(person.getPermanentAddress());
        textBox.submit();
        textBox.checkInfo();
    }

    @Test
    public void testFormsPracticeForm(){
        forms.transitionForms();
        forms.inputFirstName(person.getName());
        forms.inputLastName(person.getLastName());
        forms.inputEmail(person.getEMail());
        forms.inputGender();
        forms.inputNumber(person.getPhoneNumber());
        forms.inputDateOfBirth();
        forms.inputHobbies("Reading","Sports","");
        forms.avatarUpload();
        forms.inputAddress(person.getPermanentAddress());
        forms.submit();
        forms.closeWidow();
    }

    @Test
    public void testBookStoreApplicationRegister(){
        loginPage.skroleBody();
        loginPage.transitionBookStoreApplication();
        registerUser.newUser();
        registerUser.inputFirstName(person.getName());
        registerUser.inputLastName(person.getLastName());
        registerUser.inputUserName(person.getUserName());
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
        datePicker.inputDate("15/03/2012/16:20","January 1, 2023 12:00 AM");
        datePicker.inputDate("afafaaffaafafaffafaafaf","");
        datePicker.inputDate("???????????????????????????????????????????????","");
    }

    @Test
    public void testInteractionsDroppable(){
        elementDroppable.transitionDroppable();
        elementDroppable.drop();
    }
}