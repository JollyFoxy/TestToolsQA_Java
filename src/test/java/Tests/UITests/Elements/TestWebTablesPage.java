package Tests.UITests.Elements;

import Pages.Elements.PageWebTables;
import Persons.IPerson;
import Tests.UITests.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Ui tests")
@Feature("Elements")
public class    TestWebTablesPage extends BaseTest implements IPerson {
    PageWebTables pageWebTables= new PageWebTables();

    @Test
    @Link(name = "Web Tables", url = "https://demoqa.com/webtables")
    @DisplayName("Тест заполнения таблицы")
    public void testWebTables() throws InterruptedException {
        pageWebTables.transition();
        pageWebTables.add();
        pageWebTables.inputFirstName(person.getName());
        pageWebTables.inputLastName(person.getLastName());
        pageWebTables.inputEmail(person.getEmail());
        pageWebTables.inputAge(person.getAge());
        pageWebTables.inputSalary(person.getSalary());
        pageWebTables.inputDepartment(person.getDepartment());
        pageWebTables.submit();
    }
}