package Steps.Page;

import Steps.tools.Button;
import Steps.tools.P;
import Steps.tools.Transition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageButtons {
    private final Transition transition=new Transition("Elements","Buttons");
    private final Button doubleClickBtn = new Button("doubleClickBtn");
    private final SelenideElement clickBtn = $(By.cssSelector("div[class$='col-md-6']> div:nth-child(2) > div:nth-child(3)> button"));
//    ("div.row > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > button"))
    private final Button rightClickBtn =new Button("rightClickBtn");
    private final P dynamicClickMessage = new P("dynamicClickMessage");
    private final P rightClickMessage = new P("rightClickMessage");
    private final P doubleClickMessage = new P("doubleClickMessage");
    @Step("Перезод на страницу \"Buttons\"")
    public void inputBtn(){
        transition.transitionAll();
    }
    @Step("Один клик")
    public void oneClick(){
        clickBtn.click();
        dynamicClickMessage.checkTextP("dynamic click");
    }
    @Step("Двойной клик")
    public void doubleClick(){
        doubleClickBtn.doubleClickBtn();
        doubleClickMessage.checkTextP("double click");
    }
    @Step("Тройной клик")
    public void rightClick(){
        rightClickBtn.rightClickBtn();
        rightClickMessage.checkTextP("right click");
    }
}