package com.cignatest;

import com.base.TestBase;
import com.cigna.pages.HomePage;
import com.cigna.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase{
    private HomePage homePage;
    private LoginPage loginPage;
    @BeforeMethod
    public void pageFactorySetup() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.cignaHomePage();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @Test(enabled = false)
    public void validateLoginButton() {
        loginPage.clickOnLogIn();
        sleepFor(3);
    }
//unable to login and create account because it has lots of steps
}
