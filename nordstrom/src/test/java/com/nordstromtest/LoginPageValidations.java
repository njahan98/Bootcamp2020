package com.nordstromtest;

import com.nordstrom.pages.HomePage;
import com.base.TestBase;
import com.nordstrom.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase{
    @BeforeMethod
    public void pageFactorySetup(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test(enabled = false)
    public void validateUserLogin() {

    }
}
