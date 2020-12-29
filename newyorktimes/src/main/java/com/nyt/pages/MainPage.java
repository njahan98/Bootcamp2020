package com.nyt.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MainPage extends TestBase {

    @FindBy(linkText = "Tech")
    private WebElement techTab;

    @FindBy(xpath = "(//article[@class='css-imuvyx'])[2]")
    private WebElement firstArticle;

    public void nytMainPage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.nytimes.com/";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated url for New York Times " + actualURL);
    }
    public void navigateTechTab(){
        techTab.click();
        ExtentTestManager.log("Tech tab is clicked");
    }
    public void navigateToArticle(){
        firstArticle.click();
        ExtentTestManager.log("Article is opened");
    }
}
