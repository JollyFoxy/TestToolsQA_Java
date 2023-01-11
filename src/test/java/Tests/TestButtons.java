package Tests;

import org.junit.jupiter.api.Test;

public class TestButtons extends BaseTest{
    @Test
    public void testButtons(){
        pageButtons.inputBtn();
        pageButtons.oneClick();
        pageButtons.doubleClick();
        pageButtons.rightClick();
    }
}
