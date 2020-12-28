package com.nordstromtest;

import com.base.TestBase;
import com.nordstrom.pages.HomePage;
import com.nordstrom.pages.LoginPage;
import com.nordstrom.pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageValidations extends TestBase {

    private ProductPage productPage;

    @BeforeMethod
    public void pageFactorySetup(){
        productPage = PageFactory.initElements(driver,ProductPage.class);
    }

    @Test(enabled = false)
    public void validateUserOnNordstromPage() {
        productPage.nordstromHomePage();
    }
    @Test(enabled = false)
    public void validateUserClickingWomensSale() {
        productPage.womensSaleOption();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void validateUserHoveringOverItem() {
        validateUserOnNordstromPage();
        sleepFor(3);
        productPage.hoverOverOption();
        sleepFor(5);
    }

}
