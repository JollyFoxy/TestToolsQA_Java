package Steps.css.cssPage;

import Steps.tools.Button;
import Steps.tools.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageWebTables {
    private final SelenideElement elements = $(By.cssSelector("div.category-cards > div:nth-of-type(1)"));
    private final SelenideElement webTable = $(By.cssSelector("div.accordion > div:nth-child(1) li#item-3"));
    private final SelenideElement btnAdd = Button.getButton("addNewRecordButton");
    private final SelenideElement firstName = Input.getCssInput("firstName");
    private final SelenideElement lastName = Input.getCssInput("lastName");
    private final SelenideElement eMail = Input.getCssInput("userEmail");
    private final SelenideElement age = Input.getCssInput("age");
    private final SelenideElement salary = Input.getCssInput("salary");
    private final SelenideElement department = Input.getCssInput("department");
    private final SelenideElement submit= Button.getButton("submit");
    @Step("Переход на страницу \"Web Tables\"")
    public void transitionElements(){
        elements.should(Condition.visible).click();
        webTable.should(Condition.visible).click();
    }
    @Step("Нажатие кнопки \"Add\"")
    public void addUser(){
        btnAdd.should(Condition.visible).click();
    }
    @Step("Ввод имени")
    public void inputFirstUserName(String userFirstName){
        firstName.should(Condition.visible).val(userFirstName);
    }
    @Step("Ввод фамилии")
    public void inputLastUserName(String userLastName){
        lastName.should(Condition.visible).val(userLastName);
    }
    @Step("Ввод почты")
    public void inputUserEmail(String userEmail){
        eMail.should(Condition.visible).val(userEmail);
    }
    @Step("Ввод возраста")
    public void inputUserAge(int  userAge){
        age.should(Condition.visible).val(String.valueOf(userAge));
    }
    @Step("Ввод зарплвты")
    public void inputSalary(int userSalary){
        salary.should(Condition.visible).val(String.valueOf(userSalary));
    }
    @Step("Ввод департаминта")
    public void inputDepartment(String userDepartment){
        department.should(Condition.visible).val(String.valueOf(userDepartment));
    }
    @Step("Нажатие кнопки\"submit\"")
    public void submit(){
        submit.should(Condition.visible).click();
    }

}

