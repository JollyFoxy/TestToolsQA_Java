package Page;

import io.qameta.allure.Step;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;

import java.io.File;

import static com.codeborne.selenide.Selenide.$x;

public abstract class BasePage {
    @SneakyThrows
    @Step("Удалить файлы из дириктории \"data\"")
    public void deleteFiles() {
        File directory = new File(new File(".") + "/data");
        FileUtils.cleanDirectory(directory);
    }
    @Step("Нажать на  капчу")
    public void captchaClick(){
        $x("//iframe[starts-with(@name, 'a-') and " +
                "starts-with(@src, 'https://www.google.com/recaptcha')]").click();

    }
}
