package Page.Elements;

import Page.BasePage;
import com.codeborne.selenide.Selenide;
import tools.Elements.A;
import tools.Elements.Input;
import tools.Elements.P;
import tools.Elements.Transition;

import java.io.File;
import java.lang.reflect.Field;

import static com.codeborne.selenide.Selenide.$x;

public class UploadAndDownload extends BasePage {
    public Transition transition =new Transition("Elements","Upload and Download");
    public A downloadBtn =new A($x("//a[@id='downloadButton']"));
    public Input upload = new Input($x("//input[@class='form-control-file']"));
    public P uploadedFilePath= new P("uploadedFilePath");
    private boolean isDirectoryEmpty(File directory) {
        String[] files = directory.list();
        assert files != null;
        return files.length == 0;
    }
    public void waitDownload(File directory){
        while (isDirectoryEmpty(directory)){
            Selenide.sleep(1);
        }
    }
}
