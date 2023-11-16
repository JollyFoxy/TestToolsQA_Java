package Utils.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
/**Элкемент P*/
public class P extends BaseElement{
    public P(SelenideElement container){
        super(container);
    }
    public P(String id){
        this($(By.cssSelector("p#"+id)));
    }
    public void checkTextP(String text){
        container.should(Condition.text(text));
    }
}