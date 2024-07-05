package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage {

    WebDriver driver;
    List<WebElement> checkboxes;

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCheckboxes() {
        return driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));
    }


}
