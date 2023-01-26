package Tests.Elements;

import Tests.BaseTest;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import java.io.File;

public class TestDownload extends BaseTest {
    @Test
    public void testDownloadUpload(){
        step1();
    }
    @Step
    public void step1(){
        upDownload.transition.transitionAndScroll("div.left-pannel");
        upDownload.downloadBtn.clickA();
        upDownload.upload.uploadFileInput(new File("/home/pavel/IdeaProjects/TestToolsQA/data/sampleFile.jpeg"));
        upDownload.uploadedFilePath.checkTextP("C:\\fakepath\\sampleFile.jpeg");
    }

}
