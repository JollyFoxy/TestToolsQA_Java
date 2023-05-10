package Pages.Forms;

import Pages.BasePage;
import Utils.Elements.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.File;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Страница Регистрационной формы
 */
public class PageForms extends BasePage {
    private final File file = new File("foxy.png");
    private final Transition transition = new Transition("Forms", "Practice Form");
    private final Input firstName = new Input("firstName");
    private final Input lastName = new Input("lastName");
    private final Input userEmail = new Input("userEmail");
    private final ElementsCollection gender = $$("#genterWrapper label");
    private final ElementsCollection hobbes = $$("#hobbiesWrapper label");
    private final Input userNumber = new Input("userNumber");
    private final Input dateOfBirth = new Input("dateOfBirthInput");
    private final TextArea currentAddress = new TextArea("currentAddress");
    private final Button btnSubmit = new Button("submit");
    private final Button closeLargeModal = new Button("closeLargeModal");
    private final Input uploadPicture = new Input("uploadPicture");
    private final Scrolling scroll = new Scrolling("div.left-pannel");

    private void inputGender(String gender) {
        this.gender.find(Condition.text(gender)).click();
    }

    private void hobbies(String arg, String arg1, String arg2) {
        if (!Objects.equals(arg, ""))
            hobbes.find(Condition.text(arg)).click();
        if (!Objects.equals(arg1, ""))
            hobbes.find(Condition.text(arg1)).click();
        if (!Objects.equals(arg2, ""))
            hobbes.find(Condition.text(arg2)).click();
    }

    @Step("Перейти с домашней страницы на страницу \"Student Registration Form\"")
    public void transition() {
        transition.transitionAll();
    }

    @Step("Ввод имени в поле \"First Name\"")
    public void inputFirstName(String first_name) {
        firstName.setValueInput(first_name);
    }

    @Step("Ввод фамилии в поле \"Last Name\"")
    public void inputLastName(String last_name) {
        lastName.setValueInput(last_name);
    }

    @Step("Ввод почты в поле \"Email\"")
    public void inputEmail(String email) {
        userEmail.setValueInput(email);
    }

    @Step("Выбор гендера")
    public void gender(String gender) {
        inputGender(gender);
    }

    @Step("Ввод номера телефона в поле \"Mobile\"")
    public void inputPhoneNumber(String number) {
        userNumber.setValueInput(number);
    }

    @Step("Ввод даты рождения")
    public void inputDateOfBirth(String date) {
        dateOfBirth.dateInput(date);
    }

    @Step("Выбор хобби")
    public void inputHobbies(String arg, String arg1, String arg2) {
        hobbies(arg, arg1, arg2);
    }

    @Step("Загрузка аватара")
    public void avatar() {
        uploadPicture.uploadFileInput(file);
    }

    @Step("Ввод адреса в поле \"Address\"")
    public void inputAddress(String address) {
        currentAddress.setValueTextArea(address);
    }

    @Step("Нажатие кнопки \"Submit\"")
    public void submit() {
        $(By.cssSelector("span.pr-1")).click();
        scroll.scrollingForTact(4);
        btnSubmit.clickBtn();
    }

    @Step("Нажатие кнопки \"Close\"")
    public void close() {
        closeLargeModal.clickBtn();
    }
}