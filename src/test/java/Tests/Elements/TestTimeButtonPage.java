package Tests.Elements;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Elements")
public class TestTimeButtonPage extends BaseTest {
    @Test
    @Link(name = "Dynamic Properties", url = "https://demoqa.com/dynamic-properties")
    @DisplayName("Тест ожидания кнопок")
    public void testElementTimeButton(){
        elementTimeButton.transitionDynamicProperties();
        elementTimeButton.btnCheck();
    }
}