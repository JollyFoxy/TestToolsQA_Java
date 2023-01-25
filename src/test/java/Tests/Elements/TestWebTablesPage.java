package Tests.Elements;

import Persons.IPerson;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Elements")
public class TestWebTablesPage extends BaseTest implements IPerson {
    @Test
    @Link(name = "Web Tables", url = "https://demoqa.com/webtables")
    @DisplayName("Тест заполнения таблицы")
    public void testWebTables() {
        step1();
        step2();
        step3(person.getName());
        step4(person.getLastName());
        step5(person.getEmail());
        step6(person.getAge());
        step7(20000);
        step8("AAAaaaa");
        step9();
    }

    @Step("Переход на страницу \"Web Tables\"")
    public void step1() {
        webTables.transition.transitionAll();
    }

    @Step("Нажатие кнопки \"Add\"")
    public void step2() {
        webTables.btnAdd.clickBtn();
    }

    @Step("Ввод имени")
    public void step3(String userFirstName) {
        webTables.firstName.setValueInput(userFirstName);
    }

    @Step("Ввод фамилии")
    public void step4(String userLastName) {
        webTables.lastName.setValueInput(userLastName);
    }

    @Step("Ввод почты")
    public void step5(String userEmail) {
        webTables.eMail.setValueInput(userEmail);
    }

    @Step("Ввод возраста")
    public void step6(int userAge) {
        webTables.age.setValueInput(String.valueOf(userAge));
    }

    @Step("Ввод зарплвты")
    public void step7(int userSalary) {
        webTables.salary.setValueInput(String.valueOf(userSalary));
    }

    @Step("Ввод департаминта")
    public void step8(String userDepartment) {
        webTables.department.setValueInput(String.valueOf(userDepartment));
    }

    @Step("Нажатие кнопки\"submit\"")
    public void step9() {
        webTables.submit.clickBtn();
    }
}