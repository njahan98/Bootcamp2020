package com.facebook.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends TestBase {
    @FindBy(xpath ="//div[@class='oajrlxb2 b3i9ofy5 qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 " +
            "cxmmr5t8 oygrvhab hcukyx3x cxgpxx05 d1544ag0 sj5x9vvc tw6a2znq i1ao9s8h esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh p8dawk7l " +
            "bp9cbjyn orhb3f3m czkt41v7 fmqxjp7s emzo65vh btwxx1t3 buofh1pr idiwt2bm jifvfom9 ni8dbmo4 stjgntxs kbf60n1y']")
    private WebElement statusBar;

    @FindBy(xpath ="(//div[@class='_1mf _1mj'])[3])")
    private WebElement setStatus;

    @FindBy(xpath ="(//div[@class='oajrlxb2 gs1a9yip g5ia77u1 mtkw9kbi tlpljxtp qensuy8j ppp5ayq2 goun2846 ccm00jje s44p3ltw mk2mc5f4 " +
            "rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv nhd2j8a9 pq6dq46d mg4g778l btwxx1t3 pfnyh3mw p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab" +
            " hcukyx3x tgvbjcpo hpfvmrgz jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 i1ao9s8h esuyzwwr f1sip0of du4w35lb lzcic4wl abiwlrkh p8dawk7l'])[5]")
    private WebElement likeButton;

    public void clickStatusBar(){
        statusBar.click();
        ExtentTestManager.log("User clicks status bar");
        setStatus.sendKeys("I love dogs",Keys.ENTER);
        sleepFor(10);
        ExtentTestManager.log("User puts up a status");
    }
    public void likesStatus(){
        likeButton.click();
        ExtentTestManager.log("User likes post");
    }
}
