package Tests.Interactions;

import Tests.BaseTest;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.actions;

@Feature("Interactions")
public class TestDropElement extends BaseTest {
    @Test
    @Link(name = "Droppable",url = "https://demoqa.com/droppable")
    @DisplayName("Тест перетаскивания объета")
    public void testDrop(){
        step1();
        step2();
    }

    @Step("Переход на страницу \"droppable\"")
    public void step1() {
        pageDroppable.transition.transitionAndScroll("div.left-pannel");
    }
    @Step("Перемищение объекта в область")
    public void step2(){
        pageDroppable.draggableObject.shouldBe(Condition.exist).click();
        actions().dragAndDrop(pageDroppable.draggableObject, pageDroppable.droppableObject).build().perform();
        pageDroppable.droppableObject.should(Condition.text("Dropped"));
    }
}