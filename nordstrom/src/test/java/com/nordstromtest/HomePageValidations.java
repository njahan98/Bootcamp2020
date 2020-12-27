package com.nordstromtest;

import com.base.TestBase;
import com.nordstrom.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    @Test(enabled = false)
    public void validateUserClickingWomensButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickWomensDropDownButton();
    }
    @Test
    public void validateUserClickingSaleButton(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickSaleButton();
    }
}
