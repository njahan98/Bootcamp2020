package com.nyttest;

import com.base.TestBase;
import com.nyt.pages.MainPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageValidations extends TestBase {
    private MainPage mainPage;
    @BeforeMethod
    public void pageFactorySetup() {
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test(enabled = false)
    public void validateTechTab() {
        sleepFor(3);
        mainPage.navigateTechTab();
        sleepFor(3);
    }
    @Test(enabled = false)
    public void validateArticleClick() {
        validateTechTab();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        sleepFor(3);
        mainPage.navigateToArticle();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void validateArtsTab() {
        mainPage.navigateArtsTab();
        sleepFor(5);
    }
}
