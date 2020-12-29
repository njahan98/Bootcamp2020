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

    public void clickCreditCardsTab(){
        creditCardsTab.click();
        ExtentTestManager.log("Credit Cards tab is clicked and drop down appears");
        cashBackCards.click();
        ExtentTestManager.log("Cash back cards option is clicked");
    }
    public void clickCompareOption(){
        compareButton.click();
        ExtentTestManager.log("User scrolls down to costco card and compare option");
    }
}
