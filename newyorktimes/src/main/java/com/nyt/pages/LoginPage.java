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

    @FindBy(xpath = "//button[@class='css-fnhm75 ewfai8r0']")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@class='css-1axrnfw']")
    private WebElement searchBar;

    @FindBy(xpath = "(//h4[@class='css-2fgx4k'])[1]")
    private WebElement trumpArticle;

    @FindBy(xpath = "//span[@class='css-ct6u86 ez4a0qj3']")
    private WebElement accountButton;

    @FindBy(xpath = "//button[@class='css-1szc2m4']")
    private WebElement logOutButton;

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
        passwordField.sendKeys("TestingPage123",Keys.ENTER);
        sleepFor(5);
        ExtentTestManager.log("Passsword is entered into field and user logs into account");
    }
    public void searchBar(){
        sleepFor(7);
        searchButton.click();
        searchBar.click();
        ExtentTestManager.log("Search bar is clicked");
        sleepFor(3);
        searchBar.sendKeys("Trump",Keys.ENTER);
        ExtentTestManager.log("User enters value into searchbar");
    }
    public void clickTrumpArticle(){
        trumpArticle.click();
        ExtentTestManager.log("Barr article is clicked");
    }
    public void signOut(){
        sleepFor(7);
        accountButton.click();
        ExtentTestManager.log("Account tab is clicked and options drop down");
        sleepFor(5);
        logOutButton.click();
        sleepFor(3);
        ExtentTestManager.log("User logs out of account");
    }
}
