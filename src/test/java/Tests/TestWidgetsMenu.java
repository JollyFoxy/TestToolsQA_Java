package Tests;

import Interfasces.IMenu;
import Tests.BaseTest;
import org.junit.jupiter.api.Test;

public class TestWidgetsMenu extends BaseTest implements IMenu{
    @Test
    public void testWidgetsMenu(){
        menu.transitionMenu();
        menu.hoverMainItem2();
        menu.hoverSubList();
        menu.hoverSubItem2();
    }
}
