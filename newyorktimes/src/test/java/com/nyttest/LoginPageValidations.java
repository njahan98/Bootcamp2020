package com.nyttest;

import com.base.TestBase;
import com.nyt.pages.LoginPage;
import com.nyt.pages.MainPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.jvm.hotspot.debugger.Page;

public class LoginPageValidations extends TestBase {
    private MainPage mainPage;
    private LoginPage loginPage;
    @BeforeMethod
    public void pageFactorySetup() {
        mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.nytMainPage();
        loginPage = PageFactory.initElements(driver,LoginPage.class);
    }
    @Test(enabled = false)
    public void validateLoginButton() {
        sleepFor(5);
        loginPage.clickLoginButton();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void validateCredentials() {
        validateLoginButton();
        loginPage.enterCredentials();
    }
    @Test(enabled = false)
    public void validateSearchBar() {
        loginPage.searchBar();
    }
    @Test(enabled = false)
    public void validateTrumpArticle() {
        validateSearchBar();
        sleepFor(5);
        loginPage.clickTrumpArticle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
    @Test(enabled = false)
    public void validateSignOut() {
        validateCredentials();
        loginPage.signOut();
    }
}
