package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisappearingElementsTest extends BaseTest {

    @Test(priority = 10)
    public void userIsOnDisappearingElementsPage() {

        mainPage.clickOnDisappearingElementsLink();

        String expectedURL = "https://the-internet.herokuapp.com/disappearing_elements";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        // da li valja stranica
    }

    @Test(priority = 20)
    public void disappearingElementsBeforeRefresh() {

        mainPage.clickOnDisappearingElementsLink();

        disappearingElementsPage.galleryBeforeRefresh();
        // assertujemo da li se pokazuje element pre refresha
    }

    @Test(priority = 30)
    public void disappearingElementsAfterRefresh() {

        mainPage.clickOnDisappearingElementsLink();

        disappearingElementsPage.galleryAfterRefresh();
        // assertujemo da li se pokazuje element posle refresha
    }
}
