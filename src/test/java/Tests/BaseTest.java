package Tests;

import Interfasces.IAll;
import Steps.tools.WebDriver;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements IAll{

    private static final String baseUrl ="https://demoqa.com/";
    @BeforeAll
    static void beforeConfig() {
        Configuration.browser= WebDriver.class.getName();
    }
    @BeforeEach
    public void before() {
        open(baseUrl);
    }
}
