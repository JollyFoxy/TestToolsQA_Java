package Tests;

import org.junit.jupiter.api.Test;

public class TestWidgetsMenu extends BaseTest{
    @Test
    public void testWidgetsMenu(){
        menu.transitionMenu();
        menu.hoverMainItem2();
        menu.hoverSubList();
        menu.hoverSubItem2();
    }
}