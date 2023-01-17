package Steps.Elements;

import Steps.tools.Button;
import Steps.tools.Transition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ElementTimeButton {
    private final Transition transition=new Transition("Elements","Dynamic Properties");

    private final Button colorBtn = new Button("colorChange");
    private final Button visibleAfterBtn = new Button("visibleAfter");
    private final Button enableAfter = new Button("enableAfter");
    private final SelenideElement scroll = $(By.cssSelector("div.left-pannel"));

    @Step("Переход на страницу\"Dynamic Properties\"")
    public void transitionDynamicProperties(){
        transition.transitionOne();
        scroll.scrollTo();
        transition.transitionTwo();
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
