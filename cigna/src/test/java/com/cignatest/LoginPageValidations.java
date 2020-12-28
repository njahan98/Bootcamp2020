package com.cignatest;

import com.base.TestBase;
import com.cigna.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase{
    private LoginPage loginPage;
    @BeforeMethod
    public void pageFactorySetup() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @Test(enabled = false)
    public void validateCignaHomepage() {
        loginPage.cignaHomePage();
        sleepFor(3);
    }
    @Test(enabled = false)
    public void validateLoginButton() {
        validateCignaHomepage();
        loginPage.clickOnLogIn();
        sleepFor(3);
    }
//unable to login and create account because it has lots of steps
}
