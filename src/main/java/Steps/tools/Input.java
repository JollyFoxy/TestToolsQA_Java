package Steps.tools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Input {
    private final SelenideElement input;
    public Input(String id){
        input= $(By.cssSelector("input#"+id));
    }
    public void setValue(String value){
        input.setValue(value);
    }
    public String getValue(){
        return input.getValue();
    }
    public void sendKeysBackSpase(){
        input.sendKeys(Keys.BACK_SPACE);
    }
    public void sendKeysEnter(){
        input.sendKeys(Keys.ENTER);
    }
    public void inputClick(){
        input.click();
    }
    public void uploadFile(File file){
        input.uploadFile(file);
    }
    public void checkText(String value){
        input.should(Condition.value(value));
    }
}