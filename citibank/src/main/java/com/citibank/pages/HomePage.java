package com.citibank.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends TestBase {
    @FindBy(id = "creditcards")
    private WebElement creditCardsTab;

    @FindBy(id = "cashbackCards_Link")
    private WebElement cashBackCards;

    @FindBy(id="Citi-costco-anywhere-visa-credit-card-chkboxLabel")
    private WebElement compareButton;

    @FindBy(id="compareNowButtonDisable")
    private WebElement compareNowButton;

    @FindBy(linkText="Banking")
    private WebElement bankingTab;

    @FindBy(linkText="Checking")
    private WebElement checkingButton;

    @FindBy(linkText="Careers")
    private WebElement careersButton;

    @FindBy(id="search_icon")
    private WebElement searchButton;

    @FindBy(id="citi-autocomplete-content-searchbox-livesearch")
    private WebElement searchBar;

    public void clickCreditCardsTab(){
        creditCardsTab.click();
        ExtentTestManager.log("Credit Cards tab is clicked and drop down appears");
        cashBackCards.click();
        ExtentTestManager.log("Cash back cards option is clicked");
    }
    public void clickCompareOption(){
        compareButton.click();
        ExtentTestManager.log("User scrolls down to costco card and compare option");
        sleepFor(2);
        compareNowButton.click();
    }
    public void clickBankingTab(){
        bankingTab.click();
        ExtentTestManager.log("Banking tab is clicked and drop down appears");
        checkingButton.click();
        ExtentTestManager.log("Checking option is clicked");
    }
    public void clickCareersButton(){
        careersButton.click();
        sleepFor(5);
        ExtentTestManager.log("User scrolls down to bottom of home page and clicks Careers");
    }
    public void clickSearchButton(){
        searchButton.click();
        sleepFor(5);
        ExtentTestManager.log("User clicks search button");
        searchBar.sendKeys("Checking Account",Keys.ENTER);
        ExtentTestManager.log("User searches in search bar");
    }
}
