package Pages.Interactions;

import Pages.BasePage;
import Utils.Elements.Transition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageDroppable extends BasePage {
    public final Transition transition=new Transition("Interactions","Droppable");
    public final SelenideElement draggableObject = $(By.cssSelector("div#draggable"));
    public final SelenideElement droppableObject = $(By.cssSelector("#droppable"));


}