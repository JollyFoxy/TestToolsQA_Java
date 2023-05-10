package Tests.UITests.Forms;

import Persons.IPerson;
import Tests.UITests.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

@Epic("Ui tests")
@Feature("Forms")
public class TestPracticeFormPage extends BaseTest implements IPerson {
    @Test
    @Link(name = "Practice Form",url = "https://demoqa.com/automation-practice-form")
    @DisplayName("Тест заполнения формы")
    public void testFormsPracticeForm(){
        pageForms.transition();
        pageForms.inputFirstName(person.getName());
        pageForms.inputLastName(person.getLastName());
        pageForms.inputEmail(person.getEmail());
        pageForms.gender("Male");
        pageForms.inputPhoneNumber(person.getPhoneNumber());
        pageForms.inputDateOfBirth("11.18.2002");
        pageForms.inputHobbies("Reading","Sports","");
        pageForms.avatar();
        pageForms.inputAddress(person.getPermanentAddress());
        pageForms.submit();
        pageForms.close();
    }
}