package com.facebook.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends TestBase {
    @FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
    private WebElement fbLoginPage;

    @FindBy(id = "email")
    private WebElement loginField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "u_0_b")
    private WebElement loginButton;

    public void validateFbLoginPage(){
        Assert.assertTrue(fbLoginPage.isDisplayed());
        ExtentTestManager.log("User has landed on Facebook login page");
    }
    public void emailLoginField(){
        loginField.sendKeys("tursunnahaj@gmail.com");
        ExtentTestManager.log("User enters email into email field");
    }
    public void passwordLoginField(){
        passwordField.sendKeys("TestingPage123!");
        ExtentTestManager.log("User enters password into password field");
    }
    public void pressingLogin(){
        loginButton.click();
        ExtentTestManager.log("User presses login to enter facebook homepage");
    }
}
