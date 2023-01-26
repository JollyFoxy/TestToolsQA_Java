package Page.Elements;

import tools.Elements.A;
import tools.Elements.Input;
import tools.Elements.P;
import tools.Elements.Transition;

import static com.codeborne.selenide.Selenide.$x;

public class UploadAndDownload {
    public Transition transition =new Transition("Elements","Upload and Download");
    public A downloadBtn =new A($x("//a[@id='downloadButton']"));
    public Input upload = new Input($x("//input[@class='form-control-file']"));
    public P uploadedFilePath= new P("uploadedFilePath");
}
