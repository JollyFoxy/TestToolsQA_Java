package Steps.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Button;
import tools.Input;
import tools.Transition;

import java.io.File;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageForms {
    File file =new File("foxy.png");
    private final Transition transition=new Transition("Forms","Practice Form");
    private final Input firstName = new Input("firstName");
    private final Input lastName = new Input("lastName");
    private final Input userEmail = new Input("userEmail");
    private final ElementsCollection gender = $$("#genterWrapper label");
    private final ElementsCollection hobbes = $$("#hobbiesWrapper label");
    private final Input userNumber = new Input("userNumber");
    private final Input dateOfBirth = new Input("dateOfBirthInput");
    private final SelenideElement currentAddress = $(By.xpath("//textarea[@id='currentAddress']"));
    private final Button btnSubmit = new Button("submit");
    private final Button closeLargeModal =new Button("closeLargeModal");
    private final Input uploadPicture = new Input("uploadPicture");
    private final SelenideElement element = $(By.xpath("//span[@class='pr-1']"));
    private final SelenideElement scroll = $(By.xpath("//div[@class='left-pannel']"));

    @Step("Перейти с домашней страницы на страницу \"Student Registration Form\"")
    public void transitionForms(){
        transition.transitionAll();
    }
    @Step("Ввод имени в поле \"First Name\"")
    public void inputFirstName(String first_name) {
        firstName.setValueInput(first_name);
    }
    @Step("Ввод фамилии в поле \"Last Name\"")
    public void inputLastName(String last_name){
        lastName.setValueInput(last_name);
    }
    @Step("Ввод почты в поле \"Email\"")
    public void inputEmail(String email) {
        userEmail.setValueInput(email);
    }
    @Step("Выбор гендера")
    public void inputGender(String gender){
        this.gender.find(Condition.text(gender)).click();
    }
    @Step("Ввод номера телефона в поле \"Mobile\"")
    public void inputNumber(String number){
        userNumber.setValueInput(number);
    }
    @Step("Ввод даты рождения")
    public void inputDateOfBirth(String date) {
        dateOfBirth.dateInput(date);
    }
    @Step("Выбор хобби")
    public void inputHobbies(String arg, String arg1, String arg2) {
        if (!Objects.equals(arg, ""))
            hobbes.find(Condition.text(arg)).click();
        if (!Objects.equals(arg1, ""))
            hobbes.find(Condition.text(arg1)).click();
        if (!Objects.equals(arg2, ""))
            hobbes.find(Condition.text(arg2)).click();
    }
    @Step("Загрузка аватара")
    public void avatarUpload(){
        uploadPicture.uploadFileInput(file);
    }
    @Step("Ввод адреса в поле \"Address\"")
    public void inputAddress(String address ){
        currentAddress.val(address);
    }

    @Step("Нажатие кнопки \"Submit\"")
    public void submit(){
        element.click();
        scroll.scrollTo();
        scroll.scrollIntoView(true);
        scroll.scrollTo();
        btnSubmit.clickBtn();
    }
    @Step("Нажатие кнопки \"Close\"")
    public void closeWidow(){
        closeLargeModal.clickBtn();
    }
}