package Tests.UITests;

import Utils.TestConf;
import Utils.WebDrivers.WebDriver;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest{

    protected static TestConf testConfig = ConfigFactory.create(TestConf.class);
    @BeforeAll
    static void beforeConfig() {
        Configuration.browser = WebDriver.class.getName();
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }
    @BeforeEach
    public void before() {
        open(testConfig.baseURL());
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1920,1080));
    }
}