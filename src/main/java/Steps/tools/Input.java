package Steps.tools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Input {
    public static SelenideElement getCssInput(String id){
        return $(By.cssSelector("input#"+id));
    }
    public static SelenideElement getXpathInput(String id){
        return  $(By.xpath("//input[@id='"+id+"']"));
    }
}