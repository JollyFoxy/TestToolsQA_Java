package Tests.UITests.Elements;

import Pages.Elements.PageTextBox;
import Persons.IPerson;
import Tests.UITests.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Ui tests")
@Feature("Elements")
public class TestTextBoxPage extends BaseTest implements IPerson {
    PageTextBox pageTextBox = new PageTextBox();

    @Test
    @Link(name = "Text Box", url = "https://demoqa.com/text-box")
    @DisplayName("Тест текстовых полей")
    public void testElementsTextBox() {
        pageTextBox.transition();
        pageTextBox.inputFullName(person.getName());
        pageTextBox.inputEmail(person.getEmail());
        pageTextBox.inputCurrentAddress(person.getCurrentAddress());
        pageTextBox.inputPermanentAddress(person.getPermanentAddress());
        pageTextBox.submit();
        pageTextBox.checkInfo(person);
    }
}