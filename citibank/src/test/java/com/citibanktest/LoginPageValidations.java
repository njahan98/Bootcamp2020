package com.citibanktest;

import com.base.TestBase;
import com.citibank.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {
    private LoginPage loginPage;
    @BeforeMethod
    public void pageFactorySetup() {
        loginPage = PageFactory.initElements(driver,LoginPage.class);
    }
    @Test(enabled = false)
    public void validateInvalidCredentials() {
        sleepFor(5);
        loginPage.logInvalidCredentials();
    }
}
