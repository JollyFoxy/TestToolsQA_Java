package Steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class DatePicker {
    private SelenideElement widgets = $(By.xpath("//div[@class='card-body']//h5[.='Widgets']"));
    private SelenideElement datePicker = $(By.xpath("//div[@class='element-group']//li[@id='item-2']//span[.='Date Picker']"));
    public SelenideElement dateAndTimePickerInput = $(By.xpath("//input[@id='dateAndTimePickerInput']"));

    @Step("Переход с домашней страницы на страницу \"Date Picker\"")
    public void inputDatePicker(){
        widgets.click();
        datePicker.click();
    }

    @Step("Ввод в поле \"Date And Time\"")
    public void inputDate(String date,String expected){
        while (dateAndTimePickerInput.getValue().length()>0)
            dateAndTimePickerInput.sendKeys(Keys.BACK_SPACE);
        dateAndTimePickerInput.val(date);
        dateAndTimePickerInput.sendKeys(Keys.ENTER);
        Assertions.assertEquals(expected,dateAndTimePickerInput.getValue());
    }
}
