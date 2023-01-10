package Steps.tools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class TextArea {
    public static SelenideElement getTextarea (String id){
       return  $(By.xpath("//textarea[@id='"+id+"']"));
    }
}
