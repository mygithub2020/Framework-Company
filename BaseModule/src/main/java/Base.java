import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.*;



/**
 * Created with IntelliJ IDEA.
 * User: Sharma
 * Date: 1/2/14
 * Time: 3:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Base
{
    public static WebDriver driver = null;

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
       // driver.navigate().to("http://www.craigslist.com");
    }



    public void clickByXpath(String locator)
    {
        driver.findElement(By.xpath(locator)).click();
    }

    //type by methods
    public void typeByXpath(String locator, String value)
    {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }


    /*
    public static WebDriver driver = new FirefoxDriver();

    public static String siteUrl = "http://newyork.craigslist.org/";
    //Login Information
    public static String emailLogIn = "andwhat08@gmail.com";
    public static String pswd = "mycraigslist1234";

    //Registration information
    public static String reg_Email = "saywhat_ny@yahoo.com";


   //Links  xpath
    public static String myAccount_Link = ".//*[@id='postlks']/li[2]/a";
    public static String logOut_Link = ".//*[@id='ef']/a[1]";
    public static String username_top_Link = ".//*[@id='pagecontainer']/header/a[2]";
    public static String signup_For_Account = ".//*[@id='pagecontainer']/section/form/p/a[1]";
//*****************************************************************************
    //Input box xpath
    public static String emailInput_Box = ".//*[@id='inputEmailHandle']";
    public static String passwordInput_Box = ".//*[@id='inputPassword']";
    public static String registration_Email_Input = ".//*[@id='emailAddress']";
//*****************************************************************************
    //Buttons xpath
    public static String logIn_Button = ".//*[@id='loginBox']/p[3]/button";
    public static String create_Account_Button = "html/body/section/form/div/span[4]/input";

    //Text
    public static String logged_Out_Display = ".//*[@id='pagecontainer']/header/section";
    public static String signup_Confirmation = "html/body/h3";
    */
}
