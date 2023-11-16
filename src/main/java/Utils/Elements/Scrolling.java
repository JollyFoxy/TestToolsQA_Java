package Utils.Elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
/**Прокрутка*/
public class Scrolling extends BaseElement {

    public Scrolling(SelenideElement container){
        super(container);
    }

    public Scrolling(String cssSelector){
        this($(By.cssSelector(cssSelector)));
    }
    public void scrollingForTact(int i){
        for (int tact=i;tact > 0; tact--){
            container.scrollTo();
        }
    }
    public void scrollToObject(){
        container.scrollTo();
    }
    public void scrollBoolean(boolean torf){
        container.scrollIntoView(torf);
    }
    public void scrollString(String string){
        container.scrollIntoView(string);
    }

}