package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemovePage {

    WebDriver driver;
    WebElement addElementButton;
    List<WebElement> deleteButtons;

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddElementButton() {
        return driver.findElement(By.cssSelector("button[onclick='addElement()']"));
    }

    public List<WebElement> getDeleteButtons() {
        return driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
    }

    // ------------------------------

    public void clickOnAddElementButton () {
        getAddElementButton().click();
    }

    public void clickOnDeleteButtons () {
        getDeleteButtons().get(0).click();
    }

    public void addThreeElements () {
        for (int i = 0; i < 3; i++) {
            clickOnAddElementButton();
        }
    }

}
