package com.facebooktest;

import com.base.TestBase;
import com.facebook.pages.LoginPage;
import com.facebook.pages.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageValidations extends TestBase {
    private LoginPage loginPage;
    private MainPage mainPage;
    @BeforeMethod
    public void pageFactorySetup(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginProcess();
        sleepFor(5);
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test(enabled = false)
    public void validateUserClicksSearchBar(){
        mainPage.clickSearchBar();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void validateUserTypesOnSearchBar(){
        mainPage.enterNameInSearchBar();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void validateUserClicksFriendRequest(){
        mainPage.lookAtFriendRequests();
        sleepFor(3);
        mainPage.addingFriendRequest();
        sleepFor(3);
    }
    @Test(enabled = false)
    public void validateUserGoingToProfile(){
        mainPage.clickProfilePage();
        sleepFor(5);
    }
}