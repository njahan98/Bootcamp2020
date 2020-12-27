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

    public void clickSearchButton(){
        searchButton.click();
    }
    public void typeOnSearchBar(){
        searchBar.sendKeys("Tory Burch Handbags");
    }
    public void clickOnToryHandbags(){
        dropDownOption.click();
    }
}
