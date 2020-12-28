package com.nordstromtest;

import com.base.TestBase;
import com.nordstrom.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    private HomePage homePage;
    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false) //use enabled=false in order to run only one test case
    public void validateClickOnSearch() {
        sleepFor(5);
        homePage.clickSearchButton();
    }
    @Test(enabled = false)
    public void validateTypeOnSearch() {
        validateClickOnSearch();
        homePage.typeOnSearchBar();
    }
    @Test(enabled = false)
    public void validateClickOnDropDown() {
        validateTypeOnSearch();
        sleepFor(5);
        homePage.clickOnToryHandbags();
    }
    @Test(enabled = false)
    public void validateSortByDropDown() {
        validateClickOnDropDown();
        homePage.clickOnSortBy();
    }
    @Test(enabled = false)
    public void validateSortByLowToHigh() {
        validateSortByDropDown();
        sleepFor(2);
        homePage.sortLowToHigh();
        sleepFor(2);
    }
    @Test(enabled = false)
    public void validateScrollingFeature(){
        validateClickOnDropDown();
        homePage.scrollUpAndDown();
    }
}
