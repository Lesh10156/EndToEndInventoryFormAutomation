package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenShots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
    InventoryForm inventoryForm = PageFactory.initElements(driver, InventoryForm.class);
    OrderReviewInventoryForm orderReviewInventoryForm = PageFactory.initElements(driver, OrderReviewInventoryForm.class);

    TakeScreenShots takeScreenshots = new TakeScreenShots();


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}