package Tests.UITests.Elements;

import Pages.Elements.PageTimeButton;
import Tests.UITests.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Ui tests")
@Feature("Elements")
public class TestTimeButtonElement extends BaseTest {
    PageTimeButton pageTimeButton = new PageTimeButton();

    @Test
    @Link(name = "Dynamic Properties", url = "https://demoqa.com/dynamic-properties")
    @DisplayName("Тест ожидания кнопок")
    public void testElementTimeButton(){
        pageTimeButton.transitionDynamicProperties();
        pageTimeButton.btnCheck();
        pageTimeButton.btnCheckColor();
        pageTimeButton.btnVisibleAfterBtn();
    }
}