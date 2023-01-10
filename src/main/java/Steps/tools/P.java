package Steps.tools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class P {
    public static SelenideElement getCssP(String id){
        return $(By.cssSelector("p#"+id));
    }
    public static SelenideElement getXpathP(String id){
        return $(By.xpath("//p[@id='"+id+"']"));
    }
}
