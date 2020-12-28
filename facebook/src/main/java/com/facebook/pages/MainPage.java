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

    @FindBy(xpath = "//span[@class='s45kfl79 emlxlaya bkmhp75w spb7xbtv pq6dq46d e9vueds3 ekzkrbhg omvj5yrc jiuqdcnw d82f96u3 gky8063y']")
    private WebElement friendRequests;

    @FindBy(xpath = "//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql oi732d6d ik7dh3pa fgxwclzu a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d9wwppkn fe6kdd0r mau55g9w c8b282yb " +
            "iv3no6db jq4qci2q a3bd9o3v lrazzd5p bwm1u5wc']")
    private WebElement addFriend;

    @FindBy(linkText = "Tursun Nahaj")
    private WebElement openProfile;

    public void clickSearchBar(){
        searchBar.click();
        ExtentTestManager.log("User clicks search bar");
    }
    public void enterNameInSearchBar(){
        searchBar.sendKeys("Kevin Jai", Keys.RETURN);
        ExtentTestManager.log("User is able to search for friend");
    }
    public void lookAtFriendRequests(){
        friendRequests.click();
        ExtentTestManager.log("User checks friend request tab");
    }
    public void addingFriendRequest(){
        addFriend.click();
        ExtentTestManager.log("User adds friend");
    }
    public void clickProfilePage(){
        openProfile.click();
        ExtentTestManager.log("User opens profile page");
    }
}
