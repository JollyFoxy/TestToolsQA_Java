package Tests.Forms;

import Persons.IPerson;
import Tests.BaseTest;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;

@Feature("Forms")
public class TestPracticeFormPage extends BaseTest implements IPerson {
    @Test
    @Link(name = "Practice Form",url = "https://demoqa.com/automation-practice-form")
    @DisplayName("Тест заполнения формы")
    public void testFormsPracticeForm(){
        step1();
        step2(person.getName());
        step3(person.getLastName());
        step4(person.getEmail());
        step5("Male");
        step6(person.getPhoneNumber());
        step7("11.18.2002");
        step8("Reading","Sports","");
        step9();
        step10(person.getPermanentAddress());
        step11();
        step12();
    }
    @Step("Перейти с домашней страницы на страницу \"Student Registration Form\"")
    public void step1(){
        forms.transition.transitionAll();
    }
    @Step("Ввод имени в поле \"First Name\"")
    public void step2(String first_name) {
        forms.firstName.setValueInput(first_name);
    }
    @Step("Ввод фамилии в поле \"Last Name\"")
    public void step3(String last_name){
        forms.lastName.setValueInput(last_name);
    }
    @Step("Ввод почты в поле \"Email\"")
    public void step4(String email) {
        forms.userEmail.setValueInput(email);
    }
    @Step("Выбор гендера")
    public void step5(String gender){
        forms.inputGender(gender);
    }
    @Step("Ввод номера телефона в поле \"Mobile\"")
    public void step6(String number){
        forms.userNumber.setValueInput(number);
    }
    @Step("Ввод даты рождения")
    public void step7(String date) {
        forms.dateOfBirth.dateInput(date);
    }
    @Step("Выбор хобби")
    public void step8(String arg, String arg1, String arg2) {
        forms.inputHobbies(arg,arg1,arg2);
    }
    @Step("Загрузка аватара")
    public void step9(){
        forms.uploadPicture.uploadFileInput(forms.file);
    }
    @Step("Ввод адреса в поле \"Address\"")
    public void step10(String address ){
        forms.currentAddress.setValueTextArea(address);
    }

    @Step("Нажатие кнопки \"Submit\"")
    public void step11(){
        $(By.cssSelector("span.pr-1")).click();
        forms.scroll.scrollingForTact(3);
        forms.btnSubmit.clickBtn();
    }
    @Step("Нажатие кнопки \"Close\"")
    public void step12(){
        forms.closeLargeModal.clickBtn();
    }
}