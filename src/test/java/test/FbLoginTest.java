package test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.FbLoginPage;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class FbLoginTest extends BaseTest{

    @Test
    public void init() throws Exception{

        //driver.get("https://www.facebook.com");
        FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
        loginpage.setEmail("sddixitshruti@gmail.com");
        loginpage.setPassword("$hruti@91");
        loginpage.clickOnLoginButton();
        WebDriverWait wait=new WebDriverWait(driver, 10);
        try
        {
            wait.until(ExpectedConditions.urlToBe(""));
        }catch (Exception e)
        {

        }
    //    Wait wait = new FluentWait(driver)
    //            .withTimeout(10, TimeUnit.SECONDS)
    //            .pollingEvery(3, TimeUnit.SECONDS)
    //            .ignoring(NoSuchElementException.class);


        //FBHomePage homepage = PageFactory.initElements(driver, FBHomePage.class);
   //     homepage.clickOnProfileDropdown();
  //      System.out.println(homepage.verifyLoggedInUserNameText());
        //homepage.clickOnLogoutLink();

        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File screenFile = screenshot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("/Users/shrutidixit/Desktop/ProjectFacebook/Image_Shots/image1.jpg");
        FileUtils.copyFile(screenFile, DestFile);

    }

    @AfterTest
    public void screenshot() throws Exception
    {

    }
}
