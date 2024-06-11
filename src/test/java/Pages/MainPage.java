package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    WebDriver driver;
    WebElement addRemoveLink;
    WebElement checkboxesLink;
    WebElement dragAndDropLink;
    WebElement disappearingElementsLink;
    WebElement dropdownLink;
    WebElement fileUploadLink;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddRemoveLink() {
        return driver.findElement(By.linkText("Add/Remove Elements"));
    }

    public WebElement getCheckboxesLink() {
        return driver.findElement(By.linkText("Checkboxes"));
    }

    public WebElement getDragAndDropLink() {
        return driver.findElement(By.linkText("Drag and Drop"));
    }

    public WebElement getDisappearingElementsLink() {
        return driver.findElement(By.linkText("Disappearing Elements"));
    }

    public WebElement getDropdownLink() {
        return driver.findElement(By.linkText("Dropdown"));
    }

    public WebElement getFileUploadLink() {
        return driver.findElement(By.linkText("File Upload"));
    }

    // ----------------------------

    public void clickOnAddRemoveLink() {
        getAddRemoveLink().click();
    }

    public void clickOnCheckboxesLink() {
        getCheckboxesLink().click();
    }

    public void clickOnDragAndDropLink() {
        getDragAndDropLink().click();
    }

    public void clickOnDisappearingElementsLink() {
        getDisappearingElementsLink().click();
    }

    public void clickOnDropdownPageLink() {
        getDropdownLink().click();
    }

    public void clickOnFileUploadLink() {
        getFileUploadLink().click();
    }


}
