package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    @BeforeSuite
    public void driverInitialize()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/shrutidixit/Desktop/ProjectFacebook/Webdrivers/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

    }

    @AfterSuite
    public void TeardownTest()
    {
        BaseTest.driver.close();
        BaseTest.driver.quit();
    }



}
