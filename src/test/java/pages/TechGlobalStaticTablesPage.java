package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import scripts.TechGlobalBase;

import java.util.List;

public class TechGlobalStaticTablesPage extends TechGlobalBasePage {

    public TechGlobalStaticTablesPage(){
        super();
    }

    @FindBy(css =".header")
    public List<WebElement> tableHeader;


}
