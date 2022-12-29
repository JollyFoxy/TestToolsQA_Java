package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Value;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Value
public class Forms {
    SelenideElement forms = $(By.xpath("//div[@class='card-body']//h5[.='Forms']"));
    SelenideElement registrationForm = $(By.xpath("//div[@class='element-group']//li[@id='item-0']//span[.='Practice Form']"));
    SelenideElement firstName = $(By.xpath("//input[@id='firstName']"));
    SelenideElement lastName = $(By.xpath("//input[@id='lastName']"));
    SelenideElement userEmail = $(By.xpath("//input[@id='userEmail']"));
    SelenideElement genderMale = $(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//label[.='Male']"));
    SelenideElement genderFemale = $(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//label[.='Female']"));
    SelenideElement genderOther = $(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//label[.='Other']"));
    SelenideElement userNumber = $(By.xpath("//input[@id='userNumber']"));
    SelenideElement dateOfBirth = $(By.xpath("//input[@id='dateOfBirthInput']"));
    SelenideElement monthSelect = $(By.xpath("//select[@class='react-datepicker__month-select']"));
    SelenideElement november = $(By.xpath("//option[@value='10']"));
    SelenideElement yearSelect = $(By.xpath("//select[@class='react-datepicker__year-select']"));
    SelenideElement year2002 = $(By.xpath("//option[@value='2002']"));
    SelenideElement date_18_11_2002 = $(By.xpath("//div[@aria-label='Choose Monday, November 18th, 2002']"));
    SelenideElement hobbiesMusic = $(By.xpath("//label[.='Music']"));
    SelenideElement hobbiesSports = $(By.xpath("//label[.='Sports']"));
    SelenideElement hobbiesReading = $(By.xpath("//label[.='Reading']"));
    SelenideElement currentAddress = $(By.xpath("//textarea[@id='currentAddress']"));
    SelenideElement btnSubmit = $(By.xpath("//button[@id='submit']"));
    SelenideElement closeLargeModal =$(By.xpath("//button[@id='closeLargeModal']"));
    SelenideElement uploadPicture = $(By.xpath("//input[@id='uploadPicture']"));
    SelenideElement element = $(By.xpath("//span[@class='pr-1']"));
    SelenideElement scrole = $(By.xpath("//div[@class='left-pannel']"));

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
        //Выбор просто для удобства работы на двух компьютеров
        switch (way){
            case ("Тех"):way="C:\\Users\\инет\\IdeaProjects\\TestToolsQA\\foxy.png";
            break;
            case ("Дом"):way="/Users/pavel.mizirev/IdeaProjects/TestToolsQA/foxy.png";
            break;
            case ("Офис"):way="/home/pavel/IdeaProjects/TestToolsQA/foxy.png";
        }
        uploadPicture.val(way);
    }
    @Step("Ввод адреса в пол    е \"Address\"")
    public void inputAddress(String address ){
        currentAddress.val(address);
    }

    @Step("Нажатие кнопки \"Submit\"")
    public void submit(){
        element.click();
        scrole.scrollTo();
        btnSubmit.should(Condition.visible).click();
    }
    @Step("Нажатие кнопки \"Close\"")
    public void closeWidow(){
        closeLargeModal.click();
    }
}
