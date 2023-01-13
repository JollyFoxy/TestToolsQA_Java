package Tests;

import Persons.IPerson;
import org.junit.jupiter.api.Test;

public class TestFormsPracticeForm extends BaseTest implements IPerson {
    @Test
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
