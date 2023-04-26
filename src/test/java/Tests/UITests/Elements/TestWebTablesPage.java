package Tests.UITests.Elements;

import Persons.IPerson;
import Tests.UITests.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Ui tests")
@Feature("Elements")
public class TestWebTablesPage extends BaseTest implements IPerson {
    @Test
    @Link(name = "Web Tables", url = "https://demoqa.com/webtables")
    @DisplayName("Тест заполнения таблицы")
    public void testWebTables() {
        pageWebTables.step1_Transition();
        pageWebTables.step2_Add();
        pageWebTables.step3_InputFirstName(person.getName());
        pageWebTables.step4_InputLastName(person.getLastName());
        pageWebTables.step5_InputEmail(person.getEmail());
        pageWebTables.step6_InputAge(person.getAge());
        pageWebTables.step7_InputSalary(20000);
        pageWebTables.step8_InputDepartment("AAAaaaa");
        pageWebTables.step9_Submit();
    }
}