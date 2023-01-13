package Steps.Elements;

import Steps.tools.Input;
import Steps.tools.Transition;
import io.qameta.allure.Step;

public class ElementDatePicker {
    private final Transition transition =new Transition("Widgets","Date Picker");
    private final Input dateAndTimePickerInput = new Input("dateAndTimePickerInput");

    @Step("Переход с домашней страницы на страницу \"Date Picker\"")
    public void transitionDatePicker(){
        transition.transitionAll();
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
