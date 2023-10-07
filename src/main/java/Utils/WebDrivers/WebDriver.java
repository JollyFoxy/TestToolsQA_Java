package Utils.WebDrivers;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.Nonnull;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.openqa.selenium.remote.CapabilityType.PAGE_LOAD_STRATEGY;

/**Конфигурация ChromeDriver*/
public class WebDriver implements WebDriverProvider {
    public org.openqa.selenium.WebDriver driver;

    @Nonnull
    @Override
    public org.openqa.selenium.WebDriver createDriver(@Nonnull Capabilities capabilities) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--lang=ru");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        options.setCapability(PAGE_LOAD_STRATEGY, "eager");

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", new File(".").getAbsolutePath() + "data");
        options.setExperimentalOption("prefs", prefs);

        WebDriverManager.chromedriver().driverVersion("117.0.5938.149").setup();
        driver = new ChromeDriver(options);
        return driver;
    }
}