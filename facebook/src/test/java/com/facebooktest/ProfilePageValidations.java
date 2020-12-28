package com.facebooktest;

import com.base.TestBase;
import com.facebook.pages.LoginPage;
import com.facebook.pages.MainPage;
import com.facebook.pages.ProfilePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageValidations extends TestBase {
    private LoginPage loginPage;
    private MainPage mainPage;
    private ProfilePage profilePage;
    @BeforeMethod
    public void pageFactorySetup(){
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.loginProcess();
        sleepFor(7);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickProfilePage();
        sleepFor(5);
        profilePage = PageFactory.initElements(driver, ProfilePage.class);
    }
    @Test(enabled = false)
    public void validateUserClicksStatusBar(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        sleepFor(5);
        profilePage.clickStatusBar();
        sleepFor(3);
    }
}