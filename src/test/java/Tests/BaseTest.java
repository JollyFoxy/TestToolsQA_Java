package Tests;

import Interfasces.IAll;
import Utils.TestConf;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements IAll{

    protected static TestConf testConfig = ConfigFactory.create(TestConf.class);
    @BeforeAll
    static void beforeConfig() {
        //Url удалённого веб драйвера
        Configuration.remote = testConfig.remoteURL();
        //Определяем какой браузер будем использовать
        Configuration.browser = "chrome"/*WebDriver.class.getName()*/;
        //Размер окна браузера
        Configuration.browserSize = "1920x1080";
        //Создаём объект класса DesiredCapabilities, используется как настройка  вашей конфигурации с помощью пары ключ-значение
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //Включить поддержку отображения экрана браузера во время выполнения теста
        capabilities.setCapability("enableVNC", true);
        //Включение записи видео в процессе выполнения тестов
        capabilities.setCapability("enableVideo",  true);
        //Переопределяем Browser capabilities
        Configuration.browserCapabilities = capabilities;
        Configuration.timeout = 10000;
    }
    @BeforeEach
    public void before() {
        open(testConfig.baseURL());
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1920,1080));
    }
}