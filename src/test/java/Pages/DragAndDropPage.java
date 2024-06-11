package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDropPage {

    WebDriver driver;
    public WebElement from;
    public WebElement to;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFrom() {
        return driver.findElement(By.id("column-a"));
    }

    public WebElement getTo() {
        return driver.findElement(By.id("column-b"));
    }

    // --------------------------------

    public void fromAtoB() {
        Actions builder = new Actions(driver);
        builder.dragAndDrop(getFrom(), getTo()).perform();
    }

    public void fromBtoA() {
        Actions builder = new Actions(driver);
        builder.dragAndDrop(getTo(), getFrom()).perform();
    }

    public void assertInitialPositionBeforeSwitch () {
        String expectedTextABefore = "A";
        Assert.assertEquals(getFrom().getText(), expectedTextABefore);

        String expectedTextBBefore = "B";
        Assert.assertEquals(getTo().getText(), expectedTextBBefore);
    }

    public void assertInitialPositionAfterSwitch () {
        String expectedTextBAfter = "B";
        Assert.assertEquals(getFrom().getText(), expectedTextBAfter);

        String expectedTextAAfter = "A";
        Assert.assertEquals(getTo().getText(), expectedTextAAfter);
    }


}
