package Steps.Page;

import Steps.tools.Transition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageLogin {
    private final SelenideElement body = $(By.xpath("//div[@class='body-height']"));
    private final Transition transition=new Transition("Book Store Application","Login");

    @Step("Вход в пункт \"Login\"")
    public void transitionBookStoreApplication(){
        transition.transitionAll();
    }
    @Step("Прокрутка страницы")
    public void skrollrBody(){
        body.scrollIntoView(false);
    }
}
