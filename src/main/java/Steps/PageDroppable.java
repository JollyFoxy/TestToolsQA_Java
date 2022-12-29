package Steps;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PageDroppable {
    private final SelenideElement dd = $(By.xpath("//div[@id='draggable']"));
    private final SelenideElement dh = $(By.xpath("//div[@id='droppable']"));
    @Test
    public void d(){
        open("https://demoqa.com/droppable");
//        actions().clickAndHold(dd).moveToElement(dh).release().build().perform();
        actions().dragAndDrop(dd,dh).build().perform();
        Assertions.assertEquals("Dropped!",dh.getText());
    }
}
