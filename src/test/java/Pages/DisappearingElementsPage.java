package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DisappearingElementsPage {

    WebDriver driver;
    WebElement gallery;

    public DisappearingElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getGallery() {
        return driver.findElement(By.linkText("Gallery"));
    }

    // -----------------------------

    public void galleryBeforeRefresh() {
        boolean galleryIsDisplayed = false;
        try {
            galleryIsDisplayed = getGallery().isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }

        // checks before getting refreshed
        if (galleryIsDisplayed == false) {
            Assert.assertFalse(galleryIsDisplayed);
            System.out.println("\nGallery element nije prikazan pre refresha");
        } else {
            Assert.assertTrue(galleryIsDisplayed);
            System.out.println("\nGallery element je prikazan pre refresha");
        }
    }

    public void galleryAfterRefresh() {
        boolean galleryIsDisplayed = false;
        try {
            galleryIsDisplayed = getGallery().isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }

        do {
            driver.navigate().refresh();
            try {
                galleryIsDisplayed = getGallery().isDisplayed();
            } catch (Exception e) {
                System.out.println(e);
            }
            if (galleryIsDisplayed == false) {
                Assert.assertFalse(galleryIsDisplayed);
                System.out.println("\nGallery element nije prikazan posle refresha");
                // repeats until true
            } else {
                Assert.assertTrue(galleryIsDisplayed);
                System.out.println("\nGallery element je prikazan posle refresha");
                // this should be the last msg displayed in console
            }
        } while (galleryIsDisplayed == false);
    }
}


