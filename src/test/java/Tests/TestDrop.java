package Tests;

import org.junit.jupiter.api.Test;

public class TestDrop extends BaseTest{
    @Test
    public void testDrop(){
        elementDroppable.transitionDroppable();
        elementDroppable.drop();
    }
}