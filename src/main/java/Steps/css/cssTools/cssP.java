package Steps.css.cssTools;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class cssP {
    SelenideElement p;
    public cssP(String id){
        this.p=$(By.cssSelector("p#"+id));
    }
}
