import org.openqa.selenium.By;
import org.testng.Assert;
import java.lang.InterruptedException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Sharma
 * Date: 1/3/14
 * Time: 3:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class Registration_Test extends CraigsBase
{
    @BeforeMethod(dependsOnMethods = {"setUp"})
    public void go_to_WebSite()
    {
        driver.get(siteUrl);
    }

    @Test
    public  void register()
    {
        clickByXpath(CraigsBase.myAccount_Link);
        clickByXpath(CraigsBase.signup_For_Account);
        typeByXpath(CraigsBase.registration_Email_Input, reg_Email);
        clickByXpath(CraigsBase.create_Account_Button);
        String confirm_Text = driver.findElement(By.xpath(CraigsBase.signup_Confirmation)).getText();
        Assert.assertEquals("Thanks for signing up for a craigslist account.", confirm_Text);
    }

    @AfterTest
    private void close_Browser()
    {
        driver.quit();
    }


}
