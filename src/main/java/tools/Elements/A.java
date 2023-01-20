package tools.Elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class A {
    private final SelenideElement a;
    public A(String text){
        a = $(By.xpath("//a[.='"+text+"']"));
    }
    public void hoverA(){
        a.hover();
    }

}
