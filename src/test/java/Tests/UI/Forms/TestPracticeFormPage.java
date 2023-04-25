package Tests.UI.Forms;

import Persons.IPerson;
import Tests.UI.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Story;
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
        pageForms.step1_Transition();
        pageForms.step2_InputFirstName(person.getName());
        pageForms.step3_InputLastName(person.getLastName());
        pageForms.step4_InputEmail(person.getEmail());
        pageForms.step5_Gender("Male");
        pageForms.step6_InputPhoneNumber(person.getPhoneNumber());
        pageForms.step7_InputDateOfBirth("11.18.2002");
        pageForms.step8_InputHobbies("Reading","Sports","");
        pageForms.step9_Avatar();
        pageForms.step10_InputAddress(person.getPermanentAddress());
        pageForms.step11_Submit();
        pageForms.step12_Close();
    }
}