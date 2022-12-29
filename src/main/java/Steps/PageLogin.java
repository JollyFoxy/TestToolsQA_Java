package Steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageLogin {
    private SelenideElement body = $(By.xpath("//div[@class='body-height']"));
    private SelenideElement bookStoreApplication =$(By.xpath("//div[@class='card-body']//h5[.='Book Store Application']"));
    private SelenideElement login = $(By.xpath("//div[@class='element-group']//li[@id='item-0']//span[.='Login']"));

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
