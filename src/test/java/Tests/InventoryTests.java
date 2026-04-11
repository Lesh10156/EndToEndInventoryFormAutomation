package Tests;

import Pages.OrderReviewInventoryForm;
import Utils.ReadFromFile;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class InventoryTests extends Base {

    @Test
    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
        takeScreenshots.takeSnapShots(driver, "1.HomePageScreenshot");
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayed")
    public void clickLoginButton() throws InterruptedException {
        homePage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void userEnterEmail() {
        loginPage.enterEmail(ReadFromFile.email);
    }

    @Test(dependsOnMethods = "userEnterEmail")
    public void userEnterPassword() {
        loginPage.enterPassword(ReadFromFile.password);
        takeScreenshots.takeSnapShots(driver, "2.LoginPageScreenshot");
    }

    @Test(dependsOnMethods = "userEnterPassword")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();

    }

    @Test(dependsOnMethods = "userClicksLoginButton")
    public void verifyDashboardIsDisplayedTest() {
        dashboard.verifyDashboardIsDisplayed();
        takeScreenshots.takeSnapShots(driver, "3.DashboardScreenshot");

    }

    @Test(dependsOnMethods = "verifyDashboardIsDisplayedTest")
    public void userClickLearnButtonTest() {
        dashboard.clickLearnButton();
    }

    @Test(dependsOnMethods = "userClickLearnButtonTest")
    public void UserClickLearningMaterialButtonTest() {
        dashboard.clickLearningMaterialButton();
    }

    @Test(dependsOnMethods = "UserClickLearningMaterialButtonTest")
    public void UserClickWebAutomationAdvanceButtonTest() throws InterruptedException {
        dashboard.clickWebAutomationAdvanceButton();

    }


    @Test(dependsOnMethods = "UserClickWebAutomationAdvanceButtonTest")
    public void verifyInventoryFormIsDisplayedTest() {
        inventoryForm.verifyInventoryFormIsDisplayed();
        takeScreenshots.takeSnapShots(driver, "4.InventoryFormScreenshot");
    }

    @Test(dependsOnMethods = "verifyInventoryFormIsDisplayedTest")
    public void userClickDeviceTypeDropDownTest() {
        inventoryForm.userClickDeviceTypeDropDown();
    }

    @Test(dependsOnMethods = "userClickDeviceTypeDropDownTest")
    public void userSelectDeviceTypeTest() throws InterruptedException {
        inventoryForm.userSelectDeviceType();
    }

    @Test(dependsOnMethods = "userSelectDeviceTypeTest")
    public void userCloseDeviceTypeDropDownTest() {
        inventoryForm.userClickDeviceTypeDropDown();
    }

    @Test(dependsOnMethods = "userCloseDeviceTypeDropDownTest")
    public void verifyBrandDropDownIsEnabledTest() {
        inventoryForm.verifyBrandDropDownIsEnabled();
    }

    @Test(dependsOnMethods = "verifyBrandDropDownIsEnabledTest")
    public void userSelectBrandTest() throws InterruptedException {
        inventoryForm.userSelectBrand();
    }

    @Test(dependsOnMethods = "userSelectBrandTest")
    public void verifyDevicePreviewIsDisplayedTest() throws InterruptedException {
        inventoryForm.verifyDevicePreviewIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyDevicePreviewIsDisplayedTest")
    public void userSelectDeviceStorageTest() throws InterruptedException {
        inventoryForm.userSelectDeviceStorage();
    }

    @Test(dependsOnMethods = "userSelectDeviceStorageTest")
    public void verifyUnitPriceIsDisplayedTest() {
        inventoryForm.verifyUnitPriceIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyUnitPriceIsDisplayedTest")
    public void userSelectColorTest() {
        inventoryForm.userSelectColor();
    }

    @Test(dependsOnMethods = "userSelectColorTest")
    public void verifySelectedColorBlueIsDisplayedTest() {
        inventoryForm.verifySelectedColorBlueIsDisplayed();
    }

    @Test(dependsOnMethods = "verifySelectedColorBlueIsDisplayedTest")
    public void userEntersQuantityTest() throws InterruptedException {
        inventoryForm.userEntersQuantity();

    }

    @Test(dependsOnMethods = "userEntersQuantityTest")
    public void verifySubtotalTest() {
        inventoryForm.verifySubtotal();
    }

    @Test(dependsOnMethods = "verifySubtotalTest")
    public void userEntersAddressTest() {
        inventoryForm.userEntersAddress();
        takeScreenshots.takeSnapShots(driver, "5.OrderDetailsScreenshot");
    }

    @Test(dependsOnMethods = "userEntersAddressTest")
    public void userClicksNextTest() {
        inventoryForm.userClicksNext();
    }

    @Test(dependsOnMethods = "userClicksNextTest")
    public void verifyOrderPreviewDisplayedTest() {
        orderReviewInventoryForm.verifyOrderPreviewDisplayed();
        takeScreenshots.takeSnapShots(driver, "6.OrderPreviewScreenshot");
    }

    @Test(dependsOnMethods = "verifyOrderPreviewDisplayedTest")
    public void userSelectExpressShippingTest() {
        orderReviewInventoryForm.userSelectExpressShipping();
    }

    @Test(dependsOnMethods = "userSelectExpressShippingTest")
    public void verifyExpressShippingValueTest() {
        orderReviewInventoryForm.verifyExpressShippingValue();
    }

    @Test(dependsOnMethods = "verifyExpressShippingValueTest")
    public void userSelect1yrWarrantyTest() {
        orderReviewInventoryForm.userSelect1yrWarranty();
    }

    @Test(dependsOnMethods = "userSelect1yrWarrantyTest")
    public void verify1yrWarrantyValue() {
        orderReviewInventoryForm.verify1yrWarrantyValue();
    }

    @Test(dependsOnMethods = "verify1yrWarrantyValue")
    public void userEntersDiscountCodeTest() {
        orderReviewInventoryForm.userEntersDiscountCode();
    }

    @Test(dependsOnMethods = "userEntersDiscountCodeTest")
    public void userAppliesDiscountCodeTest() {
        orderReviewInventoryForm.userAppliesDiscountCode();
    }

    @Test(dependsOnMethods = "userAppliesDiscountCodeTest")
    public void verifyDiscountValueTest() {
        orderReviewInventoryForm.verifyDiscountValue();
        takeScreenshots.takeSnapShots(driver, "7.AllOrderDetailsScreenshot");
    }

    @Test(dependsOnMethods = "verifyDiscountValueTest")
    public void userClicksConfirmButton() {
        orderReviewInventoryForm.userClicksConfirmButton();
    }

    @Test(dependsOnMethods = "userClicksConfirmButton")
    public void verifyOrderSuccessToastTest() {
        orderReviewInventoryForm.verifyOrderSuccessToast();
        takeScreenshots.takeSnapShots(driver, "8.OrderCompletedScreenshot");
    }

    @Test(dependsOnMethods = "verifyOrderSuccessToastTest")
    public void userClicksViewInvoiceTest() {
        orderReviewInventoryForm.userClicksViewInvoice();
        takeScreenshots.takeSnapShots(driver, "9.InvoiceDetailsScreenshot");
    }

    @Test(dependsOnMethods = "userClicksViewInvoiceTest")
    public void verifyInvoiceHistoryIsDisplayed() {
        orderReviewInventoryForm.verifyInvoiceHistoryIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyInvoiceHistoryIsDisplayed")
    public void userClicksViewTest() {
        orderReviewInventoryForm.userClicksView();
        takeScreenshots.takeSnapShots(driver, "10.PDFInvoiceDetailsScreenshot");
    }


    @AfterTest
    public void closeBrowser () {
        driver.quit();
    }

}

