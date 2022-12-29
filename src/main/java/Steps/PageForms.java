package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Button;
import tools.Input;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class PageForms {
    File file =new File("foxy.png");
    private final SelenideElement forms = $(By.xpath("//div[@class='card-body']//h5[.='Forms']"));
    private final SelenideElement registrationForm = $(By.xpath("//div[@class='element-group']//li[@id='item-0']//span[.='Practice Form']"));
    private final SelenideElement firstName = new Input("firstName").getId();
    private final SelenideElement lastName = new Input("lastName").getId();
    private final SelenideElement userEmail = new Input("userEmail").getId();
    private final SelenideElement genderMale = $(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//label[.='Male']"));
    private final SelenideElement userNumber = new Input("userNumber").getId();
    private final SelenideElement dateOfBirth = new  Input("dateOfBirthInput").getId();
    private final SelenideElement monthSelect = $(By.xpath("//select[@class='react-datepicker__month-select']"));
    private final SelenideElement november = $(By.xpath("//option[@value='10']"));
    private final SelenideElement yearSelect = $(By.xpath("//select[@class='react-datepicker__year-select']"));
    private final SelenideElement year2002 = $(By.xpath("//option[@value='2002']"));
    private final SelenideElement date_18_11_2002 = $(By.xpath("//div[@aria-label='Choose Monday, November 18th, 2002']"));
    private final SelenideElement hobbiesMusic = $(By.xpath("//label[.='Music']"));
    private final SelenideElement currentAddress = $(By.xpath("//textarea[@id='currentAddress']"));
    private final SelenideElement btnSubmit = new Button("submit").getId();
    private final SelenideElement closeLargeModal =$(By.xpath("//button[@id='closeLargeModal']"));
    private final SelenideElement uploadPicture = new Input("uploadPicture").getId();
    private final SelenideElement element = $(By.xpath("//span[@class='pr-1']"));
    private final SelenideElement scroll = $(By.xpath("//div[@class='left-pannel']"));

    @Step("Перейти с домашней страницы на страницу \"Student Registration Form\"")
    public void transitionForms(){
        forms.should(Condition.visible).click();
        registrationForm.should(Condition.visible).click();
    }
    @Step("Ввод имени в поле \"First Name\"")
    public void inputFirstName(String first_name) {
        firstName.val(first_name);
    }
    @Step("Ввод фамилии в поле \"Last Name\"")
    public void inputLastName(String last_name){
        lastName.val(last_name);
    }
    @Step("Ввод почты в поле \"Email\"")
    public void inputEmail(String email) {
        userEmail.val(email);
    }
    @Step("Выбор гендера")
    public void inputGender(){
        genderMale.click();
    }
    @Step("Ввод номера телефона в поле \"Mobile\"")
    public void inputNumber(String number){
        userNumber.val(number);
    }
    @Step("Выбор даты рождения (18/11/2002)")
    public void inputDateOfBirth() {
        dateOfBirth.click();
        monthSelect.click();
        november.click();
        yearSelect.click();
        year2002.click();
        date_18_11_2002.click();
    }
    @Step("Выбор хобби\"Music\"")
    public void inputHobbies() {
        hobbiesMusic.click();
    }
    @Step("Загрузка аватара")
    public void avatarUpload(){
        uploadPicture.uploadFile(file);
    }
    @Step("Ввод адреса в поле \"Address\"")
    public void inputAddress(String address ){
        currentAddress.val(address);
    }

    @Step("Нажатие кнопки \"Submit\"")
    public void submit(){
        element.click();
        scroll.scrollTo();
        scroll.scrollTo();
        btnSubmit.should(Condition.visible).click();
    }
    @Step("Нажатие кнопки \"Close\"")
    public void closeWidow(){
        closeLargeModal.click();
    }
}
