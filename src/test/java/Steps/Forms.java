package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Forms {

    private SelenideElement forms = $(By.xpath("//div[@class='card-body']//h5[.='Forms']"));
    private SelenideElement registrationForm = $(By.xpath("//div[@class='element-group']//li[@id='item-0']//span[.='Practice Form']"));
    private SelenideElement firstName = $(By.xpath("//input[@id='firstName']"));
    private SelenideElement lastName = $(By.xpath("//input[@id='lastName']"));
    private SelenideElement userEmail = $(By.xpath("//input[@id='userEmail']"));
    private SelenideElement genderMale = $(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//label[.='Male']"));
    private SelenideElement genderFemale = $(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//label[.='Female']"));
    private SelenideElement genderOther = $(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//label[.='Other']"));
    private SelenideElement userNumber = $(By.xpath("//input[@id='userNumber']"));
    private SelenideElement dateOfBirth = $(By.xpath("//input[@id='dateOfBirthInput']"));
    private SelenideElement monthSelect = $(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement november = $(By.xpath("//option[@value='10']"));
    private SelenideElement yearSelect = $(By.xpath("//select[@class='react-datepicker__year-select']"));
    private SelenideElement year2002 = $(By.xpath("//option[@value='2002']"));
    private SelenideElement date_18_11_2002 = $(By.xpath("//div[@aria-label='Choose Monday, November 18th, 2002']"));
    private SelenideElement hobbiesMusic = $(By.xpath("//label[.='Music']"));
    private SelenideElement hobbiesSports = $(By.xpath("//label[.='Sports']"));
    private SelenideElement hobbiesReading = $(By.xpath("//label[.='Reading']"));
    private SelenideElement currentAddress = $(By.xpath("//textarea[@id='currentAddress']"));
    private SelenideElement state = $(By.xpath("//div[@id='state']"));
    private SelenideElement btnSubmit = $(By.xpath("//button[@id='submit']"));
    private SelenideElement closeLargeModal =$(By.xpath("//button[@id='closeLargeModal']"));
    private SelenideElement uploadPicture = $(By.xpath("//input[@id='uploadPicture']"));

    @Step("Перейти с домашней страницы на страницу \"Student Registration Form\"")
    public void inputForms (){
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
    public void inputGender(String gender){
        switch (gender){
            case "Male": genderMale.click();
                break;
            case "Female": genderFemale.click();
                break;
            case "Other": genderOther.click();
                break;
        }
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
    @Step("Выбор хобби")
    public void inputHobbies(String hobbies) {
        switch (hobbies){
            case("Sports"):
                hobbiesSports.click();
                break;
            case ("Reading"):
                hobbiesReading.click();
                break;
            case ("Music"):
                hobbiesMusic.click();
                break;
            case ("Sports & Reading"):
                hobbiesSports.click();
                hobbiesReading.click();
                break;
            case ("Sports & Music"):
                hobbiesSports.click();
                hobbiesMusic.click();
                break;
            case ("Reading & Music"):
                hobbiesReading.click();
                hobbiesMusic.click();
                break;
            case ("Sports & Reading & Music"):
                hobbiesSports.click();
                hobbiesReading.click();
                hobbiesMusic.click();
        }
    }
    @Step("Загрузка аватара")
    public void avatrUpload(String way){
        switch (way){
            case ("Тех"):way="C:\\Users\\инет\\IdeaProjects\\TestToolsQA\\foxy.png";
            break;
            case ("Дом"):way="/Users/pavel.mizirev/IdeaProjects/TestToolsQA/foxy.png";
        }
        uploadPicture.val(way);
    }
    @Step("Ввод адреса в поле \"Address\"")
    public void inputAddress(String address ){
        currentAddress.val(address);
    }

    @Step("Нажатие кнопки \"Submit\"")
    public void submit(){
        btnSubmit.click();
    }
    @Step("Нажатие кнопки \"Close\"")
    public void closeWidow(){
        closeLargeModal.click();
    }
}
