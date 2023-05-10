package Tests.UITests.Elements;

import Tests.UITests.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Ui tests")
@Feature("Elements")
public class TestButtonsPage extends BaseTest {
    @Test
    @Link(name = "Buttons",url="https://demoqa.com/buttons")
    @DisplayName("Тест кнопок")
    public void testButtons(){
       pageButtons.transition();
       pageButtons.oneClick();
       pageButtons.doubleClick();
       pageButtons.rightCLick();
    }

}