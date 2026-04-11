package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class InventoryForm {

    WebDriver driver;

    @FindBy(id = "inventory-form")
    WebElement verifyInventoryFormIsShown_id;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropDown_id;

    @FindBy(id = "brand")
    WebElement brandDropDown_id;

    @FindBy(xpath = "//*[@id=\"device-preview\"]/div/div/div[1]")
    WebElement devicePreview_xpath;

    @FindBy(id = "storage-128GB")
    WebElement deviceStorage_id;

    @FindBy(id = "unit-price-value")
    WebElement unitPrice_id;

    @FindBy(id = "color")
    WebElement deviceColorDropDown_id;

    @FindBy(xpath = "//*[@id=\"device-preview\"]/div/div/div[3]/strong[1]")
    WebElement deviceColorBlue_id;

    @FindBy(id = "quantity")
    WebElement quantity_id;

    @FindBy(id = "subtotal-value")
    WebElement subTotal_id;

    @FindBy(id = "address")
    WebElement address_id;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton_id;


    public InventoryForm(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyInventoryFormIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(verifyInventoryFormIsShown_id));
        verifyInventoryFormIsShown_id.isDisplayed();
    }

    public void userClickDeviceTypeDropDown() {
        deviceTypeDropDown_id.click();
    }

    public void userSelectDeviceType() {
        Select dropdown1 = new Select(deviceTypeDropDown_id);
        dropdown1.selectByVisibleText("Phone");

    }

    public void verifyBrandDropDownIsEnabled() {
        brandDropDown_id.isEnabled();
    }

    public void userSelectBrand() {
        Select brandDropdown = new Select(brandDropDown_id);
        brandDropdown.selectByVisibleText("Apple");
    }

    public void verifyDevicePreviewIsDisplayed() {
        devicePreview_xpath.isDisplayed();
    }

    public void userSelectDeviceStorage() {
        deviceStorage_id.click();
    }

    public void verifyUnitPriceIsDisplayed() {
        String unitPrice = unitPrice_id.getText();
        Assert.assertEquals(unitPrice, "R480.00");
    }

    public void userSelectColor() {
        Select ColorDropdown = new Select(deviceColorDropDown_id);
        ColorDropdown.selectByVisibleText("Blue");
    }

    public void verifySelectedColorBlueIsDisplayed() {

        deviceColorDropDown_id.isDisplayed();
    }

    public void userEntersQuantity() throws InterruptedException {

        quantity_id.sendKeys(Keys.ARROW_UP);
        Thread.sleep(1000);
        quantity_id.sendKeys(Keys.ARROW_UP);

    }

    public void verifySubtotal() {
        String subTotal = subTotal_id.getText();
        Assert.assertEquals(subTotal, "R960.00");
    }

    public void userEntersAddress() {
        address_id.sendKeys("123 Test Street");

        String fieldValue = address_id.getAttribute("123 Test Street");
        if (fieldValue == null || fieldValue.isEmpty()) {
            System.out.println("Address is empty");
        }


    }

    public void userClicksNext() {

        nextButton_id.click();
    }

}
