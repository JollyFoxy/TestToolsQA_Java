package Tests.UITests.Interactions;

import Tests.UITests.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Ui tests")
@Feature("Interactions")
public class TestDropElement extends BaseTest {
    @Test
    @Link(name = "Droppable",url = "https://demoqa.com/droppable")
    @DisplayName("Тест перетаскивания объета")
    public void testDrop(){
        pageDroppable.transition();
        pageDroppable.dragAndDrop();
    }
}