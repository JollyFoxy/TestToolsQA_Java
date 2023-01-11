package Tests;

import Interfasces.IPerson;
import Interfasces.IWebTable;
import org.junit.jupiter.api.Test;

public class TestWebTables extends BaseTest implements IPerson, IWebTable {
    @Test
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
