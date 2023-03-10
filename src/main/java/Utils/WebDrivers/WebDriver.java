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

public class WebDriver implements WebDriverProvider {
    public org.openqa.selenium.WebDriver driver;

    @Nonnull
    @Override
    public org.openqa.selenium.WebDriver createDriver(@Nonnull Capabilities capabilities) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--lang=ru");
        options.addArguments("--disable-dev-shm-usage");

        options.setCapability(PAGE_LOAD_STRATEGY, "normal");

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", new File(".").getAbsolutePath() + "data");
        options.setExperimentalOption("prefs", prefs);

        WebDriverManager.chromedriver().version("110.0.5481.77").setup();
        driver = new ChromeDriver(options);
        return driver;
    }
}