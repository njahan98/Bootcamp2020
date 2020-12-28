package com.nordstromtest;

import com.nordstrom.pages.HomePage;
import com.base.TestBase;
import com.nordstrom.pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase{

    private LoginPage loginPage;

    @BeforeMethod
    public void pageFactorySetup(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @Test(enabled = false) //use enabled=false in order to run only one test case
    public void validateSignInButton() {
        sleepFor(5);
        loginPage.clickSignInButton();
    }
    @Test(enabled = false)
    public void validateTypeInEmailField() {
        validateSignInButton();
        loginPage.typeInEmailField();
    }
    @Test(enabled = false)
    public void validateNextButton() {
        validateTypeInEmailField();
        sleepFor(5);
        loginPage.clickNextButton();
    }
    @Test(enabled = false)
    public void validateTypeInPasswordField() {
        validateNextButton();
        loginPage.typeInPasswordField();
    }
    @Test(enabled = false)
    public void validateShowPasswordToUser() {
        validateTypeInPasswordField();
        sleepFor(2);
        loginPage.showPasswordToUser();
        sleepFor(2);
    }
    @Test
    public void validatePasswordSignIn(){
        loginPage.signIntoAccount();
    }
}
