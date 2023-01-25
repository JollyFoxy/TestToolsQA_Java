package tools.Elements;

import com.codeborne.selenide.SelenideElement;

public class A extends BaseElement {

    public A(SelenideElement container ){
        super(container);
    }
    public void hoverA(){
        container.hover();
    }
    public void clickA(){
        container.click();
    }

}
