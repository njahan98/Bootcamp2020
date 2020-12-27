package com.nordstromtest;

import com.base.TestBase;
import com.nordstrom.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    @Test(enabled = false) //use enabled=false in order to run only one test case
    public void validateClickOnSearch() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        sleepFor(5);
        homePage.clickSearchButton();
    }
    @Test(enabled = false)
    public void validateTypeOnSearch() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        validateClickOnSearch();
        homePage.typeOnSearchBar();
    }
    @Test(enabled = false)
    public void validateClickOnDropDown() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        validateTypeOnSearch();
        sleepFor(5);
        homePage.clickOnToryHandbags();
    }
    @Test(enabled = false)
    public void validateSortByDropDown() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        validateClickOnDropDown();
        homePage.clickOnSortBy();
    }
    @Test
    public void validateSortByLowToHigh() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        validateSortByDropDown();
        sleepFor(2);
        homePage.sortLowToHigh();
        sleepFor(2);
    }
}
