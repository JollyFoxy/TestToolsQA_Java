package Page.Elements;

import Page.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import tools.Elements.Button;
import tools.Elements.P;
import tools.Elements.Transition;

import static com.codeborne.selenide.Selenide.$;

public class PageButtons extends BasePage {
    public final Transition transition=new Transition("Elements","Buttons");
    public final Button doubleClickBtn = new Button("doubleClickBtn");
    public final SelenideElement clickBtn = $(By.cssSelector("div[class$='col-md-6']> div:nth-child(2) > div:nth-child(3)> button"));
//    ("div.row > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > button"))
    public final Button rightClickBtn =new Button("rightClickBtn");
    public final P dynamicClickMessage = new P("dynamicClickMessage");
    public final P rightClickMessage = new P("rightClickMessage");
    public final P doubleClickMessage = new P("doubleClickMessage");
}