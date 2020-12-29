package com.nyt.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {

    @FindBy(linkText = "Log in")
    private WebElement loginButton;

    @FindBy(id = "username")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    public void clickLoginButton(){
        loginButton.click();
        ExtentTestManager.log("Login button is pressed");
    }
    public void enterCredentials(){
        emailField.click();
        emailField.sendKeys("tursunnahaj@gmail.com");
        ExtentTestManager.log("Email is entered into field");
        sleepFor(5);
        passwordField.click();
        passwordField.sendKeys("TestingPage123!",Keys.ENTER);
        sleepFor(5);
        ExtentTestManager.log("Passsword is entered into field and user logs into account");
    }//ny times currently locked out my email address
}
