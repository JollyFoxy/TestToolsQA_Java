package Tests.Interactions;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Interactions")
public class TestDropElement extends BaseTest {
    @Test
    @Link(name = "Droppable",url = "https://demoqa.com/droppable")
    @DisplayName("Тест перетаскивания объета")
    public void testDrop(){
        elementDroppable.transitionDroppable();
        elementDroppable.drop();
    }
}