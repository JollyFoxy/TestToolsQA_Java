package tools;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.Nonnull;
import java.util.concurrent.TimeUnit;

public class WebDriver implements WebDriverProvider {
    public org.openqa.selenium.WebDriver driver;

    @Nonnull
    @Override
    public org.openqa.selenium.WebDriver createDriver(@Nonnull Capabilities capabilities) {
        ChromeOptions options = new ChromeOptions();

//        options.merge(capabilities);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options.addArguments("no-sandbox", "--disable-gpu","headless"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}