package Utils.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

/**Элкемент Span*/
public class Span extends BaseElement{
    public Span(SelenideElement container){
        super(container);
    }
    public void checkTextSpan(String text){
        container.shouldBe(Condition.text(text));
    }
}
