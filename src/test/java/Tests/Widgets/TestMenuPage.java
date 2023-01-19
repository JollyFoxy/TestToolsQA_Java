package Tests.Widgets;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Interactions")
public class TestMenuPage extends BaseTest {
    @Test
    @Link(name = "Menu",url = "https://demoqa.com/menu")
    @DisplayName("Тест новидения на элименты меню")
    public void testWidgetsMenu(){
        menu.transitionMenu();
        menu.hoverMainItem2();
        menu.hoverSubList();
        menu.hoverSubItem2();
    }
}