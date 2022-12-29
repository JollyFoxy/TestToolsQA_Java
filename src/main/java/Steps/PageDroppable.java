package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PageDroppable {
    private final SelenideElement interactions = $(By.xpath("//div[@class='card-body']//h5[.='Interactions']"));
    private final SelenideElement droppable = $(By.xpath("//div[@class='element-group']//li[@id='item-3']//span[.='Droppable']"));
    private final SelenideElement draggableObject = $(By.xpath("//div[@id='draggable']"));
    private final SelenideElement droppableObject = $(By.xpath("//div[@id='droppable']"));
    SelenideElement scroll = $(By.xpath("//div[@class='left-pannel']"));
    @Step("Переход на страницу \"droppable\"")
    public void transitionDroppable() {
        interactions.click();
        scroll.scrollTo();
        droppable.should(Condition.visible).click();
    }
    @Step("Перемищение объекта в область")
    public void drop(){
        actions().dragAndDrop(draggableObject, droppableObject).build().perform();
        Assertions.assertEquals("Dropped!", droppableObject.getText());
    }
}
