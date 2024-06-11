package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownPage {
    WebDriver driver;
    WebElement dropdown;
    WebElement dropdownMenuSelection;
    WebElement option1;
    WebElement option2;


    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDropdown() {
        return driver.findElement(By.id("dropdown"));
    }

    public WebElement getDropdownMenuSelection() {
        return driver.findElement(By.cssSelector("option[selected='selected']"));
    }

    public WebElement getOption1() {
        return driver.findElement(By.cssSelector("option[value='1']"));
    }

    public WebElement getOption2() {
        return driver.findElement(By.cssSelector("option[value='2']"));
    }

    // ---------------------------

    public void clickOnDropdownMenuSelection() {
        getDropdownMenuSelection().click();
    }

    public void clickOnOption1() {
        getOption1().click();
    }

    public void clickOnOption2 () {
        getOption2().click();
    }
}
