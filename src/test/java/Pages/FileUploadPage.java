package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {
    WebDriver driver;
    WebElement uploadFile;
    WebElement submitButton;
    WebElement uploadedFile;
    WebElement displayMessage;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUploadFile() {
        return driver.findElement(By.id("file-upload"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("file-submit"));
    }

    public WebElement getUploadedFile() {
        return driver.findElement(By.id("uploaded-files"));
    }

    public WebElement getDisplayMessage() {
        return driver.findElement(By.tagName("h3"));
    }

    // -----------------------

    public void clickOnSubmitButton () {
        getSubmitButton().click();
    }


}
