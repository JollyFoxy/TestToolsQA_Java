package Steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Menu {
    private SelenideElement widgets = $(By.xpath("//div[@class='card-body']//h5[.='Widgets']"));
    private SelenideElement menu = $(By.xpath("//div[@class='element-group']//li[@id='item-7']//span[.='Menu']"));
    private SelenideElement leftPannel = $(By.xpath("//div[@class='row']"));
    private SelenideElement mainItem2 = $(By.xpath("//a[.='Main Item 2']"));
    private SelenideElement subList = $(By.xpath("//a[.='SUB SUB LIST »']"));
    private SelenideElement subItem2 = $(By.xpath("//a[.='Sub Sub Item 2']"));

    @Step("Перейти с домашней страницы на страницу \"Menu\"")
    public void inputMenu(){
        widgets.click();
        leftPannel.scrollIntoView(false);
        menu.click();
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
