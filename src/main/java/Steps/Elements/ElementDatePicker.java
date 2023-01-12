package Steps.Elements;

import Steps.tools.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;

public class ElementDatePicker {
    private final ElementsCollection widgets = $$("div.category-cards h5");
    private final ElementsCollection datePicker=$$("ul.menu-list li");
    private final Input dateAndTimePickerInput = new Input("dateAndTimePickerInput");

    @Step("Переход с домашней страницы на страницу \"Date Picker\"")
    public void transitionDatePicker(){
        widgets.find(Condition.text("Widgets")).click();
        datePicker.find(Condition.text("Date Picker")).click();
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
