package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDrop extends BaseTest{
    @Test
    @DisplayName("Тест перетаскивания объета")
    public void testDrop(){
        elementDroppable.transitionDroppable();
        elementDroppable.drop();
    }
}