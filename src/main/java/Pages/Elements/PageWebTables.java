package Pages.Elements;

import Pages.BasePage;
import Utils.Elements.Button;
import Utils.Elements.Input;
import Utils.Elements.Transition;
import io.qameta.allure.Step;

/**Страница Web-таблиц*/
public class PageWebTables extends BasePage {
    private final Transition transition =new Transition("Elements","Web Tables");
    private final Button btnAdd =new Button("addNewRecordButton");
    private final Input firstName = new Input("firstName");
    private final Input lastName = new Input("lastName");
    private final Input eMail = new  Input("userEmail");
    private final Input age = new Input("age");
    private final Input salary = new Input("salary");
    private final Input department = new Input("department");
    private final Button submit= new Button("submit");

    @Step("Переход на страницу \"Web Tables\"")
    public void step1_Transition() {
        transition.transitionAll();
    }

    @Step("Нажатие кнопки \"Add\"")
    public void step2_Add() {
        btnAdd.clickBtn();
    }

    @Step("Ввод имени")
    public void step3_InputFirstName(String userFirstName) {
        firstName.setValueInput(userFirstName);
    }

    @Step("Ввод фамилии")
    public void step4_InputLastName(String userLastName) {
        lastName.setValueInput(userLastName);
    }

    @Step("Ввод почты")
    public void step5_InputEmail(String userEmail) {
        eMail.setValueInput(userEmail);
    }

    @Step("Ввод возраста")
    public void step6_InputAge(int userAge) {
        age.setValueInput(String.valueOf(userAge));
    }

    @Step("Ввод зарплаты")
    public void step7_InputSalary(int userSalary) {
        salary.setValueInput(String.valueOf(userSalary));
    }

    @Step("Ввод департаминта")
    public void step8_InputDepartment(String userDepartment) {
        department.setValueInput(String.valueOf(userDepartment));
    }

    @Step("Нажатие кнопки\"submit\"")
    public void step9_Submit() {
        submit.clickBtn();
    }
    
}