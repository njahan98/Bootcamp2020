package com.nordstromtest;

import com.base.TestBase;
import com.nordstrom.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    @Test(enabled = false)
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
    @Test
    public void validateClickOnDropDown() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        validateTypeOnSearch();
        sleepFor(5);
        homePage.clickOnToryHandbags();
    }
}
