package Pages.Elements;

import Pages.BasePage;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import Utils.Elements.Button;
import Utils.Elements.Transition;

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
        visibleAfterBtn.checkVisibleBtn();
        Selenide.refresh();
        enableAfter.checkEnabledAndTimeoutClickBtn(6);
        Selenide.refresh();
        colorBtn.checkColorBtn("220, 53, 69, 1",6);
        Selenide.refresh();
        visibleAfterBtn.checkVisibleAndTimeoutClickBtn(6);

    }

}