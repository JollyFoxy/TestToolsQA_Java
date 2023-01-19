package Steps.Widgets.Elements;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Elements.Input;
import tools.Elements.Transition;

import static com.codeborne.selenide.Selenide.$;

public class ElementDatePicker {
    private final Transition transition =new Transition("Widgets","Date Picker");
    private final Input dateAndTimePickerInput = new Input("dateAndTimePickerInput");


    @Step("Переход с домашней страницы на страницу \"Date Picker\"")
    public void transitionDatePicker(){
        transition.transitionOne();
        $(By.xpath("//div[@class='left-pannel']")).scrollTo();
        transition.transitionTwo();
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