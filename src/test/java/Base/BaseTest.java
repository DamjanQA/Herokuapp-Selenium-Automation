package Base;

//Domaci za nedelju:
//Prepraviti domaci od srede tako da ga uradite koristeci POM

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public MainPage mainPage;
    public AddRemovePage addRemovePage;
    public CheckboxesPage checkboxesPage;
    public DragAndDropPage dragAndDropPage;
    public DisappearingElementsPage disappearingElementsPage;
    public DropdownPage dropdownPage;
    public FileUploadPage fileUploadPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainPage = new MainPage(driver);
        addRemovePage = new AddRemovePage(driver);
        checkboxesPage = new CheckboxesPage(driver);
        dragAndDropPage = new DragAndDropPage(driver);
        disappearingElementsPage = new DisappearingElementsPage(driver);
        dropdownPage = new DropdownPage(driver);
        fileUploadPage = new FileUploadPage(driver);
    }

    @BeforeMethod
    public void PageSetup() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
