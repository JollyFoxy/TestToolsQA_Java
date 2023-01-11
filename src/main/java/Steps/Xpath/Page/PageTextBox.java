package Steps.Xpath.Page;

import Persons.Person;
import Steps.tools.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class PageTextBox {
    private final SelenideElement element =  $(By.xpath("//div[@class='card-body']//h5[.='Elements']"));
    private final SelenideElement textBox = $(By.xpath("//div[@class='element-group']//span[.='Text Box']"));
    private final Input fulName = new Input("userName");
    private final Input eMail = new Input("userEmail");
    private final TextArea currentAddress = new TextArea("currentAddress");
    private final TextArea permanentAddress = new TextArea("permanentAddress");
    private final Button btnSubmit = new Button("submit");
    private final P checkName =new P("name");
    private final P checkEmail = new P("email");
    private final P checkCurrentAddress = new P("currentAddress");
    private final P checkPermanentAddress = new P("permanentAddress");

    @Step("Перейти с домашней страницы на страницу \"Text Box\"")
    public void transitionTextBox() {
        element.should(Condition.visible).click();
        textBox.should(Condition.visible).click();

    }
    @Step("Заполнить поле \"Full Name\"")
    public void inputFullName(String name){
        fulName.setValue(name);
    }
    @Step("Заполнить поле \"Email\"")
    public void inputEmail(String email) {
        eMail.setValue(email);
    }
    @Step("Зполнить поле \"Current Address\"")
    public void inputCurrentAddress(String address) {
        currentAddress.setValue(address);
    }
    @Step("Зполнить поле \"Permanent Address\"")
    public void inputPermanentAddress(String address) {
        permanentAddress.setValue(address);
    }
    @Step("Кликнуть на  кнопку \"Submit\"")
    public void submit(){
        btnSubmit.click();
    }
    @Step("Проверка введёной информации")
    public void checkInfo(Person person){
        checkName.checkText(person.getName());
        checkEmail.checkText(person.getEmail());
        checkCurrentAddress.checkText(person.getCurrentAddress());
        checkPermanentAddress.checkText(person.getPermanentAddress());
    }
}
