package com.nyttest;

import com.base.TestBase;
import com.nyt.pages.LoginPage;
import com.nyt.pages.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import sun.jvm.hotspot.debugger.Page;

public class LoginPageValidations extends TestBase {
    private MainPage mainPage;
    private LoginPage loginPage;
    @BeforeMethod
    public void pageFactorySetup() {
        mainPage = PageFactory.initElements(driver, MainPage.class);
        loginPage = PageFactory.initElements(driver,LoginPage.class);
    }
}
