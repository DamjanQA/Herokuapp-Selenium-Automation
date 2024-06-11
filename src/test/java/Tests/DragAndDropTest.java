package Tests;

import Base.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {

    @Test(priority = 10)
    public void userIsOnDragAndDropPage() throws InterruptedException {

        mainPage.clickOnDragAndDropLink();

        // dal smo na dobroj stranici
        String expectedURL = "https://the-internet.herokuapp.com/drag_and_drop";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }

    @Test(priority = 20)
    public void elementsFromAndToAreDisplayed() throws InterruptedException {

        mainPage.clickOnDragAndDropLink();

        Assert.assertTrue(dragAndDropPage.getFrom().isDisplayed());
        Assert.assertTrue(dragAndDropPage.getTo().isDisplayed());
    }

    @Test(priority = 30)
    public void userCanDragAndDropAtoB() throws InterruptedException {
        mainPage.clickOnDragAndDropLink();

        // assertujemo inicijalne pozicije teksta A i B
        dragAndDropPage.assertInitialPositionBeforeSwitch();

        // obrćemo
        dragAndDropPage.fromAtoB();

        // assertujemo da su A i B zamenili mesta
        dragAndDropPage.assertInitialPositionAfterSwitch();
    }

    @Test(priority = 40)
    public void userCanDragAndDropBtoA() throws InterruptedException {
        mainPage.clickOnDragAndDropLink();

        // assertujemo inicijalne pozicije teksta A i B
        dragAndDropPage.assertInitialPositionBeforeSwitch();

        // obrćemo
        dragAndDropPage.fromBtoA();

        // assertujemo da su B i A zamenili mesta
        dragAndDropPage.assertInitialPositionAfterSwitch();
    }
}
