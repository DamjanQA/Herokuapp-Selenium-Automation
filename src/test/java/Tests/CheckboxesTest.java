package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {

    @Test(priority = 10)
    public void userIsOnCheckboxesPage() {

        mainPage.clickOnCheckboxesLink();

        // asserting whether we are on the right address
        String expectedURL = "https://the-internet.herokuapp.com/checkboxes";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }

    @Test(priority = 20)
    public void checkboxesAreDisplayed() {

        mainPage.clickOnCheckboxesLink();

        Assert.assertEquals(checkboxesPage.getCheckboxes().size(), 2);
        // asserting whether both elements are present
    }

    @Test(priority = 30)
    public void userCanCheckUncheckedBox() throws InterruptedException {

        mainPage.clickOnCheckboxesLink();

        // check whether boxes are ticked
        boolean checkbox1InitialState = checkboxesPage.getCheckboxes().get(0).isSelected();
        boolean checkbox2InitialState = checkboxesPage.getCheckboxes().get(1).isSelected();

        // clicks first one if unticked
        if (checkbox1InitialState == false) {
            checkboxesPage.getCheckboxes().get(0).click();
        }

        // clicks second one if unticked
        if (checkbox2InitialState == false) {
            checkboxesPage.getCheckboxes().get(1).click();
        }

        // asserts that both boxes are ticked (selected)
        Assert.assertTrue(checkboxesPage.getCheckboxes().get(0).isSelected());
        Assert.assertTrue(checkboxesPage.getCheckboxes().get(1).isSelected());
    }

    @Test(priority = 40)
    public void userCanUncheckCheckedBox() throws InterruptedException {

        mainPage.clickOnCheckboxesLink();

        // checking whether the boxes are ticked
        boolean checkbox1InitialState = checkboxesPage.getCheckboxes().get(0).isSelected();
        boolean checkbox2InitialState = checkboxesPage.getCheckboxes().get(1).isSelected();

        // clicks first one if unticked
        if (checkbox1InitialState == true) {
            checkboxesPage.getCheckboxes().get(0).click();
        }

        // clicks second one if unticked
        if (checkbox2InitialState == true) {
            checkboxesPage.getCheckboxes().get(1).click();
        }

        // asserting whether both are selected
        Assert.assertFalse(checkboxesPage.getCheckboxes().get(0).isSelected());
        Assert.assertFalse(checkboxesPage.getCheckboxes().get(1).isSelected());
    }
}
