package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {

    @Test(priority = 10)
    public void userIsOnCheckboxesPage() {

        mainPage.clickOnCheckboxesLink();

        // assertujemo da smo na dobroj adresi
        String expectedURL = "https://the-internet.herokuapp.com/checkboxes";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }

    @Test(priority = 20)
    public void checkboxesAreDisplayed() {

        mainPage.clickOnCheckboxesLink();

        Assert.assertEquals(checkboxesPage.getCheckboxes().size(), 2);
        // assertujemo da li su oba elementa prisutna
    }

    @Test(priority = 30)
    public void userCanCheckUncheckedBox() throws InterruptedException {

        mainPage.clickOnCheckboxesLink();

        // proveravamo da li su tickovani boxevi
        boolean checkbox1InitialState = checkboxesPage.getCheckboxes().get(0).isSelected();
        boolean checkbox2InitialState = checkboxesPage.getCheckboxes().get(1).isSelected();

        // klikćemo prvi ako je untickovan
        if (checkbox1InitialState == false) {
            checkboxesPage.getCheckboxes().get(0).click();
        }

        // klikćemo drugi ako je untickovan
        if (checkbox2InitialState == false) {
            checkboxesPage.getCheckboxes().get(1).click();
        }

        // assertujemo da su oba selektovana (tj. checkovana)
        Assert.assertTrue(checkboxesPage.getCheckboxes().get(0).isSelected());
        Assert.assertTrue(checkboxesPage.getCheckboxes().get(1).isSelected());
    }

    @Test(priority = 40)
    public void userCanUncheckCheckedBox() throws InterruptedException {

        mainPage.clickOnCheckboxesLink();

        // proveravamo da li su tickovani boxevi
        boolean checkbox1InitialState = checkboxesPage.getCheckboxes().get(0).isSelected();
        boolean checkbox2InitialState = checkboxesPage.getCheckboxes().get(1).isSelected();

        // klikćemo prvi ako je untickovan
        if (checkbox1InitialState == true) {
            checkboxesPage.getCheckboxes().get(0).click();
        }

        // klikćemo drugi ako je untickovan
        if (checkbox2InitialState == true) {
            checkboxesPage.getCheckboxes().get(1).click();
        }

        // assertujemo da su oba selektovana (tj. unchekovana)
        Assert.assertFalse(checkboxesPage.getCheckboxes().get(0).isSelected());
        Assert.assertFalse(checkboxesPage.getCheckboxes().get(1).isSelected());
    }
}
