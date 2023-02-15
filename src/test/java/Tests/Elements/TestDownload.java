package Tests.Elements;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

@Feature("Elements")
public class TestDownload extends BaseTest {
    @Test
    @Link(name = "Upload and Download",url="https://demoqa.com/upload-download")
    @DisplayName("Тест заугрузки и выгрузки")
    public void testDownloadUpload(){
        step1();
        step2();
        step3();
    }
    @Step("Переход на страницу \"Upload and Download\"")
    public void step1(){
        upDownload.transition.transitionAndScroll("div.left-pannel");
    }
    @Step("Загрузка файла с сайта")
    public void step2() {
        upDownload.downloadBtn.clickA();
        upDownload.waitDownload(new File("data"));
    }
    @Step("Выгрузка файла на сайт")
    public void step3(){
        upDownload.upload.uploadFileInput(new File("data/sampleFile.jpeg"));
        upDownload.uploadedFilePath.checkTextP("C:\\fakepath\\sampleFile.jpeg");

        upDownload.deleteFiles();
    }

}
