package com.cigna.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {
    @FindBy(id = "individuals-families-level-one-link")
    private WebElement firstTab;

    @FindBy(linkText = "Health Insurance for Individuals and Families")
    private WebElement healthLink;

    @FindBy(linkText = "Visit our payment center")
    private WebElement paymentCenterLink;

    public void cignaHomePage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cigna.com/";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Cigna homepage is opened");
    }
    public void navigateFirstTab(){
        firstTab.click();
        ExtentTestManager.log("Individuals and Families tab is clicked");
    }
    public void navigateHealthAndFamiliesLink(){
        healthLink.click();
        ExtentTestManager.log("Health and Families link is launched");
    }
    public void navigateToPaymentCenter(){
        paymentCenterLink.click();
        ExtentTestManager.log("Health and Families link is launched");
    }
}
