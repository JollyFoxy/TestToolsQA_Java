package Tests;

import org.junit.jupiter.api.Test;

public class TestBasePage extends BaseTest{
    @Test
    public void TeatBasePage(){
        pageBase.transitionElements();

        pageBase.checkElement("Text Box","Check Box","Radio Button",
                "Web Tables","Buttons","Links","Broken Links - Images",
                "Upload and Download","Dynamic Properties");

    }
}
