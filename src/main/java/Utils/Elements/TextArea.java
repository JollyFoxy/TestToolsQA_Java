package Utils.Elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**Элкемент TextArea*/
public class TextArea extends BaseElement {

    public TextArea(SelenideElement container){
        super(container);
    }

    public TextArea(String id) {
       this($(By.xpath("//textarea[@id='" + id + "']")));
    }
    public void setValueTextArea(String value) {
        container.setValue(value);
    }
}