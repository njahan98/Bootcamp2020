package com.facebook.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends TestBase {
    @FindBy(xpath = "//input[@class='oajrlxb2 rq0escxv f1sip0of hidtqoto lzcic4wl hzawbc8m ijkhr0an nlq1og4t sgqwj88q b3i9ofy5 oo9gr5id b1f16np4 hdh3q7d8 dwo3fsh8 qu0x051f " +
            "esr5mh6w e9989ue4 r7d6kgcz br7hx15l h2jyy9rg n3ddgdk9 owxd89k7 ihxqhq3m jq4qci2q k4urcfbm iu8raji3 qypqp5cg l60d2q6s hv4rvrfc hwnh5xvq dati1w0a o1lsuvei o6r2urh6 " +
            "rmlgq0sb aj8hi1zk r4fl40cc kd8v7px7 m07ooulj mzan44vs']")
    private WebElement searchBar;

    public void clickSearchBar(){
        searchBar.click();
        ExtentTestManager.log("User clicks search bar");
    }
    public void enterNameInSearchBar(){
        sleepFor(5);
        searchBar.sendKeys("Kevin Jai", Keys.RETURN);
        ExtentTestManager.log("User is able to search for friend");
    }
}
