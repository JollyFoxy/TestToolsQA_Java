package Utils.Elements;

import com.codeborne.selenide.SelenideElement;

/**Элкемент Li*/
public class Li extends BaseElement{
    public Li(SelenideElement container){
        super(container);
    }
    public void clickLi(){
        container.click();
    }
}
