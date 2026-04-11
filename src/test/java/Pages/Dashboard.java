package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dashboard {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]/p")
    WebElement verify_dashboard;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement learnButton_xpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement learnMaterialButton_xpath;

    @FindBy(xpath = "//*[@id=\"tab-btn-web\"]/span[2]")
    WebElement webAutomationAdvance_xpath;


    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyDashboardIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(verify_dashboard));

        verify_dashboard.isDisplayed();
    }

    public void clickLearnButton() {
        learnButton_xpath.click();
    }

    public void clickLearningMaterialButton() {
        learnMaterialButton_xpath.click();
    }

    public void clickWebAutomationAdvanceButton() {
        webAutomationAdvance_xpath.click();
    }
}
