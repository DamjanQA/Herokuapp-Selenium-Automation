package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemovePageTest extends BaseTest {

    @Test(priority = 10)
    public void isUserOnAddRemovePage() throws InterruptedException {

        mainPage.clickOnAddRemoveLink();

        // assertujemo da smo na dobroj adresi
        String expectedURL = "https://the-internet.herokuapp.com/add_remove_elements/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }

    @Test(priority = 20)
    public void addElementButtonIsDisplayed() throws InterruptedException {

        mainPage.clickOnAddRemoveLink();

        // assertujemo da je prikazano Add Element dugme
        Assert.assertTrue(addRemovePage.getAddElementButton().isDisplayed());
    }

    @Test(priority = 30)
    public void addElementButtonIsWorking() throws InterruptedException {

        mainPage.clickOnAddRemoveLink();

        // proveravamo da li možemo da dodamo npr. 3 elementa (delete)
        addRemovePage.addThreeElements();
        Assert.assertEquals(addRemovePage.getDeleteButtons().size(), 3);
    }

    @Test(priority = 40)
    public void deleteButtonIsWorking() throws InterruptedException {

        mainPage.clickOnAddRemoveLink();

        addRemovePage.addThreeElements();

        // testiramo da li funkcioniše delete dugme (brišemo 1 element)
        addRemovePage.clickOnDeleteButtons();

        // assertujemo da sada ima 2 umesto 3 dugimića (delete)
        Assert.assertEquals(addRemovePage.getDeleteButtons().size(), 2);
    }
}
