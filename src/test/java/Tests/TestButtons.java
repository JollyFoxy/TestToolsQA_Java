package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestButtons extends BaseTest{
    @Test
    @DisplayName("Тест кнопок")
    public void testButtons(){
        pageButtons.inputBtn();
        pageButtons.oneClick();
        pageButtons.doubleClick();
        pageButtons.rightClick();
    }
}