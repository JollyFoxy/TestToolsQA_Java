package Tests.Forms;

import Persons.IPerson;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Forms")
public class TestPracticeFormPage extends BaseTest implements IPerson {
    @Test
    @Link(name = "Practice Form",url = "https://demoqa.com/automation-practice-form")
    @DisplayName("Тест заполнения формы")
    public void testFormsPracticeForm(){
        forms.transitionForms();
        forms.inputFirstName(person.getName());
        forms.inputLastName(person.getLastName());
        forms.inputEmail(person.getEmail());
        forms.inputGender("Male");
        forms.inputNumber(person.getPhoneNumber());
        forms.inputDateOfBirth("11.18.2002");
        forms.inputHobbies("Reading","Sports","");
        forms.avatarUpload();
        forms.inputAddress(person.getPermanentAddress());
        forms.submit();
        forms.closeWidow();
    }
}