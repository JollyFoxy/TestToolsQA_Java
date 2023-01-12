package Steps.Page;

import Steps.tools.Button;
import Steps.tools.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageWebTables {
    private final ElementsCollection elements = $$("div.category-cards h5");
    private final ElementsCollection webTable=$$("ul.menu-list li");
    private final Button btnAdd =new Button("addNewRecordButton");
    private final Input firstName = new Input("firstName");
    private final Input lastName = new Input("lastName");
    private final Input eMail = new  Input("userEmail");
    private final Input age = new Input("age");
    private final Input salary = new Input("salary");
    private final Input department = new Input("department");
    private final Button submit= new Button("submit");
    @Step("Переход на страницу \"Web Tables\"")
    public void transitionElements(){
        elements.find(Condition.text("Elements")).click();
        webTable.find(Condition.text("Web Tables")).click();
    }
    @Step("Нажатие кнопки \"Add\"")
    public void addUser(){
        btnAdd.clickBtn();
    }
    @Step("Ввод имени")
    public void inputFirstUserName(String userFirstName){
        firstName.setValueInput(userFirstName);
    }
    @Step("Ввод фамилии")
    public void inputLastUserName(String userLastName){
        lastName.setValueInput(userLastName);
    }
    @Step("Ввод почты")
    public void inputUserEmail(String userEmail){
        eMail.setValueInput(userEmail);
    }
    @Step("Ввод возраста")
    public void inputUserAge(int  userAge){
        age.setValueInput(String.valueOf(userAge));
    }
    @Step("Ввод зарплвты")
    public void inputSalary(int userSalary){
        salary.setValueInput(String.valueOf(userSalary));
    }
    @Step("Ввод департаминта")
    public void inputDepartment(String userDepartment){
        department.setValueInput(String.valueOf(userDepartment));
    }
    @Step("Нажатие кнопки\"submit\"")
    public void submit(){
        submit.clickBtn();
    }

}
