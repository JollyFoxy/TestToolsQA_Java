package Tests;

import Interfasces.IAll;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import tools.WebDrivers.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements IAll{
    @BeforeAll
    static void beforeConfig() {
        Configuration.browser= WebDriver.class.getName();
        Configuration.timeout = 10000;
        open(baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();
//        Configuration.timeout = 6000;
//        Configuration.browserSize = "1720x1080";
    }/*
    @BeforeEach
    public void before() {
    }*/
}