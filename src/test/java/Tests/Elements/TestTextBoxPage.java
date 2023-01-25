package Tests.Elements;

import Persons.IPerson;
import Persons.Person;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Elements")
public class TestTextBoxPage extends BaseTest implements IPerson {
    @Test
    @Link(name = "Text Box", url = "https://demoqa.com/text-box")
    @DisplayName("Тест текстовых полей")
    public void testElementsTextBox() {
        textBox.transitionTextBox();
        textBox.inputFullName(person.getName());
        textBox.inputEmail(person.getEmail());
        textBox.inputCurrentAddress(person.getCurrentAddress());
        textBox.inputPermanentAddress(person.getPermanentAddress());
        textBox.submit();
        textBox.checkInfo(person);
    }

    @Step("Перейти с домашней страницы на страницу \"Text Box\"")
    public void step1() {
        textBox.transition.transitionAll();
    }

    @Step("Заполнить поле \"Full Name\"")
    public void step2(String name) {
        textBox.fulName.setValueInput(name);
    }

    @Step("Заполнить поле \"Email\"")
    public void step3(String email) {
        textBox.eMail.setValueInput(email);
    }

    @Step("Зполнить поле \"Current Address\"")
    public void inputCurrentAddress(String address) {
        textBox.currentAddress.setValueTextArea(address);
    }

    @Step("Зполнить поле \"Permanent Address\"")
    public void inputPermanentAddress(String address) {
        textBox.permanentAddress.setValueTextArea(address);
    }

    @Step("Кликнуть на  кнопку \"Submit\"")
    public void submit() {
        textBox.btnSubmit.clickBtn();
    }

    @Step("Проверка введёной информации")
    public void checkInfo(Person person) {
        textBox.checkName.checkTextP(person.getName());
        textBox.checkEmail.checkTextP(person.getEmail());
        textBox.checkCurrentAddress.checkTextP(person.getCurrentAddress());
        textBox.checkPermanentAddress.checkTextP(person.getPermanentAddress());
    }
}