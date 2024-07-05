package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test(priority = 10)
    public void userIsOnDropdownPage() throws InterruptedException {

        mainPage.clickOnDropdownPageLink();

        String expectedURL = "https://the-internet.herokuapp.com/dropdown";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        // are we on the right page
    }

    @Test(priority = 20)
    public void defaultMenuIsDisplayed() throws InterruptedException {

        mainPage.clickOnDropdownPageLink();

        Assert.assertTrue(dropdownPage.getDropdown().isDisplayed());
        // checks whether there's actually a menu

        // asserts default msg before selection
        Assert.assertEquals(dropdownPage.getDropdownMenuSelection().getText(), "Please select an option");
    }

    @Test(priority = 30)
    public void userCanSelectOption1() throws InterruptedException {

        mainPage.clickOnDropdownPageLink();

        dropdownPage.clickOnDropdownMenuSelection();

        dropdownPage.clickOnOption1();
        Assert.assertEquals(dropdownPage.getDropdownMenuSelection().getText(), "Option 1");
        // proveravamo da li se menja displejovan tekst kada kliknemo menja na "Option 1"

    }

    @Test(priority = 40)
    public void userCanSelectOption2() throws InterruptedException {

        mainPage.clickOnDropdownPageLink();

        dropdownPage.clickOnDropdownMenuSelection();

        dropdownPage.clickOnOption2();
        Assert.assertEquals(dropdownPage.getDropdownMenuSelection().getText(), "Option 2");
        // proveravamo da li se menja displejovan tekst kada kliknemo menja na "Option 2"
    }
}
