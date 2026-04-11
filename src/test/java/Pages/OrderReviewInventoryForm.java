package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class OrderReviewInventoryForm {
    WebDriver driver;

    @FindBy(id = "device-summary")
    WebElement deviceOrderSummary_id;

    @FindBy(id = "shipping-option-express")
    WebElement expressShipping_id;

    @FindBy(id = "breakdown-shipping-value")
    WebElement expressShippingValue_id;

    @FindBy(id = "warranty-option-1yr")
    WebElement warrantyOption1yr_id;

    @FindBy(id = "breakdown-warranty-value")
    WebElement warrantyValue_id;

    @FindBy(id = "discount-code")
    WebElement discountCode_id;

    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountCode_id;

    @FindBy(id = "breakdown-discount-value")
    WebElement DiscountCodeValue_id;

    @FindBy(id = "purchase-device-btn")
    WebElement confirmPurchaseButton_id;

    @FindBy(xpath = "//*[@id=\"purchase-success-toast\"]/div[1]/h4")
    WebElement orderSuccessToast_xpath;

    @FindBy(id = "view-history-btn")
    WebElement viewInvoiceButton_id;

    @FindBy(id = "invoice-history-title")
    WebElement viewInvoicePanel_id;

    @FindBy(xpath = "//button[contains(@id,'view-invoice-INV-')]")
    WebElement clickView_xpath;


    public OrderReviewInventoryForm(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyOrderPreviewDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(deviceOrderSummary_id));
        deviceOrderSummary_id.isDisplayed();
    }

    public void userSelectExpressShipping() {
        expressShipping_id.click();
    }

    public void verifyExpressShippingValue() {
        expressShippingValue_id.isDisplayed();

    }

    public void userSelect1yrWarranty() {
        warrantyOption1yr_id.click();
    }

    public void verify1yrWarrantyValue() {
        warrantyValue_id.isDisplayed();
    }


    public void userEntersDiscountCode() {
        discountCode_id.sendKeys("SAVE10");
    }

    public void userAppliesDiscountCode() {
        applyDiscountCode_id.click();
    }

    public void verifyDiscountValue() {
        DiscountCodeValue_id.isDisplayed();

    }

    public void userClicksConfirmButton() {
        confirmPurchaseButton_id.click();
    }

    public void verifyOrderSuccessToast() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("scroll(0,400);");

        orderSuccessToast_xpath.isDisplayed();
    }

    public void userClicksViewInvoice() {
        viewInvoiceButton_id.click();
    }

    public void verifyInvoiceHistoryIsDisplayed() {
        viewInvoicePanel_id.click();
    }

    public void userClicksView() {

        clickView_xpath.click();

        String currentHandle = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }


}
