package com.nordstrom.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TestBase {

    @FindBy(xpath = "(//span[@class='_3a22W'])")
    private WebElement searchButton;

    @FindBy(xpath = "(//input[@class='_2341R'])")
    private WebElement searchBar;

    @FindBy(xpath = "(//span[@class='_3eBEY'])")
    private WebElement dropDownOption;

    @FindBy(xpath = "(//select[@class='_27zs1'])")
    private WebElement sortByDropdown;

    @FindBy(xpath = "(//option[@value='PriceLowToHigh'])")
    private WebElement sortByLowToHigh;

    @FindBy(xpath = "(//a[@class='_5lXiG _1sMDh _2PDR1'])")
    private WebElement ellaNylonTote;

    public void clickSearchButton(){
        searchButton.click();
    }
    public void typeOnSearchBar(){
        searchBar.sendKeys("Tory Burch Handbags");
    }
    public void clickOnToryHandbags(){
        dropDownOption.click();
    }
    public void clickOnSortBy(){
        sortByDropdown.click();
    }
    public void sortLowToHigh(){
        sortByLowToHigh.click();
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        sleepFor(5);
    }
    public void chooseHandbag(){
        ellaNylonTote.click();
        sleepFor(5);
    }
}
