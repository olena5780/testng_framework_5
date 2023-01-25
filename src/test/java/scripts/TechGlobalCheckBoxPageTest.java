package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalCheckBoxPage;
import pages.TechGlobalFrontendTestingHomePage;
import utilities.Waiter;

public class TechGlobalCheckBoxPageTest extends TechGlobalBase{
    /*
    Go to https://techglobal-training.netlify.app/
Click on "Practices" dropdown in the header
Select the "Frontend Testing" option
Click on the "Checkboxes" card
Validate "Apple" and "Microsoft" checkboxes are displayed, enabled and not selected
Select both and validate they are both selected
Deselect both and validate they are deselected
     */

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalCheckBoxPage = new TechGlobalCheckBoxPage();
    }

    @Test(priority = 1, description = "Validate checkboxes")
    public void validateCheckboxes(){

        techGlobalFrontendTestingHomePage.getFrontedTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(6);

        for (int i = 0; i < techGlobalCheckBoxPage.checkboxInput.size(); i++) {
            Assert.assertTrue(techGlobalCheckBoxPage.checkboxInput.get(i).isDisplayed());
            Assert.assertFalse(techGlobalCheckBoxPage.checkboxInput.get(i).isSelected());
            Assert.assertTrue(techGlobalCheckBoxPage.checkboxInput.get(i).isEnabled());
        }

        for (int i = 0; i < techGlobalCheckBoxPage.checkboxInput.size(); i++) {
            techGlobalCheckBoxPage.checkboxLabel.get(i).click();
            Waiter.pause(1);
            Assert.assertTrue(techGlobalCheckBoxPage.checkboxInput.get(i).isSelected());
        }

        for (int i = 0; i < techGlobalCheckBoxPage.checkboxInput.size(); i++) {
            techGlobalCheckBoxPage.checkboxLabel.get(i).click();
            Waiter.pause(1);
            Assert.assertFalse(techGlobalCheckBoxPage.checkboxInput.get(i).isSelected());
        }
    }
    /*
    Go to https://techglobal-training.netlify.app/
Click on "Practices" dropdown in the header
Select the "Frontend Testing" option
Click on the "Checkboxes" card
Validate "Tesla" and "SpaceX" checkboxes are displayed, enabled and not selected
Select both and validate they are both selected
Deselect bpth and validate they are deselected (edited)
     */

    @Test(priority = 2, description = "Validate practice")
    public void validatePractice(){

        techGlobalFrontendTestingHomePage.getFrontedTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(6);

      techGlobalCheckBoxPage.practiceInput.forEach(cb ->  {
            Assert.assertTrue(cb.isDisplayed());
            Assert.assertFalse(cb.isSelected());
            Assert.assertTrue(cb.isEnabled());
        });

        for (int i = 0; i < techGlobalCheckBoxPage.practiceInput.size(); i++) {
            techGlobalCheckBoxPage.practiceLabel.get(i).click();
            Waiter.pause(1);
            Assert.assertTrue(techGlobalCheckBoxPage.practiceInput.get(i).isSelected());
        }

        for (int i = 0; i < techGlobalCheckBoxPage.practiceInput.size(); i++) {
            techGlobalCheckBoxPage.practiceLabel.get(i).click();
            Waiter.pause(1);
            Assert.assertFalse(techGlobalCheckBoxPage.practiceInput.get(i).isSelected());
        }
    }
}
