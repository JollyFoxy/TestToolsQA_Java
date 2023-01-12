package Steps.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class ElementDroppable {
    private final ElementsCollection interactions = $$("div.category-cards h5");
    private final ElementsCollection droppable=$$("ul.menu-list li");
    private final SelenideElement draggableObject = $(By.cssSelector("div#draggable"));
    private final SelenideElement droppableObject = $(By.cssSelector("#droppable"));
    private final SelenideElement scroll = $(By.cssSelector("div.left-pannel"));

    @Step("Переход на страницу \"droppable\"")
    public void transitionDroppable() {
        interactions.find(Condition.text("Interactions")).click();
        scroll.scrollTo();
        droppable.find(Condition.text("Droppable")).click();
    }
    @Step("Перемищение объекта в область")
    public void drop(){
        draggableObject.shouldBe(Condition.exist).click();
        actions().dragAndDrop(draggableObject, droppableObject).build().perform();
        droppableObject.should(Condition.text("Dropped"));
    }
}
