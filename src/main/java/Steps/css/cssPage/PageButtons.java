package Steps.css.cssPage;

import Steps.tools.Button;
import Steps.tools.P;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageButtons {
    private final SelenideElement elements = $(By.cssSelector("div.category-cards > div:nth-of-type(1)"));
    private final SelenideElement buttons = $(By.cssSelector("div.accordion > div:nth-child(1) li#item-4"));
    private final Button doubleClickBtn = new Button("doubleClickBtn");
    private final SelenideElement clickBtn = $(By.cssSelector("div[class$='col-md-6']> div:nth-child(2) > div:nth-child(3)> button"));
//    ("div.row > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > button"))
    private final Button rightClickBtn =new Button("rightClickBtn");
    private final P dynamicClickMessage = new P("dynamicClickMessage");
    private final P rightClickMessage = new P("rightClickMessage");
    private final P doubleClickMessage = new P("doubleClickMessage");

    @Step
    public void inputBtn(){
        elements.click();
        buttons.click();
    }
    @Step
    public void oneClick(){
        clickBtn.click();
        dynamicClickMessage.checkText("dynamic click");
    }
    @Step
    public void doubleClick(){
        doubleClickBtn.doubleClick();
        doubleClickMessage.checkText("double click");
    }
    @Step
    public void rightClick(){
        rightClickBtn.rightClick();
        rightClickMessage.checkText("right click");
    }
}
