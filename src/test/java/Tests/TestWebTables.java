package Tests;

import Persons.IPerson;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWebTables extends BaseTest implements IPerson{
    @Test
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
