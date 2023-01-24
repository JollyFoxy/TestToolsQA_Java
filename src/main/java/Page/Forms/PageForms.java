package Page.Forms;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Elements.*;

import java.io.File;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageForms {
    public File file =new File("foxy.png");
    public Transition transition=new Transition("Forms","Practice Form");
    public Input firstName = new Input("firstName");
    public Input lastName = new Input("lastName");
    public Input userEmail = new Input("userEmail");
    public ElementsCollection gender = $$("#genterWrapper label");
    public ElementsCollection hobbes = $$("#hobbiesWrapper label");
    public Input userNumber = new Input("userNumber");
    public Input dateOfBirth = new Input("dateOfBirthInput");
    public TextArea currentAddress = new TextArea("currentAddress");
    public Button btnSubmit = new Button("submit");
    public Button closeLargeModal =new Button("closeLargeModal");
    public Input uploadPicture = new Input("uploadPicture");
    public Scrolling scroll = new Scrolling("div.left-pannel");

//    @Step("Перейти с домашней страницы на страницу \"Student Registration Form\"")
//    public void transitionForms(){
//        transition.transitionAll();
//    }
//    @Step("Ввод имени в поле \"First Name\"")
//    public void inputFirstName(String first_name) {
//        firstName.setValueInput(first_name);
//    }
//    @Step("Ввод фамилии в поле \"Last Name\"")
//    public void inputLastName(String last_name){
//        lastName.setValueInput(last_name);
//    }
//    @Step("Ввод почты в поле \"Email\"")
//    public void inputEmail(String email) {
//        userEmail.setValueInput(email);
//    }
//    @Step("Выбор гендера")
    public void inputGender(String gender){
        this.gender.find(Condition.text(gender)).click();
    }
//    @Step("Ввод номера телефона в поле \"Mobile\"")
//    public void inputNumber(String number){
//        userNumber.setValueInput(number);
//    }
//    @Step("Ввод даты рождения")
//    public void inputDateOfBirth(String date) {
//        dateOfBirth.dateInput(date);
//    }
//    @Step("Выбор хобби")
    public void inputHobbies(String arg, String arg1, String arg2) {
        if (!Objects.equals(arg, ""))
            hobbes.find(Condition.text(arg)).click();
        if (!Objects.equals(arg1, ""))
            hobbes.find(Condition.text(arg1)).click();
        if (!Objects.equals(arg2, ""))
            hobbes.find(Condition.text(arg2)).click();
    }
//    @Step("Загрузка аватара")
//    public void avatarUpload(){
//        uploadPicture.uploadFileInput(file);
//    }
//    @Step("Ввод адреса в поле \"Address\"")
//    public void inputAddress(String address ){
//        currentAddress.setValueTextArea(address);
//    }
//
//    @Step("Нажатие кнопки \"Submit\"")
//    public void submit(){
//        $(By.cssSelector("span.pr-1")).click();
//        scroll.scrollingForTact(3);
//        btnSubmit.clickBtn();
//    }
//    @Step("Нажатие кнопки \"Close\"")
//    public void closeWidow(){
//        closeLargeModal.clickBtn();
//    }
}