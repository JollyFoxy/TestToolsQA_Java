package Steps.css.cssPage;

import Steps.tools.Button;
import Steps.tools.P;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageButtons {
    private final SelenideElement elements = $(By.cssSelector("div.category-cards > div:nth-of-type(1)"));
    private final SelenideElement buttons = $(By.cssSelector("div.accordion > div:nth-child(1) li#item-4"));
    private final SelenideElement doubleClickBtn = Button.getButton("doubleClickBtn");
    private final SelenideElement clickBtn = $(By.cssSelector("div[class$='col-md-6']> div:nth-child(2) > div:nth-child(3)> button"));
//    ("div.row > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > button"))
    private final SelenideElement rightClickBtn = Button.getButton("rightClickBtn");
    private final SelenideElement dynamicClickMessage = P.getCssP("dynamicClickMessage");
    private final SelenideElement rightClickMessage = P.getCssP("rightClickMessage");
    private final SelenideElement doubleClickMessage = P.getCssP("doubleClickMessage");

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
