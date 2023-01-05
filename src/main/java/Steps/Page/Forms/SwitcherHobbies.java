package Steps.Page.Forms;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SwitcherHobbies {
    public SwitcherHobbies(String arg){
        $(By.xpath("//label[.='"+arg+"']")).click();
    }
    public SwitcherHobbies(String arg, String arg1){
        $(By.xpath("//label[.='"+arg+"']")).click();
        $(By.xpath("//label[.='"+arg1+"']")).click();
    }
    public SwitcherHobbies(String arg, String arg1, String arg2){
        $(By.xpath("//label[.='"+arg+"']")).click();
        $(By.xpath("//label[.='"+arg1+"']")).click();
        $(By.xpath("//label[.='"+arg2+"']")).click();
    }
}