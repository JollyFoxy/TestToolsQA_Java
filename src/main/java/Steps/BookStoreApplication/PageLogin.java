package Steps.BookStoreApplication;

import io.qameta.allure.Step;
import tools.Elements.Scrolling;
import tools.Elements.Transition;

public class PageLogin {
    private final Scrolling body = new Scrolling("div.body-height");
    private final Transition transition=new Transition("Book Store Application","Login");

    @Step("Вход в пункт \"Login\"")
    public void transitionBookStoreApplication(){
        transition.transitionAndScroll("div.left-pannel");
    }
    @Step("Прокрутка страницы")
    public void skrollrBody(){
        body.scrollBoolean(false);
    }
}
