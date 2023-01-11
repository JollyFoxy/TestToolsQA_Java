package Tests;

import Interfasces.IDrop;
import org.junit.jupiter.api.Test;

public class TestDrop extends BaseTest implements IDrop {
    @Test
    public void testDrop(){
        elementDroppable.transitionDroppable();
        elementDroppable.drop();
    }
}