package Tests.Elements;

import Persons.IPerson;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Elements")
public class TestTextBoxPage extends BaseTest implements IPerson{
    @Test
    @Link(name = "Text Box",url = "https://demoqa.com/text-box")
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