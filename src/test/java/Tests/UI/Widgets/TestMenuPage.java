package Tests.UI.Widgets;

import Tests.UI.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Ui tests")
@Feature("Interactions")
public class TestMenuPage extends BaseTest {
    @Test
    @Link(name = "Menu",url = "https://demoqa.com/menu")
    @DisplayName("Тест навидения на элименты меню")
    public void testWidgetsMenu(){
        menu.transitionMenu();
        menu.hoverMainItem2();
        menu.hoverSubList();
        menu.hoverSubItem2();
    }
}