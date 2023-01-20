package Steps.Widgets.Page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Elements.Scrolling;
import tools.Elements.Transition;

import static com.codeborne.selenide.Selenide.$;

public class PageMenu {
    private final Transition transition=new Transition("Widgets","Menu");
    private final SelenideElement mainItem2 = $(By.xpath("//a[.='Main Item 2']"));
    private final SelenideElement subList = $(By.xpath("//a[.='SUB SUB LIST »']"));
    private final SelenideElement subItem2 = $(By.xpath("//a[.='Sub Sub Item 2']"));

    @Step("Перейти с домашней страницы на страницу \"Menu\"")
    public void transitionMenu(){
        transition.transitionOne();
        //Иногда не открываеться в нужном разрешении, прокрутка для перестраховки
        new Scrolling("div.row").scrollBoolean(false);
        transition.transitionTwo();
    }
    @Step("Наводка на элемент\"Main Item 2\"")
    public void hoverMainItem2(){
        mainItem2.hover();
    }
    @Step("Наводка на элемент\"SUB SUB LIST »\"")
    public void hoverSubList(){
        subList.hover();
    }
    @Step("Наводка на элемент\"Sub Sub Item 2\"")
    public void hoverSubItem2(){
        subItem2.hover();
    }
}