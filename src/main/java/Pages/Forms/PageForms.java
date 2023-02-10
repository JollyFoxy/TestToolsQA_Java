package Pages.Forms;

import Pages.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import tools.Elements.*;

import java.io.File;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$$;

public class PageForms extends BasePage {
    public File file = new File("foxy.png");
    public Transition transition = new Transition("Forms", "Practice Form");
    public Input firstName = new Input("firstName");
    public Input lastName = new Input("lastName");
    public Input userEmail = new Input("userEmail");
    public ElementsCollection gender = $$("#genterWrapper label");
    public ElementsCollection hobbes = $$("#hobbiesWrapper label");
    public Input userNumber = new Input("userNumber");
    public Input dateOfBirth = new Input("dateOfBirthInput");
    public TextArea currentAddress = new TextArea("currentAddress");
    public Button btnSubmit = new Button("submit");
    public Button closeLargeModal = new Button("closeLargeModal");
    public Input uploadPicture = new Input("uploadPicture");
    public Scrolling scroll = new Scrolling("div.left-pannel");

    public void inputGender(String gender) {
        this.gender.find(Condition.text(gender)).click();
    }

    public void inputHobbies(String arg, String arg1, String arg2) {
        if (!Objects.equals(arg, ""))
            hobbes.find(Condition.text(arg)).click();
        if (!Objects.equals(arg1, ""))
            hobbes.find(Condition.text(arg1)).click();
        if (!Objects.equals(arg2, ""))
            hobbes.find(Condition.text(arg2)).click();
    }
}