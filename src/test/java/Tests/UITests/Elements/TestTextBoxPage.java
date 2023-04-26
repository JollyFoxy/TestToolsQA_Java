package Tests.UITests.Elements;

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
    @Test
    @Link(name = "Text Box", url = "https://demoqa.com/text-box")
    @DisplayName("Тест текстовых полей")
    public void testElementsTextBox() {
        pageTextBox.step1_Transition();
        pageTextBox.step2_InputFullName(person.getName());
        pageTextBox.step3_InputEmail(person.getEmail());
        pageTextBox.step4_InputCurrentAddress(person.getCurrentAddress());
        pageTextBox.step5_InputPermanentAddress(person.getPermanentAddress());
        pageTextBox.step6_Submit();
        pageTextBox.step7_CheckInfo(person);
    }
}