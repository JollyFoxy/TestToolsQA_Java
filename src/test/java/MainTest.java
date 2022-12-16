import Steps.Forms;
import Steps.Register;
import Steps.TextBox;
import Steps.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainTest {
    private static String baseUrl ="https://demoqa.com/";

    TextBox textBox = new TextBox();
    Forms forms = new Forms();
    Register register= new Register();
    Register registerUser= new Register();
    Menu menu = new Menu();
    DatePicker datePicker = new DatePicker();


    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000;
        Configuration.browserSize = "1820x1180";
    }
    @BeforeEach
    public void before() {
        open(baseUrl);
    }

    @Test
    public void testElementsTextBox(){
        //Переход с домашней страницы на страницу "Text Box"
        textBox.inputTextBox();
        //Ввод имени в поле "Full Name" (Павел)
        textBox.inputFullName("Павел");
        //Ввод почты в поле "Email" (pavel@mial.com)
        textBox.inputEmail("pavel@mial.com");
        //Ввод адреса в поле "Current Address" (Пушкина 23)
        textBox.inputCurrentAddress("Пушкина 23");
        //Ввод адреса в поле "Permanent Address" (Советская 43)
        textBox.inputPermanentAddress("Советская 43");
        //Нажатие на кнопку "Submit"
        textBox.submit();
        //Проверка введенной информации
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
        forms.avatrUpload("/Users/pavel.mizirev/IdeaProjects/TestToolsQA/foxy.png");
        //Ввод адреса в поле "Address" (Пушкина 23)
        forms.inputAddress("Пушкина 23");
        //Нажатие кнопки "Submit"
        forms.submit();
        //Нажатие кнопки "Close"
        forms.closeWidow();
    }

    @Test
    public void testBookStoreApplicationRegister(){
        //Прокрутка домашней страницы вниз
        registerUser.skroleBody();
        //Перейти с домашней страницы на страницу "Login"
        registerUser.inputBookStoreApplication();
        //Нажатие кнопки "New User"
        registerUser.newUser();
        //Ввод в поле "First Name"(Павел)
        registerUser.inputFirstName("Павел");
        //Ввод в поле "Last Name"(Мизирев)
        registerUser.inputLastName("Мизирев");
        //Ввод в поле "User Name"(JellyFox)
        registerUser.inputUserName("JellyFox");
        //Ввод в поле "Password"(Qq-123456!)
        registerUser.inputPassword("Qq-123456!");
        //Нажатие на кнопку "Register"
        registerUser.registerNewUser();
    }


    @Test
    public void testWidgetsMenu(){
        //Переход с домашней страницы на страницу "Menu"
        menu.inputMenu();
        //Навестись на элемент "Main Item 2"
        menu.hoverMainItem2();
        //Навестись на элемент "SUB SUB LIST"
        menu.hoverSubList();
        //Навестись на элемент "Sub Sub Item 2"
        menu.hoverSubItem2();
    }

    @Test
    public void testWidgetsDatePicker(){
        //Переход с домашней страницы на страницу "Date Picker"
        datePicker.inputDatePicker();
        //Ввод в поле "Date And Time"(November 23 2009 16:20)
        datePicker.inputDate("November 23 2009 16:20","November 23, 2009 4:20 PM");
        //Ввод в поле "Date And Time"(15/03/2012/16:20)
        datePicker.inputDate("15/03/2012/16:20","");
        //Ввод в поле "Date And Time"(afafaaffaafafaffafaafaf)
        datePicker.inputDate("afafaaffaafafaffafaafaf","");
        //Ввод в поле "Date And Time"(??????????????????????????????????????????????????????????????????????????????????????????????????????????????????)
        datePicker.inputDate("??????????????????????????????????????????????????????????????????????????????????????????????????????????????????","");
    }
}
