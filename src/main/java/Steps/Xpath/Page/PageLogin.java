package Steps.Xpath.Page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageLogin {
    private final SelenideElement body = $(By.xpath("//div[@class='body-height']"));
    private final SelenideElement bookStoreApplication = $(By.xpath("//div[@class='card-body']//h5[.='Book Store Application']"));
    private final SelenideElement login = $(By.xpath("//div[@class='element-group']//span[.='Login']"));

    @Step("Вход в пункт \"Login\"")
    public void transitionBookStoreApplication(){
        bookStoreApplication.click();
        login.click();
    }
    @Step("Прокрутка страницы")
    public void skroleBody(){
        body.scrollIntoView(false);
    }
}
