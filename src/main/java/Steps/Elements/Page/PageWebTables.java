package Steps.Elements.Page;

import io.qameta.allure.Step;
import tools.Elements.Button;
import tools.Elements.Input;
import tools.Elements.Transition;

public class PageWebTables {
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
    public void transitionElements(){
        transition.transitionAll();
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