package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFileDownloadPage;
import pages.TechGlobalFrontendTestingHomePage;

public class TechGlobalFileDownloadTest extends TechGlobalBase{

    /**
     * Go to https://techglobal-training.netlify.app/
     * Click on “Practices” dropdown in the header
     * Select the “Frontend Testing” option
     * Click on the “File Download” card
     * Click on the “TechGlobal School.pptx” file
     */

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalFileDownloadPage = new TechGlobalFileDownloadPage();
        techGlobalFrontendTestingHomePage.getFrontedTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("File Download");
    }

    @Test( priority = 1, description = "Validate file downloaded")
    public void validateFileDownloaded(){
        techGlobalFileDownloadPage.downloadFile.click();
        Assert.assertEquals(techGlobalFileDownloadPage.downloadFile.getText(), "TechGlobal School.pptx");
    }

}
