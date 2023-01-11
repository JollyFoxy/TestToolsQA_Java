package Steps.tools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class Button {
    private final SelenideElement button;

    public Button(String id){
        button = $(By.cssSelector("button#"+id));
    }
    public void clickBtn(){
        button.click();
    }
    public void doubleClickBtn(){
        button.doubleClick();
    }
    public void rightClickBtn(){
        button.contextClick();
    }
}
