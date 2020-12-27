package com.nordstrom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "(//span[@class='_3a22W'])")
    private WebElement searchButton;

    @FindBy(xpath = "(//button[@class='_31pVq _1l-nn _3CU6a _1sMDh _2PDR1'])")
    private WebElement saleButton;

    @FindBy(xpath = "(//button[@class='_31pVq UfYO5 _3CU6a _1sMDh _2PDR1'])")
    private WebElement womensDropDown;


    public void clickSearchButton() {
        searchButton.click();
    }

    public void typeOnSearchBar() {
        searchButton.sendKeys("handbags");
    }

    public void clickSaleButton() {
        saleButton.click();
    }

    public void clickWomensDropDownButton() {
        womensDropDown.click();
    }
}
