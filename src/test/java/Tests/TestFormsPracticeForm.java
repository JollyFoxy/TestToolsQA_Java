package Tests;

import Interfasces.IForm;
import Interfasces.IPerson;
import org.junit.jupiter.api.Test;

public class TestFormsPracticeForm extends BaseTest implements IPerson, IForm {
    @Test
    public void testFormsPracticeForm(){
        forms.transitionForms();
        forms.inputFirstName(person.getName());
        forms.inputLastName(person.getLastName());
        forms.inputEmail(person.getEmail());
        forms.inputGender();
        forms.inputNumber(person.getPhoneNumber());
        forms.inputDateOfBirth();
        forms.inputHobbies("Reading","Sports","");
        forms.avatarUpload();
        forms.inputAddress(person.getPermanentAddress());
        forms.submit();
        forms.closeWidow();
    }
}
