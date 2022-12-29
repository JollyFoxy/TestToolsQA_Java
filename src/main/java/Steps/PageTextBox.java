package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import tools.Button;
import tools.Input;
import tools.TextArea;

import static com.codeborne.selenide.Selenide.$;

public class PageTextBox {
    private final SelenideElement element = $(By.xpath("//div[@class='card-body']//h5[.='Elements']"));
    private final SelenideElement textBox = $(By.xpath("//div[@class='element-group']//li[@id='item-0']"));
    private final SelenideElement fulName = new Input("userName").getId();
    private final SelenideElement eMail = new Input("userEmail").getId();
    private final SelenideElement currentAddress = new TextArea("currentAddress").getId();
    private final SelenideElement permanentAddress = new TextArea("permanentAddress").getId();
    private final SelenideElement btnSubmit = new Button("submit").getId();
    private final SelenideElement checkName = $(By.xpath("//p[@id='name']"));
    private final SelenideElement checkEmail = $(By.xpath("//p[@id='email']"));
    private final SelenideElement checkCurrentAddress = $(By.xpath("//p[@id='currentAddress']"));
    private final SelenideElement checkPermanentAddress = $(By.xpath("//p[@id='permanentAddress']"));

    @Step("Перейти с домашней страницы на страницу \"Text Box\"")
    public void inputTextBox() {
        element.should(Condition.visible).click();
        textBox.should(Condition.visible).click();
    }
    @Step("Заполнить поле \"Full Name\"")
    public void inputFullName(String name){
        fulName.should(Condition.visible).val(name);
    }
    @Step("Заполнить поле \"Email\"")
    public void inputEmail(String email) {
        eMail.should(Condition.visible).val(email);
    }
    @Step("Зполнить поле \"Current Address\"")
    public void inputCurrentAddress(String address) {
        currentAddress.should(Condition.visible).val(address);
    }
    @Step("Зполнить поле \"Permanent Address\"")
    public void inputPermanentAddress(String address) {
        permanentAddress.should(Condition.visible).val(address);
    }
    @Step("Кликнуть на  кнопку \"Submit\"")
    public void submit(){
        btnSubmit.should(Condition.visible).click();
    }
    @Step("Атоматическая проверка введёной информации")
    public void checkInfo(){
        Assertions.assertEquals("Name:Павел", checkName.should(Condition.visible).getText());
        Assertions.assertEquals("Email:pavel@mial.com",checkEmail.should(Condition.visible).getText());
        Assertions.assertEquals("Current Address :Пушкина 23",checkCurrentAddress.should(Condition.visible).getText());
        Assertions.assertEquals("Permananet Address :Советская 43",checkPermanentAddress.should(Condition.visible).getText());
    }
}
