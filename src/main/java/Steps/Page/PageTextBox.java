package Steps.Page;

import Persons.Person;
import io.qameta.allure.Step;
import tools.*;

public class PageTextBox {
    private final Transition transition = new Transition("Elements","Text Box");
    private final Input fulName = new Input("userName");
    private final Input eMail = new Input("userEmail");
    private final TextArea currentAddress = new TextArea("currentAddress");
    private final TextArea permanentAddress = new TextArea("permanentAddress");
    private final Button btnSubmit = new Button("submit");
    private final P checkName =new P("name");
    private final P checkEmail = new P("email");
    private final P checkCurrentAddress = new P("currentAddress");
    private final P checkPermanentAddress = new P("permanentAddress");

    @Step("Перейти с домашней страницы на страницу \"Text Box\"")
    public void transitionTextBox() {
        transition.transitionAll();
    }
    @Step("Заполнить поле \"Full Name\"")
    public void inputFullName(String name){
        fulName.setValueInput(name);
    }
    @Step("Заполнить поле \"Email\"")
    public void inputEmail(String email) {
        eMail.setValueInput(email);
    }
    @Step("Зполнить поле \"Current Address\"")
    public void inputCurrentAddress(String address) {
        currentAddress.setValueTextArea(address);
    }
    @Step("Зполнить поле \"Permanent Address\"")
    public void inputPermanentAddress(String address) {
        permanentAddress.setValueTextArea(address);
    }
    @Step("Кликнуть на  кнопку \"Submit\"")
    public void submit(){
        btnSubmit.clickBtn();
    }
    @Step("Проверка введёной информации")
    public void checkInfo(Person person){
        checkName.checkTextP(person.getName());
        checkEmail.checkTextP(person.getEmail());
        checkCurrentAddress.checkTextP(person.getCurrentAddress());
        checkPermanentAddress.checkTextP(person.getPermanentAddress());
    }
}