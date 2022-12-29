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
        textBox.inputTextBox();
        textBox.inputFullName("Павел");
        textBox.inputEmail("pavel@mial.com");
        textBox.inputCurrentAddress("Пушкина 23");
        textBox.inputPermanentAddress("Советская 43");
        textBox.submit();
        textBox.checkInfo();
    }

    @Test
    public void testFormsPracticeForm(){
        //Переход с домашней страницы на страницу "Student Registration Form"
        forms.inputForms();
        //Ввод имени в поле "First Name"(Павел)
        forms.inputFirstName("Павел");
        //Ввод фамилии в поле "Last Name"(Мизирев)
        forms.inputLastName("Мизирев");
        //Ввод почты в поле "Email" (pavel@mial.com)
        forms.inputEmail("pavel@mial.com");
        //Выбор гендера (Male)
        forms.inputGender("Male");
        //Ввод номера телефона в поле "Mobile" (88005553535)
        forms.inputNumber("88005553535");
        //Выбор даты рождения (18/11/2002)
        forms.inputDateOfBirth();
        //Выбор хобби (Music)
        forms.inputHobbies("Music");
        //Загрузка аватара (foxy.png)
        //Требуеться указать полный путь к файлу
        forms.avatarUpload();
        //Ввод адреса в поле "Address" (Пушкина 23)
        forms.inputAddress("Пушкина 23");
        //Нажатие кнопки "Submit"
        forms.submit();
        //Нажатие кнопки "Close"
        forms.closeWidow();
    }

    @Test
    public void testBookStoreApplicationRegister(){
        loginPage.skroleBody();
        loginPage.inputBookStoreApplication();
        registerUser.newUser();
        registerUser.inputFirstName("Павел");
        registerUser.inputLastName("Мизирев");
        registerUser.inputUserName("JellyFox");
        registerUser.inputPassword("Qq-123456!");
        registerUser.registerNewUser();
    }


    @Test
    public void testWidgetsMenu(){
        menu.inputMenu();
        menu.hoverMainItem2();
        menu.hoverSubList();
        menu.hoverSubItem2();
    }

    @Test
    public void testWidgetsDatePicker(){
        datePicker.inputDatePicker();
        datePicker.inputDate("November 23 2009 16:20","November 23, 2009 4:20 PM");
        datePicker.inputDate("15/03/2012/16:20","January 1, 2022 12:00 AM");
        datePicker.inputDate("afafaaffaafafaffafaafaf","");
        datePicker.inputDate("??????????????????????????????????????????????????????????????????????????????????????????????????????????????????","");
    }
}