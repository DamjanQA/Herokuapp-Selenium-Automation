package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemovePageTest extends BaseTest {

    @Test(priority = 10)
    public void isUserOnAddRemovePage() throws InterruptedException {

        mainPage.clickOnAddRemoveLink();

        // checks whether we are on the right address
        String expectedURL = "https://the-internet.herokuapp.com/add_remove_elements/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }

    @Test(priority = 20)
    public void addElementButtonIsDisplayed() throws InterruptedException {

        mainPage.clickOnAddRemoveLink();

        // is the add element button shown
        Assert.assertTrue(addRemovePage.getAddElementButton().isDisplayed());
    }

    @Test(priority = 30)
    public void addElementButtonIsWorking() throws InterruptedException {

        mainPage.clickOnAddRemoveLink();

        // can we add 3 elements (delete)
        addRemovePage.addThreeElements();
        Assert.assertEquals(addRemovePage.getDeleteButtons().size(), 3);
    }

    @Test(priority = 40)
    public void deleteButtonIsWorking() throws InterruptedException {

        mainPage.clickOnAddRemoveLink();

        addRemovePage.addThreeElements();

        // tests whether we can delete 1 element (delete button)
        addRemovePage.clickOnDeleteButtons();

        // we assert that there are now 2 delete buttons instead of the original 3
        Assert.assertEquals(addRemovePage.getDeleteButtons().size(), 2);
    }
}
