package Tests.Widgets;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Widgets")
public class TestDatePickerElement extends BaseTest {
    @Test
    @Link(name = "Date Picker",url = "https://demoqa.com/menu")
    @DisplayName("Тест поля для ввода даты")
    public void testWidgetsDatePicker(){
        datePicker.transitionDatePicker();
        datePicker.inputDate("November 23 2009 16:20","November 23, 2009 4:20 PM");
        datePicker.inputDate("15/03/2012/16:20","January 1, 2023 12:00 AM");
        datePicker.inputDate("afafaaffaafafaffafaafaf","");
        datePicker.inputDate("???????????????????????????????????????????????","");
    }
}