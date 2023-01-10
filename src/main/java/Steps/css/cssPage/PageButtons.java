package Steps.css.cssPage;

import Steps.css.cssTools.*;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageButtons {
    private final SelenideElement elements = new cssTransition(1).getNClass();
    private final SelenideElement buttons = new cssTransitionElement(1,4).getItemId();
    private final SelenideElement doubleClickBtn = new cssButton("doubleClickBtn").getIdButton();
    private final SelenideElement clickBtn = $(By.cssSelector("div[class$='col-md-6']> div:nth-child(2) > div:nth-child(3)> button"));
//    ("div.row > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > button"))
    private final SelenideElement rightClickBtn = new cssButton("rightClickBtn").getIdButton();
    private final SelenideElement dynamicClickMessage = new cssP("dynamicClickMessage").getP();
    private final SelenideElement rightClickMessage = new cssP("rightClickMessage").getP();
    private final SelenideElement doubleClickMessage = new cssP("doubleClickMessage").getP();

    @Step
    public void inputBtn(){
        elements.click();
        buttons.click();
    }
    @Step
    public void oneClick(){
        clickBtn.click();
        Assertions.assertEquals("You have done a dynamic click",dynamicClickMessage.getText());
    }
    @Step
    public void doubleClick(){
        doubleClickBtn.doubleClick();
        Assertions.assertEquals("You have done a double click",doubleClickMessage.getText());

    }
    @Step
    public void rightClick(){
        rightClickBtn.contextClick();
        Assertions.assertEquals("You have done a right click",rightClickMessage.getText());

    }
}
