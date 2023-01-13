package Tests;

import org.junit.jupiter.api.Test;

public class TestElementTimeButton extends BaseTest{
    @Test
    public void testElementTimeButton(){
        elementTimeButton.transitionDynamicProperties();
        elementTimeButton.btnCheck();
    }
}
