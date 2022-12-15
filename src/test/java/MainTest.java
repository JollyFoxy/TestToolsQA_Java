import Steps.Forms;
import Steps.Register;
import Steps.TextBox;
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
        register.skroleBody();
        //Перейти с домашней страницы на страницу "Login"
        register.inputBookStoreApplication();
        //Нажатие кнопки "New User"
        register.newUser();
        //Ввод в поле "First Name"(Павел)
        register.inputFirstName("Павел");
        //Ввод в поле "Last Name"(Мизирев)
        register.inputLastName("Мизирев");
        //Ввод в поле "User Name"(JellyFox)
        register.inputUserName("JellyFox");
        //Ввод в поле "Password"(Qq-123456!)
        register.inputPassword("Qq-123456!");
        //Нажатие на кнопку "Register"
        register.registerNewUser();
    }
}
