package Steps.Page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Transition;

import static com.codeborne.selenide.Selenide.$;

public class PageLogin {
    private final SelenideElement body = $(By.xpath("//div[@class='body-height']"));
    private final Transition transition=new Transition("Book Store Application","Login");

    @Step("Вход в пункт \"Login\"")
    public void transitionBookStoreApplication(){
        transition.transitionOne();
        $(By.xpath("//div[@class='left-pannel']")).scrollTo();
        transition.transitionTwo();
    }
    @Step("Прокрутка страницы")
    public void skrollrBody(){
        body.scrollIntoView(false);
    }
}
