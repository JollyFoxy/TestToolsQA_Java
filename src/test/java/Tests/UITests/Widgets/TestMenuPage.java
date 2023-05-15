package Tests.UITests.Widgets;

import Pages.Widgets.PageMenu;
import Tests.UITests.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Ui tests")
@Feature("Interactions")
public class TestMenuPage extends BaseTest {
    PageMenu pageMenu = new PageMenu();

    @Test
    @Link(name = "Menu",url = "https://demoqa.com/menu")
    @DisplayName("Тест навидения на элименты меню")
    public void testWidgetsMenu(){
        pageMenu.transitionMenu();
        pageMenu.hoverMainItem2();
        pageMenu.hoverSubList();
        pageMenu.hoverSubItem2();
    }
}