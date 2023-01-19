package Tests.Elements;

import Persons.IPerson;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Elements")
public class TestWebTablesPage extends BaseTest implements IPerson{
    @Test
    @Link(name = "Web Tables",url="https://demoqa.com/webtables")
    @DisplayName("Тест заполнения таблицы")
    public void testWebTables(){
        webTables.transitionElements();
        webTables.addUser();
        webTables.inputFirstUserName(person.getName());
        webTables.inputLastUserName(person.getLastName());
        webTables.inputUserEmail(person.getEmail());
        webTables.inputUserAge(person.getAge());
        webTables.inputSalary(20000);
        webTables.inputDepartment("AAAaaaa");
        webTables.submit();
    }
}