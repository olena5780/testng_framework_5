package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalIFramesPage;
import utilities.Waiter;

public class TechGlobalIFramesTest extends TechGlobalBase {


    /**
     * Go to https://techglobal-training.netlify.app/
     * Click on “Practices” dropdown in the header
     * Select the “Frontend Testing” option
     * Click on the “IFrames” card
     * Validate the “Please fill out your information below” text
     */

    @BeforeMethod
    public void setPage() {
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalIFramesPage = new TechGlobalIFramesPage();
        techGlobalFrontendTestingHomePage.getFrontedTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("IFrames");
    }

    @Test(priority = 1, description = "Validating input header text")
    public void validateInputText() {
        driver.switchTo().frame(techGlobalIFramesPage.iFrameId);
        Assert.assertTrue(techGlobalIFramesPage.inputHeader.isDisplayed());
        Assert.assertEquals(techGlobalIFramesPage.inputHeader.getText(), "Please fill out your information below");
        Waiter.pause(3);
    }
/*
    Go to https://techglobal-training.netlify.app/
    Click on “Practices” dropdown in the header
    Select the “Frontend Testing” option
    Click on the “IFrames” card
    Enter “John” to first name input box
    Enter “Doe” to last name input box
    Click on “SUBMIT” button
    Validate the result equals “You entered: John Doe”
            */

    @Test(priority = 2 , description = "Validate the result equals ")
    public void validateResults() {
        driver.switchTo().frame(techGlobalIFramesPage.iFrameId); // switching iFrame by wedElement
        // techGlobalIFramesPage.inputFirstName.sendKeys("John");
        // techGlobalIFramesPage.inputLastName.sendKeys("Doe");
        String[] credentials = {"John", "Doe"};

        for (int i = 0; i < credentials.length; i++) {
            techGlobalIFramesPage.inputFields.get(i).sendKeys(credentials[i]);
        }

        techGlobalIFramesPage.submitButton.click();
        driver.switchTo().defaultContent(); // switching iFrame to parent
        Assert.assertEquals(techGlobalIFramesPage.result.getText(), "You entered " + credentials[0] + " " + credentials[1]);



    }





}