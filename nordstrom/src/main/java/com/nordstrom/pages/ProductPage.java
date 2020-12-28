package com.nordstrom.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestBase {
    @FindBy(xpath = "(//a[@aria-label='Nordstrom Logo'])")
    private WebElement nordstromLogo;

    @FindBy(xpath = "(//a[@class='_3rKyM _2o_sq'])")
    private WebElement womensSaleButton;

    @FindBy(xpath = "(//span[@class='_35opT'])")
    private WebElement hoverOver;

    public void nordstromHomePage(){
        Assert.assertTrue(nordstromLogo.isDisplayed());
        ExtentTestManager.log("User is on Nordstrom homepage");
    }
    public void womensSaleOption(){
        womensSaleButton.click();
        ExtentTestManager.log("User presses Women's sale option");
    }
    public void hoverOverOption() {
        hoverOver.click();
        ExtentTestManager.log("User hovers over sale option");
    }
}
