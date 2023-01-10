package Tests;

import Persons.Person;
import Steps.Xpath.Elements.ElementDatePicker;
import Steps.Xpath.Page.Forms.PageForms;
import Steps.Xpath.Page.PageLogin;
import Steps.Xpath.Page.PageMenu;
import Steps.Xpath.Page.PageRegister;
import Steps.Xpath.Page.PageTextBox;
import Steps.css.cssElement.ElementDroppable;
import Steps.css.cssPage.PageButtons;
import Steps.css.cssPage.PageWebTables;
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
    PageWebTables webTables= new PageWebTables();
    PageButtons pageButtons = new PageButtons();
    Person person =new Person("Павел","Мизирев",
            "JellyFox","Советская 43",
            "Пушкина 23","pavel@mial.com",
            "88005553535",20);

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
        textBox.inputEmail(person.getEmail());
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
        forms.inputEmail(person.getEmail());
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
    public void testWebTables(){
        webTables.transitionElements();
        webTables.addUser();
        webTables.inputFirstUserName(person.getName());
        webTables.inputLastUserName(person.getLastName());
        webTables.inputUserEmail(person.getEmail());
        webTables.inputUserAge(person.getAge());
        webTables.inputSalary(20000);
        webTables.inputDepartment("AAAaaaa");
        webTables.submit();
    }
    @Test
    public void testDrop(){
        elementDroppable.transitionDroppable();
        elementDroppable.drop();
    }
    @Test
    public void testButtons(){
        pageButtons.inputBtn();
        pageButtons.oneClick();
        pageButtons.doubleClick();
        pageButtons.rightClick();
    }
}