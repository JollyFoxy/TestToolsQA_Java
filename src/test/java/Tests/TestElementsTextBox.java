package Tests;

import Persons.IPerson;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestElementsTextBox extends BaseTest implements IPerson{
    @Test
    @DisplayName("Тест текстовых полей")
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