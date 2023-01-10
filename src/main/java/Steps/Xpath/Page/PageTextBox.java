package Steps.Xpath.Page;

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
    private final SelenideElement fulName = Input.getXpathInput("userName");
    private final SelenideElement eMail = Input.getXpathInput("userEmail");
    private final SelenideElement currentAddress = TextArea.getTextarea("currentAddress");
    private final SelenideElement permanentAddress = TextArea.getTextarea("permanentAddress");
    private final SelenideElement btnSubmit = Button.getButton("submit");
    private final SelenideElement checkName = $(By.xpath("//p[@id='name']"));
    private final SelenideElement checkEmail = $(By.xpath("//p[@id='email']"));
    private final SelenideElement checkCurrentAddress = $(By.xpath("//p[@id='currentAddress']"));
    private final SelenideElement checkPermanentAddress = $(By.xpath("//p[@id='permanentAddress']"));

    @Step("Перейти с домашней страницы на страницу \"Text Box\"")
    public void transitionTextBox() {
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
