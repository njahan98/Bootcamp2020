package com.citibank.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends TestBase {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "signInBtn")
    private WebElement signInButton;

    public void citiBankPage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://online.citi.com/US/login.do";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated url for Citibank " + actualURL);
    }
    public void logInvalidCredentials(){
        usernameField.click();
        ExtentTestManager.log("Username field is pressed");
        usernameField.sendKeys("testing123");
        ExtentTestManager.log("Username is entered");
        sleepFor(3);
        passwordField.click();
        ExtentTestManager.log("Password field is pressed");
        passwordField.sendKeys("testing123", Keys.ENTER);
        ExtentTestManager.log("Password is entered and error message appears");
        sleepFor(5);
    }
}
