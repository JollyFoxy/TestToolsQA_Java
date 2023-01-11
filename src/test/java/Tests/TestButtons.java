package Tests;

import Interfasces.IButton;
import org.junit.jupiter.api.Test;

public class TestButtons extends BaseTest implements IButton {
    @Test
    public void testButtons(){
        pageButtons.inputBtn();
        pageButtons.oneClick();
        pageButtons.doubleClick();
        pageButtons.rightClick();
    }
}
