package Pages.BookStoreApplication;

import Pages.BasePage;
import Utils.Elements.Scrolling;
import Utils.Elements.Transition;
import lombok.Getter;

public class PageLogin extends BasePage {
    @Getter
    private final Scrolling body = new Scrolling("div.home-body");
    @Getter
    private final Transition transition=new Transition("Book Store Application","Login");
}
