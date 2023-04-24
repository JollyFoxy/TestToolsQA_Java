package Tests.UI.Elements;

import Tests.UI.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Ui tests")
@Feature("Elements")
public class TestButtonsPage extends BaseTest {
    @Test
    @Link(name = "Buttons",url="https://demoqa.com/buttons")
    @DisplayName("Тест кнопок")
    public void testButtons(){
       step1();
       step2();
       step3();
       step4();
    }
    @Step("Перезод на страницу \"Buttons\"")
    public void step1(){
        pageButtons.transition.transitionAll();
    }
    @Step("Один клик")
    public void step2(){
        pageButtons.clickBtn.click();
        pageButtons.dynamicClickMessage.checkTextP("dynamic click");
    }
    @Step("Двойной клик")
    public void step3(){
        pageButtons.doubleClickBtn.doubleClickBtn();
        pageButtons.doubleClickMessage.checkTextP("double click");
    }
    @Step("Тройной клик")
    public void step4(){
        pageButtons.rightClickBtn.rightClickBtn();
        pageButtons.rightClickMessage.checkTextP("right click");
    }
}