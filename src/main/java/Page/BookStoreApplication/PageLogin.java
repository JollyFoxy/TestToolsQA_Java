package Page.BookStoreApplication;

import Page.BasePage;
import tools.Elements.Scrolling;
import tools.Elements.Transition;

public class PageLogin extends BasePage {
    public final Scrolling body = new Scrolling("div.home-body");
    public final Transition transition=new Transition("Book Store Application","Login");
}
