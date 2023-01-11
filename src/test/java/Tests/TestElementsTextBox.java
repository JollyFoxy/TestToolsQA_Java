package Tests;

import Interfasces.IPerson;
import Interfasces.ITextBox;
import org.junit.jupiter.api.Test;

public class TestElementsTextBox extends BaseTest implements IPerson, ITextBox {
    @Test
    public void testElementsTextBox(){
        textBox.transitionTextBox();
        textBox.inputFullName(person.getName());
        textBox.inputEmail(person.getEmail());
        textBox.inputCurrentAddress(person.getCurrentAddress());
        textBox.inputPermanentAddress(person.getPermanentAddress());
        textBox.submit();
        textBox.checkInfo(person);
    }
}
