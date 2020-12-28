package com.nordstrom.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestBase {
    @FindBy(xpath = "(//a[@class='_3rKyM _2o_sq'])")
    private WebElement womensSaleButton;

    public void womensSaleTab(){
        womensSaleButton.click();
        ExtentTestManager.log("User presses Women's sale option");
    }
}
