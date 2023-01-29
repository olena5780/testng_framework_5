package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TechGlobalFileUploadPage extends TechGlobalBasePage{

    public TechGlobalFileUploadPage(){
        super();
    }

    @FindBy (css = "#file_upload")
    public WebElement fileUploadInput;

    @FindBy (css = "#file_submit")
    public WebElement uploadButton;

    @FindBy(css = "#result")
    public WebElement result;
}
