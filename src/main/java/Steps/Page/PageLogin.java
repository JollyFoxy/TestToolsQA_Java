package Steps.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageLogin {
    private final SelenideElement body = $(By.xpath("//div[@class='body-height']"));
    private final ElementsCollection bookStoreApplication = $$("div.category-cards h5");
    private final ElementsCollection login=$$("ul.menu-list li");

    @Step("Вход в пункт \"Login\"")
    public void transitionBookStoreApplication(){
        bookStoreApplication.find(Condition.text("Book Store Application")).click();
        login.find(Condition.text("Login")).click();
    }
    @Step("Прокрутка страницы")
    public void skroleBody(){
        body.scrollIntoView(false);
    }
}
