package Tests.Elements;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Elements")
public class TestBasePage extends BaseTest {
    @Test
    @Link(name = "Elements",url = "https://demoqa.com/elements")
    @DisplayName("Тест базовыой страницы")
    public void testBasePage(){
        pageBase.transitionElements();
        pageBase.checkElement("Text Box","Check Box","Radio Button",
                "Web Tables","Buttons","Links","Broken Links - Images",
                "Upload and Download","Dynamic Properties");
    }
}
