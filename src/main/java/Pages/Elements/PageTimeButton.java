package Pages.Elements;

import Pages.BasePage;
import Utils.Elements.Button;
import Utils.Elements.Transition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

/**Страница Прогружающихся кнопок*/
public class PageTimeButton extends BasePage {
    private final Transition transition=new Transition("Elements","Dynamic Properties");

    private final Button colorBtn = new Button("colorChange");
    private final Button visibleAfterBtn = new Button("visibleAfter");
    private final Button enableAfter = new Button("enableAfter");

    @Step("Переход на страницу\"Dynamic Properties\"")
    public void transitionDynamicProperties(){
        transition.transitionAndScroll("div.left-pannel");
    }

    @Step("Ожидание и нажатие кнопки")
    public void btnCheck(){
        enableAfter.checkEnabledAndTimeoutClickBtn(6);
        Selenide.refresh();
    }
    @Step("Проверка изменения цвета кнопки")
    public void btnCheckColor() {
        colorBtn.checkColorBtn("220, 53, 69, 1", 6);
        Selenide.refresh();
    }
    @Step("Ожидание явления кнопки народу")
    public void btnVisibleAfterBtn(){
        visibleAfterBtn.checkVisibleAndTimeoutClickBtn(6);
    }
}