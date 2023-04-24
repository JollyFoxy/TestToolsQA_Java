package Tests.UI.Elements;

import Tests.UI.BaseTest;
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
       pageButtons.step1_Transition();
       pageButtons.step2_OneClick();
       pageButtons.step3_DoubleClick();
       pageButtons.step4_RightCLick();
    }

}