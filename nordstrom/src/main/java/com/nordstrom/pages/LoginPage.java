package com.nordstrom.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {

    @FindBy(xpath = "(//span[@class='_3xVJx'])")
    private WebElement signInButton;

    @FindBy(xpath = "(//div[@class='ysVlr'])")
    private WebElement emailField;

    @FindBy(xpath = "(//span[@class='_1vkiU'])")
    private WebElement nextButton;

    @FindBy(linkText = "password")
    private WebElement passwordField;

    @FindBy(xpath = "(//div[@class=' _1JtW7 _2VF_A _2wqvV'])")
    private WebElement showPassword;

    @FindBy(xpath = "(//span[@class='_1vkiU'])")
    private WebElement passwordSignIn;

    public void clickSignInButton(){
        signInButton.click();
        ExtentTestManager.log("User is able to press sign in button");
    }
    public void typeInEmailField(){
        emailField.sendKeys("testing123@gmail.com");
        ExtentTestManager.log("User enters valid email into the email field");
    }
    public void clickNextButton(){
        nextButton.click();
        ExtentTestManager.log("User presses next button");
    }
    public void typeInPasswordField(){
        passwordField.sendKeys("testing123");
        ExtentTestManager.log("User enters invalid password into the password field");
    }
    public void showPasswordToUser(){
        showPassword.click();
        ExtentTestManager.log("Password is shown to user in order to validate credentials");
    }
    public void signIntoAccount() {
        passwordSignIn.click();
        ExtentTestManager.log("User is unable to sign into account");
    }
}