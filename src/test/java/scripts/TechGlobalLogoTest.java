package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TechGlobalBasePage;
import utilities.Waiter;

public class TechGlobalLogoTest extends TechGlobalBase{

    @Test
    public void validateTechGlobalLogo(){
       // WebElement logo = driver.findElement(By.id("logo"));
        Waiter.waitForVisibilityOfElement(techGlobalBasePage.logo, 30);
        Assert.assertTrue(techGlobalBasePage.logo.isDisplayed());

    }



}
