package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test(priority = 10)
    public void userIsOnFileUploadPage() throws InterruptedException {

        mainPage.clickOnFileUploadLink();

        String expectedURL = "https://the-internet.herokuapp.com/upload";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        // da li smo na pravoj stranici

    }

    @Test(priority = 20)
    public void fileUploadButtonsAreDisplayed() throws InterruptedException {

        mainPage.clickOnFileUploadLink();

        Assert.assertTrue(fileUploadPage.getUploadFile().isDisplayed());
        Assert.assertTrue(fileUploadPage.getSubmitButton().isDisplayed());
    }

    @Test(priority = 30)
    public void userCanUploadFile() throws InterruptedException {

        mainPage.clickOnFileUploadLink();

        fileUploadPage.getUploadFile().clear();
        fileUploadPage.getUploadFile().sendKeys(""); // add path here
        fileUploadPage.clickOnSubmitButton();

        // da li se prikazuje dobar uplodovani fajl
        Assert.assertTrue(fileUploadPage.getUploadedFile().isDisplayed());
        Assert.assertEquals(fileUploadPage.getUploadedFile().getText(), ""); // file name

        //da li smo dobili dobru poruku
        Assert.assertEquals(fileUploadPage.getDisplayMessage().getText(), "File Uploaded!");
    }

}
