package Tests.Elements;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Feature("Elements")
public class TestButtonsPage extends BaseTest {
    @Test
    @Link(name = "Buttons",url="https://demoqa.com/buttons")
    @DisplayName("Тест кнопок")
    public void testButtons(){
        pageButtons.inputBtn();
        pageButtons.oneClick();
        pageButtons.doubleClick();
        pageButtons.rightClick();
    }
}