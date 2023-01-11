package Steps.css.cssElement;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ElementDroppable {
    private final SelenideElement interactions = $(By.cssSelector("div.category-cards > div:nth-of-type(5)"));
    private final SelenideElement droppable =  $(By.cssSelector("div.accordion > div:nth-child(5) li#item-3"));
    private final SelenideElement draggableObject = $(By.cssSelector("div#draggable"));
    private final SelenideElement droppableObject = $(By.cssSelector("#droppable"));
    private final SelenideElement scroll = $(By.cssSelector("div.left-pannel"));

    @Step("Переход на страницу \"droppable\"")
    public void transitionDroppable() {
        interactions.should(Condition.visible).click();
        scroll.scrollTo();
        droppable.should(Condition.visible).click();
    }
    @Step("Перемищение объекта в область")
    public void drop(){
        draggableObject.shouldBe(Condition.exist).click();
        actions().dragAndDrop(draggableObject, droppableObject).build().perform();
        droppableObject.should(Condition.text("Dropped"));
    }
}
