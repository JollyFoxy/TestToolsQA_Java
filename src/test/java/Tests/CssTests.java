package Tests;

import Persons.Person;
import Steps.css.cssElement.ElementDroppable;
import Steps.css.cssPage.PageWebTables;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CssTests {
    private static final String baseUrl ="https://demoqa.com/";
    ElementDroppable elementDroppable =new ElementDroppable();
    PageWebTables webTables= new PageWebTables();


    Person person =new Person("Павел","Мизирев",
            "JellyFox","Советская 43",
            "Пушкина 23","pavel@mial.com",
            "88005553535",20);
    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000;
        Configuration.browserSize = "1620x1080";
    }
    @BeforeEach
    public void before() {
        open(baseUrl);
    }
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
    @Test
    public void testDrop(){
        elementDroppable.transitionDroppable();
        elementDroppable.drop();
    }

}
