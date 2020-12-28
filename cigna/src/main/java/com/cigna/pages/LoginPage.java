package com.cigna.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends TestBase {
    @FindBy(linkText = "Log in to myCigna")
    private WebElement logInButton;

    public void cignaHomePage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cigna.com/";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Cigna homepage is opened");
    }
    public void clickOnLogIn(){
        logInButton.click();
        ExtentTestManager.log("Login button is clicked");
    }
}
