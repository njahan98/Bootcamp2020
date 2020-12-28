package com.facebooktest;

import com.base.TestBase;
import com.facebook.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {
    private LoginPage loginPage;
    @BeforeMethod
    public void pageFactorySetup(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @Test(enabled = false)
    public void validateEntersLoginPage() {
        loginPage.validateFbLoginPage();
    }
    @Test(enabled = false)
    public void validateUserEntersEmail() {
        validateEntersLoginPage();
        sleepFor(3);
        loginPage.emailLoginField();
    }
    @Test(enabled = false)
    public void validateEntersPassword() {
        validateUserEntersEmail();
        sleepFor(3);
        loginPage.passwordLoginField();
        sleepFor(3);
    }
    @Test
    public void validateUserLogsIn(){
        validateEntersPassword();
        loginPage.pressingLogin();
        sleepFor(10);
    }
}
