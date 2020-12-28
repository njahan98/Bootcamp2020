package com.cignatest;

import com.base.TestBase;
import com.cigna.pages.HomePage;
import com.cigna.pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    private HomePage homePage;
    @BeforeMethod
    public void pageFactorySetup() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test(enabled = false)
    public void validateFirstTab() {
        homePage.navigateFirstTab();
        sleepFor(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        sleepFor(3);
    }
    @Test(enabled = false)
    public void validateHealthLink() {
        validateFirstTab();
        homePage.navigateHealthAndFamiliesLink();
        sleepFor(3);
    }
    @Test(enabled = false)
    public void validatePaymentCenterLink() {
        validateHealthLink();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1600)");
        sleepFor(5);
        homePage.navigateToPaymentCenter();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void validateMedicalTools() {
        homePage.navigateSearchBar();
        sleepFor(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        sleepFor(5);
    }
    @Test(enabled = false)
    public void validateMedicalToolLink() {
        validateMedicalTools();
        homePage.clickMedicalTool();
        sleepFor(5);
    }
}
