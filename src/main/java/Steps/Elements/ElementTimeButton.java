package Steps.Elements;

import Steps.tools.Button;
import Steps.tools.Transition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ElementTimeButton {
    private final Transition transition=new Transition("Elements","Dynamic Properties");
    private final Button visibleAfterBtn = new Button("visibleAfter");
    private final SelenideElement scroll = $(By.cssSelector("div.left-pannel"));

    @Step("Переход на страницу\"Dynamic Properties\"")
    public void transitionDynamicProperties(){
        transition.transitionOne();
        scroll.scrollTo();
        transition.transitionTwo();
    }
    @Step("Ожидание и нажатие кнопки")
    public void btnCheck(){
        visibleAfterBtn.clickBtn();
    }

}
