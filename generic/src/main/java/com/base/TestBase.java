package com.base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.report.ExtentManager;
import com.report.ExtentTestManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static ExtentReports extent;
    public static String sauceUserName = "nusrutjahan1";
    public static String sauceKey = "ff3b5dce-9b66-4333-b00b-ca98460d9b85";
    public static String browserStackUserName = "nusrutjahan1";
    public static String browserStackKey = "gcLzGtJzfLXa6GCjqf41";
    public static String SAUCE_URL = "http://" + sauceUserName + ":" + sauceKey + "@ondemand.saucelabs.com:80/wd/hub";
    public static String BROWSERSTACK_URL = "https://" + browserStackUserName + ":" + browserStackKey + "@hub-cloud.browserstack.com/wd/hub";
    private static Logger LOGGER = Logger.getLogger(TestBase.class);

    /**
     * @param platform       -
     * @param url            -
     * @param browser        -
     * @param cloud          -
     * @param browserVersion -
     * @param envName        -
     * @return
     * @throws MalformedURLException
     * @Parameters - values are coming from the runner.xml file of the project modules
     */
    @Parameters({"platform", "url", "browser", "cloud", "browserVersion", "envName"})
    /*this info gets pulled from the xml file so it runs before everything, so classes know where to go*/
    @BeforeMethod
    public static WebDriver setupDriver(String platform, String url, String browser,
                                        boolean cloud, String browserVersion, String envName) throws MalformedURLException {
        if (cloud) {
            driver = getCloudDriver(browser, browserVersion, platform, envName);
        } else {
            driver = getLocalDriver(browser, platform);
        }
        driver.get(url);
        return driver;
    }

    public static WebDriver getLocalDriver(String browser, String platform) {
        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../generic/src/main/resources/chromedriver");
            driver = new ChromeDriver();
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../generic/src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "../generic/src/main/resources/geckodriver");
            driver = new FirefoxDriver();
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "../generic/src/main/resources/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getCloudDriver(String browser, String browserVersion, String platform,
                                           String envName) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("name", "Cloud Execution");
        desiredCapabilities.setCapability("browser", browser);
        desiredCapabilities.setCapability("browser_version", browserVersion);
        desiredCapabilities.setCapability("os", "OS X");
        desiredCapabilities.setCapability("os_version", "Catalina");
        desiredCapabilities.setCapability("resolution", "1920×1080");
        if (envName.equalsIgnoreCase("saucelabs")) {
            driver = new RemoteWebDriver(new URL(SAUCE_URL), desiredCapabilities);
        } else if (envName.equalsIgnoreCase("browserstack")) {
            driver = new RemoteWebDriver(new URL(BROWSERSTACK_URL), desiredCapabilities);
        }
        return driver;
    }

    public static void navigateToURL(String url) {
        driver.get(url);
        LOGGER.info("navigated to the url : " + url);
    }

    public static void sleepFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void closeDriver() {
        driver.quit();
        LOGGER.info("closed the instance of the driver");
    }

    public static void navigateBack() {
        driver.navigate().back();
    }

    public static void clickOnElement(String element) {
        driver.findElement(By.xpath(element)).click();
    }

    //screenshot used to capture failures
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("HH_mm_ss"); //gets unique name for screenshot
        Date date = new Date(); //gets current date for screenshot in order to name it
        df.format(date);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + " " + df.format(date) + ".jpg"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
    }

    //reporting starts created by extent report guys in order to use in framework
    @BeforeSuite //gets executed before running everything (before mvn clean test)
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod //executed before running test methods to start logs from extent reporting
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }

        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
    }

    public Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    @AfterSuite
    public void generateReport() { //closes object of extent
        extent.close();
    }
    //reporting finish to automatically generate report

    @AfterMethod //once test cases get executed, we want to close our browser so it always closes it
    public void cleanUp() {
        driver.close();
        driver.quit();
        LOGGER.info("driver closed");
    }

}