package Pages.Widgets;

import Pages.BasePage;
import io.qameta.allure.Step;
import tools.Elements.A;
import tools.Elements.Scrolling;
import tools.Elements.Transition;

import static com.codeborne.selenide.Selenide.$x;

public class PageMenu extends BasePage {
    private final Transition transition=new Transition("Widgets","Menu");
    private final A mainItem2 =new A($x("//a[.='Main Item 2']"));
    private final A subList =new A($x("//a[.='SUB SUB LIST »']"));
    private final A subItem2 = new A($x("//a[.='Sub Sub Item 2']"));

    @Step("Перейти с домашней страницы на страницу \"Menu\"")
    public void transitionMenu(){
        transition.transitionOne();
        //Иногда не открываеться в нужном разрешении, прокрутка для перестраховки
        new Scrolling("div.row").scrollBoolean(false);
        transition.transitionTwo();
    }
    @Step("Наводка на элемент\"Main Item 2\"")
    public void hoverMainItem2(){
        mainItem2.hoverA();
    }
    @Step("Наводка на элемент\"SUB SUB LIST »\"")
    public void hoverSubList(){
        subList.hoverA();
    }
    @Step("Наводка на элемент\"Sub Sub Item 2\"")
    public void hoverSubItem2(){
        subItem2.hoverA();
    }
}