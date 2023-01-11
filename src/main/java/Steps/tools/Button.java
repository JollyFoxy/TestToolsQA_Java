package Steps.tools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class Button {
    private final SelenideElement button;

    public Button(String id){
        button = $(By.cssSelector("button#"+id));
    }
    public void click(){
        button.click();
    }
    public void doubleClick(){
        button.doubleClick();
    }
    public void rightClick(){
        button.contextClick();
    }
}
