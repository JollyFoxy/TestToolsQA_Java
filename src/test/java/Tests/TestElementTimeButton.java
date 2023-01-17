package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestElementTimeButton extends BaseTest{
    @Test
    @DisplayName("Тест ожидания кнопок")
    public void testElementTimeButton(){
        elementTimeButton.transitionDynamicProperties();
        elementTimeButton.btnCheck();
    }
}
