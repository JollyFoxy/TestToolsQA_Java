package Page.Interactions;

import Page.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Elements.Transition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ElementDroppable extends BasePage {
    private final Transition transition=new Transition("Interactions","Droppable");
    private final SelenideElement draggableObject = $(By.cssSelector("div#draggable"));
    private final SelenideElement droppableObject = $(By.cssSelector("#droppable"));

    @Step("Переход на страницу \"droppable\"")
    public void transitionDroppable() {
        transition.transitionAndScroll("div.left-pannel");
    }
    @Step("Перемищение объекта в область")
    public void drop(){
        draggableObject.shouldBe(Condition.exist).click();
        actions().dragAndDrop(draggableObject, droppableObject).build().perform();
        droppableObject.should(Condition.text("Dropped"));
    }
}