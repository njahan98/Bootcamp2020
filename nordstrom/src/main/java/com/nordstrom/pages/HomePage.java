package com.nordstrom.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
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

    @FindBy(xpath = "(//span[@class='_1gV4w'])")
    private WebElement colorOption;

    public void clickSearchButton(){
        searchButton.click();
        ExtentTestManager.log("User is able to press search button");
    }
    public void typeOnSearchBar(){
        searchBar.sendKeys("Tory Burch Handbags");
        ExtentTestManager.log("User types for products on search bar");
    }
    public void clickOnToryHandbags(){
        dropDownOption.click();
        ExtentTestManager.log("Search bar drops options for product and product is pressed");
    }
    public void clickOnSortBy(){
        sortByDropdown.click();
        ExtentTestManager.log("Drop down is pressed to display sort by options");
    }
    public void sortLowToHigh(){
        sortByLowToHigh.click();
        ExtentTestManager.log("Items are ordered from low to high prices");
    }
    public void scrollUpAndDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        sleepFor(3);
        ExtentTestManager.log("User is able to scroll up the products");
        js.executeScript("window.scrollBy(0, -1500)");
        sleepFor(3);
        ExtentTestManager.log("User is able to scroll down the products");
    }

}
