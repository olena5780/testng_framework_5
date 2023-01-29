package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechGlobalIFramesPage extends TechGlobalBasePage{

    public TechGlobalIFramesPage(){
        super();
    }

    @FindBy(css = "#name_form > p")
    public WebElement inputHeader;

    @FindBy(css = "#form_frame")
    public WebElement iFrameId;
/*
    @FindBy(css = "(//div[@class='control mt-2'])[1]")
    public WebElement inputFirstName;

    @FindBy(css = "(//div[@class='control mt-2'])[2]")
    public WebElement inputLastName;

 */

    @FindBy(id = "submit")
    public WebElement submitButton;


    @FindBy(css = ".input")
    public List<WebElement> inputFields;
    @FindBy(id = "result")
    public WebElement result;






}
