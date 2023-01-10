package Steps.tools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class Button {
    public static SelenideElement getButton(String id){
        return $(By.cssSelector("button#"+id));
    }
}
