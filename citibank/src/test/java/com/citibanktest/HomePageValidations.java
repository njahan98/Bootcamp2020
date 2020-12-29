package com.citibanktest;

import com.base.TestBase;
import com.citibank.pages.HomePage;
import com.citibank.pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    private HomePage homePage;
    private LoginPage loginPage;
    @BeforeMethod
    public void pageFactorySetup() {
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.citiBankPage();
        homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @Test(enabled = false)
    public void validateCreditCardsTab() {
        sleepFor(5);
        homePage.clickCreditCardsTab();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void validateCompareOptions() {
        validateCreditCardsTab();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        sleepFor(3);
        homePage.clickCompareOption();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void validateBankingTab() {
        sleepFor(5);
        homePage.clickBankingTab();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void validateScrollToCareers() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3500)");
        sleepFor(5);
        homePage.clickCareersButton();
    }
    @Test(enabled = false)
    public void validateSearchOption() {
        homePage.clickSearchButton();
        sleepFor(5);
    }
}