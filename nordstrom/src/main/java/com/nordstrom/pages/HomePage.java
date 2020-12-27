package com.nordstrom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

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
}
