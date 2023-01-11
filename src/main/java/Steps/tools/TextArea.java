package Steps.tools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextArea {

    private final SelenideElement textArea;

    public TextArea(String id) {
        textArea = $(By.xpath("//textarea[@id='" + id + "']"));
    }
    public void setValue(String value) {
        textArea.setValue(value);
    }
}
