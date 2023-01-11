package Steps.Xpath.Elements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import Steps.tools.Input;

import static com.codeborne.selenide.Selenide.$;

public class ElementDatePicker {
    private final SelenideElement widgets = $(By.xpath("//div[@class='card-body']//h5[.='Widgets']"));
    private final SelenideElement datePicker = $(By.xpath("//div[@class='element-group']//li[@id='item-2']//span[.='Date Picker']"));
    private final Input dateAndTimePickerInput = new Input("dateAndTimePickerInput");

    @Step("Переход с домашней страницы на страницу \"Date Picker\"")
    public void transitionDatePicker(){
        widgets.click();
        datePicker.click();
    }

    @Step("Ввод в поле \"Date And Time\"")
    public void inputDate(String date,String expected){
        //Предварительная очистка поля
        while (dateAndTimePickerInput.getValueInput().length()>0)
            dateAndTimePickerInput.sendKeysBackSpaseInput();
        //Ввод даты
        dateAndTimePickerInput.setValueInput(date);
        dateAndTimePickerInput.sendKeysEnterInput();
        dateAndTimePickerInput.checkTextInput(expected);
    }
}
