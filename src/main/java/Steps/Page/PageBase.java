package Steps.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Transition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageBase {
    private final Transition transition = new Transition("Elements","");
    private final ElementsCollection elementMenu = $$("ul.menu-list li");
    private final SelenideElement sk = $(By.cssSelector(".left-pannel"));
    @Step("Перейти с домашней страницы на страницу \"Text Box\"")
    public void transitionElements() {
        transition.transitionOne();
    }

    @Step
    public void checkElement (String ... value){
        int i=0;
        String k;
        for (String s : value) {
            k="item-"+i;
            elementMenu.find(Condition.id(k)).shouldHave(Condition.text(s)).should(Condition.visible).click();
            sk.scrollTo();
            i++;
        }
    }
}